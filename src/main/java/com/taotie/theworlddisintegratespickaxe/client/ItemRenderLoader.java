package com.taotie.theworlddisintegratespickaxe.client;

import com.taotie.theworlddisintegratespickaxe.block.BlockLoader;
import com.taotie.theworlddisintegratespickaxe.block.ore.BlockOreLoader;
import com.taotie.theworlddisintegratespickaxe.item.ItemLoader;

public class ItemRenderLoader {
	public ItemRenderLoader() {
		ItemLoader.registerRenders();
		BlockLoader.registerRenders();
		BlockOreLoader.registerRenders();
	}
}
