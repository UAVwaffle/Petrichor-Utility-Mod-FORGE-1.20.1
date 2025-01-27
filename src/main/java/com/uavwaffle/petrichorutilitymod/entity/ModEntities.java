package com.uavwaffle.petrichorutilitymod.entity;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.BoulderSpiritEntity;
import com.uavwaffle.petrichorutilitymod.entity.custom.VengefulGravestoneEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PetrichorUtilityMod.MODID);

    public static final RegistryObject<EntityType<BoulderSpiritEntity>> BOULDER_SPIRIT =
            ENTITY_TYPES.register("boulder_spirit",
                    () -> EntityType.Builder.of(BoulderSpiritEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.9f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "boulder_spirit").toString()));
    public static final RegistryObject<EntityType<VengefulGravestoneEntity>> VENGEFULE_GRAVESTONE =
            ENTITY_TYPES.register("vengeful_gravestone",
                    () -> EntityType.Builder.of(VengefulGravestoneEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 2.375f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "vengeful_gravestone").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}