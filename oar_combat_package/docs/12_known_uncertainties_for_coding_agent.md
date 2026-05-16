# Known uncertainties for coding agent

## NeoForge Gradle

The scaffold uses `net.neoforged.moddev` version `2.0.107` as a reasonable modern MDK baseline. If the VPS project uses a different MDK or wrapper, adapt `build.gradle` before touching gameplay code.

## Minecraft 1.21.1 item APIs

Tool/armor APIs changed across recent versions. Do not blindly activate the disabled candidate code. First inspect the MDK or existing examples for:

- ArmorMaterial constructor/record fields.
- ArmorItem constructor.
- Tier/ToolMaterial registration or enum equivalent.
- SwordItem/AxeItem constructor signatures.

## Data pack paths

This scaffold uses 1.21-style singular registry tag paths such as:

- `data/c/tags/item/ingots/bronze.json`
- `data/minecraft/tags/block/mineable/pickaxe.json`
- `data/oar_combat/tags/entity_type/silver_vulnerable.json`

If the runtime complains, validate against generated reports from the exact server.

## Loot modifiers

The package intentionally does not force a Global Loot Modifier implementation in compiled source. Implement after validating exact NeoForge 21.1.229 API and target loot table IDs.

## Mythril worldgen

Keep disabled until Aether/Twilight dimensional placement is validated. Prefer loot-based Mythril in alpha.

## Design decisions already resolved

- The addon is a pure NeoForge mod, not a KubeJS-first implementation.
- Mythril should exist via dimensional loot in alpha and may gain natural Aether ore after runtime validation.
- Adamantite is intended for both deep Overworld and Nether, but the first stable implementation can start with only one source.
- Orichalcum is upgrade-focused in v1, mainly for weapons and tools, not a full armor set.
- Armor set effects are in scope for alpha, but must remain conservative and configurable.
- Spartan is optional as dependency but integrated into gameplay; investigate API exposure for custom materials before final weapon rollout.
