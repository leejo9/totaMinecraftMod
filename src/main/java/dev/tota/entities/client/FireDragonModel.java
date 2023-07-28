package dev.tota.entities.client;

import dev.tota.entities.custom.CrabEntity;
import dev.tota.entities.custom.FireDragonEntity;
import dev.tota.tota;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class FireDragonModel extends GeoModel<FireDragonEntity> {
    @Override
    public ResourceLocation getModelResource(FireDragonEntity animatable) {
        return new ResourceLocation(tota.MODID, "geo/firedragon.model.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireDragonEntity animatable) {
        return new ResourceLocation(tota.MODID, "textures/entity/firedragontexture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireDragonEntity animatable) {
        return new ResourceLocation(tota.MODID, "animations/firedragon.animation.json");
    }
    @Override
    public void setCustomAnimations(FireDragonEntity animatable, long instanceId, AnimationState<FireDragonEntity> animationState){
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
        super.setCustomAnimations(animatable, instanceId, animationState);
    }
}
