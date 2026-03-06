
package net.mcreator.nimsrandombullshit.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.nimsrandombullshit.procedures.TuxPlaybackConditionWalkingProcedure;
import net.mcreator.nimsrandombullshit.entity.TuxEntity;
import net.mcreator.nimsrandombullshit.client.model.animations.tuxModelAnimation;
import net.mcreator.nimsrandombullshit.client.model.Modelpeguin;

import com.mojang.blaze3d.vertex.PoseStack;

public class TuxRenderer extends MobRenderer<TuxEntity, Modelpeguin<TuxEntity>> {
	public TuxRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelpeguin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(TuxEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.25f, 1.25f, 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(TuxEntity entity) {
		return new ResourceLocation("nims_random_bullshit:textures/entities/tux.png");
	}

	private static final class AnimatedModel extends Modelpeguin<TuxEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<TuxEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(TuxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (TuxPlaybackConditionWalkingProcedure.execute(entity))
					this.animateWalk(tuxModelAnimation.walking, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, tuxModelAnimation.jumpUp, ageInTicks, 1f);
				this.animate(entity.animationState2, tuxModelAnimation.JumpDown, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(TuxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
