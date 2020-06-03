package com.taotie.theworlddisintegratespickaxe.block;

import net.minecraft.block.Block;

public enum IBlocks {
	;
	private Block block;

	private IBlocks(Block block) {
		this.block = block;
	}

	public Block getBlock() {
		return block;
	}
}
