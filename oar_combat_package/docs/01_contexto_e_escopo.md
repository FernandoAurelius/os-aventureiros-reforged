# Contexto e escopo

## Modpack alvo

- Nome: Os Aventureiros Reforged - Twilight Edition
- Minecraft: 1.21.1
- NeoForge real do servidor: 21.1.229
- Estilo: aventura Vanilla+, exploracao, dungeons, Aether, Twilight Forest, Terralith, Battle Towers, Waystones e cooperacao.

## Filosofia da expansao

A expansao nao deve substituir Minecraft vanilla. Ela deve enriquecer o combate com escolhas horizontais e progressao RPG leve:

- Mais tipos de arma.
- Mais papeis de armadura.
- Mais materiais com identidade.
- Mais recompensas para exploracao.
- Menos dependencia de simplesmente aumentar dano/defesa.

Regra central: **novos materiais vencem por especializacao, nao por poder bruto universal.**

## Rota escolhida

Rota B disciplinada:

- Better Combat para sensacao de combate.
- Spartan Weaponry Unofficial para variedade de armas.
- Addon autoral `oar_combat` para materiais/progressao/equipamentos controlados.
- Implementacao em mod NeoForge puro, sem depender de KubeJS como camada principal.

## Materiais planejados

- Tin: suporte de liga para bronze.
- Bronze: early game alternativo.
- Steel: mid game confiavel e militar.
- Silver: situacional contra mortos-vivos e criaturas misticas.
- Mythril: material elfico/Tolkien-style, leve e encantavel.
- Adamantite: metal pesado ancestral, defensivo, austero, nao Netherite recolorida.
- Orichalcum: verde/verde-escuro brilhante, raro, arcano, usado para upgrades lendarios.

## Escopo v0.1 alpha

Entra:

- Itens base e blocos de armazenamento.
- Ores de tin, silver e adamantite no Overworld.
- Adamantite tambem planejada para expansao posterior no Nether, com validacao de worldgen em ambiente real.
- Receitas e tags comuns.
- Texturas placeholder consistentes com o conceito visual.
- Compat templates para Better Combat/Spartan.
- Scaffold para armaduras/ferramentas/effects a ser adaptado.
- Efeitos de set para armaduras ja entram como alvo de implementacao da v0.1, desde que sejam leves e configuraveis.
- Orichalcum entra como material de upgrade de armas e ferramentas, nao como set completo.
- Spartan segue opcional em dependencia, mas integrada a gameplay por tags, receitas, loot e investigacao de API para materiais customizados.

Nao entra de imediato:

- Orichalcum set completo.
- Skill tree.
- Magia complexa.
- Overhaul de encantamentos.
- Dependencia dura de Better Combat/Spartan.

## Decisoes fechadas nesta iteracao

- Mythril pode existir como minerio natural no Aether, se o formato e os targets reais forem validados; no alpha ele tambem deve existir por loot dimensional basico.
- Adamantite e candidata a existir no Overworld profundo e no Nether, mas a implementacao deve começar pelo caminho mais simples/seguro que compile e gere sem regressao.
- Orichalcum e material de upgrade de armas e ferramentas na v1, com foco em tier maximo e sem set completo.
- Efeitos de set sao desejados ja na primeira versao, mas devem ser conservadores e nao transformar a progressao em power creep.
