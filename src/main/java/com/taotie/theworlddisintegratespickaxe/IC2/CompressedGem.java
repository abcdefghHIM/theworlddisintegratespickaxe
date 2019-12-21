package com.taotie.theworlddisintegratespickaxe.IC2;

import ic2.api.recipe.ICannerBottleRecipeManager;
import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.MachineRecipe;
import ic2.api.recipe.MachineRecipeResult;
import ic2.api.recipe.RecipeOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Optional;

@Optional.Interface(modid = "ic2", iface = "ic2.api.recipe.ICannerBottleRecipeManager")
public class CompressedGem implements ICannerBottleRecipeManager{

	@Override
	public boolean addRecipe(Input input, ItemStack output, NBTTagCompound metadata, boolean replace) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public MachineRecipeResult<Input, ItemStack, RawInput> apply(RawInput input, boolean acceptTest) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Iterable<? extends MachineRecipe<Input, ItemStack>> getRecipes() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean isIterable() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean addRecipe(IRecipeInput container, IRecipeInput fill, ItemStack output, boolean replace) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void addRecipe(IRecipeInput container, IRecipeInput fill, ItemStack output) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public RecipeOutput getOutputFor(ItemStack container, ItemStack fill, boolean adjustInput, boolean acceptTest) {
		// TODO 自动生成的方法存根
		return null;
	}

}
