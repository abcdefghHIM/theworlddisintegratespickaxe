package com.taotie.theworlddisintegratespickaxe.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.ChunkGeneratorEnd;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldBroken extends WorldProvider {

	@Override
	public DimensionType getDimensionType() {
		return DimensionType.OVERWORLD;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isSkyColored() {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getCloudHeight() {
		return 8.0F;
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorEnd(this.world, this.world.getWorldInfo().isMapFeaturesEnabled(), this.world.getSeed(),
				this.getSpawnCoordinate());
	}
}
