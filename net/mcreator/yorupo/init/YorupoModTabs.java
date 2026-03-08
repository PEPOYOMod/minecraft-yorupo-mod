package net.mcreator.yorupo.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
/* loaded from: YorupoModTabs.class */
public class YorupoModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.f_279569_, "yorupo");
    public static final RegistryObject<CreativeModeTab> YORUPOO = REGISTRY.register("yorupoo", () -> {
        return CreativeModeTab.builder().m_257941_(Component.m_237115_("item_group.yorupo.yorupoo")).m_257737_(() -> {
            return new ItemStack((ItemLike) YorupoModItems.RAMEN.get());
        }).m_257501_(parameters, tabData -> {
            tabData.m_246326_((ItemLike) YorupoModItems.RAMEN.get());
            tabData.m_246326_((ItemLike) YorupoModItems.YORUPOBOSS_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike) YorupoModItems.YORUPORED_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike) YorupoModItems.NOODLERECORD.get());
            tabData.m_246326_((ItemLike) YorupoModItems.DISABLE.get());
            tabData.m_246326_((ItemLike) YorupoModItems.YEBUEATING_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike) YorupoModItems.GULUGULU_SPAWN_EGG.get());
        }).m_257652_();
    });
}