#!/usr/bin/env python3
from pathlib import Path
import json
import struct
import sys

if len(sys.argv) != 2:
    print("usage: validate_oar_textures.py <assets_modid_dir>")
    sys.exit(2)

root = Path(sys.argv[1])
if not root.exists():
    print(f"ERROR: not found: {root}")
    sys.exit(1)


def read_png_size(path: Path) -> tuple[int, int]:
    with path.open("rb") as f:
        if f.read(8) != b"\x89PNG\r\n\x1a\n":
            raise ValueError("not a PNG file")
        f.read(8)
        return struct.unpack(">II", f.read(8))


errors = []
allowed_sizes = {
    "textures/item": {(16, 16), (32, 32)},
    "textures/block": {(16, 16), (32, 32)},
    "textures/models/armor": {(64, 32), (128, 64)},
}

for folder, allowed in allowed_sizes.items():
    for path in (root / folder).glob("*.png"):
        size = read_png_size(path)
        if size not in allowed:
            errors.append(f"{path}: expected one of {sorted(allowed)}, got {size}")

for folder in ("models/item", "models/block", "blockstates"):
    for path in (root / folder).glob("*.json"):
        try:
            json.loads(path.read_text(encoding="utf-8"))
        except Exception as exc:
            errors.append(f"{path}: invalid json: {exc}")

for material in ("adamantite", "mythril"):
    for tool in ("sword", "pickaxe", "axe", "shovel", "hoe"):
        path = root / "models" / "item" / f"{material}_{tool}.json"
        if path.exists():
            obj = json.loads(path.read_text(encoding="utf-8"))
            if obj.get("parent") != "minecraft:item/handheld":
                errors.append(f"{path}: tools/weapons must use minecraft:item/handheld")

if errors:
    print("TEXTURE VALIDATION FAILED")
    for error in errors:
        print(" -", error)
    sys.exit(1)

print("OK: texture assets and model parents look valid")
