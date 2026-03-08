package net.mcreator.yorupo.procedures;

import net.mcreator.yorupo.YorupoMod;
import net.mcreator.yorupo.entity.GuluguluEntity;
import net.mcreator.yorupo.entity.YorupobossEntity;
import net.mcreator.yorupo.init.YorupoModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
/* loaded from: YorupobossDangShiTiShouShangShiProcedure.class */
public class YorupobossDangShiTiShouShangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null && sourceentity == ((Entity) world.m_6443_(GuluguluEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
            return true;
        }).stream().sorted(new 1().compareDistOf(x, y, z)).findFirst().orElse(null))) {
            if (entity instanceof LivingEntity) {
                LivingEntity _entity = (LivingEntity) entity;
                if (!_entity.m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 60, 255, false, false));
                }
            }
            if (!((Entity) world.m_6443_(GuluguluEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                return true;
            }).stream().sorted(new 2().compareDistOf(x, y, z)).findFirst().orElse(null)).m_9236_().m_5776_()) {
                ((Entity) world.m_6443_(GuluguluEntity.class, AABB.m_165882_(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e3 -> {
                    return true;
                }).stream().sorted(new 3().compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_();
            }
            if (entity instanceof YorupobossEntity) {
                ((YorupobossEntity) entity).setAnimation("animation.yebu.beigulugulu");
            }
            YorupoMod.queueServerWork(40, () -> {
                if (!entity.m_9236_().m_5776_()) {
                    entity.m_146870_();
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel) world;
                    Entity entityToSpawn = ((EntityType) YorupoModEntities.YEBUSPIN.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                    }
                }
            });
        }
    }
}