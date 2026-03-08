package net.mcreator.yorupo.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
/* loaded from: YorupoModSounds.class */
public class YorupoModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "yorupo");
    public static final RegistryObject<SoundEvent> HAHAHAHAHAHA = REGISTRY.register("hahahahahaha", () -> {
        return SoundEvent.m_262824_(new ResourceLocation("yorupo", "hahahahahaha"));
    });
    public static final RegistryObject<SoundEvent> NOODLE = REGISTRY.register("noodle", () -> {
        return SoundEvent.m_262824_(new ResourceLocation("yorupo", "noodle"));
    });
    public static final RegistryObject<SoundEvent> DISABLE = REGISTRY.register("disable", () -> {
        return SoundEvent.m_262824_(new ResourceLocation("yorupo", "disable"));
    });
}