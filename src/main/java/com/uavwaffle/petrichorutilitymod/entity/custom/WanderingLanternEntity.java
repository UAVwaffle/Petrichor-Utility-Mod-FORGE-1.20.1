package com.uavwaffle.petrichorutilitymod.entity.custom;

import com.uavwaffle.petrichorutilitymod.entity.custom.type.PetrichorNoFallEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class WanderingLanternEntity extends PetrichorNoFallEntity {

    public static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.wandering_lantern.idle");
    public static final RawAnimation WALK = RawAnimation.begin().thenLoop("animation.wandering_lantern.walk");
    public static final RawAnimation ATTACK_ANIMATION = RawAnimation.begin().thenLoop("animation.wandering_lantern.attack");


    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public WanderingLanternEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel, ATTACK_ANIMATION, 17);
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.ATTACK_DAMAGE, 10.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.35f);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.addBehaviourGoals();
    }
    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0d, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, BoulderSpiritEntity.class, true));
    }



        @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {


        controllers.add(new AnimationController<>(this, "Walk/Idle", 5, state -> state.setAndContinue(state.isMoving() ? WALK : IDLE)));
        controllers.add(new AnimationController<>(this, "AttackController", state -> PlayState.STOP).triggerableAnim("Attack", ATTACK_ANIMATION));

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return geoCache;
    }

    @Override
    protected float getStandingEyeHeight(@NotNull Pose pPose, @NotNull EntityDimensions pSize) {
        return 2.5f;
    }

    /* SOUNDS */
//    @Nullable
//    @Override
//    protected SoundEvent getAmbientSound() {
//        return SoundEvents.CHAIN_BREAK;
//    }
    @Override
    protected @NotNull SoundEvent getHurtSound(@NotNull DamageSource pDamageSource) {
        return SoundEvents.CHAIN_BREAK;
    }
    @Override
    protected @NotNull SoundEvent getDeathSound() {
        return SoundEvents.CHAIN_BREAK;
    }

//    @Override
//    public boolean checkSpawnRules(@NotNull LevelAccessor pLevel, @NotNull MobSpawnType pSpawnReason) {
//        boolean passDefaultSpawnRules = super.checkSpawnRules(pLevel, pSpawnReason);
//        if(!passDefaultSpawnRules) {
//            System.out.println("I don't pass the default rules! " + this.getOnPos());
//            return false;
//        }
//        if (!pLevel.canSeeSky(this.getOnPos(2))) {
//            System.out.println("I cannot see the sky! " + this.getOnPos());
//            return false;
//        }
//        System.out.println("I pass the spawn rules and I can see the sky! " + this.getOnPos());
//        return true;
//    }
}
