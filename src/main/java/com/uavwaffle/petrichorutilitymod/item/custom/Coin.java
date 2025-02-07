package com.uavwaffle.petrichorutilitymod.item.custom;

import com.uavwaffle.petrichorutilitymod.item.ModItems;
import com.uavwaffle.petrichorutilitymod.util.CoinStar;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Coin extends Item {

    public Coin(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide()) {
            return CoinStar.coinstar(pLevel, pPlayer, pUsedHand, ModItems.COIN.get(), ModItems.TEN_COIN.get(), true, false);
        }

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }
}
