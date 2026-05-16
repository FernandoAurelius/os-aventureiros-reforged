# Worldgen plan

## O que ativar no alpha

Ativar apenas Overworld controlado:

- Tin: Y 32 a 96, moderado, veios pequenos/medios.
- Silver: Y -32 a 48, incomum, veios pequenos.
- Adamantite: Y -64 a -32, muito raro, veios muito pequenos.

## O que manter desativado

- Mythril ore em Aether/Twilight deve ficar desativado no alpha.
- Orichalcum nao deve gerar como ore comum.

## IDs reais de dimensao fornecidos

- Aether: `aether:dimension/the_aether`
- Twilight Forest: `twilightforest:dimension/twilight_forest`
- Terralith: atua no `minecraft:dimension/overworld`

## Biomas reais importantes

Aether:

- `aether:worldgen/biome/skyroot_forest`
- `aether:worldgen/biome/skyroot_grove`
- `aether:worldgen/biome/skyroot_meadow`
- `aether:worldgen/biome/skyroot_woodland`

Twilight Forest:

- `twilightforest:worldgen/biome/clearing`
- `twilightforest:worldgen/biome/dark_forest`
- `twilightforest:worldgen/biome/dense_forest`
- `twilightforest:worldgen/biome/enchanted_forest`
- `twilightforest:worldgen/biome/highlands`
- `twilightforest:worldgen/biome/lake`
- `twilightforest:worldgen/biome/swamp`

## Implementacao sugerida

- Usar JSON configured_feature/placed_feature para ores do Overworld.
- Usar NeoForge biome modifiers para adicionar features a `#minecraft:is_overworld`.
- Para dimensoes modded, criar templates desativados ate validar se o target por biome tag/explicit biome esta correto.
