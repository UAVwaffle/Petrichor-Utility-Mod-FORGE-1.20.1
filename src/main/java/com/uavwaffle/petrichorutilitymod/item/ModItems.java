package com.uavwaffle.petrichorutilitymod.item;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import com.uavwaffle.petrichorutilitymod.block.ModBlocks;
import com.uavwaffle.petrichorutilitymod.entity.ModEntities;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PetrichorUtilityMod.MODID);

    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN_BUNDLE = ITEMS.register("coin_bundle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_COIN_BUNDLE = ITEMS.register("large_coin_bundle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROG_IDOL = ITEMS.register("frog_idol",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> FORGOTTEN_GRAVESTONE_BLOCK_ITEM = ITEMS.register("forgotten_gravestone_block_entity",
            () -> new BlockItem(ModBlocks.FORGOTTEN_GRAVESTONE_BLOCK.get(), new Item.Properties()));


    public static final RegistryObject<Item> BOULDER_SPIRIT_SPAWN_EGG = ITEMS.register("boulder_spirit_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BOULDER_SPIRIT, 0x615f5e, 0x1448ab,
                    new Item.Properties()));

    public static final RegistryObject<Item> VENGEFUL_GRAVESTONE_SPAWN_EGG = ITEMS.register("vengeful_gravestone_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.VENGEFULE_GRAVESTONE, 0x1448ab, 0x615f5e,
                    new Item.Properties()));



    public static final RegistryObject<Item> DIREWOLF_SPAWN_EGG = ITEMS.register("direwolf_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DIREWOLF, 0x1448ab, 0x615f5e,
                    new Item.Properties()));
    public static final RegistryObject<Item> HAUNT_SPAWN_EGG = ITEMS.register("haunt_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HAUNT, 0x1448ab, 0x615f5e,
                    new Item.Properties()));
    public static final RegistryObject<Item> MEADOW_SLIME_SPAWN_EGG = ITEMS.register("meadow_slime_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MEADOW_SLIME, 0x1448ab, 0x615f5e,
                    new Item.Properties()));
    public static final RegistryObject<Item> MEADOW_SLIME_SMALL_SPAWN_EGG = ITEMS.register("meadow_slime_small_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MEADOW_SLIME_SMALL, 0x1448ab, 0x615f5e,
                    new Item.Properties()));
    public static final RegistryObject<Item> SHADE_SPAWN_EGG = ITEMS.register("shade_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SHADE, 0x1448ab, 0x615f5e,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
