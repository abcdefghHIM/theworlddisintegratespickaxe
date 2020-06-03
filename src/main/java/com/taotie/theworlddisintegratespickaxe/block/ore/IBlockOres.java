package com.taotie.theworlddisintegratespickaxe.block.ore;

import net.minecraft.block.BlockOre;

public enum IBlockOres {
	;
	private BlockOre block;

	private IBlockOres(BlockOre block) {
		this.block = block;
	}

	public BlockOre getBlockOre() {
		return block;
	}
}
