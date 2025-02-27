package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.WillOWispModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.WillOWispEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WillOWispRenderer extends GeoEntityRenderer<WillOWispEntity> {
    public WillOWispRenderer(EntityRendererProvider.Context context) {
        super(context, new WillOWispModel());
    }
}
