package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.NamelessModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.NamelessEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class NamelessRenderer extends GeoEntityRenderer<NamelessEntity> {
    public NamelessRenderer(EntityRendererProvider.Context context) {
        super(context, new NamelessModel());
    }
}
