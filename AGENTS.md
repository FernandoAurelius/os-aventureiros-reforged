# AGENTS.md

## Objetivo

Este repositório guarda a base versionada do servidor `Os Aventureiros Reforged - Twilight Edition` para Minecraft `1.21.1` com NeoForge. Agentes devem tratar este diretório como infraestrutura viva de um servidor em operação, não como um projeto descartável.

## Contexto do servidor

- O foco do servidor é cooperação, exploração, estruturas e progressão por fases.
- A jornada esperada passa por Overworld, estruturas e preparo, Aether e Twilight Forest.
- `JourneyMap`, `Waystones`, mochilas, acessórios e loot de estruturas fazem parte central da experiência.
- O mundo real do servidor fica em `world/` e nao deve ser alterado sem necessidade operacional clara.

## O que normalmente pode ser alterado

- `README.md`
- `docs/`
- `server.properties`
- `user_jvm_args.txt`
- `start.sh`, `run.sh`, `run.bat`
- `mods/`
- `config/`
- `defaultconfigs/`

## O que exige cuidado extra

- qualquer mudanca em `mods/` que altere compatibilidade de saves
- qualquer mudanca em `config/` que altere progressao, spawn, dimensoes, estruturas ou geracao de mundo
- qualquer acao que afete `world/`, `ops.json`, `whitelist.json` ou caches de usuario
- qualquer limpeza de arquivos gerados se houver chance de apagar estado ainda util

## Regras operacionais

1. Sempre leia o estado atual antes de editar. Compare `README.md`, `server.properties`, `mods/` e `config/` com a tarefa pedida.
2. Nunca remova ou regenere `world/` sem instrucao explicita do usuario.
3. Nao altere a progressao da campanha por acidente. Mudancas em Aether, Twilight Forest, Waystones, JourneyMap, estruturas ou loot devem ser intencionais e documentadas.
4. Antes de mudar modpack, considere impacto em compatibilidade de save, dependencias e configuracoes associadas.
5. Prefira mudancas pequenas e auditaveis. Se alterar mod ou configuracao, explique o efeito operacional esperado.
6. Preserve o material em `docs/` como referencia de design e progressao do servidor.
7. Nao exponha segredos por padrao. Se algum dia houver credenciais ou integracoes, valide antes de versionar.

## Fluxo recomendado para agentes

1. Verifique `git status` e leia a documentacao relevante.
2. Se a tarefa envolver ambientacao, progressao ou onboarding, use `docs/` como fonte primaria de contexto.
3. Se a tarefa envolver operacao do servidor, revise `start.sh`, `run.sh`, `user_jvm_args.txt` e `server.properties`.
4. Se a tarefa envolver modpack, revise `mods/` e `config/` em conjunto.
5. Depois das mudancas, valide o diff e resuma impactos reais para o usuario.

## Limites de seguranca

- Nao execute acoes destrutivas em Git sem pedido explicito.
- Nao assuma que arquivos ignorados sao descartaveis; eles podem conter estado do servidor.
- Nao reescreva configuracoes em massa sem entender o efeito no save atual.
- Nao trate este repositorio como ambiente de testes isolado se o servidor real depende dele.
