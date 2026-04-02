package net.mcreator.arisrandomadditions.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelWarTank<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("aris_random_additions", "model_war_tank"), "main");
	public final ModelPart root;
	public final ModelPart body;
	public final ModelPart body_details;
	public final ModelPart body_core;
	public final ModelPart body_wheels;
	public final ModelPart head;
	public final ModelPart head_core;
	public final ModelPart head_details;

	public ModelWarTank(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.body_details = this.body.getChild("body_details");
		this.body_core = this.body.getChild("body_core");
		this.body_wheels = this.body.getChild("body_wheels");
		this.head = this.body.getChild("head");
		this.head_core = this.head.getChild("head_core");
		this.head_details = this.head.getChild("head_details");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_details = body.addOrReplaceChild("body_details",
				CubeListBuilder.create().texOffs(70, 26).addBox(-6.3333F, 0.0F, -2.4167F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(72, 20).addBox(-6.3333F, 3.0F, -8.4167F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 22)
						.addBox(1.6667F, -2.0F, -2.4167F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 84).addBox(-0.3333F, -2.0F, -2.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 84)
						.addBox(-2.3333F, -2.0F, -2.4167F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 26).addBox(4.6667F, 0.0F, -2.4167F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.3333F, -8.0F, -5.5833F));
		PartDefinition body_core = body.addOrReplaceChild("body_core",
				CubeListBuilder.create().texOffs(0, 51).addBox(-6.0F, 5.5F, -23.0F, 12.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-6.0F, 3.5F, -24.0F, 12.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 1.5F, -24.0F, 12.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(64, 51).addBox(-5.0F, -0.5F, -20.0F, 10.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(54, 80)
						.addBox(0.0F, -0.5F, -23.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(70, 45).addBox(-6.0F, -1.5F, -1.0F, 12.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.5F, 11.0F));
		PartDefinition body_wheels = body.addOrReplaceChild("body_wheels",
				CubeListBuilder.create().texOffs(72, 0).addBox(-8.0F, -1.5F, -3.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(36, 86).addBox(-8.0F, -2.5F, -7.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(6.0F, -1.5F, -3.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(36, 86).addBox(6.0F, -2.5F, -7.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1F, -2.5F, -5.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));
		PartDefinition head_core = head.addOrReplaceChild("head_core",
				CubeListBuilder.create().texOffs(0, 73).addBox(-4.0F, -2.5F, -1.1667F, 8.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 89).addBox(-4.0F, -3.5F, -0.1667F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 80)
						.addBox(-4.0F, -1.5F, 8.8333F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 86).addBox(-3.0F, -1.5F, -2.1667F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 22)
						.addBox(-2.0F, -0.5F, -4.1667F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 72).addBox(-1.0F, -0.5F, -20.1667F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.5F, -3.8333F));
		PartDefinition head_details = head.addOrReplaceChild("head_details",
				CubeListBuilder.create().texOffs(60, 73).addBox(-5.0F, -2.0556F, 2.4444F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73).addBox(-5.0F, -2.0556F, 0.4444F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73)
						.addBox(-5.0F, -2.0556F, -1.5556F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73).addBox(-5.0F, -2.0556F, -3.5556F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73)
						.addBox(4.0F, -2.0556F, 2.4444F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73).addBox(4.0F, -2.0556F, 0.4444F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73)
						.addBox(4.0F, -2.0556F, -1.5556F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 73).addBox(4.0F, -2.0556F, -3.5556F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 73)
						.addBox(-3.0F, -4.0556F, -2.5556F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.9444F, -0.4444F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
