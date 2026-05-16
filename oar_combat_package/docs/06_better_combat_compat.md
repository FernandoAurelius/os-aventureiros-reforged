# Better Combat compatibility

## Runtime confirmado

- Mod id: `bettercombat`
- Versao: `2.3.2+1.21.1`
- Config ativa: `config/bettercombat/server.json5`
- Fallback compat: `config/bettercombat/fallback_compatibility.json`

## Presets confirmados

- `bettercombat:dagger`
- `bettercombat:sword`
- `bettercombat:mace`
- `bettercombat:spear`
- `bettercombat:halberd`
- `bettercombat:glaive`
- `bettercombat:lance`
- `bettercombat:katana`
- `bettercombat:rapier`
- `bettercombat:trident`

## Estrategia segura

1. Nao colocar Better Combat como dependencia obrigatoria.
2. Entregar snippet para merge em `fallback_compatibility.json`.
3. Fazer backup da config antes do merge.
4. Validar no servidor dedicado.
5. Se o formato mudar, adaptar pelo arquivo real instalado.

## Arquivos incluidos

- `config_templates/bettercombat/oar_fallback_compatibility_entries.json`
- `scripts/merge_bettercombat_fallback.py`

## Regex sugeridos

- `^oar_combat:.*dagger.*|^oar_combat:.*knife.*` -> `bettercombat:dagger`
- `^oar_combat:.*rapier.*` -> `bettercombat:rapier`
- `^oar_combat:.*katana.*` -> `bettercombat:katana`
- `^oar_combat:.*spear.*` -> `bettercombat:spear`
- `^oar_combat:.*glaive.*` -> `bettercombat:glaive`
- `^oar_combat:.*halberd.*` -> `bettercombat:halberd`
- `^oar_combat:.*hammer.*|^oar_combat:.*mace.*|^oar_combat:.*club.*` -> `bettercombat:mace`
- `^oar_combat:.*sword.*|^oar_combat:.*blade.*` -> `bettercombat:sword`
