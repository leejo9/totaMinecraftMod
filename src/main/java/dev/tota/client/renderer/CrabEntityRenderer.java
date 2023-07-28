package dev.tota.client.renderer;

import dev.tota.client.models.CrabEntityModel;
import dev.tota.entities.custom.CrabEntity;
import dev.tota.tota;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CrabEntityRenderer extends MobRenderer<CrabEntity, CrabEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(tota.MODID, "textures/entities/crabtexture.png");
    public CrabEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new CrabEntityModel(context.bakeLayer(CrabEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(CrabEntity entity) {
        return TEXTURE;
    }
}
