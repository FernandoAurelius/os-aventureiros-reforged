# Runtime handoff info normalized

Esta secao consolida a informacao enviada pelo operador do servidor. Ela deve ser tratada como fonte de verdade operacional, mas ainda precisa ser validada por build/test no ambiente real.

```text
 Instalei e validei em runtime:

  - bettercombat 2.3.2+1.21.1
  - spartan_weaponry_unofficial 1.1.0
  - dependências reais carregadas:
      - playeranimator 2.0.4+1.21.1
      - cloth_config 15.0.140
      - tiny_config 3.1.0 vindo jar-in-jar do Better Combat

  Também há um detalhe importante: o servidor real está em NeoForge 21.1.229, não 21.1.209. Para o pacote de extensão, a base correta agora é Minecraft
  1.21.1 + NeoForge 21.1.229.

  Tópico 10, já confirmado
  IDs de mods carregados mais relevantes:

  - aether
  - twilightforest
  - lootr
  - waystones
  - bettercombat
  - spartan_weaponry_unofficial
  - playeranimator
  - cloth_config
  - tiny_config
  - terralith
  - mr_dungeons_andtaverns
  - new_classic_battle_towers
  - travelersbackpack
  - accessories

  Versões reais do stack de combate:

  - bettercombat: 2.3.2+1.21.1
  - spartan_weaponry_unofficial: 1.1.0
  - playeranimator: 2.0.4+1.21.1
  - cloth_config: 15.0.140

  Dimensões e tipos de dimensão:

  - Aether:
      - aether:dimension/the_aether
      - aether:dimension_type/the_aether
  - Twilight Forest:
      - twilightforest:dimension/twilight_forest
      - twilightforest:dimension_type/twilight_forest_type
  - Terralith:
      - atua no minecraft:dimension/overworld

  Biomas reais principais:

  - Aether:
      - aether:worldgen/biome/skyroot_forest
      - aether:worldgen/biome/skyroot_grove
      - aether:worldgen/biome/skyroot_meadow
      - aether:worldgen/biome/skyroot_woodland
  - Twilight Forest:
      - twilightforest:worldgen/biome/clearing
      - twilightforest:worldgen/biome/dark_forest
      - twilightforest:worldgen/biome/dark_forest_center
      - twilightforest:worldgen/biome/dense_forest
      - twilightforest:worldgen/biome/enchanted_forest
      - twilightforest:worldgen/biome/final_plateau
      - twilightforest:worldgen/biome/fire_swamp
      - twilightforest:worldgen/biome/glacier
      - twilightforest:worldgen/biome/highlands
      - twilightforest:worldgen/biome/lake
      - twilightforest:worldgen/biome/swamp
      - twilightforest:worldgen/biome/thornlands
  - Terralith:
      - há 130 biomes reais entre vanilla e Terralith
      - exemplos úteis para compatibilidade:
          - terralith:worldgen/biome/alpha_islands
          - terralith:worldgen/biome/alpine_grove
          - terralith:worldgen/biome/amethyst_canyon
          - terralith:worldgen/biome/blooming_valley
          - terralith:worldgen/biome/desert_oasis
          - terralith:worldgen/biome/fractured_savanna
          - terralith:worldgen/biome/lavender_forest
          - terralith:worldgen/biome/moonlight_grove
          - terralith:worldgen/biome/orchid_swamp
          - terralith:worldgen/biome/rocky_mountains
          - terralith:worldgen/biome/skylands_summer
          - terralith:worldgen/biome/volcanic_crater
          - terralith:worldgen/biome/yellowstone

  Estruturas reais:

  - Aether:
      - aether:worldgen/structure/bronze_dungeon
      - aether:worldgen/structure/silver_dungeon
      - aether:worldgen/structure/gold_dungeon
      - aether:worldgen/structure/large_aercloud
  - Twilight Forest:
      - twilightforest:worldgen/structure/lich_tower
      - twilightforest:worldgen/structure/naga_courtyard
      - twilightforest:worldgen/structure/labyrinth
      - twilightforest:worldgen/structure/hydra_lair
      - twilightforest:worldgen/structure/dark_tower
      - twilightforest:worldgen/structure/knight_stronghold
      - twilightforest:worldgen/structure/yeti_cave
      - twilightforest:worldgen/structure/aurora_palace
      - twilightforest:worldgen/structure/final_castle
      - mais hollow hills, quest grove, troll cave etc.
  - Battle Towers:
      - new_classic_battle_towers:worldgen/structure/battletower_1
      - new_classic_battle_towers:worldgen/structure/battletower_2
  - Dungeons and Taverns:
      - namespace real: nova_structures
      - exemplos relevantes:
          - nova_structures:worldgen/structure/creeping_crypt
          - nova_structures:worldgen/structure/desert_ruins
          - nova_structures:worldgen/structure/end_castle
          - nova_structures:worldgen/structure/firewatch_tower_forest
          - nova_structures:worldgen/structure/illager_hideout
          - nova_structures:worldgen/structure/lone_citadel
          - nova_structures:worldgen/structure/nether_keep
          - nova_structures:worldgen/structure/piglin_donjon
          - nova_structures:worldgen/structure/shrine_combat_tier_1 até shrine_combat_tier_5
          - nova_structures:worldgen/structure/stray_fort
          - nova_structures:worldgen/structure/tavern_oak
          - nova_structures:worldgen/structure/toxic_lair
          - nova_structures:worldgen/structure/undead_crypt
          - nova_structures:worldgen/structure/witch_villa

  Loot tables reais úteis para injeção:

  - Battle Towers:
      - new_classic_battle_towers:loot_table/towerloot_1
      - new_classic_battle_towers:loot_table/towerloot_2
  - Spartan já injeta em:
      - spartan_weaponry_unofficial:loot_table/inject/chests/end_city_treasure
      - spartan_weaponry_unofficial:loot_table/inject/chests/village/village_fletcher
      - spartan_weaponry_unofficial:loot_table/inject/chests/village/village_weaponsmith
  - Dungeons and Taverns:
      - namespace real é nova_structures:loot_table/...
      - exemplos úteis:
          - nova_structures:loot_table/chests/dungeon_1 até dungeon_7
          - nova_structures:loot_table/chests/creeping_crypt/vault_creeping
          - nova_structures:loot_table/chests/desert_ruins/desert_ruin_main_temple
          - nova_structures:loot_table/chests/end_castle/greater_loot
          - nova_structures:loot_table/chests/illager_hideout_weaponry
          - nova_structures:loot_table/chests/lone_citadel/c_vault
          - nova_structures:loot_table/chests/piglin_donjon/vault_piglin_donjon
          - nova_structures:loot_table/chests/shrine/combat_treasure_1 até combat_treasure_5
          - nova_structures:loot_table/chests/stray_fort_tresure
  - Terralith:
      - terralith:loot_table/spire/treasure
      - terralith:loot_table/mage/treasure
      - terralith:loot_table/underground/chest
  - Lootr:
      - mod id confirmado lootr
      - ele usa seus próprios blocos/containers, mas não te dá um alvo de injeção “de progressão”; ele intercepta experiência de saque

  Formato real do Better Combat:

  - config ativa em config/bettercombat/server.json5
  - compat fallback em config/bettercombat/fallback_compatibility.json
  - o formato real de compatibilidade usa preset ids como:
      - bettercombat:dagger
      - bettercombat:sword
      - bettercombat:mace
      - bettercombat:spear
      - bettercombat:halberd
      - bettercombat:glaive
      - bettercombat:lance
      - bettercombat:katana
      - bettercombat:rapier
      - bettercombat:trident
  - exemplo real de mapeamento:
      - regex dagger|knife -> bettercombat:dagger
      - regex trident|javelin|impaled -> bettercombat:trident
      - regex sword|blade -> bettercombat:sword
  - o runtime registrou:
      - Encoded Weapon Attribute registry size ... 23379 bytes
  - então o sistema de weapon attributes está ativo e funcional no servidor

  Formato real do Spartan:

  - config ativa em config/spartan_weaponry_unofficial-common.toml
  - archetypes confirmados por config:
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
  - materiais extras que o mod tenta suportar/configurar:
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

  Problemas reais encontrados no boot

  - falta tag:
      - #c:ingots/aluminum (from mod/spartan_weaponry_unofficial)
  - warning de trait inválida:
      - spartan_weaponry_unofficial:reach_1 para Javelin
  - correção automática de config:
      - traits.damage_bonus.max_armor_value foi corrigido de 0.0 para default 1.0

  Isso significa que, antes de escrever o addon autoral, eu trataria estes dois pontos como riscos concretos:

  - não assumir que todos os materiais extras do Spartan existirão no pack
  - não depender da trait spartan_weaponry_unofficial:reach_1 sem validar como o mod está registrando traits de alcance nessa build

  Logs de boot

  - servidor com os mods novos carregou com sucesso em 2026-05-16 13:12 UTC
  - load completo:
      - Done (1.432s)!
  - tempo total reportado:
      - Dedicated server took 21.063 seconds to load

  Dump de registries/datagen

  - tentei gerar um processo separado com --reports
  - o bootstrap modado funcionou e confirmou os mods/IDs corretos
  - ele parou no world/session.lock, porque o servidor real já estava online
  - então:
      - dump formal de reports não saiu nessa tentativa
      - mas os IDs de biome/dimension/structure/loot foram extraídos diretamente dos jars carregados e dos logs reais do runtime

  Se quiser, o próximo passo lógico é eu transformar isso em um handoff técnico enxuto para a expansão, com:

  1. mod ids confirmados,
  2. loot targets recomendados,
  3. weapon archetypes já presentes,
  4. riscos de compatibilidade,
  5. regras para não quebrar progressão vanilla+.
```
