package br.com.osaventureiros.oarcombat;

import br.com.osaventureiros.oarcombat.registry.OarBlocks;
import br.com.osaventureiros.oarcombat.registry.OarArmorMaterials;
import br.com.osaventureiros.oarcombat.registry.OarCreativeTabs;
import br.com.osaventureiros.oarcombat.registry.OarItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;

@Mod(OarCombat.MOD_ID)
public final class OarCombat {
    public static final String MOD_ID = "oar_combat";

    public OarCombat(IEventBus modEventBus, ModContainer modContainer) {
        OarBlocks.register(modEventBus);
        OarArmorMaterials.register(modEventBus);
        OarItems.register(modEventBus);
        OarCreativeTabs.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.SERVER, OarServerConfig.SPEC);
        OarCombatEvents events = new OarCombatEvents();
        NeoForge.EVENT_BUS.addListener(events::onLivingIncomingDamage);
        NeoForge.EVENT_BUS.addListener(events::onPlayerTick);
    }
}
