package br.com.osaventureiros.oarcombat.registry;

import br.com.osaventureiros.oarcombat.OarCombat;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class OarArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, OarCombat.MOD_ID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRONZE = register("bronze", defense(2, 5, 4, 1), 14, "minecraft:chainmail", OarTags.C_INGOTS_BRONZE, 0.0F, 0.0F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> STEEL = register("steel", defense(2, 6, 5, 2), 10, "minecraft:iron", OarTags.C_INGOTS_STEEL, 1.0F, 0.0F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SILVER = register("silver", defense(2, 5, 4, 2), 18, "minecraft:iron", OarTags.C_INGOTS_SILVER, 0.0F, 0.0F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MYTHRIL = register("mythril", defense(3, 6, 5, 2), 22, "oar_combat:mythril", OarTags.C_INGOTS_MYTHRIL, 1.0F, 0.0F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ADAMANTITE = register("adamantite", defense(3, 8, 6, 3), 8, "oar_combat:adamantite", OarTags.C_INGOTS_ADAMANTITE, 2.0F, 0.1F);

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> register(String name, Map<ArmorItem.Type, Integer> defense, int enchantmentValue, String layerId, net.minecraft.tags.TagKey<net.minecraft.world.item.Item> repairTag, float toughness, float knockbackResistance) {
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(
                defense,
                enchantmentValue,
                SoundEvents.ARMOR_EQUIP_IRON,
                () -> Ingredient.of(repairTag),
                List.of(new ArmorMaterial.Layer(ResourceLocation.parse(layerId))),
                toughness,
                knockbackResistance
        ));
    }

    private static Map<ArmorItem.Type, Integer> defense(int helmet, int chestplate, int leggings, int boots) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
        defense.put(ArmorItem.Type.HELMET, helmet);
        defense.put(ArmorItem.Type.CHESTPLATE, chestplate);
        defense.put(ArmorItem.Type.LEGGINGS, leggings);
        defense.put(ArmorItem.Type.BOOTS, boots);
        defense.put(ArmorItem.Type.BODY, 0);
        return defense;
    }

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }

    private OarArmorMaterials() {}
}
