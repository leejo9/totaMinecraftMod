package dev.tota.client.models;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.tota.entities.custom.CrabEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class CrabEntityModel extends EntityModel<CrabEntity> {
	private float walkTime;
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "crab_entity"), "main");
	private final ModelPart mainbody;
	private final ModelPart leftlegs;
	private final ModelPart leftlegs2;
	private final ModelPart eye1;
	private final ModelPart eye2;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public CrabEntityModel(ModelPart root) {
		this.mainbody = root.getChild("mainbody");
		this.leftlegs = root.getChild("leftlegs");
		this.leftlegs2 = root.getChild("leftlegs2");
		this.eye1 = root.getChild("eye1");
		this.eye2 = root.getChild("eye2");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mainbody = partdefinition.addOrReplaceChild("mainbody", CubeListBuilder.create().texOffs(0, 10).addBox(-5.0F, -3.0F, -2.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-4.0F, -3.5F, -2.0F, 8.0F, 0.5F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftlegs = partdefinition.addOrReplaceChild("leftlegs", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg1 = leftlegs.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(28, 23).addBox(-0.3703F, -0.5F, -0.0395F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0119F, -1.24F, -2.2007F, 0.0F, -0.6545F, -0.3491F));

		PartDefinition cube_r1 = leg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 27).addBox(1.0F, -1.5F, 5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -6.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leg2 = leftlegs.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(27, 18).addBox(-0.3703F, -0.5F, -0.0395F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6829F, -1.4516F, 0.0386F, 0.0F, -0.0873F, -0.3491F));

		PartDefinition cube_r2 = leg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 29).addBox(1.0F, -1.5F, 5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -6.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leg3 = leftlegs.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(13, 25).addBox(-0.3703F, -0.5F, 0.9605F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6829F, -1.4516F, 1.0386F, 0.0F, 0.2618F, -0.3491F));

		PartDefinition cube_r3 = leg3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 27).addBox(1.0F, -1.5F, 5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -5.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leg4 = leftlegs.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(15, 29).addBox(-0.3703F, -0.5F, 0.9605F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.045F, -0.8949F, 5.9541F, 2.7102F, 0.5234F, -0.3677F));

		PartDefinition cube_r4 = leg4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 20).addBox(2.0F, -1.5F, 5.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -5.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leftlegs2 = partdefinition.addOrReplaceChild("leftlegs2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 18.0F, 0.0F, 0.0F, 0.0F, -2.4435F));

		PartDefinition leg5 = leftlegs2.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(26, 12).addBox(-0.3703F, -0.5F, -0.0395F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0119F, -1.24F, -2.2007F, 0.0F, -0.6545F, -0.3491F));

		PartDefinition cube_r5 = leg5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 14).addBox(1.0F, -1.5F, 5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -6.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leg6 = leftlegs2.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(26, 10).addBox(-0.3703F, -0.5F, -0.0395F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6829F, -1.4516F, 0.0386F, 0.0F, -0.0873F, -0.3491F));

		PartDefinition cube_r6 = leg6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(29, 4).addBox(1.0F, -1.5F, 5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -6.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leg7 = leftlegs2.addOrReplaceChild("leg7", CubeListBuilder.create().texOffs(0, 5).addBox(-0.3703F, -0.5F, 0.9605F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6829F, -1.4516F, 1.0386F, 0.0F, 0.2618F, -0.3491F));

		PartDefinition cube_r7 = leg7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(21, 25).addBox(1.0F, -1.5F, 5.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -5.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition leg8 = leftlegs2.addOrReplaceChild("leg8", CubeListBuilder.create().texOffs(29, 0).addBox(-0.3703F, -0.6051F, 0.9605F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.045F, -2.8949F, 5.9541F, -2.618F, 0.5234F, -0.3677F));

		PartDefinition cube_r8 = leg8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(2.0F, -1.6051F, 5.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6297F, 1.0F, -5.0395F, 0.0F, -0.8727F, 0.0F));

		PartDefinition eye1 = partdefinition.addOrReplaceChild("eye1", CubeListBuilder.create().texOffs(8, 30).addBox(-1.9F, -4.3F, -2.9F, 0.8F, 2.0F, 0.8F, new CubeDeformation(0.0F))
		.texOffs(4, 30).addBox(-2.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 23.0F, 1.0F, 0.1745F, 0.0F, 0.1745F));

		PartDefinition eye2 = partdefinition.addOrReplaceChild("eye2", CubeListBuilder.create().texOffs(0, 30).addBox(-0.4F, -0.9056F, -0.4F, 0.8F, 2.0F, 0.8F, new CubeDeformation(0.0F))
		.texOffs(29, 25).addBox(-0.5312F, -1.6056F, -0.4608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0688F, 19.9056F, -2.1392F, 0.1745F, 0.0F, -0.1745F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(3.0F, 25.0F, 2.0F));

		PartDefinition cube_r9 = leftarm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -4.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, -0.3491F, 0.0873F));

		PartDefinition leftpincer = leftarm.addOrReplaceChild("leftpincer", CubeListBuilder.create().texOffs(22, 18).addBox(0.0F, -5.0F, -8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(8, 25).addBox(1.0F, -4.8F, -8.0F, 0.5F, 1.8F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(5, 25).addBox(0.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r10 = leftpincer.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 4).addBox(0.0F, -6.0F, -5.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 25.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightarm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 10).addBox(2.0F, -3.4F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.3491F, -0.0873F));

		PartDefinition leftpincer2 = rightarm.addOrReplaceChild("leftpincer2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6875F, -1.7936F, -2.0715F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-1.1872F, -1.5936F, -2.0715F, 0.5F, 1.8F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-0.6875F, -0.7936F, 0.9285F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0622F, -2.6064F, -7.9285F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r12 = leftpincer2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -0.5713F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1875F, 0.7776F, -0.2856F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(CrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		if(this.walkTime> 0.0F){
			this.leftlegs.zRot = -0.47F;
		}
	}
/*
	public void setupAnim(T p_102348_, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setupAnim(p_102348_, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

		if (this.lieDownAmount > 0.0F) {
			this.head.zRot = ModelUtils.rotlerpRad(this.head.zRot, -1.2707963F, this.lieDownAmount);
			this.head.yRot = ModelUtils.rotlerpRad(this.head.yRot, 1.2707963F, this.lieDownAmount);
			this.leftFrontLeg.xRot = -1.2707963F;
			this.rightFrontLeg.xRot = -0.47079635F;
			this.rightFrontLeg.zRot = -0.2F;
			this.rightFrontLeg.x = -0.2F;
			this.leftHindLeg.xRot = -0.4F;
			this.rightHindLeg.xRot = 0.5F;
			this.rightHindLeg.zRot = -0.5F;
			this.rightHindLeg.x = -0.3F;
			this.rightHindLeg.y = 20.0F;
			this.tail1.xRot = ModelUtils.rotlerpRad(this.tail1.xRot, 0.8F, this.lieDownAmountTail);
			this.tail2.xRot = ModelUtils.rotlerpRad(this.tail2.xRot, -0.4F, this.lieDownAmountTail);
		}

		if (this.relaxStateOneAmount > 0.0F) {
			this.head.xRot = ModelUtils.rotlerpRad(this.head.xRot, -0.58177644F, this.relaxStateOneAmount);
		}

	}
*/
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mainbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftlegs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftlegs2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}