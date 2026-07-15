#!/usr/bin/env python3
"""Rebuild the CurseForge client pack with current 1.21.1 NeoForge releases.

The script starts from the archived canonical CurseForge export, updates every
project to the newest compatible release, removes known conflicts, adds the
Gobber/combat/QoL stack, and writes an importable CurseForge ZIP plus reports.
"""
from __future__ import annotations

import argparse
import json
import os
import shutil
import sys
import urllib.parse
import urllib.request
import zipfile
from datetime import datetime, timezone
from pathlib import Path

GAME_ID = 432
MC_VERSION = "1.21.1"
LOADER = "NeoForge"

# Explicit additions. These IDs are stable CurseForge project IDs.
REQUIRED_PROJECTS = {
    301700: "Gobber",
    639842: "Better Combat",
    658587: "Player Animator",
    238222: "Just Enough Items",
    240630: "Just Enough Resources",
    393442: "LambDynamicLights",
}

# Remove conflicting/redundant projects from the historical pack.
DENY_PROJECTS = {
    511319: "Reese's Sodium Options (removed because it conflicts in this pack)",
}

# Projects resolved by name through the CurseForge search API when available.
SEARCH_PROJECTS = [
    "Just Another Server Resource Pack",
]


def request_json(url: str, api_key: str | None = None) -> dict:
    headers = {
        "Accept": "application/json",
        "User-Agent": "OAR-Modpack-Rebuilder/0.4.1",
    }
    if api_key:
        headers["x-api-key"] = api_key
    req = urllib.request.Request(url, headers=headers)
    with urllib.request.urlopen(req, timeout=45) as response:
        return json.load(response)


def api_get(path: str, params: dict[str, object], api_key: str | None) -> dict:
    query = urllib.parse.urlencode(params)
    candidates: list[str] = []
    if api_key:
        candidates.append(f"https://api.curseforge.com/v1/{path}?{query}")
    # CurseForge's website API is used as a no-key fallback. The script records
    # a clear failure if the endpoint becomes unavailable instead of guessing.
    candidates.append(f"https://www.curseforge.com/api/v1/{path}?{query}")
    errors: list[str] = []
    for url in candidates:
        try:
            return request_json(url, api_key if "api.curseforge.com" in url else None)
        except Exception as exc:  # noqa: BLE001
            errors.append(f"{url}: {exc}")
    raise RuntimeError("CurseForge API request failed:\n" + "\n".join(errors))


def unwrap(payload: dict) -> object:
    return payload.get("data", payload)


def search_project(name: str, api_key: str | None) -> int:
    payload = api_get(
        "mods/search",
        {
            "gameId": GAME_ID,
            "classId": 6,
            "searchFilter": name,
            "pageSize": 20,
            "sortField": 2,
            "sortOrder": "desc",
        },
        api_key,
    )
    data = unwrap(payload)
    if not isinstance(data, list):
        raise RuntimeError(f"Unexpected search response for {name!r}")
    normalized = name.casefold()
    for mod in data:
        title = str(mod.get("name", "")).casefold()
        slug = str(mod.get("slug", "")).replace("-", " ").casefold()
        if title == normalized or slug == normalized:
            return int(mod["id"])
    if data:
        return int(data[0]["id"])
    raise RuntimeError(f"Could not resolve CurseForge project: {name}")


def compatible(file: dict) -> bool:
    versions = {str(v).casefold() for v in file.get("gameVersions", [])}
    if MC_VERSION.casefold() not in versions:
        return False
    if LOADER.casefold() not in versions:
        return False
    # releaseType: 1 release, 2 beta, 3 alpha. Prefer stable releases only.
    return int(file.get("releaseType", 99)) == 1


def latest_file(project_id: int, api_key: str | None) -> dict:
    payload = api_get(
        f"mods/{project_id}/files",
        {
            "gameVersion": MC_VERSION,
            "modLoaderType": 6,  # NeoForge in the CurseForge API
            "pageSize": 100,
            "index": 0,
        },
        api_key,
    )
    data = unwrap(payload)
    if not isinstance(data, list):
        raise RuntimeError(f"Unexpected files response for project {project_id}")
    releases = [f for f in data if compatible(f)]
    if not releases:
        # Some website API responses omit the loader tag after server-side
        # filtering. Accept 1.21.1 release files only as a controlled fallback.
        releases = [
            f
            for f in data
            if MC_VERSION.casefold()
            in {str(v).casefold() for v in f.get("gameVersions", [])}
            and int(f.get("releaseType", 99)) == 1
        ]
    if not releases:
        raise RuntimeError(
            f"No stable Minecraft {MC_VERSION} NeoForge file found for project {project_id}"
        )
    releases.sort(
        key=lambda f: str(f.get("fileDate") or f.get("dateCreated") or ""),
        reverse=True,
    )
    return releases[0]


def clean_overrides(root: Path) -> None:
    config = root / "overrides" / "config"
    for relative in [
        "emi.css",
        "emi.json",
        "emi",
        "reeses_sodium_options.json",
        "reeses-sodium-options-options.json",
        "sodiumoptionsapi.json",
    ]:
        target = config / relative
        if target.is_dir():
            shutil.rmtree(target)
        elif target.exists():
            target.unlink()

    fallback = config / "bettercombat" / "fallback_compatibility.json"
    if fallback.exists():
        data = json.loads(fallback.read_text(encoding="utf-8"))
        entries = data.get("fallback_compatibility", [])
        data["fallback_compatibility"] = [
            entry
            for entry in entries
            if "oar_combat:" not in str(entry.get("item_id_regex", ""))
        ]
        fallback.write_text(json.dumps(data, indent=2) + "\n", encoding="utf-8")


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--base", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    parser.add_argument("--work", default=Path("build/modpack"), type=Path)
    args = parser.parse_args()

    api_key = os.environ.get("CF_API_KEY") or os.environ.get("CURSEFORGE_API_KEY")
    if args.work.exists():
        shutil.rmtree(args.work)
    args.work.mkdir(parents=True)

    with zipfile.ZipFile(args.base) as archive:
        archive.extractall(args.work)

    manifest_path = args.work / "manifest.json"
    manifest = json.loads(manifest_path.read_text(encoding="utf-8"))

    project_ids = {
        int(entry["projectID"])
        for entry in manifest.get("files", [])
        if int(entry["projectID"]) not in DENY_PROJECTS
    }
    project_ids.update(REQUIRED_PROJECTS)

    unresolved_search: list[str] = []
    for name in SEARCH_PROJECTS:
        try:
            project_ids.add(search_project(name, api_key))
        except Exception as exc:  # noqa: BLE001
            unresolved_search.append(f"{name}: {exc}")

    resolved: list[dict] = []
    failures: list[str] = []
    for project_id in sorted(project_ids):
        try:
            file = latest_file(project_id, api_key)
            resolved.append(
                {
                    "projectID": project_id,
                    "fileID": int(file["id"]),
                    "required": True,
                    "isLocked": False,
                    "fileName": file.get("fileName") or file.get("displayName"),
                    "fileDate": file.get("fileDate") or file.get("dateCreated"),
                }
            )
        except Exception as exc:  # noqa: BLE001
            failures.append(f"{project_id}: {exc}")

    # Never publish a partially guessed manifest.
    if failures or unresolved_search:
        report = {
            "failures": failures,
            "unresolvedSearchProjects": unresolved_search,
            "apiKeyPresent": bool(api_key),
        }
        Path("build").mkdir(exist_ok=True)
        Path("build/rebuild-failure.json").write_text(
            json.dumps(report, indent=2) + "\n", encoding="utf-8"
        )
        print(json.dumps(report, indent=2), file=sys.stderr)
        return 2

    manifest["name"] = "Os Aventureiros Reforged - Twilight Edition 0.4.1 - Relíquias Gobber"
    manifest["version"] = "0.4.1-neoforge-1.21.1-gobber"
    manifest["author"] = "Fernando Aurelius / Sistemium"
    manifest["files"] = [
        {key: item[key] for key in ("projectID", "fileID", "required", "isLocked")}
        for item in resolved
    ]
    manifest["overrides"] = "overrides"
    manifest_path.write_text(json.dumps(manifest, indent=2) + "\n", encoding="utf-8")

    clean_overrides(args.work)

    docs = args.work / "overrides" / "docs"
    docs.mkdir(parents=True, exist_ok=True)
    generated_at = datetime.now(timezone.utc).isoformat()
    report = {
        "generatedAt": generated_at,
        "minecraft": MC_VERSION,
        "loader": LOADER,
        "projects": resolved,
        "removedProjects": DENY_PROJECTS,
    }
    (docs / "MODPACK_0.4.1_RESOLUTION_REPORT.json").write_text(
        json.dumps(report, indent=2) + "\n", encoding="utf-8"
    )
    (docs / "README_0.4.1.txt").write_text(
        "Os Aventureiros Reforged 0.4.1\n"
        "Pack rebuilt automatically from current stable CurseForge releases for "
        "Minecraft 1.21.1 + NeoForge. Reese's Sodium Options, Sodium Options API, "
        "EMI and OAR Combat are intentionally absent.\n",
        encoding="utf-8",
    )

    args.output.parent.mkdir(parents=True, exist_ok=True)
    if args.output.exists():
        args.output.unlink()
    with zipfile.ZipFile(args.output, "w", compression=zipfile.ZIP_DEFLATED) as archive:
        for path in sorted(args.work.rglob("*")):
            if path.is_file():
                archive.write(path, path.relative_to(args.work))

    with zipfile.ZipFile(args.output) as archive:
        bad = archive.testzip()
        if bad:
            raise RuntimeError(f"Corrupt ZIP member: {bad}")
        parsed = json.loads(archive.read("manifest.json"))
        if len(parsed.get("files", [])) != len(resolved):
            raise RuntimeError("Manifest validation failed")

    print(f"Generated {args.output} with {len(resolved)} projects")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
