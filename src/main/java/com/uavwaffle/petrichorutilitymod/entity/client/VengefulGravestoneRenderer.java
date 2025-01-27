package com.uavwaffle.petrichorutilitymod.entity.client;

import com.uavwaffle.petrichorutilitymod.entity.custom.BoulderSpiritEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class VengefulGravestoneRenderer extends GeoEntityRenderer<VengefulGravestoneEntity> {
    public VengefulGravestoneRenderer(EntityRendererProvider.Context context) {
        super(context, new VengefulGravestoneModel());
    }
}
