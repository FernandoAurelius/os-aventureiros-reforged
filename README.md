# Os Aventureiros Reforged

Servidor e modpack da campanha `Os Aventureiros Reforged - Twilight Edition` para Minecraft `1.21.1` com NeoForge.

## Escopo do repositório

Este repositório versiona a base operacional do servidor e do modpack:

- `mods/`
- `config/`
- `defaultconfigs/`
- scripts de inicialização (`start.sh`, `run.sh`, `run.bat`)
- arquivos principais do servidor (`server.properties`, `user_jvm_args.txt`, `eula.txt`, `server-icon.png`)
- material de apoio em `docs/`

Itens de runtime e estado local ficam fora do Git por `.gitignore`, incluindo:

- `world/`
- `logs/`
- `libraries/`
- caches de usuários e listas administrativas
- artefatos gerados localmente

## Tema e progressão da campanha

O servidor é orientado para cooperação, exploração e progressão por fases:

1. Overworld com Terralith, base inicial e coleta dos primeiros recursos.
2. Estruturas e preparo com dungeons, Battle Towers, loot, camas, comida e mochilas.
3. Expansão para Aether, com mobilidade, tesouros e progressão vertical.
4. Progressão em Twilight Forest, com chefes, ruínas e avanço em grupo.

Elementos centrais do modpack e da campanha:

- exploração guiada por `JourneyMap`
- rotas e logística com `Waystones`
- mochilas e acessórios para expedições
- dungeons e estruturas como eixo de progressão
- foco em jogo cooperativo e registro de pontos importantes

## Operação local

Para iniciar o servidor neste host:

```bash
./start.sh
```

O script ajusta o `PATH` para usar Java em `$HOME/java/bin` e delega para `run.sh`.

## Fluxo de manutenção

- Faça mudanças pequenas e rastreáveis.
- Revise `server.properties`, `mods/` e `config/` juntos quando houver alteração de modpack.
- Trate mudanças em progressão, dimensões e geração de mundo como sensíveis.
- Não versione `world/` neste repositório sem decisão explícita.

## Documentação de apoio

O diretório `docs/` contém o guia visual da campanha, usado como referência de ambientação e progressão:

- começo cooperativo com base compartilhada
- papéis iniciais de exploração, mineração e construção
- uso de JourneyMap, Waystones, bússolas, camas, tochas e comida
- metas de campanha como base principal, exploração de biomas, Battle Towers, Aether e Twilight Forest
