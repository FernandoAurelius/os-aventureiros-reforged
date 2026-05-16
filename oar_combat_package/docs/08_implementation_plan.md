# Implementation plan

## Fase 0 - Preparacao

- Abrir `scaffold/oar_combat`.
- Confirmar Java 21.
- Confirmar Gradle wrapper/NeoForge plugin adequado.
- Ajustar `build.gradle` para o MDK real da VPS se necessario.

## Fase 1 - Bootstrap compilavel

- Registrar itens base.
- Registrar blocos de ore/storage.
- Registrar creative tab.
- Incluir textures/models/lang/recipes/tags.
- Buildar jar.

## Fase 2 - Worldgen Overworld

- Ativar configured/placed features de tin, silver e adamantite.
- Usar biome modifiers NeoForge.
- Criar mundo novo e validar geracao.

## Fase 3 - Ferramentas e armaduras

- Adaptar API exata 1.21.1 para ArmorMaterial/ToolMaterial.
- Implementar sets bronze/steel/silver/mythril/adamantite.
- Implementar efeitos: silver bonus, mythril speed/fall, adamantite penalty.
- Manter stats configuraveis.

## Fase 4 - Compatibilidade de combate

- Merge Better Combat fallback config.
- Testar animacoes e armas.
- Validar Spartan recipes/tags.

## Fase 5 - Loot

- Escolher estrategia segura de Global Loot Modifiers.
- Injetar fragmentos/ingots/equip danificado conservadoramente.
- Validar que Lootr continua funcionando.

## Fase 6 - Dimensoes e Mythril

- Somente apos validar target correto em Aether/Twilight.
- Se gerar em dimensoes modded, usar raridade baixa e biomas especificos.
- Alternativa preferida no alpha: Mythril via loot dimensional.

## Fase 7 - Release alpha

- Gerar jar versionado.
- Atualizar manifest do modpack.
- Rodar dedicated server separado.
- So entao subir para servidor real.
