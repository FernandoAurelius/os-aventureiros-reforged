package br.com.osaventureiros.oarcombat;

import br.com.osaventureiros.oarcombat.registry.OarTags;
import java.util.Objects;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

public final class OarCombatEvents {
    private static final ResourceLocation MYTHRIL_SPEED_ID = ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "mythril_full_set_speed");
    private static final ResourceLocation ADAMANTITE_SPEED_ID = ResourceLocation.fromNamespaceAndPath(OarCombat.MOD_ID, "adamantite_full_set_speed");
    private static final AttributeModifier MYTHRIL_SPEED_MODIFIER = new AttributeModifier(MYTHRIL_SPEED_ID, 0.05D, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
    private static final AttributeModifier ADAMANTITE_SPEED_MODIFIER = new AttributeModifier(ADAMANTITE_SPEED_ID, -0.05D, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);

    public void onLivingIncomingDamage(LivingIncomingDamageEvent event) {
        LivingEntity attacker = resolveAttacker(event);
        if (attacker != null && attacker.getMainHandItem().is(OarTags.SILVER_WEAPONS) && event.getEntity().getType().is(OarTags.SILVER_VULNERABLE)) {
            event.setAmount(event.getAmount() + OarServerConfig.SILVER_BONUS_DAMAGE.get().floatValue());
        }

        if (event.getEntity() instanceof Player player && hasFullSet(player, OarTags.MYTHRIL_EQUIPMENT) && event.getSource().is(DamageTypes.FALL)) {
            event.setAmount(event.getAmount() * 0.9F);
        }
    }

    public void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        if (player.level().isClientSide) {
            return;
        }

        AttributeInstance movement = player.getAttribute(Attributes.MOVEMENT_SPEED);
        if (movement == null) {
            return;
        }

        boolean hasMythrilSet = hasFullSet(player, OarTags.MYTHRIL_EQUIPMENT);
        boolean hasAdamantiteSet = hasFullSet(player, OarTags.ADAMANTITE_EQUIPMENT);

        if (hasMythrilSet) {
            movement.addOrUpdateTransientModifier(MYTHRIL_SPEED_MODIFIER);
        } else {
            movement.removeModifier(MYTHRIL_SPEED_ID);
        }

        if (hasAdamantiteSet) {
            movement.addOrUpdateTransientModifier(ADAMANTITE_SPEED_MODIFIER);
        } else {
            movement.removeModifier(ADAMANTITE_SPEED_ID);
        }
    }

    private static LivingEntity resolveAttacker(LivingIncomingDamageEvent event) {
        if (event.getSource().getEntity() instanceof LivingEntity livingEntity) {
            return livingEntity;
        }
        if (event.getSource().getDirectEntity() instanceof LivingEntity livingEntity) {
            return livingEntity;
        }
        return null;
    }

    private static boolean hasFullSet(Player player, net.minecraft.tags.TagKey<net.minecraft.world.item.Item> tag) {
        return player.getInventory().armor.stream().filter(Objects::nonNull).map(ItemStack::getItem).allMatch(item -> item.builtInRegistryHolder().is(tag))
                && player.getInventory().armor.size() == 4
                && player.getInventory().armor.stream().noneMatch(ItemStack::isEmpty);
    }
}
