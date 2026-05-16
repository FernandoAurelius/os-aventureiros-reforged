package br.com.osaventureiros.oarcombat.registry;

import br.com.osaventureiros.oarcombat.OarCombat;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private OarItems() {}
}
