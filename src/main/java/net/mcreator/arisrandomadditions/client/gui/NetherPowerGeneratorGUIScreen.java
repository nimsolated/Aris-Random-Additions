package net.mcreator.arisrandomadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arisrandomadditions.world.inventory.NetherPowerGeneratorGUIMenu;
import net.mcreator.arisrandomadditions.procedures.NetherPowerGeneratorFluidTankTextUpdateProcedure;
import net.mcreator.arisrandomadditions.network.NetherPowerGeneratorGUIButtonMessage;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NetherPowerGeneratorGUIScreen extends AbstractContainerScreen<NetherPowerGeneratorGUIMenu> {
	private final static HashMap<String, Object> guistate = NetherPowerGeneratorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_refill;
	Button button_drain;

	public NetherPowerGeneratorGUIScreen(NetherPowerGeneratorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 213;
	}

	private static final ResourceLocation texture = new ResourceLocation("aris_random_additions:textures/screens/nether_power_generator_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.aris_random_additions.nether_power_generator_gui.label_nether_power_generator"), 6, 8, -16777216, false);
		guiGraphics.drawString(this.font,

				NetherPowerGeneratorFluidTankTextUpdateProcedure.execute(world, x, y, z), 6, 80, -13434880, false);
	}

	@Override
	public void init() {
		super.init();
		button_refill = Button.builder(Component.translatable("gui.aris_random_additions.nether_power_generator_gui.button_refill"), e -> {
			if (true) {
				ArisRandomAdditionsMod.PACKET_HANDLER.sendToServer(new NetherPowerGeneratorGUIButtonMessage(0, x, y, z));
				NetherPowerGeneratorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 92, this.topPos + 53, 56, 20).build();
		guistate.put("button:button_refill", button_refill);
		this.addRenderableWidget(button_refill);
		button_drain = Button.builder(Component.translatable("gui.aris_random_additions.nether_power_generator_gui.button_drain"), e -> {
			if (true) {
				ArisRandomAdditionsMod.PACKET_HANDLER.sendToServer(new NetherPowerGeneratorGUIButtonMessage(1, x, y, z));
				NetherPowerGeneratorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 29, this.topPos + 53, 51, 20).build();
		guistate.put("button:button_drain", button_drain);
		this.addRenderableWidget(button_drain);
	}
}
