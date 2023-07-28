package dev.tota;

import dev.tota.init.EntityInit;
import dev.tota.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(tota.MODID)
public class  tota {
    public static final String MODID = "tota";

    public tota(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);

        EntityInit.ENTITY_TYPES.register(bus);



    }
}
