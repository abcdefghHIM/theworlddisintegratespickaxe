package com.taotie.theworlddisintegratespickaxe.common;

import org.lwjgl.opengl.GL11;

import com.taotie.theworlddisintegratespickaxe.RandomBlocks;
import com.taotie.theworlddisintegratespickaxe.TheworlddisintegratespickaxeMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventLoader {

	public EventLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRenderPlayer(RenderWorldLastEvent event) {
		/*
		Tessellator tessellator = Tessellator.getInstance();
		TextureManager manager = Minecraft.getMinecraft().getTextureManager();
		BufferBuilder buffer = tessellator.getBuffer();
		GL11.glPushMatrix();
		GL11.glRotated(((int) System.currentTimeMillis() % 360000) / 100D, 0, 1, 0);
		GL11.glTranslated(0, 0.01, 0);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glDisable(GL11.GL_LIGHTING);

		// GL11.glRotated(player.rotationYaw, 0, 1, 0);
		manager.bindTexture(new ResourceLocation(TheworlddisintegratespickaxeMod.MODID, "textures/items/b.png"));
		buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		buffer.pos(5, 0, 5).tex(0, 0).endVertex();
		buffer.pos(5, 0, -5).tex(0, 1).endVertex();
		buffer.pos(-5, 0, -5).tex(1, 1).endVertex();
		buffer.pos(-5, 0, 5).tex(1, 0).endVertex();
		tessellator.draw();
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glRotated(((int) System.currentTimeMillis() % 360000) / 100D, 0, 1, 0);
		GL11.glTranslated(0, 5, 0);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glDisable(GL11.GL_LIGHTING);

		// GL11.glRotated(player.rotationYaw, 0, 1, 0);
		manager.bindTexture(new ResourceLocation(TheworlddisintegratespickaxeMod.MODID, "textures/items/a.png"));
		buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		buffer.pos(5, 0, 5).tex(0, 0).endVertex();
		buffer.pos(5, 0, -5).tex(0, 1).endVertex();
		buffer.pos(-5, 0, -5).tex(1, 1).endVertex();
		buffer.pos(-5, 0, 5).tex(1, 0).endVertex();
		tessellator.draw();
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
		*/
	}
}
