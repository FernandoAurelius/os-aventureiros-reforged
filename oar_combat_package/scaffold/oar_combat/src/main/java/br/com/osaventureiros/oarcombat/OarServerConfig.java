package br.com.osaventureiros.oarcombat;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class OarServerConfig {
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.BooleanValue ENABLE_TIN_ORE;
    public static final ModConfigSpec.BooleanValue ENABLE_SILVER_ORE;
    public static final ModConfigSpec.BooleanValue ENABLE_MYTHRIL_ORE;
    public static final ModConfigSpec.BooleanValue ENABLE_OVERWORLD_ADAMANTITE_ORE;
    public static final ModConfigSpec.BooleanValue ENABLE_NETHER_ADAMANTITE_ORE;

    public static final ModConfigSpec.BooleanValue ENABLE_SILVER_BONUS;
    public static final ModConfigSpec.DoubleValue SILVER_BONUS_DAMAGE;
    public static final ModConfigSpec.BooleanValue ENABLE_MYTHRIL_SPEED_BONUS;
    public static final ModConfigSpec.DoubleValue MYTHRIL_SPEED_BONUS;
    public static final ModConfigSpec.BooleanValue ENABLE_ADAMANTITE_SPEED_PENALTY;
    public static final ModConfigSpec.DoubleValue ADAMANTITE_SPEED_PENALTY;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.push("worldgen");
        ENABLE_TIN_ORE = builder.comment("Generate tin ore in the Overworld.").define("enableTinOre", true);
        ENABLE_SILVER_ORE = builder.comment("Generate silver ore in the Overworld.").define("enableSilverOre", true);
        ENABLE_MYTHRIL_ORE = builder.comment("Generate mythril ore. Disabled by default until dimensional worldgen is validated.").define("enableMythrilOre", false);
        ENABLE_OVERWORLD_ADAMANTITE_ORE = builder.comment("Generate adamantite ore in deep Overworld.").define("enableOverworldAdamantiteOre", true);
        ENABLE_NETHER_ADAMANTITE_ORE = builder.comment("Generate adamantite ore in the Nether.").define("enableNetherAdamantiteOre", true);
        builder.pop();

        builder.push("balance");
        ENABLE_SILVER_BONUS = builder.define("enableSilverBonus", true);
        SILVER_BONUS_DAMAGE = builder.defineInRange("silverBonusDamage", 2.0D, 0.0D, 20.0D);
        ENABLE_MYTHRIL_SPEED_BONUS = builder.define("enableMythrilSpeedBonus", true);
        MYTHRIL_SPEED_BONUS = builder.defineInRange("mythrilSpeedBonus", 0.05D, 0.0D, 0.5D);
        ENABLE_ADAMANTITE_SPEED_PENALTY = builder.define("enableAdamantiteSpeedPenalty", true);
        ADAMANTITE_SPEED_PENALTY = builder.defineInRange("adamantiteSpeedPenalty", -0.05D, -0.5D, 0.0D);
        builder.pop();

        SPEC = builder.build();
    }

    private OarServerConfig() {}
}
