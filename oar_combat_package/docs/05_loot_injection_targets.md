# Loot injection targets

## Estrategia

Loot deve enriquecer a exploracao sem entregar set completo cedo. Priorizar:

- Fragmentos.
- 1 a 3 ingots.
- Equipamentos danificados.
- Componentes de upgrade.
- Orichalcum fragment muito raro.

## Targets confirmados

Battle Towers:

- `new_classic_battle_towers:loot_table/towerloot_1`
- `new_classic_battle_towers:loot_table/towerloot_2`

Dungeons and Taverns / Nova Structures:

- `nova_structures:loot_table/chests/dungeon_1` ate `dungeon_7`
- `nova_structures:loot_table/chests/creeping_crypt/vault_creeping`
- `nova_structures:loot_table/chests/desert_ruins/desert_ruin_main_temple`
- `nova_structures:loot_table/chests/end_castle/greater_loot`
- `nova_structures:loot_table/chests/illager_hideout_weaponry`
- `nova_structures:loot_table/chests/lone_citadel/c_vault`
- `nova_structures:loot_table/chests/piglin_donjon/vault_piglin_donjon`
- `nova_structures:loot_table/chests/shrine/combat_treasure_1` ate `combat_treasure_5`
- `nova_structures:loot_table/chests/stray_fort_tresure`

Terralith:

- `terralith:loot_table/spire/treasure`
- `terralith:loot_table/mage/treasure`
- `terralith:loot_table/underground/chest`

Aether structures:

- `aether:worldgen/structure/bronze_dungeon`
- `aether:worldgen/structure/silver_dungeon`
- `aether:worldgen/structure/gold_dungeon`

Twilight Forest structures:

- `twilightforest:worldgen/structure/lich_tower`
- `twilightforest:worldgen/structure/naga_courtyard`
- `twilightforest:worldgen/structure/labyrinth`
- `twilightforest:worldgen/structure/hydra_lair`
- `twilightforest:worldgen/structure/dark_tower`
- `twilightforest:worldgen/structure/knight_stronghold`
- `twilightforest:worldgen/structure/aurora_palace`
- `twilightforest:worldgen/structure/final_castle`

## Observacao tecnica

O scaffold nao deve sobrescrever loot tables de outros mods diretamente sem validacao. Preferir Global Loot Modifiers NeoForge ou abordagem equivalente segura. Os targets acima estao em `machine_readable/loot_targets.json`.
