package com.taotie.theworlddisintegratespickaxe.item;

import com.taotie.theworlddisintegratespickaxe.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class GuGuGu extends ItemSword {

	public static final Item.ToolMaterial GuGuGu = EnumHelper.addToolMaterial("GUGUGU", 3, Integer.MAX_VALUE,
			Float.MAX_VALUE, Float.MAX_VALUE, Integer.MAX_VALUE);

	public GuGuGu() {
		super(GuGuGu);
		this.setRegistryName("gugugu");
		this.setUnlocalizedName("GuGuGu");
		this.setCreativeTab(CreativeTabsLoader.TheworlddisintegratespickaxeTab);
	}
}
