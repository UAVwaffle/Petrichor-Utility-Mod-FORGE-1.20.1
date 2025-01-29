package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.MeadowSlimeSmallEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MeadowSlimeSmallModel extends GeoModel<MeadowSlimeSmallEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/meadow_slime_small.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/meadow_slime_small.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/meadow_slime_small.animation.json");





    @Override
    public ResourceLocation getModelResource(MeadowSlimeSmallEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(MeadowSlimeSmallEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(MeadowSlimeSmallEntity object) {
        return this.animations;
    }
}