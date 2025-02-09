package com.uavwaffle.petrichorutilitymod.entity.custom;

import com.uavwaffle.petrichorutilitymod.entity.custom.type.PetrichorAttackingEntity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
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
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

public class MeadowSlimeSmallEntity extends PetrichorAttackingEntity {

    public static final RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.meadow_slime_small.idle");
    public static final RawAnimation WALK = RawAnimation.begin().thenLoop("animation.meadow_slime_small.walk");
    public static final RawAnimation ATTACK_ANIMATION = RawAnimation.begin().thenLoop("animation.meadow_slime_small.attack");


    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);
    public MeadowSlimeSmallEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel, ATTACK_ANIMATION, 16);
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.ATTACK_DAMAGE, 2.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.25f);
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
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, BoulderSpiritEntity.class, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR));
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
    protected float getStandingEyeHeight(Pose pPose, EntityDimensions pSize) {
        return 0.3f;
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
}
