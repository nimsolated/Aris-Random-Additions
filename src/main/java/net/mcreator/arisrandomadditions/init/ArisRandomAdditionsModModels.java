
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.arisrandomadditions.client.model.Modelpeguin;
import net.mcreator.arisrandomadditions.client.model.ModelWarTankBullet;
import net.mcreator.arisrandomadditions.client.model.ModelWarTank;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ArisRandomAdditionsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelWarTank.LAYER_LOCATION, ModelWarTank::createBodyLayer);
		event.registerLayerDefinition(ModelWarTankBullet.LAYER_LOCATION, ModelWarTankBullet::createBodyLayer);
		event.registerLayerDefinition(Modelpeguin.LAYER_LOCATION, Modelpeguin::createBodyLayer);
	}
}
