package br.com.osaventureiros.oarcombat.registry;

import br.com.osaventureiros.oarcombat.OarCombat;
import com.mojang.logging.LogUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.function.Supplier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import org.slf4j.Logger;

public final class OarSpartanCompat {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final String SPARTAN_MOD_ID = "spartan_weaponry_unofficial";

    public static boolean isLoaded() {
        try {
            Class<?> modListClass = Class.forName("net.neoforged.fml.ModList");
            Object modList = modListClass.getMethod("get").invoke(null);
            return (boolean) modListClass.getMethod("isLoaded", String.class).invoke(modList, SPARTAN_MOD_ID);
        } catch (ReflectiveOperationException exception) {
            return false;
        }
    }

    public static Item createLongsword(String materialName, Tier tier, TagKey<Item> repairTag, TagKey<?> traitsTag) {
        return createWeapon("createLongsword", materialName, tier, repairTag, traitsTag, () -> new SwordItem(tier, new Item.Properties()));
    }

    public static Item createSpear(String materialName, Tier tier, TagKey<Item> repairTag, TagKey<?> traitsTag) {
        return createWeapon("createSpear", materialName, tier, repairTag, traitsTag, () -> new SwordItem(tier, new Item.Properties()));
    }

    public static Item createBattleaxe(String materialName, Tier tier, TagKey<Item> repairTag, TagKey<?> traitsTag) {
        return createWeapon("createBattleaxe", materialName, tier, repairTag, traitsTag, () -> new AxeItem(tier, new Item.Properties()));
    }

    public static Item createGreatsword(String materialName, Tier tier, TagKey<Item> repairTag, TagKey<?> traitsTag) {
        return createWeapon("createGreatsword", materialName, tier, repairTag, traitsTag, () -> new SwordItem(tier, new Item.Properties()));
    }

    public static Item createScythe(String materialName, Tier tier, TagKey<Item> repairTag, TagKey<?> traitsTag) {
        return createWeapon("createScythe", materialName, tier, repairTag, traitsTag, () -> new SwordItem(tier, new Item.Properties()));
    }

    private static Item createWeapon(String methodName, String materialName, Tier tier, TagKey<Item> repairTag, TagKey<?> traitsTag, Supplier<Item> fallback) {
        if (!isLoaded()) {
            return fallback.get();
        }

        try {
            Class<?> weaponMaterialClass = Class.forName("org.xiyu.spartanweaponryunofficial.api.WeaponMaterial");
            Constructor<?> constructor = weaponMaterialClass.getConstructor(String.class, String.class, Tier.class, TagKey.class, TagKey.class);
            Object weaponMaterial = constructor.newInstance(materialName, OarCombat.MOD_ID, tier, repairTag, traitsTag);
            Method customNameMethod = weaponMaterialClass.getMethod("setUseCustomDisplayName");
            customNameMethod.invoke(weaponMaterial);

            Class<?> apiClass = Class.forName("org.xiyu.spartanweaponryunofficial.api.SpartanWeaponryAPI");
            Method factoryMethod = apiClass.getMethod(methodName, weaponMaterialClass);
            return (Item) factoryMethod.invoke(null, weaponMaterial);
        } catch (ReflectiveOperationException exception) {
            LOGGER.warn("Failed to create Spartan weapon {} for material {}", methodName, materialName, exception);
            return fallback.get();
        }
    }

    private OarSpartanCompat() {}
}
