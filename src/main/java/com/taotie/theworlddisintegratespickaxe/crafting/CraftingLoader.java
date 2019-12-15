package com.taotie.theworlddisintegratespickaxe.crafting;

import com.taotie.theworlddisintegratespickaxe.item.Items;

import ic2.api.item.IC2Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.Optional;

public class CraftingLoader {
	public CraftingLoader() {
		registerRecipe();
		registerSmelting();
		registerFuel();
		IC2registerRecipe();
		IC2registerSmelting();
		IC2registerFuel();
	}

	private static void registerRecipe() {
	}

	private static void registerSmelting() {

	}

	private static void registerFuel() {

	}

	@Optional.Method(modid = "ic2")
	private static void IC2registerRecipe() {
		ResourceLocation optionalGroup = new ResourceLocation("");
		GameRegistry.addShapedRecipe(new ResourceLocation("theworlddisintegratespickaxe:compressedmixture"),
				optionalGroup, new ItemStack(Items.CompressedMixture.getItem()),
				new Object[] { "A ", "BC", Character.valueOf('A'), IC2Items.getItem("forge_hammer"),
						Character.valueOf('B'), net.minecraft.init.Items.DIAMOND, Character.valueOf('C'),
						net.minecraft.init.Items.EMERALD });
	}

	@Optional.Method(modid = "ic2")
	private static void IC2registerSmelting() {

	}

	@Optional.Method(modid = "ic2")
	private static void IC2registerFuel() {

	}
}
