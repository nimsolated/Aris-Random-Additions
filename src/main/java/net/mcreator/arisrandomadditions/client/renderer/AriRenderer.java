
package net.mcreator.arisrandomadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.arisrandomadditions.entity.AriEntity;

public class AriRenderer extends HumanoidMobRenderer<AriEntity, HumanoidModel<AriEntity>> {
	public AriRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<AriEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(AriEntity entity) {
		return new ResourceLocation("aris_random_additions:textures/entities/ari.png");
	}
}
