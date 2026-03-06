package net.mcreator.nimsrandombullshit.client.model;

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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpeguin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("nims_random_bullshit", "modelpeguin"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart BodySegment;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelpeguin(ModelPart root) {
		this.root = root.getChild("root");
		this.Head = this.root.getChild("Head");
		this.BodySegment = this.root.getChild("BodySegment");
		this.LeftLeg = this.BodySegment.getChild("LeftLeg");
		this.RightLeg = this.BodySegment.getChild("RightLeg");
		this.Body = this.BodySegment.getChild("Body");
		this.RightArm = this.BodySegment.getChild("RightArm");
		this.LeftArm = this.BodySegment.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3125F, 24.0F, -0.0938F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Head = root.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(42, 46).addBox(0.5625F, -2.7188F, 1.0625F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-7.0F, -8.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.875F, -16.0625F, -2.8438F));
		PartDefinition BodySegment = root.addOrReplaceChild("BodySegment", CubeListBuilder.create(), PartPose.offset(-1.5625F, 0.0F, -2.0F));
		PartDefinition LeftLeg = BodySegment.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(30, 46).addBox(-1.8125F, -2.0F, -1.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(9.6875F, 0.0F, 5.2188F));
		PartDefinition RightLeg = BodySegment.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(18, 46).addBox(-1.8125F, -2.0F, -1.3438F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(9.6875F, 0.0F, -2.5625F));
		PartDefinition Body = BodySegment.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -16.0F, 0.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(8.5938F, 0.0F, -4.7813F));
		PartDefinition RightArm = BodySegment.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 30).addBox(-4.25F, 0.0F, -0.0625F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6875F, -16.0313F, -5.6875F));
		PartDefinition LeftArm = BodySegment.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 46).addBox(-4.0F, -0.0313F, -1.0F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4375F, -16.0F, 10.125F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
