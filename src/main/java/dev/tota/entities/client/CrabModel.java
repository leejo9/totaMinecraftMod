package dev.tota.entities.client;

import dev.tota.entities.custom.CrabEntity;
import dev.tota.tota;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CrabModel extends GeoModel<CrabEntity> {
    @Override
    public ResourceLocation getModelResource(CrabEntity animatable) {
        return new ResourceLocation(tota.MODID, "geo/crab.model.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrabEntity animatable) {
        return new ResourceLocation(tota.MODID, "textures/entity/crabtexture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrabEntity animatable) {
        return new ResourceLocation(tota.MODID, "animations/crab.animation.json");
    }
    @Override
    public void setCustomAnimations(CrabEntity animatable, long instanceId, AnimationState<CrabEntity> animationState){
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
        super.setCustomAnimations(animatable, instanceId, animationState);
    }
}
