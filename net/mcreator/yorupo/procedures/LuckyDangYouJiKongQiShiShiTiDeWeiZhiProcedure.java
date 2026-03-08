package net.mcreator.yorupo.procedures;

import net.mcreator.yorupo.init.YorupoModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
/* loaded from: LuckyDangYouJiKongQiShiShiTiDeWeiZhiProcedure.class */
public class LuckyDangYouJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity) entity;
            if (!_entity.m_9236_().m_5776_()) {
                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19621_, 200, 1, false, false));
            }
        }
        if (entity instanceof Player) {
            Player _player = (Player) entity;
            ItemStack _stktoremove = new ItemStack((ItemLike) YorupoModItems.LUCKY.get());
            _player.m_150109_().m_36022_(p -> {
                return _stktoremove.m_41720_() == p.m_41720_();
            }, 1, _player.f_36095_.m_39730_());
        }
    }
}