package com.uavwaffle.petrichorutilitymod.entity.client.renderer;

import com.uavwaffle.petrichorutilitymod.entity.client.model.DeathKnellModel;
import com.uavwaffle.petrichorutilitymod.entity.custom.DeathKnellEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DeathKnellRenderer extends GeoEntityRenderer<DeathKnellEntity> {
    public DeathKnellRenderer(EntityRendererProvider.Context context) {
        super(context, new DeathKnellModel());
    }
}
