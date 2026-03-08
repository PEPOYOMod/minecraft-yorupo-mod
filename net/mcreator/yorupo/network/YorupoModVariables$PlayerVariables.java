package net.mcreator.yorupo.network;

import net.mcreator.yorupo.YorupoMod;
import net.mcreator.yorupo.network.YorupoModVariables;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.PacketDistributor;
/* loaded from: YorupoModVariables$PlayerVariables.class */
public class YorupoModVariables$PlayerVariables {
    public double anyeffection = 0.0d;
    public double ramen_times = 0.0d;

    public void syncPlayerVariables(Entity entity) {
        if (entity instanceof ServerPlayer) {
            ServerPlayer serverPlayer = (ServerPlayer) entity;
            YorupoMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> {
                return serverPlayer;
            }), new YorupoModVariables.PlayerVariablesSyncMessage(this));
        }
    }

    public Tag writeNBT() {
        CompoundTag nbt = new CompoundTag();
        nbt.m_128347_("anyeffection", this.anyeffection);
        nbt.m_128347_("ramen_times", this.ramen_times);
        return nbt;
    }

    public void readNBT(Tag tag) {
        CompoundTag nbt = (CompoundTag) tag;
        this.anyeffection = nbt.m_128459_("anyeffection");
        this.ramen_times = nbt.m_128459_("ramen_times");
    }
}