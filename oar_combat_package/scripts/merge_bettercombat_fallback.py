#!/usr/bin/env python3
"""Merge OAR Better Combat fallback compatibility entries into an existing fallback_compatibility.json.
Usage:
  python scripts/merge_bettercombat_fallback.py /path/to/config/bettercombat/fallback_compatibility.json config_templates/bettercombat/oar_fallback_compatibility_entries.json
The script creates a .bak file and avoids duplicate item_id_regex entries.
"""
from __future__ import annotations
import json, shutil, sys
from pathlib import Path

if len(sys.argv) != 3:
    print("Usage: merge_bettercombat_fallback.py <target fallback_compatibility.json> <oar entries json>", file=sys.stderr)
    sys.exit(2)

target = Path(sys.argv[1])
source = Path(sys.argv[2])
if not target.exists():
    raise SystemExit(f"Target file not found: {target}")
if not source.exists():
    raise SystemExit(f"Source file not found: {source}")

backup = target.with_suffix(target.suffix + ".bak")
shutil.copy2(target, backup)

with target.open("r", encoding="utf-8") as f:
    current = json.load(f)
with source.open("r", encoding="utf-8") as f:
    incoming = json.load(f)

current_entries = current.setdefault("fallback_compatibility", [])
incoming_entries = incoming.get("fallback_compatibility", [])
seen = {entry.get("item_id_regex") for entry in current_entries if isinstance(entry, dict)}
added = 0
for entry in incoming_entries:
    regex = entry.get("item_id_regex")
    if regex and regex not in seen:
        current_entries.append(entry)
        seen.add(regex)
        added += 1

with target.open("w", encoding="utf-8") as f:
    json.dump(current, f, indent=2)
    f.write("\n")

print(f"Merged {added} OAR entries into {target}")
print(f"Backup created at {backup}")
