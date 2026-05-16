package br.com.osaventureiros.oarcombat.registry;

import java.util.function.Supplier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum OarToolTiers implements Tier {
    BRONZE(180, 5.5F, 1.5F, blockTag("minecraft:incorrect_for_iron_tool"), 14, () -> Ingredient.of(OarTags.C_INGOTS_BRONZE)),
    STEEL(420, 6.5F, 2.0F, blockTag("minecraft:incorrect_for_diamond_tool"), 10, () -> Ingredient.of(OarTags.C_INGOTS_STEEL)),
    SILVER(220, 6.0F, 1.8F, blockTag("minecraft:incorrect_for_iron_tool"), 18, () -> Ingredient.of(OarTags.C_INGOTS_SILVER)),
    MYTHRIL(720, 8.0F, 2.5F, blockTag("minecraft:incorrect_for_diamond_tool"), 22, () -> Ingredient.of(OarTags.C_INGOTS_MYTHRIL)),
    ADAMANTITE(1400, 7.0F, 3.0F, blockTag("minecraft:incorrect_for_netherite_tool"), 8, () -> Ingredient.of(OarTags.C_INGOTS_ADAMANTITE));

    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final TagKey<Block> incorrectBlocksForDrops;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    OarToolTiers(int uses, float speed, float attackDamageBonus, TagKey<Block> incorrectBlocksForDrops, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    private static TagKey<Block> blockTag(String id) {
        return TagKey.create(net.minecraft.core.registries.Registries.BLOCK, net.minecraft.resources.ResourceLocation.parse(id));
    }
}
