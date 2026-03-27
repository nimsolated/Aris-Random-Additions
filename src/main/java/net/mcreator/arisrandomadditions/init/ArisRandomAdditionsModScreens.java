
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.arisrandomadditions.client.gui.TurdGUIScreen;
import net.mcreator.arisrandomadditions.client.gui.OreMinerGUIScreen;
import net.mcreator.arisrandomadditions.client.gui.BedrockifierGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ArisRandomAdditionsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ArisRandomAdditionsModMenus.ORE_MINER_GUI.get(), OreMinerGUIScreen::new);
			MenuScreens.register(ArisRandomAdditionsModMenus.BEDROCKIFIER_GUI.get(), BedrockifierGUIScreen::new);
			MenuScreens.register(ArisRandomAdditionsModMenus.TURD_GUI.get(), TurdGUIScreen::new);
		});
	}
}
