package net.mcreator.yorupo.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.yorupo.entity.YorupobossEntity;
import net.mcreator.yorupo.entity.model.YorupobossModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/* loaded from: YorupobossRenderer.class */
public class YorupobossRenderer extends GeoEntityRenderer<YorupobossEntity> {
    public YorupobossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new YorupobossModel());
        this.f_114477_ = 0.5f;
    }

    public RenderType getRenderType(YorupobossEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_(m_5478_(animatable));
    }

    public void preRender(PoseStack poseStack, YorupobossEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.scaleHeight = 1.0f;
        this.scaleWidth = 1.0f;
        preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    /* access modifiers changed from: protected */
    public float getDeathMaxRotation(YorupobossEntity entityLivingBaseIn) {
        return 0.0f;
    }
}