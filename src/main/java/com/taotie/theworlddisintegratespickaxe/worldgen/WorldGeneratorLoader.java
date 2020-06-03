package com.taotie.theworlddisintegratespickaxe.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WorldGeneratorLoader {
	private static WorldGenerator generatorGlowstone = new WorldGeneratorOre();
	private BlockPos pos;
	
	public WorldGeneratorLoader() {
		MinecraftForge.ORE_GEN_BUS.register(this);
	}
	
	@SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event)
    {
        if (!event.getPos().equals(this.pos))
        {
            this.pos = event.getPos();
            generatorGlowstone.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }
}
