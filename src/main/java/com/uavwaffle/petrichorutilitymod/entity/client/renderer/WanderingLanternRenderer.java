package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.WanderingLanternModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.WanderingLanternEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WanderingLanternRenderer extends GeoEntityRenderer<WanderingLanternEntity> {
    public WanderingLanternRenderer(EntityRendererProvider.Context context) {
        super(context, new WanderingLanternModel());
    }
}
