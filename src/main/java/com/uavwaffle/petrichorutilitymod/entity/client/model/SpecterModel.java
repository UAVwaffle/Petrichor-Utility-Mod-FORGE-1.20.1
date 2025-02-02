package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpecterEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.WillOWispEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SpecterModel extends GeoModel<SpecterEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/specter.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/specter.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/specter.animation.json");





    @Override
    public ResourceLocation getModelResource(SpecterEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(SpecterEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(SpecterEntity object) {
        return this.animations;
    }

    @Override
    public RenderType getRenderType(SpecterEntity animatable, ResourceLocation texture) {
        return RenderType.entityTranslucent(getTextureResource(animatable));
    }
}