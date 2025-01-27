package com.uavwaffle.petrichorutilitymod.entity.client;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.BoulderSpiritEntity;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class BoulderSpiritModel extends GeoModel<BoulderSpiritEntity> {
    private final ResourceLocation model = new ResourceLocation(PetrichorUtilityMod.MODID, "geo/boulder_spirit.geo.json");
    private final ResourceLocation texture = new ResourceLocation(PetrichorUtilityMod.MODID, "textures/entity/boulder_spirit.png");
    private final ResourceLocation animations = new ResourceLocation(PetrichorUtilityMod.MODID, "animations/boulder_spirit.animation.json");





    @Override
    public ResourceLocation getModelResource(BoulderSpiritEntity object) {
        return this.model;
    }

    @Override
    public ResourceLocation getTextureResource(BoulderSpiritEntity object) {
        return this.texture;
    }

    @Override
    public ResourceLocation getAnimationResource(BoulderSpiritEntity object) {
        return this.animations;
    }
}
