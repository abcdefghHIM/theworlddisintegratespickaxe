package com.taotie.theworlddisintegratespickaxe;

import com.taotie.theworlddisintegratespickaxe.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = TheworlddisintegratespickaxeMod.MODID, name = TheworlddisintegratespickaxeMod.NAME, version = TheworlddisintegratespickaxeMod.VERSION, acceptedMinecraftVersions = "1.12.2")
public class TheworlddisintegratespickaxeMod {
	public static final String MODID = "theworlddisintegratespickaxe";
	public static final String NAME = "The world disintegrates pickaxe";
	public static final String VERSION = "1.0.0";

	@Instance(TheworlddisintegratespickaxeMod.MODID)
	public static TheworlddisintegratespickaxeMod instance;

	@SidedProxy(clientSide = "com.taotie.theworlddisintegratespickaxe.client.ClientProxy", serverSide = "com.taotie.theworlddisintegratespickaxe.common.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
