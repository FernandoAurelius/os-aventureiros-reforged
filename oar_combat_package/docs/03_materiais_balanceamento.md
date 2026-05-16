# Materiais e balanceamento

## Matrix de tiers

| Material | Momento | Papel | Deve vencer em | Deve perder em |
|---|---|---|---|---|
| Tin | early | suporte de liga | acesso a bronze | combate direto |
| Bronze | early | alternativo | custo/acesso | defesa vs ferro |
| Steel | mid | militar | durabilidade | magia/encantabilidade |
| Silver | mid situacional | anti-undead | alvo vulneravel | durabilidade geral |
| Mythril | late lateral | explorador | mobilidade | defesa/toughness |
| Adamantite | late lateral | tanque | defesa/toughness | velocidade |
| Orichalcum | endgame | upgrade | unicidade | disponibilidade |

## Stats iniciais sugeridos

A fonte machine-readable esta em `machine_readable/material_definitions.json`.

### Armaduras

| Material | Helmet | Chest | Legs | Boots | Total | Toughness | Observacao |
|---|---:|---:|---:|---:|---:|---:|---|
| Bronze | 2 | 5 | 4 | 1 | 12 | 0 | abaixo de ferro |
| Steel | 2 | 6 | 5 | 2 | 15 | 1 | entre ferro e diamante |
| Silver | 2 | 5 | 4 | 2 | 13 | 0 | situacional |
| Mythril | 3 | 6 | 5 | 2 | 16 | 1 | leve/movel |
| Adamantite | 3 | 8 | 6 | 3 | 20 | 2 | pesada/tanque |

## Regras anti-power-creep

- Netherite nao deve ser invalidada.
- Adamantite nao deve ter resistencia a lava igual Netherite no alpha.
- Mythril nao deve permitir voo, salto exagerado ou imunidade a queda.
- Silver so deve brilhar contra tags vulneraveis.
- Orichalcum deve ser componente/upgrade, nao set farmavel.
