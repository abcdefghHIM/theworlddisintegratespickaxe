package com.taotie.theworlddisintegratespickaxe.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.taotie.theworlddisintegratespickaxe.TheworlddisintegratespickaxeMod;

public enum Entitys {
	EntityTaoTie(new ResourceLocation("TaoTie"), EntityTaoTie.class, "TaoTie", 0, TheworlddisintegratespickaxeMod.instance, 80, 3, true);
	private ResourceLocation registryName;
	private Class<? extends Entity> entityClass;
	private String entityName;
	private int id = 0;
	private Object mod;
	private int trackingRange;
	private int updateFrequency;
	private boolean sendsVelocityUpdates;

	private Entitys(ResourceLocation registryName, Class<? extends Entity> entityClass, String entityName, int id,
			Object mod, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		this.registryName = registryName;
		this.entityClass = entityClass;
		this.entityName = entityName;
		this.id = id;
		this.mod = mod;
		this.trackingRange = trackingRange;
		this.updateFrequency = updateFrequency;
		this.sendsVelocityUpdates = sendsVelocityUpdates;
	}

	public ResourceLocation getRegistryName() {
		return registryName;
	}

	public Class<? extends Entity> getEntityClass() {
		return entityClass;
	}

	public String getEntityName() {
		return entityName;
	}

	public int getId() {
		return id;
	}

	public Object getMod() {
		return mod;
	}

	public int getTrackingRange() {
		return trackingRange;
	}

	public int getUpdateFrequency() {
		return updateFrequency;
	}

	public boolean getSendsVelocityUpdates() {
		return sendsVelocityUpdates;
	}
}
