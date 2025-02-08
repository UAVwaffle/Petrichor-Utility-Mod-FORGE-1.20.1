package com.uavwaffle.petrichorutilitymod.entity.client.model;

import com.google.common.collect.Maps;
import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.DirewolfEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpecterEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpriteEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.WillOWispEntity;
import com.uavwaffle.petrichorutilitymod.entity.varient_enum.SpriteVarient;
import com.uavwaffle.petrichorutilitymod.entity.varient_enum.WillOWispVarient;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

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

    @Override
    public void setCustomAnimations(SpriteEntity animatable, long instanceId, AnimationState<SpriteEntity> animationState) {

        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}