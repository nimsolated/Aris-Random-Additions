
package net.mcreator.arisrandomadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.arisrandomadditions.entity.GhoulEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class GhoulRenderer extends HumanoidMobRenderer<GhoulEntity, HumanoidModel<GhoulEntity>> {
	public GhoulRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<GhoulEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.25f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(GhoulEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GhoulEntity entity) {
		return new ResourceLocation("aris_random_additions:textures/entities/ghoul.png");
	}
}
