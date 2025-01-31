package com.uavwaffle.petrichorutilitymod.entity.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class BoulderSpiritEntity extends Monster implements GeoEntity {

    private int attackAnimationTickLength = 0;

    public static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.boulder_spirit.idle");
    public static final RawAnimation WALK = RawAnimation.begin().thenLoop("animation.boulder_spirit.walk");
    public static final RawAnimation ATTACK = RawAnimation.begin().thenLoop("animation.boulder_spirit.attack");

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public BoulderSpiritEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 40.0D)
                .add(Attributes.ATTACK_DAMAGE, 15.0f)
                .add(Attributes.ATTACK_SPEED, 0.5f)
                .add(Attributes.MOVEMENT_SPEED, 0.25f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.addBehaviourGoals();
    }
    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0d, false));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, VengefulGravestoneEntity.class, true));

        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR));
    }

    @Override
    protected int decreaseAirSupply(int pAir) {
        return pAir;
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!level().isClientSide) {
            return;
        }
        if (attackAnimationTickLength > 0) {
            attackAnimationTickLength--;
        }

        if (attackAnimationTickLength == 0) {
            stopTriggeredAnimation("AttackController", "Attack");
        }
    }

    @Override
    public boolean doHurtTarget(@NotNull Entity pEntity) {
        this.level().broadcastEntityEvent(this, (byte)4);
        return super.doHurtTarget(pEntity);
    }

    public void handleEntityEvent(byte pId) {
        if (pId == 4) {
            playAttackAnimation();
        } else {
            super.handleEntityEvent(pId);
        }

    }

    private void playAttackAnimation() {
        this.attackAnimationTickLength = 14;
        triggerAnim("AttackController", "Attack");
        this.playSound(SoundEvents.IRON_GOLEM_ATTACK, 1.0F, 1.0F);
    }



        @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {


        controllers.add(new AnimationController<>(this, "Walk/Idle", 5, state -> state.setAndContinue(state.isMoving() ? WALK : IDLE)));
        controllers.add(new AnimationController<>(this, "AttackController", state -> PlayState.STOP).triggerableAnim("Attack", ATTACK));

//        controllers.add( new AnimationController<>(this, "Attack", 0, state -> { //Only works for animations less than 6 ticks
//            if (this.swinging) {
//                return state.setAndContinue(ATTACK);
//            }
//
//            state.getController().forceAnimationReset();
//            return PlayState.STOP;
//
//        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return geoCache;
    }

    @Override
    protected float getStandingEyeHeight(Pose pPose, EntityDimensions pSize) {
        return 1.8f;
    }

//    public void remove(Entity.RemovalReason pReason) { //make more entities
//        if (!this.level().isClientSide && this.isDeadOrDying()) {
//            Component component = this.getCustomName();
//            boolean flag = this.isNoAi();
//            int k = this.random.nextInt(2) + 1;
//
//            for(int l = 0; l < k; ++l) {
//                BoulderSpiritEntity slime = (BoulderSpiritEntity) getType().create(level());
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
}
