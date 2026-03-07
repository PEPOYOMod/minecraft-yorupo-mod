package net.mcreator.yorupo.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.yorupo.entity.YoruporedEntity;
import net.mcreator.yorupo.entity.model.YoruporedModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/* loaded from: YoruporedRenderer.class */
public class YoruporedRenderer extends GeoEntityRenderer<YoruporedEntity> {
    public YoruporedRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new YoruporedModel());
        this.f_114477_ = 0.5f;
    }

    public RenderType getRenderType(YoruporedEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_(m_5478_(animatable));
    }

    public void preRender(PoseStack poseStack, YoruporedEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.scaleHeight = 1.0f;
        this.scaleWidth = 1.0f;
        preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }
}