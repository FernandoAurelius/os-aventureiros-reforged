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
- Manter Mythril fora do worldgen ativo nesta fase.

## Fase 3 - Ferramentas e armaduras

- Adaptar API exata 1.21.1 para ArmorMaterial/ToolMaterial.
- Implementar sets bronze/steel/silver/mythril/adamantite.
- Implementar efeitos: silver bonus, mythril speed/fall, adamantite penalty.
- Implementar efeitos de set leves e configuraveis no alpha.
- Manter stats configuraveis.

## Fase 4 - Compatibilidade de combate

- Merge Better Combat fallback config.
- Testar animacoes e armas.
- Validar Spartan recipes/tags.
- Investigar se Spartan Unofficial expoe API para registrar materiais customizados.
- Se houver API segura, integrar tin/bronze/steel/silver ao menos no fluxo de armas do Spartan.
- Se nao houver API segura, manter Spartan como compat opcional por tags/config/loot.

## Fase 5 - Loot

- Escolher estrategia segura de Global Loot Modifiers.
- Injetar fragmentos/ingots/equip danificado conservadoramente.
- Validar que Lootr continua funcionando.

## Fase 6 - Dimensoes e Mythril

- Somente apos validar target correto em Aether/Twilight.
- Se gerar em dimensoes modded, priorizar Aether e usar raridade baixa com biomas especificos reais.
- Mythril deve existir por loot dimensional basico mesmo antes do worldgen natural ficar pronto.
- Twilight Forest pode continuar apenas como fonte de loot/recompensa no alpha se o worldgen natural em dimensao modded aumentar muito o risco.

## Fase 6.5 - Adamantite dual-source

- Depois do alpha compilavel, avaliar segunda fonte de Adamantite no Nether.
- A primeira implementacao pode ficar apenas no Overworld profundo se isso reduzir risco de regressao.
- A segunda fonte deve ser tratada como expansao controlada, nao como requisito de bootstrap.

## Fase 6.6 - Orichalcum

- Implementar como componente de upgrade de armas e ferramentas.
- Nao criar set de armadura completo no alpha.
- Tratar como material de tier maximo e aquisicao rara.

## Fase 7 - Release alpha

- Gerar jar versionado.
- Atualizar manifest do modpack.
- Rodar dedicated server separado.
- So entao subir para servidor real.
