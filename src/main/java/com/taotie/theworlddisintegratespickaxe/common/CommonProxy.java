package com.taotie.theworlddisintegratespickaxe.common;

import com.taotie.theworlddisintegratespickaxe.creativetab.CreativeTabsLoader;
import com.taotie.theworlddisintegratespickaxe.item.ItemLoader;

import net.minecraftforge.fml.common.event.*;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		new CreativeTabsLoader(event);
		new ItemLoader(event);
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
