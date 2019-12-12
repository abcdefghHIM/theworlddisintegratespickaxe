package com.taotie.theworlddisintegratespickaxe.item;

import java.util.List;
import java.util.Set;

import com.taotie.theworlddisintegratespickaxe.creativetab.CreativeTabsLoader;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class Theworlddisintegratespickaxe extends ItemPickaxe {
	public static final Item.ToolMaterial Theworlddisintegratespickaxe = EnumHelper.addToolMaterial("theworlddisintegratespickaxe", 3, 5000, 16.0F, 16.0F, 5000);
	public Theworlddisintegratespickaxe() {
		super(Theworlddisintegratespickaxe);
		this.setRegistryName("theworlddisintegratespickaxe");
		this.setUnlocalizedName("Theworlddisintegratespickaxe");
		this.setCreativeTab(CreativeTabsLoader.TheworlddisintegratespickaxeTab);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format("book.inf"));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		System.exit(0);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
}
