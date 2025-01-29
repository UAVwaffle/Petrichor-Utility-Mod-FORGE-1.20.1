package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.ShadeEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShadeModel extends GeoModel<ShadeEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/shade.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/shade.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/shade.animation.json");





    @Override
    public ResourceLocation getModelResource(ShadeEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(ShadeEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(ShadeEntity object) {
        return this.animations;
    }
}