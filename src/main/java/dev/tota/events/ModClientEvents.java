package dev.tota.events;

import dev.tota.client.models.CrabEntityModel;
import dev.tota.client.renderer.CrabEntityRenderer;
import dev.tota.entities.client.FireDragonRenderer;
import dev.tota.init.EntityInit;
import dev.tota.entities.client.CrabRenderer;
import dev.tota.tota;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = tota.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        EntityRenderers.register(EntityInit.CRAB.get(), CrabRenderer::new);
        EntityRenderers.register(EntityInit.FIREDRAGON.get(), FireDragonRenderer::new);
    }
/*
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInit.CRAB.get(), CrabEntityRenderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(CrabEntityModel.LAYER_LOCATION, CrabEntityModel::createBodyLayer);
    } */
}
