package com.taotie.theworlddisintegratespickaxe.creativetab;

import com.taotie.theworlddisintegratespickaxe.item.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TheworlddisintegratespickaxeTab extends CreativeTabs {
	public TheworlddisintegratespickaxeTab() {
		super("theworlddisintegratespickaxetab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.Theworlddisintegratespickaxe.getItem());
	}

}
