package com.taotie.theworlddisintegratespickaxe.world;

import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class WorldLoader {
	public WorldLoader(FMLPreInitializationEvent event) {
		for (Worlds worlds : Worlds.values()) {
			DimensionManager.registerDimension(worlds.getId(), worlds.getDimensionType());
		}
	}
}
