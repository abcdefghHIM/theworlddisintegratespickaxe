package com.taotie.theworlddisintegratespickaxe.item;

import com.taotie.theworlddisintegratespickaxe.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public enum Items {
	Theworlddisintegratespickaxe(new Theworlddisintegratespickaxe()),
	Themixthespuriouswiththegenuinepickaxe(new Themixthespuriouswiththegenuinepickaxe()),
	Thespacematerialconversionpickaxe(new Thespacematerialconversionpickaxe()),
	Thetimedisintegratespickaxe(new Thetimedisintegratespickaxe()),
	Therelativespacecollapsepickaxe(new Therelativespacecollapsepickaxe()),
	CompressedMixture(new IItem("compressedmixture","CompressedMixture",CreativeTabsLoader.TheworlddisintegratespickaxeTab)),
	CompressedGem(new IItem("compressedgem","CompressedGem",CreativeTabsLoader.TheworlddisintegratespickaxeTab)),
	CriticalGem(new IItem("criticalgem","CriticalGem", CreativeTabsLoader.TheworlddisintegratespickaxeTab)),
	FallenGem(new IItem("fallengem","FallenGem", CreativeTabsLoader.TheworlddisintegratespickaxeTab)),
	GuGuGu(new GuGuGu());
	
	private Item item;

	private Items(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return item;
	}
}
