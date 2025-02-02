package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.CursedDollEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpecterEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CursedDollModel extends GeoModel<CursedDollEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/cursed_doll.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/cursed_doll.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/cursed_doll.animation.json");





    @Override
    public ResourceLocation getModelResource(CursedDollEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(CursedDollEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(CursedDollEntity object) {
        return this.animations;
    }
}