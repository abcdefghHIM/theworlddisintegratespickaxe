package com.taotie.theworlddisintegratespickaxe.entity;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTaoTie extends EntityZombie{

	public EntityTaoTie(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public boolean isChild()
    {
        return false;
    }
	
	@Override
	protected boolean shouldBurnInDay()
    {
        return false;
    }
}
