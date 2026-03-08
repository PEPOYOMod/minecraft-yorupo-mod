package net.mcreator.yorupo.network;

import net.mcreator.yorupo.network.YorupoModVariables;
import net.minecraft.core.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber
/* loaded from: YorupoModVariables$EventBusVariableHandlers.class */
public class YorupoModVariables$EventBusVariableHandlers {
    @SubscribeEvent
    public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.getEntity().m_9236_().m_5776_()) {
            ((YorupoModVariables.PlayerVariables) event.getEntity().getCapability(YorupoModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction) null).orElse(new YorupoModVariables.PlayerVariables())).syncPlayerVariables(event.getEntity());
        }
    }

    @SubscribeEvent
    public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
        if (!event.getEntity().m_9236_().m_5776_()) {
            ((YorupoModVariables.PlayerVariables) event.getEntity().getCapability(YorupoModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction) null).orElse(new YorupoModVariables.PlayerVariables())).syncPlayerVariables(event.getEntity());
        }
    }

    @SubscribeEvent
    public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (!event.getEntity().m_9236_().m_5776_()) {
            ((YorupoModVariables.PlayerVariables) event.getEntity().getCapability(YorupoModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction) null).orElse(new YorupoModVariables.PlayerVariables())).syncPlayerVariables(event.getEntity());
        }
    }

    @SubscribeEvent
    public static void clonePlayer(PlayerEvent.Clone event) {
        event.getOriginal().revive();
        YorupoModVariables.PlayerVariables original = (YorupoModVariables.PlayerVariables) event.getOriginal().getCapability(YorupoModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction) null).orElse(new YorupoModVariables.PlayerVariables());
        YorupoModVariables.PlayerVariables clone = (YorupoModVariables.PlayerVariables) event.getEntity().getCapability(YorupoModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction) null).orElse(new YorupoModVariables.PlayerVariables());
        clone.ramen_times = original.ramen_times;
        if (!event.isWasDeath()) {
            clone.anyeffection = original.anyeffection;
        }
    }
}