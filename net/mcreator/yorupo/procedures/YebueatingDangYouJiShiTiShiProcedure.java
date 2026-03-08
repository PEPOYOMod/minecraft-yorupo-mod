package net.mcreator.yorupo.procedures;

import net.mcreator.yorupo.YorupoMod;
import net.mcreator.yorupo.entity.YebueatingEntity;
import net.mcreator.yorupo.init.YorupoModEntities;
import net.mcreator.yorupo.init.YorupoModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.items.ItemHandlerHelper;
/* loaded from: YebueatingDangYouJiShiTiShiProcedure.class */
public class YebueatingDangYouJiShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        if (sourceentity instanceof Player) {
            Player _player = (Player) sourceentity;
            ItemStack _setstack = new ItemStack((ItemLike) YorupoModItems.RAMEN.get()).m_41777_();
            _setstack.m_41764_(1);
            ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
        }
        if (entity instanceof YebueatingEntity) {
            ((YebueatingEntity) entity).setAnimation("empty");
        }
        if (entity instanceof YebueatingEntity) {
            YebueatingEntity animatable = (YebueatingEntity) entity;
            animatable.setTexture("yebu_bleeded");
        }
        if (entity instanceof YebueatingEntity) {
            ((YebueatingEntity) entity).setAnimation("animation.yebu.what?");
        }
        YorupoMod.queueServerWork(50, () -> {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                Entity entityToSpawn = ((EntityType) YorupoModEntities.YORUPOBOSS.get()).m_262496_(_level, BlockPos.m_274561_(x, y, z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                }
            }
        });
    }
}