package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.ShadeModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.ShadeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ShadeRenderer extends GeoEntityRenderer<ShadeEntity> {
    public ShadeRenderer(EntityRendererProvider.Context context) {
        super(context, new ShadeModel());
    }
}
