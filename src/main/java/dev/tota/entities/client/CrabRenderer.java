package dev.tota.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.tota.entities.custom.CrabEntity;
import dev.tota.tota;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CrabRenderer extends GeoEntityRenderer<CrabEntity> {
    public CrabRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrabModel());
    }
    @Override
    public ResourceLocation getTextureLocation(CrabEntity animatable) {
        return new ResourceLocation(tota.MODID, "textures/entity/crabtexture.png");
    }
    @Override
    public void render(CrabEntity entity, float entityYaw, float potentialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight){
        if(entity.isBaby()){
            poseStack.scale(0.4f,0.4f,0.4f);
        }
        super.render(entity,entityYaw,potentialTick,poseStack,bufferSource,packedLight);
    }

}
