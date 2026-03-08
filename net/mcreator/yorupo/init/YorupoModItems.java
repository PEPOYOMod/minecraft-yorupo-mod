package net.mcreator.yorupo.init;

import net.mcreator.yorupo.item.DisableItem;
import net.mcreator.yorupo.item.LuckyItem;
import net.mcreator.yorupo.item.NoodlerecordItem;
import net.mcreator.yorupo.item.NothingItem;
import net.mcreator.yorupo.item.RamenItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
/* loaded from: YorupoModItems.class */
public class YorupoModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "yorupo");
    public static final RegistryObject<Item> RAMEN = REGISTRY.register("ramen", () -> {
        return new RamenItem();
    });
    public static final RegistryObject<Item> NOTHING = REGISTRY.register("nothing", () -> {
        return new NothingItem();
    });
    public static final RegistryObject<Item> LUCKY = REGISTRY.register("lucky", () -> {
        return new LuckyItem();
    });
    public static final RegistryObject<Item> YORUPOBOSS_SPAWN_EGG = REGISTRY.register("yorupoboss_spawn_egg", () -> {
        return new ForgeSpawnEggItem(YorupoModEntities.YORUPOBOSS, -6710887, -10066330, new Item.Properties());
    });
    public static final RegistryObject<Item> YORUPORED_SPAWN_EGG = REGISTRY.register("yorupored_spawn_egg", () -> {
        return new ForgeSpawnEggItem(YorupoModEntities.YORUPORED, -52429, -13108, new Item.Properties());
    });
    public static final RegistryObject<Item> NOODLERECORD = REGISTRY.register("noodlerecord", () -> {
        return new NoodlerecordItem();
    });
    public static final RegistryObject<Item> DISABLE = REGISTRY.register("disable", () -> {
        return new DisableItem();
    });
    public static final RegistryObject<Item> YEBUEATING_SPAWN_EGG = REGISTRY.register("yebueating_spawn_egg", () -> {
        return new ForgeSpawnEggItem(YorupoModEntities.YEBUEATING, -1, -1, new Item.Properties());
    });
    public static final RegistryObject<Item> GULUGULU_SPAWN_EGG = REGISTRY.register("gulugulu_spawn_egg", () -> {
        return new ForgeSpawnEggItem(YorupoModEntities.GULUGULU, -154, -13210, new Item.Properties());
    });
    public static final RegistryObject<Item> YEBUSPIN_SPAWN_EGG = REGISTRY.register("yebuspin_spawn_egg", () -> {
        return new ForgeSpawnEggItem(YorupoModEntities.YEBUSPIN, -1, -1, new Item.Properties());
    });
}