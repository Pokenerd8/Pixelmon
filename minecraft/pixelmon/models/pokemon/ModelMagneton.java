// Date: 27/06/2012 5:26:41 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.models.pokemon;

import java.util.Random;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelMagneton extends ModelBase {
	// fields
	ModelRenderer LowerLeftBody;
	ModelRenderer BottomLeftMagnet;
	ModelRenderer LowerLeftMagnet;
	ModelRenderer LowerRightBody;
	ModelRenderer BottomRightMagnet;
	ModelRenderer LowerRightMagnet;
	ModelRenderer TopBody;
	ModelRenderer TopRightMagnet;
	ModelRenderer TopLeftMagnet;

	public ModelMagneton() {
		textureWidth = 64;
		textureHeight = 32;

		LowerLeftBody = new ModelRenderer(this, "LowerLeftBody");
		LowerLeftBody.setRotationPoint(3.8F, 6.8F, 2.5F);
		setRotation(LowerLeftBody, 0F, 0F, 0F);
		LowerLeftBody.mirror = true;
		ModelRenderer Screw5 = new ModelRenderer(this, 50, 28);
		Screw5.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		Screw5.setRotationPoint(1.2F, 1.5F, 0F);
		Screw5.setTextureSize(64, 32);
		Screw5.mirror = true;
		setRotation(Screw5, 0F, 0F, -0.6108652F);
		ModelRenderer Screw6 = new ModelRenderer(this, 32, 28);
		Screw6.addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
		Screw6.setRotationPoint(2.9F, 3.9F, 0F);
		Screw6.setTextureSize(64, 32);
		Screw6.mirror = true;
		setRotation(Screw6, 0F, 0F, -0.6108652F);
		ModelRenderer Body3 = new ModelRenderer(this, 24, 0);
		Body3.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
		Body3.setRotationPoint(0F, 0F, 0F);
		Body3.setTextureSize(64, 32);
		Body3.mirror = true;
		setRotation(Body3, 0F, 0F, 0.0698132F);

		LowerLeftBody.addChild(Body3);
		LowerLeftBody.addChild(Screw5);
		LowerLeftBody.addChild(Screw6);

		BottomLeftMagnet = new ModelRenderer(this, "BottomLeftMagnet");
		BottomLeftMagnet.setRotationPoint(0F, 2F, 0F);
		setRotation(BottomLeftMagnet, 0F, 0F, 0F);
		BottomLeftMagnet.mirror = true;
		ModelRenderer Magnet26 = new ModelRenderer(this, 0, 0);
		Magnet26.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet26.setRotationPoint(-0.7F, 0F, -0.5F);
		Magnet26.setTextureSize(64, 32);
		Magnet26.mirror = true;
		setRotation(Magnet26, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet27 = new ModelRenderer(this, 0, 0);
		Magnet27.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet27.setRotationPoint(-1.7F, 0.9F, -0.5F);
		Magnet27.setTextureSize(64, 32);
		Magnet27.mirror = true;
		setRotation(Magnet27, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet28 = new ModelRenderer(this, 0, 0);
		Magnet28.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet28.setRotationPoint(0.2F, 1F, -0.5F);
		Magnet28.setTextureSize(64, 32);
		Magnet28.mirror = true;
		setRotation(Magnet28, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet29 = new ModelRenderer(this, 0, 25);
		Magnet29.addBox(0F, 0F, 0F, 1, 3, 1);
		Magnet29.setRotationPoint(-2.7F, 1.8F, -0.5F);
		Magnet29.setTextureSize(64, 32);
		Magnet29.mirror = true;
		setRotation(Magnet29, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet30 = new ModelRenderer(this, 5, 25);
		Magnet30.addBox(0F, 0F, 0F, 1, 3, 1);
		Magnet30.setRotationPoint(1.1F, 2F, -0.5F);
		Magnet30.setTextureSize(64, 32);
		Magnet30.mirror = true;
		setRotation(Magnet30, 0F, 0F, 0.0698132F);

		BottomLeftMagnet.addChild(Magnet26);
		BottomLeftMagnet.addChild(Magnet27);
		BottomLeftMagnet.addChild(Magnet28);
		BottomLeftMagnet.addChild(Magnet29);
		BottomLeftMagnet.addChild(Magnet30);
		LowerLeftBody.addChild(BottomLeftMagnet);

		LowerLeftMagnet = new ModelRenderer(this, "LowerLeftMagnet");
		LowerLeftMagnet.setRotationPoint(1.7F, 0F, 0F);
		setRotation(LowerLeftMagnet, 0F, 0F, 0F);
		LowerLeftMagnet.mirror = true;
		ModelRenderer Magnet16 = new ModelRenderer(this, 0, 0);
		Magnet16.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet16.setRotationPoint(0.3F, -0.6F, -0.5F);
		Magnet16.setTextureSize(64, 32);
		Magnet16.mirror = true;
		setRotation(Magnet16, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet17 = new ModelRenderer(this, 0, 0);
		Magnet17.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet17.setRotationPoint(1.3F, -1.7F, -0.5F);
		Magnet17.setTextureSize(64, 32);
		Magnet17.mirror = true;
		setRotation(Magnet17, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet18 = new ModelRenderer(this, 0, 0);
		Magnet18.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet18.setRotationPoint(1.2F, 0.4F, -0.5F);
		Magnet18.setTextureSize(64, 32);
		Magnet18.mirror = true;
		setRotation(Magnet18, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet19 = new ModelRenderer(this, 0, 15);
		Magnet19.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet19.setRotationPoint(2.3F, -2.4F, -0.5F);
		Magnet19.setTextureSize(64, 32);
		Magnet19.mirror = true;
		setRotation(Magnet19, 0F, 0F, 0.0698132F);
		ModelRenderer Magnet20 = new ModelRenderer(this, 0, 20);
		Magnet20.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet20.setRotationPoint(2.1F, 1.4F, -0.5F);
		Magnet20.setTextureSize(64, 32);
		Magnet20.mirror = true;
		setRotation(Magnet20, 0F, 0F, 0.0698132F);

		LowerLeftMagnet.addChild(Magnet16);
		LowerLeftMagnet.addChild(Magnet17);
		LowerLeftMagnet.addChild(Magnet18);
		LowerLeftMagnet.addChild(Magnet19);
		LowerLeftMagnet.addChild(Magnet20);
		LowerLeftBody.addChild(LowerLeftMagnet);

		LowerRightBody = new ModelRenderer(this, "LowerRightBody");
		LowerRightBody.setRotationPoint(-3.8F, 6.5F, 2.5F);
		setRotation(LowerRightBody, 0F, 0F, 0F);
		LowerRightBody.mirror = true;
		ModelRenderer Body2 = new ModelRenderer(this, 44, 10);
		Body2.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
		Body2.setRotationPoint(0F, 0F, 0F);
		Body2.setTextureSize(64, 32);
		Body2.mirror = true;
		setRotation(Body2, 0F, 0F, -0.0698132F);
		ModelRenderer Screw3 = new ModelRenderer(this, 50, 28);
		Screw3.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		Screw3.setRotationPoint(-2F, 2F, 0F);
		Screw3.setTextureSize(64, 32);
		Screw3.mirror = true;
		setRotation(Screw3, 0F, 0F, 0.6108652F);
		ModelRenderer Screw4 = new ModelRenderer(this, 32, 28);
		Screw4.addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
		Screw4.setRotationPoint(-3.4F, 4F, 0F);
		Screw4.setTextureSize(64, 32);
		Screw4.mirror = true;
		setRotation(Screw4, 0F, 0F, 0.6108652F);

		LowerRightBody.addChild(Body2);
		LowerRightBody.addChild(Screw3);
		LowerRightBody.addChild(Screw4);

		BottomRightMagnet = new ModelRenderer(this, "BottomRightMagnet");
		BottomRightMagnet.setRotationPoint(0.2F, 2.7F, 0F);
		setRotation(BottomRightMagnet, 0F, 0F, 0F);
		BottomRightMagnet.mirror = true;
		ModelRenderer Magnet21 = new ModelRenderer(this, 0, 0);
		Magnet21.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet21.setRotationPoint(-0.1F, -0.2F, -0.5F);
		Magnet21.setTextureSize(64, 32);
		Magnet21.mirror = true;
		setRotation(Magnet21, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet22 = new ModelRenderer(this, 0, 0);
		Magnet22.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet22.setRotationPoint(0.9F, 0.6F, -0.5F);
		Magnet22.setTextureSize(64, 32);
		Magnet22.mirror = true;
		setRotation(Magnet22, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet23 = new ModelRenderer(this, 0, 0);
		Magnet23.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet23.setRotationPoint(-1F, 0.8F, -0.5F);
		Magnet23.setTextureSize(64, 32);
		Magnet23.mirror = true;
		setRotation(Magnet23, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet24 = new ModelRenderer(this, 0, 25);
		Magnet24.addBox(0F, 0F, 0F, 1, 3, 1);
		Magnet24.setRotationPoint(1.9F, 1.5F, -0.5F);
		Magnet24.setTextureSize(64, 32);
		Magnet24.mirror = true;
		setRotation(Magnet24, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet25 = new ModelRenderer(this, 5, 25);
		Magnet25.addBox(0F, 0F, 0F, 1, 3, 1);
		Magnet25.setRotationPoint(-1.9F, 1.8F, -0.5F);
		Magnet25.setTextureSize(64, 32);
		Magnet25.mirror = true;
		setRotation(Magnet25, 0F, 0F, -0.0698132F);

		BottomRightMagnet.addChild(Magnet21);
		BottomRightMagnet.addChild(Magnet22);
		BottomRightMagnet.addChild(Magnet23);
		BottomRightMagnet.addChild(Magnet24);
		BottomRightMagnet.addChild(Magnet25);
		LowerRightBody.addChild(BottomRightMagnet);

		LowerRightMagnet = new ModelRenderer(this, "LowerRightMagnet");
		LowerRightMagnet.setRotationPoint(-2.1F, 0.2F, 0F);
		setRotation(LowerRightMagnet, 0F, 0F, 0F);
		LowerRightMagnet.mirror = true;
		ModelRenderer Magnet15 = new ModelRenderer(this, 0, 10);
		Magnet15.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet15.setRotationPoint(-4.9F, 1.7F, -0.5F);
		Magnet15.setTextureSize(64, 32);
		Magnet15.mirror = true;
		setRotation(Magnet15, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet11 = new ModelRenderer(this, 0, 0);
		Magnet11.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet11.setRotationPoint(-1.3F, -0.2F, -0.5F);
		Magnet11.setTextureSize(64, 32);
		Magnet11.mirror = true;
		setRotation(Magnet11, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet12 = new ModelRenderer(this, 0, 0);
		Magnet12.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet12.setRotationPoint(-2.2F, -1.1F, -0.5F);
		Magnet12.setTextureSize(64, 32);
		Magnet12.mirror = true;
		setRotation(Magnet12, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet13 = new ModelRenderer(this, 0, 0);
		Magnet13.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet13.setRotationPoint(-2F, 0.6F, -0.5F);
		Magnet13.setTextureSize(64, 32);
		Magnet13.mirror = true;
		setRotation(Magnet13, 0F, 0F, -0.0698132F);
		ModelRenderer Magnet14 = new ModelRenderer(this, 0, 5);
		Magnet14.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet14.setRotationPoint(-5.2F, -1.9F, -0.5F);
		Magnet14.setTextureSize(64, 32);
		Magnet14.mirror = true;
		setRotation(Magnet14, 0F, 0F, -0.0698132F);

		LowerRightMagnet.addChild(Magnet11);
		LowerRightMagnet.addChild(Magnet12);
		LowerRightMagnet.addChild(Magnet13);
		LowerRightMagnet.addChild(Magnet14);
		LowerRightMagnet.addChild(Magnet15);
		LowerRightBody.addChild(LowerRightMagnet);

		TopBody = new ModelRenderer(this, "TopBody");
		TopBody.setRotationPoint(0F, 1.5F, 2.5F);
		setRotation(TopBody, 0F, 0F, 0F);
		TopBody.mirror = true;
		ModelRenderer Body1 = new ModelRenderer(this, 44, 0);
		Body1.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
		Body1.setRotationPoint(0F, 0F, 0F);
		Body1.setTextureSize(64, 32);
		Body1.mirror = true;
		setRotation(Body1, 0F, 0F, 0F);
		ModelRenderer Screw1 = new ModelRenderer(this, 45, 29);
		Screw1.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
		Screw1.setRotationPoint(0F, -2.5F, 0F);
		Screw1.setTextureSize(64, 32);
		Screw1.mirror = true;
		setRotation(Screw1, 0F, 0F, 0F);
		ModelRenderer Screw2 = new ModelRenderer(this, 32, 28);
		Screw2.addBox(-1.5F, -1F, -1.5F, 3, 1, 3);
		Screw2.setRotationPoint(0F, -4.5F, 0F);
		Screw2.setTextureSize(64, 32);
		Screw2.mirror = true;
		setRotation(Screw2, 0F, 0F, 0F);

		TopBody.addChild(Body1);
		TopBody.addChild(Screw1);
		TopBody.addChild(Screw2);

		TopLeftMagnet = new ModelRenderer(this, "TopLeftMagnet");
		TopLeftMagnet.setRotationPoint(2.5F, 0F, 0F);
		setRotation(TopLeftMagnet, 0F, 0F, 0F);
		TopLeftMagnet.mirror = true;
		ModelRenderer Magnet6 = new ModelRenderer(this, 0, 0);
		Magnet6.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet6.setRotationPoint(0F, -0.5F, -0.5F);
		Magnet6.setTextureSize(64, 32);
		Magnet6.mirror = true;
		setRotation(Magnet6, 0F, 0F, 0F);
		ModelRenderer Magnet7 = new ModelRenderer(this, 0, 0);
		Magnet7.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet7.setRotationPoint(1F, -1.5F, -0.5F);
		Magnet7.setTextureSize(64, 32);
		Magnet7.mirror = true;
		setRotation(Magnet7, 0F, 0F, 0F);
		ModelRenderer Magnet8 = new ModelRenderer(this, 0, 0);
		Magnet8.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet8.setRotationPoint(1F, 0.5F, -0.5F);
		Magnet8.setTextureSize(64, 32);
		Magnet8.mirror = true;
		setRotation(Magnet8, 0F, 0F, 0F);
		ModelRenderer Magnet9 = new ModelRenderer(this, 0, 15);
		Magnet9.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet9.setRotationPoint(2F, -2.5F, -0.5F);
		Magnet9.setTextureSize(64, 32);
		Magnet9.mirror = true;
		setRotation(Magnet9, 0F, 0F, 0F);
		ModelRenderer Magnet10 = new ModelRenderer(this, 0, 20);
		Magnet10.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet10.setRotationPoint(2F, 1.5F, -0.5F);
		Magnet10.setTextureSize(64, 32);
		Magnet10.mirror = true;
		setRotation(Magnet10, 0F, 0F, 0F);

		TopLeftMagnet.addChild(Magnet6);
		TopLeftMagnet.addChild(Magnet7);
		TopLeftMagnet.addChild(Magnet8);
		TopLeftMagnet.addChild(Magnet9);
		TopLeftMagnet.addChild(Magnet10);
		TopBody.addChild(TopLeftMagnet);

		TopRightMagnet = new ModelRenderer(this, "TopRightMagnet");
		TopRightMagnet.setRotationPoint(-2.5F, 0F, 0F);
		setRotation(TopRightMagnet, 0F, 0F, 0F);
		TopRightMagnet.mirror = true;
		ModelRenderer Magnet1 = new ModelRenderer(this, 0, 0);
		Magnet1.addBox(-1F, -0.5F, -0.5F, 1, 1, 1);
		Magnet1.setRotationPoint(0F, 0F, 0F);
		Magnet1.setTextureSize(64, 32);
		Magnet1.mirror = true;
		setRotation(Magnet1, 0F, 0F, 0F);
		ModelRenderer Magnet2 = new ModelRenderer(this, 0, 0);
		Magnet2.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet2.setRotationPoint(-2F, -1.5F, -0.5F);
		Magnet2.setTextureSize(64, 32);
		Magnet2.mirror = true;
		setRotation(Magnet2, 0F, 0F, 0F);
		ModelRenderer Magnet4 = new ModelRenderer(this, 0, 5);
		Magnet4.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet4.setRotationPoint(-5F, -2.5F, -0.5F);
		Magnet4.setTextureSize(64, 32);
		Magnet4.mirror = true;
		setRotation(Magnet4, 0F, 0F, 0F);
		ModelRenderer Magnet5 = new ModelRenderer(this, 0, 10);
		Magnet5.addBox(0F, 0F, 0F, 3, 1, 1);
		Magnet5.setRotationPoint(-5F, 1.5F, -0.5F);
		Magnet5.setTextureSize(64, 32);
		Magnet5.mirror = true;
		setRotation(Magnet5, 0F, 0F, 0F);
		ModelRenderer Magnet3 = new ModelRenderer(this, 0, 0);
		Magnet3.addBox(0F, 0F, 0F, 1, 1, 1);
		Magnet3.setRotationPoint(-2F, 0.5F, -0.5F);
		Magnet3.setTextureSize(64, 32);
		Magnet3.mirror = true;
		setRotation(Magnet3, 0F, 0F, 0F);

		TopRightMagnet.addChild(Magnet1);
		TopRightMagnet.addChild(Magnet2);
		TopRightMagnet.addChild(Magnet3);
		TopRightMagnet.addChild(Magnet4);
		TopRightMagnet.addChild(Magnet5);
		TopBody.addChild(TopRightMagnet);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		LowerLeftBody.render(f5);
		LowerRightBody.render(f5);
		TopBody.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	Random randomGenerator = new Random();
	int count = 0;

	boolean Headisrotating = false;

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
		LowerLeftBody.rotationPointY = MathHelper.cos(.2F * f2) * 5F * .5F;
		LowerRightBody.rotationPointY = MathHelper.cos(.2F * f2) * 5F * .5F;
		TopBody.rotationPointY = MathHelper.cos(.2F * f2) * 5F * .5F - 5F;

		int randomInt = randomGenerator.nextInt(100);

		if (randomInt == 4) {
			Headisrotating = true;
		}else if (Headisrotating == true) {
			TopRightMagnet.rotateAngleX += .1F;
			count++;
		}

		if (count >= 63) {
			Headisrotating = false;
			count = 0;
			}
		
		

	}

}
