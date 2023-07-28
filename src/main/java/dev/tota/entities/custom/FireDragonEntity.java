package dev.tota.entities.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class FireDragonEntity extends Monster implements GeoEntity, RangedAttackMob {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    public FireDragonEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
    private int fireBreathCooldown = 200;
    private boolean isBreathingFire = false;

    public static AttributeSupplier getFireDragonAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 150D)
                .add(Attributes.ATTACK_DAMAGE, 1.0f)
                .add(Attributes.ATTACK_SPEED, 0.8f)
                .add(Attributes.MOVEMENT_SPEED, 0.5f).build();
    }
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 0.6, 1,3,5));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 0.3D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 4.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 0, this::predicate));
        controllers.add(new AnimationController<>(this, "attackController", 0, this::attackPredicate));

    }

    public boolean isBreathingFire(){
        return isBreathingFire;
    }
    public void setBreathingFire(Boolean breathingFire){
        isBreathingFire = breathingFire;
    }

    @Override
    public boolean fireImmune(){
        return true;
    }
    public void performRangedAttack(LivingEntity p_29912_, float p_29913_) {
        if(isBreathingFire()) {
            System.out.println(this.getHealth());
            Fireball fireball = new CustomLargeFireball(this.level, this, p_29912_.getX(), p_29912_.getY() + 10, p_29912_.getZ(), 3);
            double d0 = p_29912_.getEyeY() - (double) 1.1F - 10;
            double d1 = p_29912_.getX() - this.getX();
            double d2 = d0 - fireball.getY();
            double d3 = p_29912_.getZ() - this.getZ();
            double d4 = Math.sqrt(d1 * d1 + d3 * d3) * (double) 0.2F;
            fireball.shoot(d1, d2 + d4, d3, 1.6F, 12.0F);
            this.playSound(SoundEvents.SNOW_GOLEM_SHOOT, 1.0F, 0.4F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
            this.level.addFreshEntity(fireball);
            setBreathingFire(false);
        }

            /*
            Vec3 vec3 = this.getViewVector(1.0F).normalize();
            vec3.yRot((-(float)Math.PI / 4F));
            double d0 = this.getX();
            double d1 = this.getY(0.5D) + 110;
            double d2 = this.getZ() + 44;

            for(int i = 0; i < 8; i++) {
                double d3 = this.getRandom().nextGaussian() / 2.0D;
                double d4 = this.getRandom().nextGaussian() / 2.0D;
                double d5 = this.getRandom().nextGaussian() / 2.0D;
                level.addParticle(ParticleTypes.FLAME,
                        getX() + p_29912_.getX(),
                        getY() + p_29912_.getY(),
                        getZ() + p_29912_.getZ(),
                        d3, d4, d5);
            }

                vec3.yRot(0.19634955F);
            }*/

        }

    @Override
    public void tick() {
        super.tick();
        // Decrement fire breath cooldown
        if (fireBreathCooldown > 0) {
            fireBreathCooldown--;
        }
        else{
            setBreathingFire(true);
            fireBreathCooldown=200;
        }
        if (level.isClientSide) {
            doClientTick();
        }

    }
    public void doClientTick() {
        if (isBreathingFire()) {
            System.out.println(this.getTarget());
            Vec3 vec3 = this.getLookAngle().normalize();
            vec3.yRot((-(float)Math.PI / 4F));
            double d0 = this.getX();
            double d1 = this.getY(0.65D);
            double d2 = this.getZ();

            for (int i = 0; i < 20; ++i) { // Increase the number of particles
                double d3 = d0 + this.getRandom().nextGaussian() / 2.0D;
                double d4 = d1 + this.getRandom().nextGaussian() / 2.0D;
                double d5 = d2 + this.getRandom().nextGaussian() / 2.0D;

                for (int j = 0; j < 10; ++j) {
                    this.level.addParticle(ParticleTypes.FLAME,
                            d3, d4, d5,
                            vec3.x * (double)0.5F * (double)j, // Use positive values
                            vec3.y * (double)0.6F, // Use positive values
                            vec3.z * (double)0.18F * (double)j); // Use positive values
                }

                vec3.yRot(0.19634955F);
            }
            setBreathingFire(false);
        }

    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if(tAnimationState.isMoving()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.firedragon.walk", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.firedragon.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }
    private <T extends GeoAnimatable> PlayState attackPredicate(AnimationState<T> tAnimationState) {
        if(isBreathingFire() && tAnimationState.getController().getAnimationState().equals(AnimationController.State.STOPPED)) {
            System.out.println("sup");
            tAnimationState.getController().forceAnimationReset();
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.firedragon.roar", Animation.LoopType.PLAY_ONCE));
            setBreathingFire(false);
        }
        return PlayState.CONTINUE;
    }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}





