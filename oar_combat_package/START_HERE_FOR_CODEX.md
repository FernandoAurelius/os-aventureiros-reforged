# START HERE - Codex Handover

Voce e o agente de codificacao responsavel por transformar este pacote em um addon NeoForge funcional para o modpack.

## Resultado esperado

Criar/adaptar o mod `oar_combat` para Minecraft `1.21.1` + NeoForge `21.1.229`, adicionando uma expansao Vanilla+ de combate, materiais, armaduras e progressao RPG sem quebrar a progressao vanilla.

## Ordem obrigatoria de trabalho

1. Validar o projeto Gradle/NeoForge em `scaffold/oar_combat/`.
2. Fazer a fase 1 compilar: itens base, blocos, tags, receitas, modelos e texturas.
3. Rodar `./gradlew clean build` e corrigir API/sintaxe conforme MDK real.
4. Rodar `./gradlew runData` se a estrutura de datagen for ativada.
5. Rodar `./gradlew runClient` e `./gradlew runServer`.
6. Somente depois ativar/adaptar ferramentas, armaduras e efeitos especiais.
7. Integrar Better Combat via fallback compat/config ou data pack, conforme formato real instalado.
8. Integrar Spartan de forma opcional e defensiva, sem hard dependency.
9. Implementar loot injection apos validar formato de NeoForge Global Loot Modifiers ou alternativa segura.
10. Testar dentro da instancia real do modpack na VPS.

## Nao fazer

- Nao transformar Mythril/Adamantita/Oricalco em power creep universal.
- Nao gerar Mythril em dimensoes modded sem validar biomas/dimension ids em runtime.
- Nao depender de trait `spartan_weaponry_unofficial:reach_1` sem confirmar registro real.
- Nao assumir que materiais extras do Spartan existem no pack.
- Nao sobrescrever config de Better Combat sem merge/backup.
- Nao publicar jar no servidor real sem teste em instancia separada.

## Fonte de verdade

- Dados de runtime: `reference/runtime_handoff_info_from_user.txt`
- Materiais: `machine_readable/material_definitions.json`
- Loot targets: `machine_readable/loot_targets.json`
- Better Combat: `config_templates/bettercombat/`
- Spartan: `docs/07_spartan_compat.md`
- Plano de validacao: `docs/10_validation_checklist.md`
