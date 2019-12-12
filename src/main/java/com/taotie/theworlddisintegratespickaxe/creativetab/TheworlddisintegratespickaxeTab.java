package com.taotie.theworlddisintegratespickaxe.creativetab;

import com.taotie.theworlddisintegratespickaxe.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TheworlddisintegratespickaxeTab extends CreativeTabs {
	public TheworlddisintegratespickaxeTab() {
		super("theworlddisintegratespickaxetab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemLoader.item.Theworlddisintegratespickaxe.getItem());
	}

}
