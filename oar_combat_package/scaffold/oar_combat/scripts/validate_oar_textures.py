#!/usr/bin/env python3
from pathlib import Path
import json
import struct
import sys

if len(sys.argv) != 2:
    print('usage: validate_oar_textures.py <assets_modid_dir>')
    sys.exit(2)
root = Path(sys.argv[1])
if not root.exists():
    print(f'ERROR: not found: {root}')
    sys.exit(1)
def read_png_size(path: Path) -> tuple[int, int]:
    with path.open('rb') as f:
        if f.read(8) != b'\x89PNG\r\n\x1a\n':
            raise ValueError('not a PNG file')
        if f.read(4) != struct.pack('>I', 13):
            raise ValueError('invalid PNG header')
        if f.read(4) != b'IHDR':
            raise ValueError('missing IHDR chunk')
        width, height = struct.unpack('>II', f.read(8))
        return width, height

errors=[]
for p in (root/'textures'/'item').glob('*.png'):
    size = read_png_size(p)
    if size != (16,16): errors.append(f'{p}: expected 16x16, got {size}')
for p in (root/'textures'/'block').glob('*.png'):
    size = read_png_size(p)
    if size != (16,16): errors.append(f'{p}: expected 16x16, got {size}')
for p in (root/'textures'/'models'/'armor').glob('*.png'):
    size = read_png_size(p)
    if size != (64,32): errors.append(f'{p}: expected 64x32 armor layer, got {size}')
for p in list((root/'models'/'item').glob('*.json')) + list((root/'models'/'block').glob('*.json')) + list((root/'blockstates').glob('*.json')):
    try: json.loads(p.read_text(encoding='utf-8'))
    except Exception as e: errors.append(f'{p}: invalid json: {e}')
if errors:
    print('TEXTURE VALIDATION FAILED')
    for e in errors: print(' -',e)
    sys.exit(1)
print('OK: texture dimensions and JSON syntax look valid')
