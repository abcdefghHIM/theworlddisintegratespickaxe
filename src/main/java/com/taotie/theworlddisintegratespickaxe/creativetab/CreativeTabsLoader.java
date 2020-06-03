package com.taotie.theworlddisintegratespickaxe.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
	public static CreativeTabs TheworlddisintegratespickaxeTab;
	public static CreativeTabs TheworlddisintegratespickaxeOresTab;

	public CreativeTabsLoader(FMLPreInitializationEvent event) {
		TheworlddisintegratespickaxeTab = new TheworlddisintegratespickaxeTab();
		TheworlddisintegratespickaxeOresTab = new TheworlddisintegratespickaxeOresTab();
	}
}
