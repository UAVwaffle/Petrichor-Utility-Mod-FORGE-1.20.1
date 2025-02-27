package com.uavwaffle.petrichorutilitymod.entity.custom;

import com.uavwaffle.petrichorutilitymod.entity.varient_enum.WillOWispVarient;
import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;

public class WillOWispEntity extends PathfinderMob implements GeoEntity {

    private static final EntityDataAccessor<Integer> VARIANT =
            SynchedEntityData.defineId(WillOWispEntity.class, EntityDataSerializers.INT);


    public static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.will_o_wisp.idle");
    public static final RawAnimation WALK = RawAnimation.begin().thenLoop("animation.will_o_wisp.walk");


    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public WillOWispEntity(EntityType<? extends PathfinderMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes(){
        return AmbientCreature.createMobAttributes().add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.ATTACK_DAMAGE, 2.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.15f);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
    }






        @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {


        controllers.add(new AnimationController<>(this, "Walk/Idle", 5, state -> state.setAndContinue(state.isMoving() ? WALK : IDLE)));

//            controllers.add( new AnimationController<>(this, "Walk/Idle", 10, state -> { //feature preview for resting transitions
//            if (state.isMoving()) {
//                resting = false;
//                return state.setAndContinue(WALK);
//            }
//            if (resting) {
//                return state.setAndContinue(RESTING);
//            }
//            return state.setAndContinue(IDLE);
//
//            }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return geoCache;
    }

    @Override
    protected float getStandingEyeHeight(@NotNull Pose pPose, @NotNull EntityDimensions pSize) {
        return 1.4f;
    }

//    public void remove(Entity.RemovalReason pReason) { //make more entities
//        if (!this.level().isClientSide && this.isDeadOrDying()) {
//            Component component = this.getCustomName();
//            boolean flag = this.isNoAi();
//            int k = this.random.nextInt(2) + 1;
//
//            for(int l = 0; l < k; ++l) {
//                VengefulGravestoneEntity slime = (VengefulGravestoneEntity) getType().create(level());
//                if (slime != null) {
//                    if (this.isPersistenceRequired()) {
//                        slime.setPersistenceRequired();
//                    }
//
//                    slime.setCustomName(component);
//                    slime.setNoAi(flag);
//                    slime.setInvulnerable(this.isInvulnerable());
//                    slime.moveTo(this.getX(), this.getY() + 0.5D, this.getZ(), this.random.nextFloat() * 360.0F, 0.0F);
//                    this.level().addFreshEntity(slime);
//                }
//            }
//        }
//
//        super.remove(pReason);
//    }

    /* VARIANT STUFF */
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

    private int getTypeVariant() {
        return this.entityData.get(VARIANT);
    }

    public WillOWispVarient getVariant() {
        return WillOWispVarient.byId(this.getTypeVariant() & 255);
    }

    private void setVariant(WillOWispVarient variant) {
        this.entityData.set(VARIANT, variant.getId() & 255);
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        this.entityData.set(VARIANT, pCompound.getInt("Variant"));
    }


    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        WillOWispVarient variant = Util.getRandom(WillOWispVarient.values(), this.random);
        this.setVariant(variant);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }

}
