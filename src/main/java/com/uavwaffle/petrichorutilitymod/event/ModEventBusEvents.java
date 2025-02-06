package com.uavwaffle.petrichorutilitymod.event;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.ModEntities;
import com.uavwaffle.petrichorutilitymod.entity.custom.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PetrichorUtilityMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BOULDER_SPIRIT.get(), BoulderSpiritEntity.createAttributes().build());
        event.put(ModEntities.VENGEFULE_GRAVESTONE.get(), VengefulGravestoneEntity.createAttributes().build());
        event.put(ModEntities.DIREWOLF.get(), DirewolfEntity.createAttributes().build());
        event.put(ModEntities.HAUNT.get(), HauntEntity.createAttributes().build());
        event.put(ModEntities.MEADOW_SLIME.get(), MeadowSlimeEntity.createAttributes().build());
        event.put(ModEntities.MEADOW_SLIME_SMALL.get(), MeadowSlimeSmallEntity.createAttributes().build());
        event.put(ModEntities.SHADE.get(), ShadeEntity.createAttributes().build());
        event.put(ModEntities.DEATH_KNELL.get(), DeathKnellEntity.createAttributes().build());
        event.put(ModEntities.SPECTER.get(), SpecterEntity.createAttributes().build());
        event.put(ModEntities.CURSED_DOLL.get(), CursedDollEntity.createAttributes().build());
        event.put(ModEntities.NAMELESS.get(), NamelessEntity.createAttributes().build());
        event.put(ModEntities.SHROOMIN.get(), ShroominEntity.createAttributes().build());
        event.put(ModEntities.SPRITE.get(), SpriteEntity.createAttributes().build());
        event.put(ModEntities.WILL_O_WISP.get(), WillOWispEntity.createAttributes().build());

    }
}
