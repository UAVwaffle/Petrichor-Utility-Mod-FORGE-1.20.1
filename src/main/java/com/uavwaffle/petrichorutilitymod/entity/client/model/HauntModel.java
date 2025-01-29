package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.HauntEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HauntModel extends GeoModel<HauntEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/haunt.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/haunt.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/haunt.animation.json");





    @Override
    public ResourceLocation getModelResource(HauntEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(HauntEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(HauntEntity object) {
        return this.animations;
    }
}