package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.NamelessEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NamelessModel extends GeoModel<NamelessEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/nameless.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/nameless.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/nameless.animation.json");





    @Override
    public ResourceLocation getModelResource(NamelessEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(NamelessEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(NamelessEntity object) {
        return this.animations;
    }
}