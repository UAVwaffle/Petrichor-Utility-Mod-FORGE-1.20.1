package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.google.common.collect.Maps;
import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpecterEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpriteEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.WillOWispEntity;
import com.uavwaffle.petrichorutilitymod.entity.varient_enum.SpriteVarient;
import com.uavwaffle.petrichorutilitymod.entity.varient_enum.WillOWispVarient;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

import java.util.Map;

public class SpriteModel extends GeoModel<SpriteEntity> {
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/sprite.animation.json");

    private static final Map<SpriteVarient, ResourceLocation> MODEL_LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SpriteVarient.class), (map) -> {
                map.put(SpriteVarient.GREEN, new ResourceLocation(PetrichorUtilityMod.MODID,"geo/sprite/sprite.geo.json"));
                map.put(SpriteVarient.YELLOW, new ResourceLocation(PetrichorUtilityMod.MODID,"geo/sprite/sprite2.geo.json"));
                map.put(SpriteVarient.RED, new ResourceLocation(PetrichorUtilityMod.MODID,"geo/sprite/sprite3.geo.json"));
            });

    private static final Map<SpriteVarient, ResourceLocation> TEXTURE_LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SpriteVarient.class), (map) -> {
                map.put(SpriteVarient.GREEN, new ResourceLocation(PetrichorUtilityMod.MODID,"textures/entity/sprite/sprite.png"));
                map.put(SpriteVarient.YELLOW, new ResourceLocation(PetrichorUtilityMod.MODID,"textures/entity/sprite/sprite2.png"));
                map.put(SpriteVarient.RED, new ResourceLocation(PetrichorUtilityMod.MODID,"textures/entity/sprite/sprite3.png"));
            });





    @Override
    public ResourceLocation getModelResource(SpriteEntity object) {
        return MODEL_LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getTextureResource(SpriteEntity object) {
        return TEXTURE_LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationResource(SpriteEntity object) {
        return this.animations;
    }
}