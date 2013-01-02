// Date: 4/28/2012 11:56:04 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelZubat extends ModelBase {
	// fields
	ModelRenderer bodyupper;
	ModelRenderer bodymiddle;
	ModelRenderer bodybottom;
	ModelRenderer leftear;
	ModelRenderer rightear;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer leftwing;
	ModelRenderer rightwing;
	ModelRenderer lefttoptooth;
	ModelRenderer rightbottomtooth;
	ModelRenderer leftbottomtooth;
	ModelRenderer righttoptooth;

	public ModelZubat() {
		textureWidth = 32;
		textureHeight = 32;

		bodyupper = new ModelRenderer(this, 0, 12);
		bodyupper.addBox(-1.5F, -2.5F, -1F, 3, 1, 2);
		bodyupper.setRotationPoint(0F, 15.5F, 0F);
		bodyupper.setTextureSize(32, 32);
		bodyupper.mirror = true;
		setRotation(bodyupper, 0F, 0F, 0F);
		bodymiddle = new ModelRenderer(this, 0, 15);
		bodymiddle.addBox(-1.5F, -1.5F, 0F, 3, 3, 1);
		bodymiddle.setRotationPoint(0F, 15.5F, 0F);
		bodymiddle.setTextureSize(32, 32);
		bodymiddle.mirror = true;
		setRotation(bodymiddle, 0F, 0F, 0F);
		bodybottom = new ModelRenderer(this, 0, 19);
		bodybottom.addBox(-1.5F, 1.5F, -1F, 3, 2, 2);
		bodybottom.setRotationPoint(0F, 15.5F, 0F);
		bodybottom.setTextureSize(32, 32);
		bodybottom.mirror = true;
		setRotation(bodybottom, 0F, 0F, 0F);
		leftear = new ModelRenderer(this, 10, 17);
		leftear.addBox(-3.8F, -4.2F, 0.9F, 3, 3, 0);
		leftear.setRotationPoint(0F, 15.5F, 0F);
		leftear.setTextureSize(32, 32);
		leftear.mirror = true;
		setRotation(leftear, 0F, 0F, 0.1745329F);
		rightear = new ModelRenderer(this, 10, 17);
		rightear.addBox(-4.2F, -3.8F, 0.9F, 3, 3, 0);
		rightear.setRotationPoint(0F, 15.5F, 0F);
		rightear.setTextureSize(32, 32);
		rightear.mirror = true;
		setRotation(rightear, 0F, 0F, 1.396263F);
		rightleg = new ModelRenderer(this, 10, 11);
		rightleg.addBox(-0.5F, 3.5F, -0.5F, 0, 5, 1);
		rightleg.setRotationPoint(0F, 15.5F, 0F);
		rightleg.setTextureSize(32, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0.1396263F);
		leftleg = new ModelRenderer(this, 12, 11);
		leftleg.addBox(0.5F, 3.5F, -0.5F, 0, 5, 1);
		leftleg.setRotationPoint(0F, 15.5F, 0F);
		leftleg.setTextureSize(32, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, -0.1396263F);
		leftwing = new ModelRenderer(this, 0, 6);
		leftwing.addBox(1.5F, -5F, 0.6F, 10, 6, 0);
		leftwing.setRotationPoint(0F, 15.5F, 0F);
		leftwing.setTextureSize(32, 32);
		leftwing.mirror = true;
		setRotation(leftwing, 0.1570796F, 0.1047198F, 0.5934119F);
		rightwing = new ModelRenderer(this, 0, 0);
		rightwing.addBox(-11.5F, -5F, 0.6F, 10, 6, 0);
		rightwing.setRotationPoint(0F, 15.5F, 0F);
		rightwing.setTextureSize(32, 32);
		rightwing.mirror = true;
		setRotation(rightwing, 0.1570796F, -0.1047198F, -0.5934119F);
		lefttoptooth = new ModelRenderer(this, 10, 20);
		lefttoptooth.addBox(-1F, -2F, -1F, 1, 1, 0);
		lefttoptooth.setRotationPoint(0F, 15.5F, 0F);
		lefttoptooth.setTextureSize(32, 32);
		lefttoptooth.mirror = true;
		setRotation(lefttoptooth, 0F, -0.1745329F, 0.7853982F);
		rightbottomtooth = new ModelRenderer(this, 10, 20);
		rightbottomtooth.addBox(0F, 1F, -1F, 1, 1, 0);
		rightbottomtooth.setRotationPoint(0F, 15.5F, 0F);
		rightbottomtooth.setTextureSize(32, 32);
		rightbottomtooth.mirror = true;
		setRotation(rightbottomtooth, 0F, 0.1745329F, 0.7853982F);
		leftbottomtooth = new ModelRenderer(this, 10, 20);
		leftbottomtooth.addBox(1F, 0F, -1F, 1, 1, 0);
		leftbottomtooth.setRotationPoint(0F, 15.5F, 0F);
		leftbottomtooth.setTextureSize(32, 32);
		leftbottomtooth.mirror = true;
		setRotation(leftbottomtooth, 0F, -0.1745329F, 0.7853982F);
		righttoptooth = new ModelRenderer(this, 10, 20);
		righttoptooth.addBox(-2F, -1F, -1F, 1, 1, 0);
		righttoptooth.setRotationPoint(0F, 15.5F, 0F);
		righttoptooth.setTextureSize(32, 32);
		righttoptooth.mirror = true;
		setRotation(righttoptooth, 0F, 0.1745329F, 0.7853982F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		bodyupper.render(f5);
		bodymiddle.render(f5);
		bodybottom.render(f5);
		leftear.render(f5);
		rightear.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		leftwing.render(f5);
		rightwing.render(f5);
		lefttoptooth.render(f5);
		rightbottomtooth.render(f5);
		leftbottomtooth.render(f5);
		righttoptooth.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	/*	leftwing.rotateAngleY = MathHelper.cos(f2 * f);
		rightwing.rotateAngleY = MathHelper.cos(f2 * f + 3.14159F);
		*/
	}

}
