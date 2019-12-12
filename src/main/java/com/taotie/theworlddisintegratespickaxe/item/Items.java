package com.taotie.theworlddisintegratespickaxe.item;

import net.minecraft.item.Item;

public enum Items {
	Theworlddisintegratespickaxe(new Theworlddisintegratespickaxe()),
	Themixthespuriouswiththegenuinepickaxe(new Themixthespuriouswiththegenuinepickaxe()),
	Thespacematerialconversionpickaxe(new Thespacematerialconversionpickaxe()),
	Thetimedisintegratespickaxe(new Thetimedisintegratespickaxe()),
	Therelativespacecollapsepickaxe(new Therelativespacecollapsepickaxe());
	private Item item;

	private Items(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return item;
	}
}
