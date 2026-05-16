# OAR Combat Expansion - Handover Package

Pacote tecnico para o agente de codificacao implementar/adaptar a expansao autoral de combate e armaduras do modpack **Os Aventureiros Reforged - Twilight Edition**.

Este pacote foi preparado para economizar tokens do agente de codificacao: contem contexto consolidado, especificacao, matrizes de balanceamento, alvos reais de loot/bioma/dimensao, configs de compatibilidade, assets visuais, JSONs data-driven e um scaffold inicial de mod NeoForge.

## Target confirmado

- Minecraft: `1.21.1`
- NeoForge runtime real: `21.1.229`
- Better Combat: `2.3.2+1.21.1`
- Spartan Weaponry Unofficial: `1.1.0`
- Mod id sugerido: `oar_combat`
- Nome sugerido: `Os Aventureiros Reforged Combat Expansion`

## Como usar

1. Comece por `START_HERE_FOR_CODEX.md`.
2. Leia `docs/01_contexto_e_escopo.md` e `docs/02_especificacao_funcional.md`.
3. Use `machine_readable/material_definitions.json` como fonte de verdade para stats e ids planejados.
4. Use `scaffold/oar_combat/` como ponto de partida do mod NeoForge.
5. Rode a validacao em uma copia do ambiente da VPS antes de colocar no servidor real.

## O que esta pronto

- Documentacao funcional e tecnica.
- Assets visuais e PDFs/MDs ja produzidos.
- IDs reais de mods, dimensoes, estruturas, biomas e loot tables fornecidos pelo runtime.
- Scaffold inicial de mod NeoForge com itens, blocos, recipes, tags, modelos e texturas placeholder.
- Dados JSON para worldgen Overworld de estanho, prata e adamantita.
- Templates seguros para Better Combat e Spartan.
- Checklists de validacao e prompts para Codex.

## O que o agente ainda precisa validar no ambiente real

- Sintaxe exata do Gradle/NeoForge MDK no projeto da VPS.
- Compilacao do scaffold com NeoForge `21.1.229`.
- API exata de ArmorMaterial/ToolMaterial em Minecraft/NeoForge `1.21.1` antes de ativar armaduras/ferramentas completas.
- Formato final de Global Loot Modifiers ou alternativa de injeção de loot.
- Worldgen em dimensoes modded antes de ativar Mythril em Aether/Twilight.

## Entregaveis principais

- `scaffold/oar_combat/` - projeto-base do addon.
- `docs/` - especificacao e plano de execucao.
- `machine_readable/` - dados para geracao/adaptacao automatica.
- `config_templates/` - snippets de Better Combat e Spartan.
- `visual_assets/` - imagens, PDFs e MDs de guia/expansao.
