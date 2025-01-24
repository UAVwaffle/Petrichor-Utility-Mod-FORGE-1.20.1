package com.uavwaffle.petrichorutilitymod.item;

import com.uavwaffle.petrichorutilitymod.PetrichorUtilityMod;
import net.minecraft.world.item.Item;
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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
