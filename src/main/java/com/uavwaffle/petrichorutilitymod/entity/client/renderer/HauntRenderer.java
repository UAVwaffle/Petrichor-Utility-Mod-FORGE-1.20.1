package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.HauntModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.HauntEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HauntRenderer extends GeoEntityRenderer<HauntEntity> {
    public HauntRenderer(EntityRendererProvider.Context context) {
        super(context, new HauntModel());
    }
}
