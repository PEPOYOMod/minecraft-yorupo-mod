package net.mcreator.yorupo.procedures;

import net.mcreator.yorupo.entity.YoruporedEntity;
import net.mcreator.yorupo.init.YorupoModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
/* loaded from: YoruporedDangYouJiShiTiShiProcedure.class */
public class YoruporedDangYouJiShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        ItemStack itemStack;
        int i;
        int i2;
        if (entity == null || sourceentity == null) {
            return;
        }
        if (sourceentity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) sourceentity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() == YorupoModItems.RAMEN.get()) {
            if (entity instanceof YoruporedEntity) {
                ((YoruporedEntity) entity).setAnimation("animation.yebu_red.no");
            }
            if (!world.m_5776_() && world.m_7654_() != null) {
                world.m_7654_().m_6846_().m_240416_(Component.m_237113_("<红夜步> 我不要"), false);
            }
            if (entity instanceof YoruporedEntity) {
                YoruporedEntity _datEntSetI = (YoruporedEntity) entity;
                SynchedEntityData m_20088_ = _datEntSetI.m_20088_();
                EntityDataAccessor entityDataAccessor = YoruporedEntity.DATA_no;
                if (entity instanceof YoruporedEntity) {
                    YoruporedEntity _datEntI = (YoruporedEntity) entity;
                    i2 = ((Integer) _datEntI.m_20088_().m_135370_(YoruporedEntity.DATA_no)).intValue();
                } else {
                    i2 = 0;
                }
                m_20088_.m_135381_(entityDataAccessor, Integer.valueOf(i2 + 1));
            }
            if (entity instanceof YoruporedEntity) {
                YoruporedEntity _datEntI2 = (YoruporedEntity) entity;
                i = ((Integer) _datEntI2.m_20088_().m_135370_(YoruporedEntity.DATA_no)).intValue();
            } else {
                i = 0;
            }
            if (i >= 3 && (entity instanceof Mob)) {
                Mob _entity = (Mob) entity;
                _entity.m_21573_().m_26519_(x, y + 10.0d, z, 1.0d);
            }
        }
    }
}