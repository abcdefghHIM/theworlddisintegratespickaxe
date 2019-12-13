package com.taotie.theworlddisintegratespickaxe.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IItem extends Item {
    public IItem(String RegistryName, String UnlocalizedName, CreativeTabs CreativeTab)
    {
        super();
        this.setRegistryName(RegistryName);
        this.setUnlocalizedName(UnlocalizedName);
        this.setCreativeTab(CreativeTab);
    }
}
