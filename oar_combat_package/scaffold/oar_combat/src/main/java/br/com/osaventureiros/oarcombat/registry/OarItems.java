package br.com.osaventureiros.oarcombat.registry;

import br.com.osaventureiros.oarcombat.OarCombat;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

public final class OarItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OarCombat.MOD_ID);

    public static final DeferredItem<BlockItem> TIN_ORE = ITEMS.registerSimpleBlockItem("tin_ore", OarBlocks.TIN_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.registerSimpleBlockItem("deepslate_tin_ore", OarBlocks.DEEPSLATE_TIN_ORE);
    public static final DeferredItem<BlockItem> SILVER_ORE = ITEMS.registerSimpleBlockItem("silver_ore", OarBlocks.SILVER_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.registerSimpleBlockItem("deepslate_silver_ore", OarBlocks.DEEPSLATE_SILVER_ORE);
    public static final DeferredItem<BlockItem> MYTHRIL_ORE = ITEMS.registerSimpleBlockItem("mythril_ore", OarBlocks.MYTHRIL_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_MYTHRIL_ORE = ITEMS.registerSimpleBlockItem("deepslate_mythril_ore", OarBlocks.DEEPSLATE_MYTHRIL_ORE);
    public static final DeferredItem<BlockItem> ADAMANTITE_ORE = ITEMS.registerSimpleBlockItem("adamantite_ore", OarBlocks.ADAMANTITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_ADAMANTITE_ORE = ITEMS.registerSimpleBlockItem("deepslate_adamantite_ore", OarBlocks.DEEPSLATE_ADAMANTITE_ORE);
    public static final DeferredItem<BlockItem> NETHER_ADAMANTITE_ORE = ITEMS.registerSimpleBlockItem("nether_adamantite_ore", OarBlocks.NETHER_ADAMANTITE_ORE);
    public static final DeferredItem<BlockItem> TIN_BLOCK = ITEMS.registerSimpleBlockItem("tin_block", OarBlocks.TIN_BLOCK);
    public static final DeferredItem<BlockItem> BRONZE_BLOCK = ITEMS.registerSimpleBlockItem("bronze_block", OarBlocks.BRONZE_BLOCK);
    public static final DeferredItem<BlockItem> STEEL_BLOCK = ITEMS.registerSimpleBlockItem("steel_block", OarBlocks.STEEL_BLOCK);
    public static final DeferredItem<BlockItem> SILVER_BLOCK = ITEMS.registerSimpleBlockItem("silver_block", OarBlocks.SILVER_BLOCK);
    public static final DeferredItem<BlockItem> MYTHRIL_BLOCK = ITEMS.registerSimpleBlockItem("mythril_block", OarBlocks.MYTHRIL_BLOCK);
    public static final DeferredItem<BlockItem> ADAMANTITE_BLOCK = ITEMS.registerSimpleBlockItem("adamantite_block", OarBlocks.ADAMANTITE_BLOCK);
    public static final DeferredItem<Item> RAW_TIN = ITEMS.registerSimpleItem("raw_tin", new Item.Properties());
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerSimpleItem("tin_ingot", new Item.Properties());
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.registerSimpleItem("tin_nugget", new Item.Properties());
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.registerSimpleItem("bronze_ingot", new Item.Properties());
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.registerSimpleItem("bronze_nugget", new Item.Properties());
    public static final DeferredItem<Item> RAW_STEEL_BLEND = ITEMS.registerSimpleItem("raw_steel_blend", new Item.Properties());
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot", new Item.Properties());
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.registerSimpleItem("steel_nugget", new Item.Properties());
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.registerSimpleItem("raw_silver", new Item.Properties());
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.registerSimpleItem("silver_ingot", new Item.Properties());
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.registerSimpleItem("silver_nugget", new Item.Properties());
    public static final DeferredItem<Item> RAW_MYTHRIL = ITEMS.registerSimpleItem("raw_mythril", new Item.Properties());
    public static final DeferredItem<Item> MYTHRIL_INGOT = ITEMS.registerSimpleItem("mythril_ingot", new Item.Properties());
    public static final DeferredItem<Item> MYTHRIL_NUGGET = ITEMS.registerSimpleItem("mythril_nugget", new Item.Properties());
    public static final DeferredItem<Item> RAW_ADAMANTITE = ITEMS.registerSimpleItem("raw_adamantite", new Item.Properties());
    public static final DeferredItem<Item> ADAMANTITE_INGOT = ITEMS.registerSimpleItem("adamantite_ingot", new Item.Properties());
    public static final DeferredItem<Item> ADAMANTITE_NUGGET = ITEMS.registerSimpleItem("adamantite_nugget", new Item.Properties());
    public static final DeferredItem<Item> ORICHALCUM_FRAGMENT = ITEMS.registerSimpleItem("orichalcum_fragment", new Item.Properties());
    public static final DeferredItem<Item> ORICHALCUM_INGOT = ITEMS.registerSimpleItem("orichalcum_ingot", new Item.Properties());
    public static final DeferredItem<Item> ORICHALCUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.registerSimpleItem("orichalcum_upgrade_smithing_template", new Item.Properties());

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = armor("bronze_helmet", OarArmorMaterials.BRONZE, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = armor("bronze_chestplate", OarArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = armor("bronze_leggings", OarArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = armor("bronze_boots", OarArmorMaterials.BRONZE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<SwordItem> BRONZE_SWORD = sword("bronze_sword", OarToolTiers.BRONZE);
    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = pickaxe("bronze_pickaxe", OarToolTiers.BRONZE);
    public static final DeferredItem<AxeItem> BRONZE_AXE = axe("bronze_axe", OarToolTiers.BRONZE);
    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = shovel("bronze_shovel", OarToolTiers.BRONZE);
    public static final DeferredItem<HoeItem> BRONZE_HOE = hoe("bronze_hoe", OarToolTiers.BRONZE);

    public static final DeferredItem<ArmorItem> STEEL_HELMET = armor("steel_helmet", OarArmorMaterials.STEEL, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = armor("steel_chestplate", OarArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS = armor("steel_leggings", OarArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> STEEL_BOOTS = armor("steel_boots", OarArmorMaterials.STEEL, ArmorItem.Type.BOOTS);
    public static final DeferredItem<SwordItem> STEEL_SWORD = sword("steel_sword", OarToolTiers.STEEL);
    public static final DeferredItem<PickaxeItem> STEEL_PICKAXE = pickaxe("steel_pickaxe", OarToolTiers.STEEL);
    public static final DeferredItem<AxeItem> STEEL_AXE = axe("steel_axe", OarToolTiers.STEEL);
    public static final DeferredItem<ShovelItem> STEEL_SHOVEL = shovel("steel_shovel", OarToolTiers.STEEL);
    public static final DeferredItem<HoeItem> STEEL_HOE = hoe("steel_hoe", OarToolTiers.STEEL);

    public static final DeferredItem<ArmorItem> SILVER_HELMET = armor("silver_helmet", OarArmorMaterials.SILVER, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> SILVER_CHESTPLATE = armor("silver_chestplate", OarArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> SILVER_LEGGINGS = armor("silver_leggings", OarArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> SILVER_BOOTS = armor("silver_boots", OarArmorMaterials.SILVER, ArmorItem.Type.BOOTS);
    public static final DeferredItem<SwordItem> SILVER_SWORD = sword("silver_sword", OarToolTiers.SILVER);
    public static final DeferredItem<PickaxeItem> SILVER_PICKAXE = pickaxe("silver_pickaxe", OarToolTiers.SILVER);
    public static final DeferredItem<AxeItem> SILVER_AXE = axe("silver_axe", OarToolTiers.SILVER);
    public static final DeferredItem<ShovelItem> SILVER_SHOVEL = shovel("silver_shovel", OarToolTiers.SILVER);
    public static final DeferredItem<HoeItem> SILVER_HOE = hoe("silver_hoe", OarToolTiers.SILVER);

    public static final DeferredItem<ArmorItem> MYTHRIL_HELMET = armor("mythril_helmet", OarArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> MYTHRIL_CHESTPLATE = armor("mythril_chestplate", OarArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> MYTHRIL_LEGGINGS = armor("mythril_leggings", OarArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> MYTHRIL_BOOTS = armor("mythril_boots", OarArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS);
    public static final DeferredItem<SwordItem> MYTHRIL_SWORD = sword("mythril_sword", OarToolTiers.MYTHRIL);
    public static final DeferredItem<PickaxeItem> MYTHRIL_PICKAXE = pickaxe("mythril_pickaxe", OarToolTiers.MYTHRIL);
    public static final DeferredItem<AxeItem> MYTHRIL_AXE = axe("mythril_axe", OarToolTiers.MYTHRIL);
    public static final DeferredItem<ShovelItem> MYTHRIL_SHOVEL = shovel("mythril_shovel", OarToolTiers.MYTHRIL);
    public static final DeferredItem<HoeItem> MYTHRIL_HOE = hoe("mythril_hoe", OarToolTiers.MYTHRIL);

    public static final DeferredItem<ArmorItem> ADAMANTITE_HELMET = armor("adamantite_helmet", OarArmorMaterials.ADAMANTITE, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> ADAMANTITE_CHESTPLATE = armor("adamantite_chestplate", OarArmorMaterials.ADAMANTITE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> ADAMANTITE_LEGGINGS = armor("adamantite_leggings", OarArmorMaterials.ADAMANTITE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> ADAMANTITE_BOOTS = armor("adamantite_boots", OarArmorMaterials.ADAMANTITE, ArmorItem.Type.BOOTS);
    public static final DeferredItem<SwordItem> ADAMANTITE_SWORD = sword("adamantite_sword", OarToolTiers.ADAMANTITE);
    public static final DeferredItem<PickaxeItem> ADAMANTITE_PICKAXE = pickaxe("adamantite_pickaxe", OarToolTiers.ADAMANTITE);
    public static final DeferredItem<AxeItem> ADAMANTITE_AXE = axe("adamantite_axe", OarToolTiers.ADAMANTITE);
    public static final DeferredItem<ShovelItem> ADAMANTITE_SHOVEL = shovel("adamantite_shovel", OarToolTiers.ADAMANTITE);
    public static final DeferredItem<HoeItem> ADAMANTITE_HOE = hoe("adamantite_hoe", OarToolTiers.ADAMANTITE);

    public static Item ADAMANTITE_LONGSWORD;
    public static Item ADAMANTITE_SPEAR;
    public static Item ADAMANTITE_BATTLEAXE;
    public static Item MYTHRIL_LONGSWORD;
    public static Item MYTHRIL_SPEAR;
    public static Item MYTHRIL_BATTLEAXE;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        eventBus.addListener(OarItems::registerSpartanItems);
    }

    private static void registerSpartanItems(RegisterEvent event) {
        event.register(net.minecraft.core.registries.Registries.ITEM, net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "adamantite_longsword"), () -> ADAMANTITE_LONGSWORD = OarSpartanCompat.createLongsword("adamantite", OarToolTiers.ADAMANTITE, OarTags.C_INGOTS_ADAMANTITE, OarTags.SPARTAN_MATERIAL_TRAITS_ADAMANTITE));
        event.register(net.minecraft.core.registries.Registries.ITEM, net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "adamantite_spear"), () -> ADAMANTITE_SPEAR = OarSpartanCompat.createSpear("adamantite", OarToolTiers.ADAMANTITE, OarTags.C_INGOTS_ADAMANTITE, OarTags.SPARTAN_MATERIAL_TRAITS_ADAMANTITE));
        event.register(net.minecraft.core.registries.Registries.ITEM, net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "adamantite_battleaxe"), () -> ADAMANTITE_BATTLEAXE = OarSpartanCompat.createBattleaxe("adamantite", OarToolTiers.ADAMANTITE, OarTags.C_INGOTS_ADAMANTITE, OarTags.SPARTAN_MATERIAL_TRAITS_ADAMANTITE));
        event.register(net.minecraft.core.registries.Registries.ITEM, net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "mythril_longsword"), () -> MYTHRIL_LONGSWORD = OarSpartanCompat.createLongsword("mythril", OarToolTiers.MYTHRIL, OarTags.C_INGOTS_MYTHRIL, OarTags.SPARTAN_MATERIAL_TRAITS_MYTHRIL));
        event.register(net.minecraft.core.registries.Registries.ITEM, net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "mythril_spear"), () -> MYTHRIL_SPEAR = OarSpartanCompat.createSpear("mythril", OarToolTiers.MYTHRIL, OarTags.C_INGOTS_MYTHRIL, OarTags.SPARTAN_MATERIAL_TRAITS_MYTHRIL));
        event.register(net.minecraft.core.registries.Registries.ITEM, net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "mythril_battleaxe"), () -> MYTHRIL_BATTLEAXE = OarSpartanCompat.createBattleaxe("mythril", OarToolTiers.MYTHRIL, OarTags.C_INGOTS_MYTHRIL, OarTags.SPARTAN_MATERIAL_TRAITS_MYTHRIL));
    }

    private static DeferredItem<ArmorItem> armor(String id, net.neoforged.neoforge.registries.DeferredHolder<net.minecraft.world.item.ArmorMaterial, net.minecraft.world.item.ArmorMaterial> material, ArmorItem.Type type) {
        return ITEMS.register(id, () -> new ArmorItem(material, type, new Item.Properties().stacksTo(1)));
    }

    private static DeferredItem<SwordItem> sword(String id, net.minecraft.world.item.Tier tier) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties().stacksTo(1)));
    }

    private static DeferredItem<PickaxeItem> pickaxe(String id, net.minecraft.world.item.Tier tier) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties().stacksTo(1)));
    }

    private static DeferredItem<AxeItem> axe(String id, net.minecraft.world.item.Tier tier) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties().stacksTo(1)));
    }

    private static DeferredItem<ShovelItem> shovel(String id, net.minecraft.world.item.Tier tier) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties().stacksTo(1)));
    }

    private static DeferredItem<HoeItem> hoe(String id, net.minecraft.world.item.Tier tier) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties().stacksTo(1)));
    }

    private OarItems() {}
}
