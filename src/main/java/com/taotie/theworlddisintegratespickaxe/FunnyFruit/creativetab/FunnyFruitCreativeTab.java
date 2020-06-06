package com.taotie.theworlddisintegratespickaxe.FunnyFruit.creativetab;

import com.taotie.theworlddisintegratespickaxe.FunnyFruit.FunnyFruitMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FunnyFruitCreativeTab extends CreativeTabs {

	public FunnyFruitCreativeTab() {
		super("creativeTab.funnyFruit.extend");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(FunnyFruitMod.SaplingFunnyFruit);
	}
}
