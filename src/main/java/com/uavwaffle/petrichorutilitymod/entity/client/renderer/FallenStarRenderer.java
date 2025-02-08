package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.FallenStarModel;
import com.uavwaffle.petrichorutilitymod.entity.client.model.WanderingLanternModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.FallenStarEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.WanderingLanternEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FallenStarRenderer extends GeoEntityRenderer<FallenStarEntity> {
    public FallenStarRenderer(EntityRendererProvider.Context context) {
        super(context, new FallenStarModel());
    }
}
