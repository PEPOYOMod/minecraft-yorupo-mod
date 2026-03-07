package net.mcreator.yorupo.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.yorupo.entity.GuluguluEntity;
import net.mcreator.yorupo.entity.model.GuluguluModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/* loaded from: GuluguluRenderer.class */
public class GuluguluRenderer extends GeoEntityRenderer<GuluguluEntity> {
    public GuluguluRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GuluguluModel());
        this.f_114477_ = 0.5f;
    }

    public RenderType getRenderType(GuluguluEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_(m_5478_(animatable));
    }

    public void preRender(PoseStack poseStack, GuluguluEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.scaleHeight = 1.0f;
        this.scaleWidth = 1.0f;
        preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    /* access modifiers changed from: protected */
    public float getDeathMaxRotation(GuluguluEntity entityLivingBaseIn) {
        return 0.0f;
    }
}