package dev.tota.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.tota.entities.custom.CrabEntity;
import dev.tota.entities.custom.FireDragonEntity;
import dev.tota.tota;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FireDragonRenderer extends GeoEntityRenderer<FireDragonEntity> {
    public FireDragonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FireDragonModel());
    }
    @Override
    public ResourceLocation getTextureLocation(FireDragonEntity animatable) {
        return new ResourceLocation(tota.MODID, "textures/entity/firedragontexture.png");
    }
    @Override
    public void render(FireDragonEntity entity, float entityYaw, float potentialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight){
        if(entity.isBaby()){
            poseStack.scale(0.4f,0.4f,0.4f);
        }
        super.render(entity,entityYaw,potentialTick,poseStack,bufferSource,packedLight);
    }

}