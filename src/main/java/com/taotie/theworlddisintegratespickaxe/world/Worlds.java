package com.taotie.theworlddisintegratespickaxe.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public enum Worlds {
	WorldBroken("worldbroken", "world_broken", 50, WorldBroken.class, false);
	private String RegistryName;
	private String UnlocalizedName;
	private int id;
	private Class<? extends WorldProvider> clazz;
	private boolean Spawn;

	Worlds(String RegistryName, String UnlocalizedName, int id, Class<? extends WorldProvider> clazz, boolean Spawn) {
		this.RegistryName = RegistryName;
		this.UnlocalizedName = UnlocalizedName;
		this.id = id;
		this.clazz = clazz;
		this.Spawn = Spawn;
	}

	public DimensionType getDimensionType() {
		return DimensionType.register(RegistryName, UnlocalizedName, id, clazz, Spawn);
	}

	public String getRegistryName() {
		return RegistryName;
	}

	public String getUnlocalizedName() {
		return UnlocalizedName;
	}

	public int getId() {
		return id;
	}

	public Class<? extends WorldProvider> getClazz() {
		return clazz;
	}

	public boolean getSpawn() {
		return Spawn;
	}
}
