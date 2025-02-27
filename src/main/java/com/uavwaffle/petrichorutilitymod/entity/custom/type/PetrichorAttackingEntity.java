package com.uavwaffle.petrichorutilitymod.entity.custom.type;

import com.uavwaffle.petrichorutilitymod.util.Constants;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

public abstract class PetrichorAttackingEntity extends Monster implements GeoEntity {

    private final int attackAnimationTickLength;
    private int attackAnimationTick = 0;
    private boolean attacking = false;

    private final RawAnimation ATTACK_ANIMATION;// = RawAnimation.begin().thenLoop("animation.boulder_spirit.attack");

    public PetrichorAttackingEntity(EntityType<? extends Monster> pEntityType, Level pLevel, RawAnimation ATTACK_ANIMATION, int attackAnimationTickLength) {
        super(pEntityType, pLevel);
        this.ATTACK_ANIMATION = ATTACK_ANIMATION;
        this.attackAnimationTickLength = attackAnimationTickLength;
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (attackAnimationTick > 0) {
            attackAnimationTick--;
            attacking = true;
        }



        if (attackAnimationTick == 0) {
            attacking = false;
            stopTriggeredAnimation("AttackController", "Attack");
        }
    }

    @Override
    public boolean doHurtTarget(@NotNull Entity pEntity) {
        if (!attacking) {
            this.level().broadcastEntityEvent(this, (byte)4);
            this.attackAnimationTick = attackAnimationTickLength;
            return super.doHurtTarget(pEntity);//this should be called at the halfway mark of attack animation tick
        }
        return false;
    }

    public void handleEntityEvent(byte pId) {
        if (pId == 4) {
            playAttackAnimation();
        } else {
            super.handleEntityEvent(pId);
        }

    }

    private void playAttackAnimation() {
        this.attackAnimationTick = attackAnimationTickLength;
        triggerAnim("AttackController", "Attack");
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "AttackController", state -> PlayState.STOP).triggerableAnim("Attack", ATTACK_ANIMATION));
    }

    @Override
    public boolean checkSpawnRules(@NotNull LevelAccessor pLevel, @NotNull MobSpawnType pSpawnReason) {
        if(pSpawnReason != MobSpawnType.NATURAL){
            return super.checkSpawnRules(pLevel, pSpawnReason);
        }

        if(pLevel.getBiome(this.getOnPos()).containsTag(Constants.FORGE_NO_DEFAULT_MONSTERS_TAG)) {
            return false;
        }

        if(pLevel.getBiome(this.getOnPos()).containsTag(Tags.Biomes.IS_MUSHROOM)) {
            return false;
        }

        if(pLevel.getBiome(this.getOnPos()).is(Biomes.DEEP_DARK)) {
            return false;
        }

        return  true;
    }

}
