package com.taotie.theworlddisintegratespickaxe.block.ore;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOreLoader {
	public BlockOreLoader(FMLPreInitializationEvent event) {
		for (IBlockOres blockOres : IBlockOres.values()) {
			register(blockOres.getBlockOre());
		}
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		for (IBlockOres blockOres : IBlockOres.values()) {
			registerRender(blockOres.getBlockOre());
		}
	}

	private static void register(Block block) {
		ForgeRegistries.ITEMS.register((new ItemBlock(block)).setRegistryName(block.getRegistryName()));
		ForgeRegistries.BLOCKS.register(block);
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
	}
}
