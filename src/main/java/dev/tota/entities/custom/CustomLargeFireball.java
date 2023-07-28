package dev.tota.entities.custom;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class CustomLargeFireball extends LargeFireball {
    private LivingEntity shootingEntity; // Add a field to store the shooting entity

    public CustomLargeFireball(Level level, LivingEntity shooter, double x, double y, double z, int r) {
        super(level, shooter, x, y, z, r);
        this.shootingEntity = shooter; // Store the shooting entity in the field
    }

    public CustomLargeFireball(EntityType<? extends LargeFireball> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        if (entity != this.shootingEntity) { // Check if the hit entity is not the shooting entity
            // Perform the default behavior (damage the hit entity)
            super.onHitEntity(entityHitResult);
        }
    }
    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.getEntity() == this.shootingEntity) {
            return false; // Prevent the shooting entity from being damaged
        }
        return super.hurt(source, amount);
    }
}
