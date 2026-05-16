#!/usr/bin/env python3
from pathlib import Path
import json
root = Path(__file__).resolve().parents[1]
required = [
    'README.md',
    'START_HERE_FOR_CODEX.md',
    'machine_readable/material_definitions.json',
    'machine_readable/loot_targets.json',
    'scaffold/oar_combat/build.gradle',
    'scaffold/oar_combat/src/main/resources/META-INF/neoforge.mods.toml',
]
missing = [p for p in required if not (root / p).exists()]
if missing:
    print('Missing required files:')
    for p in missing:
        print(' -', p)
    raise SystemExit(1)
for p in ['machine_readable/material_definitions.json', 'machine_readable/loot_targets.json']:
    json.loads((root / p).read_text(encoding='utf-8'))
print('Handover tree looks consistent.')
