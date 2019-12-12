package com.taotie.theworlddisintegratespickaxe.item;

import java.util.List;

import com.taotie.theworlddisintegratespickaxe.RandomBlocks;
import com.taotie.theworlddisintegratespickaxe.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class Thespacematerialconversionpickaxe extends ItemPickaxe {
	public static final Item.ToolMaterial Thespacematerialconversionpickaxe = EnumHelper
			.addToolMaterial("thespacematerialconversionpickaxe", 3, 5000, 16.0F, 16.0F, 5000);

	public Thespacematerialconversionpickaxe() {
		super(Thespacematerialconversionpickaxe);
		this.setRegistryName("thespacematerialconversionpickaxe");
		this.setUnlocalizedName("Thespacematerialconversionpickaxe");
		this.setCreativeTab(CreativeTabsLoader.TheworlddisintegratespickaxeTab);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("book.inf"));
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.getHeldItem(hand);

		if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
			if (hook != 0)
				return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();
			this.setBlock(itemstack, player, worldIn, pos, RandomBlocks.getRandomBlocks().getDefaultState());
			return EnumActionResult.PASS;
		}
	}

	public void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			worldIn.setBlockState(pos, state, 11);
			stack.damageItem(1, player);
		}
	}
}
