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
