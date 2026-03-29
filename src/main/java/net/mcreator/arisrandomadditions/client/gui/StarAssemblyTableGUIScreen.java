package net.mcreator.arisrandomadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.arisrandomadditions.world.inventory.StarAssemblyTableGUIMenu;
import net.mcreator.arisrandomadditions.network.StarAssemblyTableGUIButtonMessage;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StarAssemblyTableGUIScreen extends AbstractContainerScreen<StarAssemblyTableGUIMenu> {
	private final static HashMap<String, Object> guistate = StarAssemblyTableGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_assemble;

	public StarAssemblyTableGUIScreen(StarAssemblyTableGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 220;
	}

	private static final ResourceLocation texture = new ResourceLocation("aris_random_additions:textures/screens/star_assembly_table_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.aris_random_additions.star_assembly_table_gui.label_star_assembly_table"), 9, 7, -13434829, false);
	}

	@Override
	public void init() {
		super.init();
		button_assemble = Button.builder(Component.translatable("gui.aris_random_additions.star_assembly_table_gui.button_assemble"), e -> {
			if (true) {
				ArisRandomAdditionsMod.PACKET_HANDLER.sendToServer(new StarAssemblyTableGUIButtonMessage(0, x, y, z));
				StarAssemblyTableGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 117, this.topPos + 79, 67, 20).build();
		guistate.put("button:button_assemble", button_assemble);
		this.addRenderableWidget(button_assemble);
	}
}
