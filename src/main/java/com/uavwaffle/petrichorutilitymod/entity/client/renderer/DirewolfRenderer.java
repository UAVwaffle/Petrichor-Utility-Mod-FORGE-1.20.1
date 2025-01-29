package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.DirewolfModel;
import com.uavwaffle.petrichorutilitymod.entity.client.model.VengefulGravestoneModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.DirewolfEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DirewolfRenderer extends GeoEntityRenderer<DirewolfEntity> {
    public DirewolfRenderer(EntityRendererProvider.Context context) {
        super(context, new DirewolfModel());
    }
}
