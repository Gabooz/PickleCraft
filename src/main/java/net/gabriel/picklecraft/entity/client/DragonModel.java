// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package net.gabriel.picklecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DragonModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "reddragon"), "main");
	private final ModelPart rightwing;
	private final ModelPart leftwing;
	private final ModelPart head;
	private final ModelPart neck;
	private final ModelPart tail;
	private final ModelPart body;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;

	public DragonModel(ModelPart root) {
		this.rightwing = root.getChild("rightwing");
		this.leftwing = root.getChild("leftwing");
		this.head = root.getChild("head");
		this.neck = root.getChild("neck");
		this.tail = root.getChild("tail");
		this.body = root.getChild("body");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightwing = partdefinition.addOrReplaceChild("rightwing", CubeListBuilder.create().texOffs(114, 116).addBox(-1.0F, -6.0F, 18.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 101).addBox(8.0F, -6.0F, 18.0F, 3.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(92, 64).addBox(-1.0F, -6.0F, 12.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(11.0F, -6.0F, 13.0F, 35.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(46, 60).addBox(-1.0F, -5.0F, 1.0F, 12.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(11.0F, -5.0F, 2.0F, 25.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, -6.0F));

		PartDefinition leftwing = partdefinition.addOrReplaceChild("leftwing", CubeListBuilder.create().texOffs(118, 36).addBox(-8.0F, -6.0F, 18.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(104, 0).addBox(-11.0F, -6.0F, 18.0F, 3.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(104, 29).addBox(-11.0F, -6.0F, 12.0F, 12.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-46.0F, -6.0F, 13.0F, 35.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(72, 36).addBox(-11.0F, -5.0F, 1.0F, 12.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-36.0F, -5.0F, 2.0F, 25.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 22.0F, -6.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(88, 106).addBox(-8.0F, -4.0F, 33.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(114, 106).addBox(-7.0F, -2.0F, 40.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 116).addBox(-7.0F, 0.0F, 40.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, -6.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 106).addBox(-1.0F, -2.0F, -11.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -1.0F, 35.0F, -0.2208F, 0.5162F, -0.1269F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 106).addBox(-1.0F, -2.0F, -11.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.0F, 35.0F, -0.1309F, -0.48F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 48).addBox(-1.0F, -2.0F, -13.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -3.0F, 34.0F, -0.4038F, 0.2172F, -0.0821F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 90).addBox(-1.0F, -2.0F, -13.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.0F, 34.0F, -0.4046F, -0.2254F, 0.1051F));

		PartDefinition neck = partdefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(84, 89).addBox(-7.0F, -3.0F, 21.0F, 4.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, -6.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(104, 15).addBox(-6.0F, -5.0F, -10.0F, 6.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 84).addBox(-5.0F, -4.0F, -23.0F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-4.0F, -3.0F, -44.0F, 2.0F, 3.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(116, 89).addBox(-2.0F, -3.0F, -44.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(72, 48).addBox(-2.0F, -3.0F, -37.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(116, 97).addBox(-9.0F, -3.0F, -44.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(118, 71).addBox(-7.0F, -3.0F, -37.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 24.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(46, 72).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(84, 72).addBox(-4.0F, -7.0F, 6.0F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(40, 120).addBox(-1.0F, -5.0F, -23.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(66, 99).addBox(-1.0F, -2.0F, -27.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 84).addBox(-1.0F, -2.0F, -29.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 23.0F, 18.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(54, 120).addBox(-1.0F, -5.0F, -23.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(118, 41).addBox(-1.0F, -2.0F, -27.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(78, 120).addBox(-1.0F, -2.0F, -29.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 23.0F, 18.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(88, 119).addBox(4.0F, -7.0F, 7.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(66, 90).addBox(4.0F, -3.0F, 11.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(104, 119).addBox(4.0F, -3.0F, 17.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(24, 120).addBox(4.0F, -7.0F, 7.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(118, 79).addBox(5.0F, -3.0F, 11.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(68, 120).addBox(5.0F, -3.0F, 17.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		// TODO Auto-generated method stub
		return null;
	}
}