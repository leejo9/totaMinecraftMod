package dev.tota.init;

import dev.tota.entities.custom.CrabEntity;
import dev.tota.entities.custom.FireDragonEntity;
import dev.tota.tota;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, tota.MODID);

    public static final RegistryObject<EntityType<CrabEntity>> CRAB = ENTITY_TYPES.register("crab", ()->EntityType.Builder.of(CrabEntity::new, MobCategory.CREATURE)
            .sized(0.6f, 1.0f)
            .build(new ResourceLocation(tota.MODID, "crab").toString()));
    public static final RegistryObject<EntityType<FireDragonEntity>> FIREDRAGON = ENTITY_TYPES.register("firedragon", ()->EntityType.Builder.of(FireDragonEntity::new, MobCategory.CREATURE)
            .sized(5f, 10f)
            .build(new ResourceLocation(tota.MODID, "crab").toString()));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
