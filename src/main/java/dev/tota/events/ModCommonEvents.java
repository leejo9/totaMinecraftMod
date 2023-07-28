package dev.tota.events;

import dev.tota.entities.custom.CrabEntity;
import dev.tota.entities.custom.FireDragonEntity;
import dev.tota.init.EntityInit;
import dev.tota.tota;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModCommonEvents {
    @Mod.EventBusSubscriber(modid = tota.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void commonSetup(FMLCommonSetupEvent event){

        }
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(EntityInit.CRAB.get(), CrabEntity.getCrabAttributes());
            event.put(EntityInit.FIREDRAGON.get(), FireDragonEntity.getFireDragonAttributes());
        }
    }
}
