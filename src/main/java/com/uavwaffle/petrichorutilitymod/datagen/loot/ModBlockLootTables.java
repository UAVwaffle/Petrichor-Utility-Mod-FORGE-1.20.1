package com.uavwaffle.petrichorutilitymod.datagen.loot;

import com.uavwaffle.petrichorutilitymod.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables  extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ALEXANDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

        this.dropSelf(ModBlocks.FORGOTTEN_GRAVESTONE_BLOCK.get());

//        this.add(ModBlocks.ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
//        this.add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
//        this.add(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.END_STONE_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
//        this.add(ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
//                block -> createOreDrop(ModBlocks.NETHER_ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));

    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
