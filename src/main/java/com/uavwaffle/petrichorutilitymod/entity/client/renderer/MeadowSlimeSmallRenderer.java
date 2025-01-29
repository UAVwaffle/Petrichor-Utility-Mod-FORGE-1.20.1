package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.MeadowSlimeSmallModel;
import com.uavwaffle.petrichorutilitymod.entity.client.model.VengefulGravestoneModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.MeadowSlimeEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.MeadowSlimeSmallEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MeadowSlimeSmallRenderer extends GeoEntityRenderer<MeadowSlimeSmallEntity> {
    public MeadowSlimeSmallRenderer(EntityRendererProvider.Context context) {
        super(context, new MeadowSlimeSmallModel());
    }
}
