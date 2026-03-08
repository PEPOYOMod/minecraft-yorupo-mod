package net.mcreator.yorupo.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.ForgeRegistries;
/* loaded from: DisableItem.class */
public class DisableItem extends RecordItem {
    public DisableItem() {
        super(0, () -> {
            return (SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("yorupo:disable"));
        }, new Item.Properties().m_41487_(1).m_41497_(Rarity.COMMON), 4800);
    }
}
