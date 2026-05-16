# Spartan Weaponry Unofficial compatibility

## Runtime confirmado

- Mod id: `spartan_weaponry_unofficial`
- Versao: `1.1.0`
- Config ativa: `config/spartan_weaponry_unofficial-common.toml`

## Archetypes confirmados

- dagger
- parrying_dagger
- longsword
- katana
- saber
- rapier
- greatsword
- club
- cestus
- battle_hammer
- warhammer
- spear
- halberd
- pike
- lance
- longbow
- heavy_crossbow
- throwing_knife
- tomahawk
- javelin
- boomerang
- battleaxe
- flanged_mace
- glaive
- quarterstaff
- scythes

## Materiais extras que o Spartan tenta suportar/configurar

- copper
- tin
- bronze
- steel
- silver
- electrum
- lead
- nickel
- invar
- constantan
- platinum
- aluminum

## Riscos reais encontrados

- Tag ausente: `#c:ingots/aluminum`.
- Warning de trait invalida: `spartan_weaponry_unofficial:reach_1` para Javelin.
- Config corrigiu `traits.damage_bonus.max_armor_value` de `0.0` para default `1.0`.

## Estrategia segura

1. Nao assumir que todos os materiais extras existem.
2. Garantir tags `c:ingots/tin`, `c:ingots/bronze`, `c:ingots/steel`, `c:ingots/silver`.
3. Incluir tag vazia `c:ingots/aluminum` como hotfix defensivo, se validada.
4. Nao depender de trait `reach_1` ate confirmar registro real.
5. Fazer compat via tags/receitas/config, nao via internals instaveis.

## Arquivos incluidos

- `config_templates/spartan/spartan_compat_notes.toml`
- Tag placeholder em `scaffold/oar_combat/src/main/resources/data/c/tags/item/ingots/aluminum.json`
