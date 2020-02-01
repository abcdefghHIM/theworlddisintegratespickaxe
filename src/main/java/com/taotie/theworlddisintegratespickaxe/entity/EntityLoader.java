package com.taotie.theworlddisintegratespickaxe.entity;

import com.taotie.theworlddisintegratespickaxe.TheworlddisintegratespickaxeMod;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityLoader {
	public EntityLoader() {
		for (Entitys entity : Entitys.values()) {
			EntityRegistry.registerModEntity(entity.getRegistryName(), entity.getEntityClass(), entity.getEntityName(),
					entity.getId(), entity.getMod(), entity.getTrackingRange(), entity.getUpdateFrequency(),
					entity.getSendsVelocityUpdates());
		}
		for (EntityEggs eggs : EntityEggs.values()) {
			EntityRegistry.registerEgg(eggs.getName(), eggs.getPrimary(), eggs.getSecondary());
		}
	}
	
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        // TODO
    }
}
