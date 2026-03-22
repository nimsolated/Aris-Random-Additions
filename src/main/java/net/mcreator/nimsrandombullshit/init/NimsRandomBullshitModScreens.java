
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.Minecraft;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModMenus.GuiSyncMessage;
import net.mcreator.nimsrandombullshit.client.gui.ShitGUIScreen;
import net.mcreator.nimsrandombullshit.client.gui.OreMinerGUIScreen;
import net.mcreator.nimsrandombullshit.client.gui.BedrockifierGUIScreen;

import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NimsRandomBullshitModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NimsRandomBullshitModMenus.SHIT_GUI.get(), ShitGUIScreen::new);
			MenuScreens.register(NimsRandomBullshitModMenus.ORE_MINER_GUI.get(), OreMinerGUIScreen::new);
			MenuScreens.register(NimsRandomBullshitModMenus.BEDROCKIFIER_GUI.get(), BedrockifierGUIScreen::new);
		});
	}

	static void handleTextBoxMessage(GuiSyncMessage message) {
		String editbox = message.editbox();
		String value = message.value();
		Screen currentScreen = Minecraft.getInstance().screen;
		if (currentScreen instanceof WidgetScreen sc) {
			HashMap<String, Object> widgets = sc.getWidgets();
			Object obj = widgets.get("text:" + editbox);
			if (obj instanceof EditBox box) {
				box.setValue(value);
			}
		}
	}

	public interface WidgetScreen {
		HashMap<String, Object> getWidgets();
	}
}
