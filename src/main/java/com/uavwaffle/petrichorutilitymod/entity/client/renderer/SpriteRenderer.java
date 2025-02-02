package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.SpecterModel;
import com.uavwaffle.petrichorutilitymod.entity.client.model.SpriteModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpecterEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.SpriteEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SpriteRenderer extends GeoEntityRenderer<SpriteEntity> {
    public SpriteRenderer(EntityRendererProvider.Context context) {
        super(context, new SpriteModel());
    }
}
