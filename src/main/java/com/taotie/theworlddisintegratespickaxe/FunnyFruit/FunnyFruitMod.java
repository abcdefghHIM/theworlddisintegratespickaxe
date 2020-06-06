package com.taotie.theworlddisintegratespickaxe.FunnyFruit;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FunnyFruitMod {
	public static final Item funnyFruit = Item.getByNameOrId("funnyfruit:funny_fruit");
	public static final Item goldenFunnyFruit = Item.getByNameOrId("funnyfruit:golden_funny_fruit");

	public static final Block SaplingFunnyFruit = Block.getBlockFromName("funnyfruit:sapling_funny_fruit");
	public static final Block logFunnyFruit = Block.getBlockFromName("funnyfruit:log_funny_fruit");
	public static final Block levelFunnyFruit = Block.getBlockFromName("funnyfruit:level_funny_fruit");
	public static final Block levelFunny = Block.getBlockFromName("funnyfruit:level_funny");

	public static final CreativeTabs FUNNY_FRUIT() {
		CreativeTabs[] list = CreativeTabs.CREATIVE_TAB_ARRAY;
		for (int i = 0; i < list.length; i++) {
			if (list[i].getTabLabel().equals("creativeTab.funnyFruit"))
				return list[i];
		}
		return null;
	}
}
