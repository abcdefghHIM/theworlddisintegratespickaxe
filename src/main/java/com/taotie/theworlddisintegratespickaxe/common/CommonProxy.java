package com.taotie.theworlddisintegratespickaxe.common;

import com.taotie.theworlddisintegratespickaxe.FunnyFruit.FunnyFruitLoader;
import com.taotie.theworlddisintegratespickaxe.IC2.IC2Loader;
import com.taotie.theworlddisintegratespickaxe.block.BlockLoader;
import com.taotie.theworlddisintegratespickaxe.block.ore.BlockOreLoader;
import com.taotie.theworlddisintegratespickaxe.crafting.CraftingLoader;
import com.taotie.theworlddisintegratespickaxe.creativetab.CreativeTabsLoader;
import com.taotie.theworlddisintegratespickaxe.entity.EntityLoader;
import com.taotie.theworlddisintegratespickaxe.item.ItemLoader;
import com.taotie.theworlddisintegratespickaxe.world.WorldLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Loader;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		new WorldLoader(event);
		new CreativeTabsLoader(event);
		new ItemLoader(event);
		new BlockLoader(event);
		new BlockOreLoader(event);
		new EntityLoader();
		new FunnyFruitLoader();
	}

	public void init(FMLInitializationEvent event) {
		if(Loader.isModLoaded("ic2"))
		{
			new IC2Loader();
		}
		new CraftingLoader();
		new EventLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
