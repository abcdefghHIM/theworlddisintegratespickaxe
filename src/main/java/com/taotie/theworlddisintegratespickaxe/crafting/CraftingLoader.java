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
		if (Loader.isModLoaded("ic2")) {
			IC2registerRecipe();
			IC2registerSmelting();
			IC2registerFuel();
		} else {
			NoIC2registerRecipe();
			NoIC2registerSmelting();
			NoIC2registerFuel();
		}
	}

	private static void registerRecipe() {
		ResourceLocation optionalGroup = new ResourceLocation("");
		GameRegistry.addShapedRecipe(new ResourceLocation("theworlddisintegratespickaxe:thespacematerialconversionpickaxe"),
				optionalGroup, new ItemStack(Items.Thespacematerialconversionpickaxe.getItem()),
				new Object[] { "AAA", " B "," B ", Character.valueOf('A'), Items.CompressedMixture.getItem(),
						Character.valueOf('B'), net.minecraft.init.Items.STICK });
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

	private static void NoIC2registerRecipe() {
		ResourceLocation optionalGroup = new ResourceLocation("");
		GameRegistry.addShapedRecipe(new ResourceLocation("theworlddisintegratespickaxe:compressedmixture"),
				optionalGroup, new ItemStack(Items.CompressedMixture.getItem()),
				new Object[] { "A ", "BC", Character.valueOf('A'), net.minecraft.init.Items.IRON_INGOT,
						Character.valueOf('B'), net.minecraft.init.Items.DIAMOND, Character.valueOf('C'),
						net.minecraft.init.Items.EMERALD });
	}

	private static void NoIC2registerSmelting() {

	}

	private static void NoIC2registerFuel() {

	}
}
