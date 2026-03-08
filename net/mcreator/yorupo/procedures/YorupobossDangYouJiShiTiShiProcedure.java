package net.mcreator.yorupo.procedures;

import net.mcreator.yorupo.init.YorupoModItems;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
/* loaded from: YorupobossDangYouJiShiTiShiProcedure.class */
public class YorupobossDangYouJiShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity) entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() == YorupoModItems.RAMEN.get() && !entity.m_9236_().m_5776_()) {
            entity.m_146870_();
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel) world;
            _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", Component.m_237113_(""), _level.m_7654_(), (Entity) null).m_81324_(), "execute as @e[type=!minecraft:player 2] at @s run tp @s ~ ~ ~ facing entity @p[distance=..32]");
        }
    }
}