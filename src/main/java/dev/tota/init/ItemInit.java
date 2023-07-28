package dev.tota.init;

import dev.tota.tota;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, tota.MODID);

    public static final RegistryObject<Item> CRAB_LEG = ITEMS.register("crab_leg", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRAB_SPAWN_EGG = ITEMS.register("crab_spawn_egg", ()->
            new ForgeSpawnEggItem(EntityInit.CRAB, 0xFFFFFF, 0xF5F5DC, new Item.Properties()));

}
