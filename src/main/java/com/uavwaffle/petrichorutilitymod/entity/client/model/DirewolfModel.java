package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.DirewolfEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DirewolfModel extends GeoModel<DirewolfEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/direwolf.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/direwolf.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/direwolf.animation.json");





    @Override
    public ResourceLocation getModelResource(DirewolfEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(DirewolfEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(DirewolfEntity object) {
        return this.animations;
    }
}