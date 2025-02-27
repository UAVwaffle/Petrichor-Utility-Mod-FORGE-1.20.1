package com.uavwaffle.petrichorutilitymod.entity.custom.type;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.core.animation.RawAnimation;

public abstract class PetrichorNoFallEntity extends PetrichorAttackingEntity{
    public PetrichorNoFallEntity(EntityType<? extends Monster> pEntityType, Level pLevel, RawAnimation ATTACK_ANIMATION, int attackAnimationTickLength) {
        super(pEntityType, pLevel, ATTACK_ANIMATION, attackAnimationTickLength);
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }
}
