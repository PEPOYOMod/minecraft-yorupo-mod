package net.mcreator.yorupo.procedures;

import net.mcreator.yorupo.YorupoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
/* loaded from: FriendlyyorupoDangShiTiChuShiShengChengShiProcedure.class */
public class FriendlyyorupoDangShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _entity = (LivingEntity) entity;
            if (!_entity.m_9236_().m_5776_()) {
                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19619_, 280, 1, false, false));
            }
        }
        YorupoMod.queueServerWork(280, () -> {
            entity.m_6469_(new DamageSource(world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268433_)), 300.0f);
        });
    }
}
