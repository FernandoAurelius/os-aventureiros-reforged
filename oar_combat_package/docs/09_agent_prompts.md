# Prompts para Codex

## Prompt principal

Use este pacote como fonte de verdade para implementar/adaptar o mod `oar_combat`.

Objetivo: criar um addon NeoForge 1.21.1 para o modpack Os Aventureiros Reforged - Twilight Edition, usando NeoForge 21.1.229, que adiciona materiais e progressao RPG Vanilla+ sem quebrar diamond/netherite.

Leia primeiro:

- START_HERE_FOR_CODEX.md
- docs/01_contexto_e_escopo.md
- docs/02_especificacao_funcional.md
- machine_readable/material_definitions.json
- docs/10_validation_checklist.md

Tarefa inicial:

1. Entre em `scaffold/oar_combat`.
2. Ajuste Gradle/NeoForge para o MDK real da VPS se necessario.
3. Faca a fase 1 compilar com itens/blocos/receitas/tags/modelos.
4. Nao ative armaduras/ferramentas ate o bootstrap compilar.
5. Gere um relatorio das alteracoes feitas e dos riscos restantes.

## Prompt de validacao

Valide o addon em ambiente separado do servidor real:

- `./gradlew clean build`
- `./gradlew runClient`
- `./gradlew runServer`
- Criar mundo novo.
- Verificar recipes no EMI.
- Verificar tags comuns.
- Verificar que o servidor sobe com Better Combat e Spartan.
- Verificar que o warning `#c:ingots/aluminum` foi resolvido ou explicado.

## Prompt de proxima fase

Depois do bootstrap compilar, implemente armaduras e ferramentas usando os stats de `machine_readable/material_definitions.json`. Adapte API de ArmorMaterial/ToolMaterial para Minecraft/NeoForge 1.21.1, mantenha efeitos configuraveis, e nao introduza hard dependency em Better Combat/Spartan.
