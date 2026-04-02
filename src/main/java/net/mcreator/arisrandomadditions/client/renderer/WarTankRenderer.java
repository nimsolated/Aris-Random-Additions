
package net.mcreator.arisrandomadditions.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arisrandomadditions.entity.WarTankEntity;
import net.mcreator.arisrandomadditions.client.model.ModelWarTank;

import com.mojang.blaze3d.vertex.PoseStack;

public class WarTankRenderer extends MobRenderer<WarTankEntity, ModelWarTank<WarTankEntity>> {
	public WarTankRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWarTank<WarTankEntity>(context.bakeLayer(ModelWarTank.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(WarTankEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarTankEntity entity) {
		return new ResourceLocation("aris_random_additions:textures/entities/wartank_texture.png");
	}
}
