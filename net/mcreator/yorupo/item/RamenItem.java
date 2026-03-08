
RamenItem.class

package net.mcreator.yorupo.item;

import net.mcreator.yorupo.procedures.RamenDangWanJiaWanChengShiYongWuPinShiProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
/* loaded from: RamenItem.class */
public class RamenItem extends Item {
    public RamenItem() {
        super(new Item.Properties().m_41487_(64).m_41497_(Rarity.COMMON).m_41489_(new FoodProperties.Builder().m_38760_(10).m_38758_(0.3f).m_38765_().m_38757_().m_38767_()));
    }

    public int m_8105_(ItemStack itemstack) {
        return 40;
    }

    public ItemStack m_5922_(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = super.m_5922_(itemstack, world, entity);
        double x = entity.m_20185_();
        double y = entity.m_20186_();
        double z = entity.m_20189_();
        RamenDangWanJiaWanChengShiYongWuPinShiProcedure.execute(world, x, y, z, entity);
        return retval;
