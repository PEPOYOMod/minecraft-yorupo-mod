package net.mcreator.yorupo.entity.model;

import net.mcreator.yorupo.entity.FriendlyyorupoEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;
/* loaded from: FriendlyyorupoModel.class */
public class FriendlyyorupoModel extends GeoModel<FriendlyyorupoEntity> {
    public ResourceLocation getAnimationResource(FriendlyyorupoEntity entity) {
        return new ResourceLocation("yorupo", "animations/yebu.animation.json");
    }

    public ResourceLocation getModelResource(FriendlyyorupoEntity entity) {
        return new ResourceLocation("yorupo", "geo/yebu.geo.json");
    }

    public ResourceLocation getTextureResource(FriendlyyorupoEntity entity) {
        return new ResourceLocation("yorupo", "textures/entities/" + entity.getTexture() + ".png");
    }

    public void setCustomAnimations(FriendlyyorupoEntity animatable, long instanceId, AnimationState animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head2");
        if (head != null) {
            EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * 0.017453292f);
            head.setRotY(entityData.netHeadYaw() * 0.017453292f);
        }
    }
}
