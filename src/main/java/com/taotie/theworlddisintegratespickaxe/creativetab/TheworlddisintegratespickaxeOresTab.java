package com.taotie.theworlddisintegratespickaxe.creativetab;

import com.taotie.theworlddisintegratespickaxe.item.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TheworlddisintegratespickaxeOresTab extends CreativeTabs {
	public TheworlddisintegratespickaxeOresTab() {
		super("theworlddisintegratespickaxeorestab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.Theworlddisintegratespickaxe.getItem());
	}
}
