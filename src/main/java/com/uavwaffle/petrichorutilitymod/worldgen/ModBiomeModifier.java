package com.uavwaffle.petrichorutilitymod.worldgen;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.entity.ModEntities;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class ModBiomeModifier {

    public static final ResourceKey<BiomeModifier> SPAWN_SPRITE = registerKey("spawn_sprite");
    public static final ResourceKey<BiomeModifier> SPAWN_VENGEFUL_GRAVESTONE = registerKey("spawn_vengeful_gravestone");
    public static final ResourceKey<BiomeModifier> SPAWN_WANDERING_LANTERN = registerKey("spawn_wandering_lantern");


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(PetrichorUtilityMod.MODID, name));
    }

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        /* Vanilla Mob Spawn Weights: https://minecraft.wiki/w/Mob_spawning#Monsters */

        context.register(SPAWN_SPRITE, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
//                biomes.getOrThrow(Tags.Biomes.IS_DENSE_OVERWORLD),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SPRITE.get(), 30, 3, 5))));
        context.register(SPAWN_VENGEFUL_GRAVESTONE, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.VENGEFUL_GRAVESTONE.get(), 40, 1,1))));
        context.register(SPAWN_WANDERING_LANTERN, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                List.of(new MobSpawnSettings.SpawnerData(ModEntities.WANDERING_LANTERN.get(), 20, 1,1))));

    }
}
