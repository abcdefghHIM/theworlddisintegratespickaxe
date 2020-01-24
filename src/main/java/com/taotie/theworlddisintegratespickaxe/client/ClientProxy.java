package com.taotie.theworlddisintegratespickaxe.client;

import com.taotie.theworlddisintegratespickaxe.common.CommonProxy;

import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		new ItemRenderLoader();
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}