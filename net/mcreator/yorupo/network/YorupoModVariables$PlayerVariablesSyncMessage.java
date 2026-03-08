package net.mcreator.yorupo.network;

import java.util.function.Supplier;
import net.mcreator.yorupo.network.YorupoModVariables;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Direction;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;
/* loaded from: YorupoModVariables$PlayerVariablesSyncMessage.class */
public class YorupoModVariables$PlayerVariablesSyncMessage {
    private final YorupoModVariables.PlayerVariables data;

    public YorupoModVariables$PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
        this.data = new YorupoModVariables.PlayerVariables();
        this.data.readNBT(buffer.m_130260_());
    }

    public YorupoModVariables$PlayerVariablesSyncMessage(YorupoModVariables.PlayerVariables data) {
        this.data = data;
    }

    public static void buffer(YorupoModVariables$PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
        buffer.m_130079_(message.data.writeNBT());
    }

    public static void handler(YorupoModVariables$PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            if (!context.getDirection().getReceptionSide().isServer()) {
                YorupoModVariables.PlayerVariables variables = (YorupoModVariables.PlayerVariables) Minecraft.m_91087_().f_91074_.getCapability(YorupoModVariables.PLAYER_VARIABLES_CAPABILITY, (Direction) null).orElse(new YorupoModVariables.PlayerVariables());
                variables.anyeffection = message.data.anyeffection;
                variables.ramen_times = message.data.ramen_times;
            }
        });
        context.setPacketHandled(true);
    }
}