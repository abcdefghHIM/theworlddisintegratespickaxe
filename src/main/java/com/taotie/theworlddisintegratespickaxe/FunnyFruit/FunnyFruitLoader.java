package com.taotie.theworlddisintegratespickaxe.FunnyFruit;

import com.taotie.theworlddisintegratespickaxe.FunnyFruit.creativetab.FunnyFruitCreativeTabsLoader;
import com.taotie.theworlddisintegratespickaxe.FunnyFruit.item.FunnyFruitItemLoader;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;

public class FunnyFruitLoader {
	public FunnyFruitLoader() {
		if(Loader.isModLoaded("funnyfruit"))
		{
			new FunnyFruitCreativeTabsLoader();
			new FunnyFruitItemLoader();
		}
	}
}
