package br.com.osaventureiros.oarcombat.registry;

import br.com.osaventureiros.oarcombat.OarCombat;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

public final class OarTags {
    public static final TagKey<Item> BRONZE_EQUIPMENT = itemTag("oar_combat:bronze_equipment");
    public static final TagKey<Item> STEEL_EQUIPMENT = itemTag("oar_combat:steel_equipment");
    public static final TagKey<Item> SILVER_EQUIPMENT = itemTag("oar_combat:silver_equipment");
    public static final TagKey<Item> MYTHRIL_EQUIPMENT = itemTag("oar_combat:mythril_equipment");
    public static final TagKey<Item> ADAMANTITE_EQUIPMENT = itemTag("oar_combat:adamantite_equipment");
    public static final TagKey<Item> SILVER_WEAPONS = itemTag("oar_combat:silver_weapons");

    public static final TagKey<Item> C_INGOTS_BRONZE = itemTag("c:ingots/bronze");
    public static final TagKey<Item> C_INGOTS_STEEL = itemTag("c:ingots/steel");
    public static final TagKey<Item> C_INGOTS_SILVER = itemTag("c:ingots/silver");
    public static final TagKey<Item> C_INGOTS_MYTHRIL = itemTag("c:ingots/mythril");
    public static final TagKey<Item> C_INGOTS_ADAMANTITE = itemTag("c:ingots/adamantite");

    public static final TagKey<EntityType<?>> SILVER_VULNERABLE = TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("oar_combat:silver_vulnerable"));

    @SuppressWarnings("unchecked")
    private static final ResourceKey SPARTAN_WEAPON_TRAIT_REGISTRY = ResourceKey.createRegistryKey(ResourceLocation.parse("spartan_weaponry_unofficial:weapon_traits"));
    public static final TagKey<?> SPARTAN_MATERIAL_TRAITS_ADAMANTITE = TagKey.create(SPARTAN_WEAPON_TRAIT_REGISTRY, ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "materials/adamantite"));
    public static final TagKey<?> SPARTAN_MATERIAL_TRAITS_MYTHRIL = TagKey.create(SPARTAN_WEAPON_TRAIT_REGISTRY, ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "materials/mythril"));

    private static TagKey<Item> itemTag(String id) {
        return TagKey.create(Registries.ITEM, ResourceLocation.parse(id));
    }

    private OarTags() {}
}
