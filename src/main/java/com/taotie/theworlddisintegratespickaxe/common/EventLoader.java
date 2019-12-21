package com.taotie.theworlddisintegratespickaxe.common;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class EventLoader {
	public EventLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onRenderPlayer(RenderPlayerEvent event) {
		Tessellator tessellator = Tessellator.getInstance();
		TextureManager renderEngine = Minecraft.getMinecraft().renderEngine;
		BufferBuilder bufferBuilder = tessellator.getBuffer();
		GL11.glPushMatrix();
		renderEngine.bindTexture(new ResourceLocation("theworlddisintegratespickaxe:textures/items/a.png"));
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glDisable(GL11.GL_CULL_FACE);
		GL11.glTranslated(event.getX(), event.getY(), event.getZ());
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
		bufferBuilder.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
		bufferBuilder.pos(5, 0, 5).tex(0, 0).endVertex();
		bufferBuilder.pos(5, 0, -5).tex(0, 1).endVertex();
		bufferBuilder.pos(-5, 0, -5).tex(1, 1).endVertex();
		bufferBuilder.pos(-5, 0, 5).tex(1, 0).endVertex();
		tessellator.draw();
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
		System.out.println(event.getX() + "," + event.getY() + "," + event.getZ());
	}
}
