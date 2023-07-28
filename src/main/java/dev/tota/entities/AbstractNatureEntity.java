package dev.tota.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

public abstract class AbstractNatureEntity extends LivingEntity {
    protected AbstractNatureEntity(EntityType<? extends LivingEntity> type, Level level) {
        super(type, level);
    }
    public boolean isInNature(){
        Holder<Biome> b = this.level.getBiome(new BlockPos(this.blockPosition().getX(), 0, this.blockPosition().getZ()));
        if(this.level.getBiome(new BlockPos(this.blockPosition().getX(), 0, this.blockPosition().getZ())).equals(Biomes.PLAINS))
            return true;
        return false;
    }
}
