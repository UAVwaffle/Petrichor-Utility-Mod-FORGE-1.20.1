package com.uavwaffle.petrichorutilitymod.item.custom;

import com.uavwaffle.petrichorutilitymod.item.ModItems;
import com.uavwaffle.petrichorutilitymod.util.CoinStar;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class HundredCoin extends Item {
    public HundredCoin(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pLevel.playSound(pPlayer, pPlayer.getOnPos(), SoundEvents.CHAIN_BREAK, SoundSource.PLAYERS,1.0f, 1.0f);
        if(!pLevel.isClientSide()) {
            return CoinStar.coinstar(pLevel, pPlayer, pUsedHand, ModItems.TEN_COIN.get(), ModItems.FROG_INGOT.get(), false, false);
        }

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }

}
