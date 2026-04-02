
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.arisrandomadditions.client.renderer.WarTankRenderer;
import net.mcreator.arisrandomadditions.client.renderer.WarTankBulletRenderer;
import net.mcreator.arisrandomadditions.client.renderer.TuxRenderer;
import net.mcreator.arisrandomadditions.client.renderer.GhoulRenderer;
import net.mcreator.arisrandomadditions.client.renderer.AriRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArisRandomAdditionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.GHOUL.get(), GhoulRenderer::new);
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.TUX.get(), TuxRenderer::new);
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.POCKET_LIGHTNING_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.TURD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.ARI.get(), AriRenderer::new);
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.WAR_TANK.get(), WarTankRenderer::new);
		event.registerEntityRenderer(ArisRandomAdditionsModEntities.WAR_TANK_BULLET.get(), WarTankBulletRenderer::new);
	}
}
