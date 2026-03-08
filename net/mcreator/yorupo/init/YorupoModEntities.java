package net.mcreator.yorupo.init;

import net.mcreator.yorupo.entity.FriendlyyorupoEntity;
import net.mcreator.yorupo.entity.GuluguluEntity;
import net.mcreator.yorupo.entity.YebueatingEntity;
import net.mcreator.yorupo.entity.YebuspinEntity;
import net.mcreator.yorupo.entity.YorupobossEntity;
import net.mcreator.yorupo.entity.YoruporedEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: YorupoModEntities.class */
public class YorupoModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "yorupo");
    public static final RegistryObject<EntityType<FriendlyyorupoEntity>> FRIENDLYYORUPO = register("friendlyyorupo", EntityType.Builder.m_20704_(FriendlyyorupoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendlyyorupoEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<YorupobossEntity>> YORUPOBOSS = register("yorupoboss", EntityType.Builder.m_20704_(YorupobossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YorupobossEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<YoruporedEntity>> YORUPORED = register("yorupored", EntityType.Builder.m_20704_(YoruporedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoruporedEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<YebueatingEntity>> YEBUEATING = register("yebueating", EntityType.Builder.m_20704_(YebueatingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YebueatingEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<GuluguluEntity>> GULUGULU = register("gulugulu", EntityType.Builder.m_20704_(GuluguluEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GuluguluEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<YebuspinEntity>> YEBUSPIN = register("yebuspin", EntityType.Builder.m_20704_(YebuspinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YebuspinEntity::new).m_20699_(0.6f, 1.8f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> {
            return entityTypeBuilder.m_20712_(registryname);
        });
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FriendlyyorupoEntity.init();
            YorupobossEntity.init();
            YoruporedEntity.init();
            YebueatingEntity.init();
            GuluguluEntity.init();
            YebuspinEntity.init();
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put((EntityType) FRIENDLYYORUPO.get(), FriendlyyorupoEntity.createAttributes().m_22265_());
        event.put((EntityType) YORUPOBOSS.get(), YorupobossEntity.createAttributes().m_22265_());
        event.put((EntityType) YORUPORED.get(), YoruporedEntity.createAttributes().m_22265_());
        event.put((EntityType) YEBUEATING.get(), YebueatingEntity.createAttributes().m_22265_());
        event.put((EntityType) GULUGULU.get(), GuluguluEntity.createAttributes().m_22265_());
        event.put((EntityType) YEBUSPIN.get(), YebuspinEntity.createAttributes().m_22265_());
    }
}