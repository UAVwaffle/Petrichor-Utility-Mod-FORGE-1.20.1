package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.FallenStarEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.WanderingLanternEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FallenStarModel extends GeoModel<FallenStarEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/fallen_star.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/fallen_star.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/fallen_star.animation.json");





    @Override
    public ResourceLocation getModelResource(FallenStarEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(FallenStarEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(FallenStarEntity object) {
        return this.animations;
    }
}