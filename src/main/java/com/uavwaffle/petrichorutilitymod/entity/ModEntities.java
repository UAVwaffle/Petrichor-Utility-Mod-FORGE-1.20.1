package com.uavwaffle.petrichorutilitymod.entity;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.custom.*;
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

    /* .ambient mobs spawn naturally while .creature mobs spawn at terrain gen like sheep and cows*/

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
    public static final RegistryObject<EntityType<DirewolfEntity>> DIREWOLF =
            ENTITY_TYPES.register("direwolf",
                    () -> EntityType.Builder.of(DirewolfEntity::new, MobCategory.MONSTER)
                            .sized(0.95f, 1.5f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "direwolf").toString()));
    public static final RegistryObject<EntityType<HauntEntity>> HAUNT =
            ENTITY_TYPES.register("haunt",
                    () -> EntityType.Builder.of(HauntEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.6f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "haunt").toString()));
    public static final RegistryObject<EntityType<MeadowSlimeEntity>> MEADOW_SLIME =
            ENTITY_TYPES.register("meadow_slime",
                    () -> EntityType.Builder.of(MeadowSlimeEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 0.7f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "meadow_slime").toString()));
    public static final RegistryObject<EntityType<MeadowSlimeSmallEntity>> MEADOW_SLIME_SMALL =
            ENTITY_TYPES.register("meadow_slime_small",
                    () -> EntityType.Builder.of(MeadowSlimeSmallEntity::new, MobCategory.MONSTER)
                            .sized(0.6f, 0.6f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "meadow_slime_small").toString()));
    public static final RegistryObject<EntityType<ShadeEntity>> SHADE =
            ENTITY_TYPES.register("shade",
                    () -> EntityType.Builder.of(ShadeEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 2.5f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "shade").toString()));
    public static final RegistryObject<EntityType<DeathKnellEntity>> DEATH_KNELL =
            ENTITY_TYPES.register("death_knell",
                    () -> EntityType.Builder.of(DeathKnellEntity::new, MobCategory.MONSTER)
                            .sized(0.6f, 2.2f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "death_knell").toString()));
    public static final RegistryObject<EntityType<SpecterEntity>> SPECTER =
            ENTITY_TYPES.register("specter",
                    () -> EntityType.Builder.of(SpecterEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.9f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "specter").toString()));
    public static final RegistryObject<EntityType<CursedDollEntity>> CURSED_DOLL =
            ENTITY_TYPES.register("cursed_doll",
                    () -> EntityType.Builder.of(CursedDollEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.9f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "cursed_doll").toString()));
    public static final RegistryObject<EntityType<NamelessEntity>> NAMELESS =
            ENTITY_TYPES.register("nameless",
                    () -> EntityType.Builder.of(NamelessEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.9f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "nameless").toString()));
    public static final RegistryObject<EntityType<ShroominEntity>> SHROOMIN =
            ENTITY_TYPES.register("shroomin",
                    () -> EntityType.Builder.of(ShroominEntity::new, MobCategory.MONSTER)
                            .sized(0.7f, 1.6f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "shroomin").toString()));
    public static final RegistryObject<EntityType<SpriteEntity>> SPRITE =
            ENTITY_TYPES.register("sprite",
                    () -> EntityType.Builder.of(SpriteEntity::new, MobCategory.AMBIENT)
                            .sized(0.5f, 0.8f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "sprite").toString()));
    public static final RegistryObject<EntityType<WillOWispEntity>> WILL_O_WISP =
            ENTITY_TYPES.register("will_o_wisp",
                    () -> EntityType.Builder.of(WillOWispEntity::new, MobCategory.AMBIENT)
                            .sized(0.5f, 1.6f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "will_o_wisp").toString()));
    public static final RegistryObject<EntityType<WanderingLanternEntity>> WANDERING_LANTERN =
            ENTITY_TYPES.register("wandering_lantern",
                    () -> EntityType.Builder.of(WanderingLanternEntity::new, MobCategory.MONSTER)
                            .sized(1.5f, 2.9f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "wandering_lantern").toString()));
    public static final RegistryObject<EntityType<FallenStarEntity>> FALLEN_STAR =
            ENTITY_TYPES.register("fallen_star",
                    () -> EntityType.Builder.of(FallenStarEntity::new, MobCategory.AMBIENT)
                            .sized(0.3f, 0.8f)
                            .build(new ResourceLocation(PetrichorUtilityMod.MODID, "fallen_star").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}