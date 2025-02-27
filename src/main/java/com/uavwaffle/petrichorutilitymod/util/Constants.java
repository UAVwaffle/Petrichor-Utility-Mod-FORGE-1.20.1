package com.uavwaffle.petrichorutilitymod.util;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Constants {

    public static final List<ItemLike> WOOD_TYPES = Arrays.asList(
            Items.OAK_LOG,
            Items.ACACIA_LOG,
            Items.BIRCH_LOG,
            Items.CHERRY_LOG,
            Items.JUNGLE_LOG,
            Items.DARK_OAK_LOG,
            Items.MANGROVE_LOG,
            Items.SPRUCE_LOG);

    public static ItemLike getRandomWoodType() {
        return Constants.WOOD_TYPES.get(new Random().nextInt(Constants.WOOD_TYPES.size()));
    }
}
