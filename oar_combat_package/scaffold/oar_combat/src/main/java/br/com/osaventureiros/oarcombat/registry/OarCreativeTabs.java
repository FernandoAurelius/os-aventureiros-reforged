package br.com.osaventureiros.oarcombat.registry;

import br.com.osaventureiros.oarcombat.OarCombat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class OarCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OarCombat.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.oar_combat.main"))
            .icon(() -> new ItemStack(OarItems.MYTHRIL_INGOT.get()))
            .displayItems((parameters, output) -> {
                output.accept(OarItems.TIN_ORE.get());
                output.accept(OarItems.DEEPSLATE_TIN_ORE.get());
                output.accept(OarItems.SILVER_ORE.get());
                output.accept(OarItems.DEEPSLATE_SILVER_ORE.get());
                output.accept(OarItems.MYTHRIL_ORE.get());
                output.accept(OarItems.DEEPSLATE_MYTHRIL_ORE.get());
                output.accept(OarItems.ADAMANTITE_ORE.get());
                output.accept(OarItems.DEEPSLATE_ADAMANTITE_ORE.get());
                output.accept(OarItems.TIN_BLOCK.get());
                output.accept(OarItems.BRONZE_BLOCK.get());
                output.accept(OarItems.STEEL_BLOCK.get());
                output.accept(OarItems.SILVER_BLOCK.get());
                output.accept(OarItems.MYTHRIL_BLOCK.get());
                output.accept(OarItems.ADAMANTITE_BLOCK.get());
                output.accept(OarItems.RAW_TIN.get());
                output.accept(OarItems.TIN_INGOT.get());
                output.accept(OarItems.TIN_NUGGET.get());
                output.accept(OarItems.BRONZE_INGOT.get());
                output.accept(OarItems.BRONZE_NUGGET.get());
                output.accept(OarItems.RAW_STEEL_BLEND.get());
                output.accept(OarItems.STEEL_INGOT.get());
                output.accept(OarItems.STEEL_NUGGET.get());
                output.accept(OarItems.RAW_SILVER.get());
                output.accept(OarItems.SILVER_INGOT.get());
                output.accept(OarItems.SILVER_NUGGET.get());
                output.accept(OarItems.RAW_MYTHRIL.get());
                output.accept(OarItems.MYTHRIL_INGOT.get());
                output.accept(OarItems.MYTHRIL_NUGGET.get());
                output.accept(OarItems.RAW_ADAMANTITE.get());
                output.accept(OarItems.ADAMANTITE_INGOT.get());
                output.accept(OarItems.ADAMANTITE_NUGGET.get());
                output.accept(OarItems.ORICHALCUM_FRAGMENT.get());
                output.accept(OarItems.ORICHALCUM_INGOT.get());
                output.accept(OarItems.ORICHALCUM_UPGRADE_SMITHING_TEMPLATE.get());
                output.accept(OarItems.BRONZE_HELMET.get());
                output.accept(OarItems.BRONZE_CHESTPLATE.get());
                output.accept(OarItems.BRONZE_LEGGINGS.get());
                output.accept(OarItems.BRONZE_BOOTS.get());
                output.accept(OarItems.BRONZE_SWORD.get());
                output.accept(OarItems.BRONZE_PICKAXE.get());
                output.accept(OarItems.BRONZE_AXE.get());
                output.accept(OarItems.BRONZE_SHOVEL.get());
                output.accept(OarItems.BRONZE_HOE.get());
                output.accept(OarItems.STEEL_HELMET.get());
                output.accept(OarItems.STEEL_CHESTPLATE.get());
                output.accept(OarItems.STEEL_LEGGINGS.get());
                output.accept(OarItems.STEEL_BOOTS.get());
                output.accept(OarItems.STEEL_SWORD.get());
                output.accept(OarItems.STEEL_PICKAXE.get());
                output.accept(OarItems.STEEL_AXE.get());
                output.accept(OarItems.STEEL_SHOVEL.get());
                output.accept(OarItems.STEEL_HOE.get());
                output.accept(OarItems.SILVER_HELMET.get());
                output.accept(OarItems.SILVER_CHESTPLATE.get());
                output.accept(OarItems.SILVER_LEGGINGS.get());
                output.accept(OarItems.SILVER_BOOTS.get());
                output.accept(OarItems.SILVER_SWORD.get());
                output.accept(OarItems.SILVER_PICKAXE.get());
                output.accept(OarItems.SILVER_AXE.get());
                output.accept(OarItems.SILVER_SHOVEL.get());
                output.accept(OarItems.SILVER_HOE.get());
                output.accept(OarItems.MYTHRIL_HELMET.get());
                output.accept(OarItems.MYTHRIL_CHESTPLATE.get());
                output.accept(OarItems.MYTHRIL_LEGGINGS.get());
                output.accept(OarItems.MYTHRIL_BOOTS.get());
                output.accept(OarItems.MYTHRIL_SWORD.get());
                output.accept(OarItems.MYTHRIL_PICKAXE.get());
                output.accept(OarItems.MYTHRIL_AXE.get());
                output.accept(OarItems.MYTHRIL_SHOVEL.get());
                output.accept(OarItems.MYTHRIL_HOE.get());
                output.accept(OarItems.ADAMANTITE_HELMET.get());
                output.accept(OarItems.ADAMANTITE_CHESTPLATE.get());
                output.accept(OarItems.ADAMANTITE_LEGGINGS.get());
                output.accept(OarItems.ADAMANTITE_BOOTS.get());
                output.accept(OarItems.ADAMANTITE_SWORD.get());
                output.accept(OarItems.ADAMANTITE_PICKAXE.get());
                output.accept(OarItems.ADAMANTITE_AXE.get());
                output.accept(OarItems.ADAMANTITE_SHOVEL.get());
                output.accept(OarItems.ADAMANTITE_HOE.get());
                if (OarItems.MYTHRIL_LONGSWORD != null) output.accept(OarItems.MYTHRIL_LONGSWORD);
                if (OarItems.MYTHRIL_SPEAR != null) output.accept(OarItems.MYTHRIL_SPEAR);
                if (OarItems.MYTHRIL_BATTLEAXE != null) output.accept(OarItems.MYTHRIL_BATTLEAXE);
                if (OarItems.MYTHRIL_GREATSWORD != null) output.accept(OarItems.MYTHRIL_GREATSWORD);
                if (OarItems.MYTHRIL_SCYTHE != null) output.accept(OarItems.MYTHRIL_SCYTHE);
                if (OarItems.ADAMANTITE_LONGSWORD != null) output.accept(OarItems.ADAMANTITE_LONGSWORD);
                if (OarItems.ADAMANTITE_SPEAR != null) output.accept(OarItems.ADAMANTITE_SPEAR);
                if (OarItems.ADAMANTITE_BATTLEAXE != null) output.accept(OarItems.ADAMANTITE_BATTLEAXE);
                if (OarItems.ADAMANTITE_GREATSWORD != null) output.accept(OarItems.ADAMANTITE_GREATSWORD);
                if (OarItems.ADAMANTITE_SCYTHE != null) output.accept(OarItems.ADAMANTITE_SCYTHE);
            })
            .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }

    private OarCreativeTabs() {}
}
