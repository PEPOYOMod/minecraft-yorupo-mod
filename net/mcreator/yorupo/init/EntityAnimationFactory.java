package net.mcreator.yorupo.init;

import net.mcreator.yorupo.entity.FriendlyyorupoEntity;
import net.mcreator.yorupo.entity.GuluguluEntity;
import net.mcreator.yorupo.entity.YebueatingEntity;
import net.mcreator.yorupo.entity.YebuspinEntity;
import net.mcreator.yorupo.entity.YorupobossEntity;
import net.mcreator.yorupo.entity.YoruporedEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber
/* loaded from: EntityAnimationFactory.class */
public class EntityAnimationFactory {
    @SubscribeEvent
    public static void onEntityTick(LivingEvent.LivingTickEvent event) {
        if (event != null && event.getEntity() != null) {
            FriendlyyorupoEntity entity = event.getEntity();
            if (entity instanceof FriendlyyorupoEntity) {
                FriendlyyorupoEntity syncable = entity;
                String animation = syncable.getSyncedAnimation();
                if (!animation.equals("undefined")) {
                    syncable.setAnimation("undefined");
                    syncable.animationprocedure = animation;
                }
            }
            YorupobossEntity entity2 = event.getEntity();
            if (entity2 instanceof YorupobossEntity) {
                YorupobossEntity syncable2 = entity2;
                String animation2 = syncable2.getSyncedAnimation();
                if (!animation2.equals("undefined")) {
                    syncable2.setAnimation("undefined");
                    syncable2.animationprocedure = animation2;
                }
            }
            YoruporedEntity entity3 = event.getEntity();
            if (entity3 instanceof YoruporedEntity) {
                YoruporedEntity syncable3 = entity3;
                String animation3 = syncable3.getSyncedAnimation();
                if (!animation3.equals("undefined")) {
                    syncable3.setAnimation("undefined");
                    syncable3.animationprocedure = animation3;
                }
            }
            YebueatingEntity entity4 = event.getEntity();
            if (entity4 instanceof YebueatingEntity) {
                YebueatingEntity syncable4 = entity4;
                String animation4 = syncable4.getSyncedAnimation();
                if (!animation4.equals("undefined")) {
                    syncable4.setAnimation("undefined");
                    syncable4.animationprocedure = animation4;
                }
            }
            GuluguluEntity entity5 = event.getEntity();
            if (entity5 instanceof GuluguluEntity) {
                GuluguluEntity syncable5 = entity5;
                String animation5 = syncable5.getSyncedAnimation();
                if (!animation5.equals("undefined")) {
                    syncable5.setAnimation("undefined");
                    syncable5.animationprocedure = animation5;
                }
            }
            YebuspinEntity entity6 = event.getEntity();
            if (entity6 instanceof YebuspinEntity) {
                YebuspinEntity syncable6 = entity6;
                String animation6 = syncable6.getSyncedAnimation();
                if (!animation6.equals("undefined")) {
                    syncable6.setAnimation("undefined");
                    syncable6.animationprocedure = animation6;
                }
            }
        }
    }
}
