package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.MeadowSlimeModel;
import com.uavwaffle.petrichorutilitymod.entity.client.model.VengefulGravestoneModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.MeadowSlimeEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MeadowSlimeRenderer extends GeoEntityRenderer<MeadowSlimeEntity> {
    public MeadowSlimeRenderer(EntityRendererProvider.Context context) {
        super(context, new MeadowSlimeModel());
    }
}
