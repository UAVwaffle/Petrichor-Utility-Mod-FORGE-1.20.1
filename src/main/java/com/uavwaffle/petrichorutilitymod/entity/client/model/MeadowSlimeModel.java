package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.MeadowSlimeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MeadowSlimeModel extends GeoModel<MeadowSlimeEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/meadow_slime.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/meadow_slime.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/meadow_slime.animation.json");





    @Override
    public ResourceLocation getModelResource(MeadowSlimeEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(MeadowSlimeEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(MeadowSlimeEntity object) {
        return this.animations;
    }
}