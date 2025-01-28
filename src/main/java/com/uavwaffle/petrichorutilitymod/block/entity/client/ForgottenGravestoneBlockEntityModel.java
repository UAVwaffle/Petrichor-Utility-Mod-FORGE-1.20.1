package com.uavwaffle.petrichorutilitymod.block.entity.client;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.block.entity.ForgottenGravestoneBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ForgottenGravestoneBlockEntityModel extends GeoModel<ForgottenGravestoneBlockEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/forgotten_gravestone_block.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/vengeful_gravestone.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/forgotten_gravestone_block.animation.json");





    @Override
    public ResourceLocation getModelResource(ForgottenGravestoneBlockEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(ForgottenGravestoneBlockEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ForgottenGravestoneBlockEntity object) {
        return this.animations;
    }
}