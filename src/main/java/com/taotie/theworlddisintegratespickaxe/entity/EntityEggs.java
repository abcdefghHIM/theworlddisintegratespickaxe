package com.taotie.theworlddisintegratespickaxe.entity;

import net.minecraft.util.ResourceLocation;

public enum EntityEggs {
	EntityTaoTie(new ResourceLocation("TaoTie"), 0xffff66, 0x660000);
	private ResourceLocation name;
	private int primary;
	private int secondary;

	private EntityEggs(ResourceLocation name, int primary, int secondary) {
		this.name = name;
		this.primary = primary;
		this.secondary = secondary;
	}

	public ResourceLocation getName() {
		return name;
	}

	public int getPrimary() {
		return primary;
	}

	public int getSecondary() {
		return secondary;
	}
}
