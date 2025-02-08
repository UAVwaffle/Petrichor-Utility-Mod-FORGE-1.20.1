package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.ShadeEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.WanderingLanternEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WanderingLanternModel extends GeoModel<WanderingLanternEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/wandering_lantern.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/wandering_lantern.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/wandering_lantern.animation.json");





    @Override
    public ResourceLocation getModelResource(WanderingLanternEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(WanderingLanternEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(WanderingLanternEntity object) {
        return this.animations;
    }
}