package net.mcreator.yorupo.network;

import net.mcreator.yorupo.network.YorupoModVariables;
import net.minecraft.core.Direction;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber
/* loaded from: YorupoModVariables$PlayerVariablesProvider.class */
class YorupoModVariables$PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
    private final YorupoModVariables.PlayerVariables playerVariables = new YorupoModVariables.PlayerVariables();
    private final LazyOptional<YorupoModVariables.PlayerVariables> instance = LazyOptional.of(() -> {
        return this.playerVariables;
    });

    private YorupoModVariables$PlayerVariablesProvider() {
    }

    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
        if ((event.getObject() instanceof Player) && !(event.getObject() instanceof FakePlayer)) {
            event.addCapability(new ResourceLocation("yorupo", "player_variables"), new YorupoModVariables$PlayerVariablesProvider());
        }
    }

    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return cap == YorupoModVariables.PLAYER_VARIABLES_CAPABILITY ? this.instance.cast() : LazyOptional.empty();
    }

    public Tag serializeNBT() {
        return this.playerVariables.writeNBT();
    }

    public void deserializeNBT(Tag nbt) {
        this.playerVariables.readNBT(nbt);
    }
}