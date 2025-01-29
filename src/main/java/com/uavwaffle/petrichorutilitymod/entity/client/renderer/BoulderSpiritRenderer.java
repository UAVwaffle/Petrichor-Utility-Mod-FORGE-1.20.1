package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.BoulderSpiritModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.BoulderSpiritEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BoulderSpiritRenderer extends GeoEntityRenderer<BoulderSpiritEntity> {
    public BoulderSpiritRenderer(EntityRendererProvider.Context context) {
        super(context, new BoulderSpiritModel());
    }
}
