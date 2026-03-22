
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.nimsrandombullshit.client.renderer.TuxRenderer;
import net.mcreator.nimsrandombullshit.client.renderer.GhoulRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NimsRandomBullshitModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NimsRandomBullshitModEntities.SHIT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NimsRandomBullshitModEntities.GHOUL.get(), GhoulRenderer::new);
		event.registerEntityRenderer(NimsRandomBullshitModEntities.TUX.get(), TuxRenderer::new);
		event.registerEntityRenderer(NimsRandomBullshitModEntities.POCKET_LIGHTNING_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
