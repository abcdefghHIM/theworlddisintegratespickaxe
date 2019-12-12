package com.taotie.theworlddisintegratespickaxe.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemLoader {
	public static enum item {
		Theworlddisintegratespickaxe(new Theworlddisintegratespickaxe()),
		Themixthespuriouswiththegenuinepickaxe(new Themixthespuriouswiththegenuinepickaxe()),
		Thespacematerialconversionpickaxe(new Thespacematerialconversionpickaxe()),
		Thetimedisintegratespickaxe(new Thetimedisintegratespickaxe()),
		Therelativespacecollapsepickaxe(new Therelativespacecollapsepickaxe());
		private Item item;

		private item(Item item) {
			this.item = item;
		}

		public Item getItem() {
			return item;
		}
	}

	public ItemLoader(FMLPreInitializationEvent event) {
		for (item item : item.values()) {
			register(item.getItem());
		}
	}

	public static void registerRenders() {
		for (item item : item.values()) {
			registerRender(item.getItem());
		}
	}

	private static void register(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}

	private static void registerRender(Item item) {
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, model);
	}
}
