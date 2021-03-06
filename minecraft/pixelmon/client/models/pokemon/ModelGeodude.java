// Date: 25/12/2012 3:03:54 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.pokemon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelGeodude extends ModelBase
{
  //fields
	ModelRenderer leftupperarm1;
	ModelRenderer leftlowerarm1;
	ModelRenderer rightupperarm1;
	ModelRenderer rightlowerarm;
	ModelRenderer lefthand;
	ModelRenderer righthand;
	ModelRenderer rightthumb;
	ModelRenderer leftthumb;
	ModelRenderer rightfingers;
	ModelRenderer leftfingers;
    ModelRenderer Body;
    ModelRenderer Body1;
    ModelRenderer Body1a;
    ModelRenderer Body1b;
    ModelRenderer Body1c;
    ModelRenderer body2;
    ModelRenderer body2a;
    ModelRenderer body2b;
    ModelRenderer body3;
    ModelRenderer body3a;
    ModelRenderer body3b;
    ModelRenderer body3c;
    ModelRenderer jaw;
    ModelRenderer Left_Eyebrow;
    ModelRenderer Right_eyebrow;
    ModelRenderer leftlowerarm2;
    ModelRenderer leftupperarm;
    ModelRenderer rightlowerarm1;
    ModelRenderer rightlowerarm2;
    ModelRenderer rightupperarm;
    ModelRenderer LEFTARMPIECE;
    ModelRenderer RIGHTARMPIECE;
  
  public ModelGeodude()
  {
    textureWidth = 64;
    textureHeight = 32;
    setTextureOffset("LEFTARMPIECE.DELETE_THIS", 0, 0);
    setTextureOffset("RIGHTARMPIECE.DELETE_THIS", 0, 0);
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-3F, -2.5F, -3F, 6, 5, 6);
      Body.setRotationPoint(0F, 20F, 1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Body1 = new ModelRenderer(this, 0, 12);
      Body1.addBox(-2.5F, -3.5F, -2.5F, 5, 6, 5);
      Body1.setRotationPoint(0F, 20F, 1F);
      Body1.setTextureSize(64, 32);
      Body1.mirror = true;
      setRotation(Body1, 0.0743572F, -0.0371786F, -0.1487144F);
      Body1a = new ModelRenderer(this, 0, 12);
      Body1a.addBox(-2.5F, -3.5F, -2.5F, 5, 6, 5);
      Body1a.setRotationPoint(0F, 20F, 1F);
      Body1a.setTextureSize(64, 32);
      Body1a.mirror = true;
      setRotation(Body1a, -0.1115358F, 0.0743572F, 0.2602503F);
      Body1b = new ModelRenderer(this, 0, 12);
      Body1b.addBox(-2.5F, -3.5F, -2.5F, 5, 6, 5);
      Body1b.setRotationPoint(0F, 20F, 1F);
      Body1b.setTextureSize(64, 32);
      Body1b.mirror = true;
      setRotation(Body1b, 0.1487144F, -0.1115358F, 0.2602503F);
      Body1c = new ModelRenderer(this, 0, 12);
      Body1c.addBox(-2.5F, -3.5F, -2.5F, 5, 6, 5);
      Body1c.setRotationPoint(0F, 20F, 1F);
      Body1c.setTextureSize(64, 32);
      Body1c.mirror = true;
      setRotation(Body1c, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 30, 0);
      body2.addBox(1.5F, 1.5F, -3.5F, 1, 1, 3);
      body2.setRotationPoint(0F, 20F, 1F);
      body2.setTextureSize(64, 32);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      body2a = new ModelRenderer(this, 24, 0);
      body2a.addBox(-2.5F, -2.5F, -3.5F, 5, 4, 7);
      body2a.setRotationPoint(0F, 20F, 1F);
      body2a.setTextureSize(64, 32);
      body2a.mirror = true;
      setRotation(body2a, 0F, 0F, 0F);
      body2b = new ModelRenderer(this, 28, 0);
      body2b.addBox(-2.5F, 1.5F, -3.5F, 1, 1, 4);
      body2b.setRotationPoint(0F, 20F, 1F);
      body2b.setTextureSize(64, 32);
      body2b.mirror = true;
      setRotation(body2b, 0F, 0F, 0F);
      body3 = new ModelRenderer(this, 20, 12);
      body3.addBox(-3.5F, -2.5F, -2.5F, 7, 5, 5);
      body3.setRotationPoint(0F, 20F, 1F);
      body3.setTextureSize(64, 32);
      body3.mirror = true;
      setRotation(body3, 0F, 0.1487144F, 0.1115358F);
      body3a = new ModelRenderer(this, 20, 12);
      body3a.addBox(-3.5F, -2.5F, -2.5F, 7, 5, 5);
      body3a.setRotationPoint(0F, 20F, 1F);
      body3a.setTextureSize(64, 32);
      body3a.mirror = true;
      setRotation(body3a, 0F, -0.1487144F, -0.1115358F);
      body3b = new ModelRenderer(this, 20, 12);
      body3b.addBox(-3.5F, -2.5F, -2.5F, 7, 5, 5);
      body3b.setRotationPoint(0F, 20F, 1F);
      body3b.setTextureSize(64, 32);
      body3b.mirror = true;
      setRotation(body3b, 0F, 0F, 0.1115358F);
      body3c = new ModelRenderer(this, 20, 12);
      body3c.addBox(-3.5F, -2.5F, -2.5F, 7, 5, 5);
      body3c.setRotationPoint(0F, 20F, 1F);
      body3c.setTextureSize(64, 32);
      body3c.mirror = true;
      setRotation(body3c, 0F, 0F, 0.1115358F);
      jaw = new ModelRenderer(this, 7, 0);
      jaw.addBox(-1F, 0F, -2F, 3, 1, 2);
      jaw.setRotationPoint(-0.5F, 22F, -0.5F);
      jaw.setTextureSize(64, 32);
      jaw.mirror = true;
      setRotation(jaw, 0.0371786F, 0F, 0F);
      Left_Eyebrow = new ModelRenderer(this, 6, 0);
      Left_Eyebrow.addBox(0F, -0.5F, 0F, 3, 1, 1);
      Left_Eyebrow.setRotationPoint(3F, 17.5F, -2.7F);
      Left_Eyebrow.setTextureSize(64, 32);
      Left_Eyebrow.mirror = true;
      setRotation(Left_Eyebrow, 0F, 0F, 2.770937F);
      Right_eyebrow = new ModelRenderer(this, 6, 0);
      Right_eyebrow.addBox(0F, -0.5F, 0F, 3, 1, 1);
      Right_eyebrow.setRotationPoint(-3F, 17.5F, -2.7F);
      Right_eyebrow.setTextureSize(64, 32);
      Right_eyebrow.mirror = true;
      setRotation(Right_eyebrow, 0F, 0F, 0.3717861F);
      leftlowerarm2 = new ModelRenderer(this, 0, 24);
      leftlowerarm2.addBox(1.7F, -1.6F, -4.5F, 2, 2, 4);
      leftlowerarm2.setRotationPoint(0F,0F,0F);
      leftlowerarm2.setTextureSize(64, 32);
      leftlowerarm2.mirror = true;
      setRotation(leftlowerarm2, -0.0371786F, -0.1487144F, 0.2602503F);
      leftupperarm = new ModelRenderer(this, 12, 26);
      leftupperarm.addBox(-1.2F, -0.5F, -0.5F, 5, 1, 1);
      leftupperarm.setRotationPoint(0F,0F,0F);
      leftupperarm.setTextureSize(64, 32);
      leftupperarm.mirror = true;
      setRotation(leftupperarm, 0.4089656F, 0F, 0F);
      rightlowerarm1 = new ModelRenderer(this, 0, 24);
      rightlowerarm1.addBox(0F, -4F, -1F, 2, 2, 4);
      rightlowerarm1.setRotationPoint(0F,0F,0F);
      rightlowerarm1.setTextureSize(64, 32);
      rightlowerarm1.mirror = true;
      setRotation(rightlowerarm1, -0.0371786F, 2.992878F, 1.226894F);
      rightlowerarm2 = new ModelRenderer(this, 0, 24);
      rightlowerarm2.addBox(-2.5F, 1.5F, -4F, 2, 2, 4);
      rightlowerarm2.setRotationPoint(0F,0F,0F);
      rightlowerarm2.setTextureSize(64, 32);
      rightlowerarm2.mirror = true;
      setRotation(rightlowerarm2, 0F, 0F, 0.966650606F);
      rightupperarm = new ModelRenderer(this, 12, 26);
      rightupperarm.addBox(-3.8F, -0.5F, -0.5F, 5, 1, 1);
      rightupperarm.setRotationPoint(0F,0F,0F);
      rightupperarm.setTextureSize(64, 32);
      rightupperarm.mirror = true;
      setRotation(rightupperarm, 0.6320364F, 0.0371786F, 0F);
    LEFTARMPIECE = new ModelRenderer(this, "LEFTARMPIECE");
    LEFTARMPIECE.setRotationPoint(4F, 20F, 1F);
    setRotation(LEFTARMPIECE, 0F, 0F, 0F);
    LEFTARMPIECE.mirror = true;
      leftfingers = new ModelRenderer(this, 0, 30);
      leftfingers.addBox(-2F, 0.5F, -2F, 4, 1, 1);
      leftfingers.setRotationPoint(3F,0F,-4F);
      leftfingers.setTextureSize(64, 32);
      leftfingers.mirror = true;
      setRotation(leftfingers, 0F, 0F, 0F);
      leftthumb = new ModelRenderer(this, 12, 24);
      leftthumb.addBox(-2F, 0.5F, -1F, 3, 1, 1);
      leftthumb.setRotationPoint(3F,0F,-4F);
      leftthumb.setTextureSize(64, 32);
      leftthumb.mirror = true;
      setRotation(leftthumb, 0F, 0F, 0F);
      leftlowerarm1 = new ModelRenderer(this, 0, 24);
      leftlowerarm1.addBox(-1F, -1F, -4F, 2, 2, 4);
      leftlowerarm1.setRotationPoint(3F,0F,0F);
      leftlowerarm1.setTextureSize(64, 32);
      leftlowerarm1.mirror = true;
      setRotation(leftlowerarm1, 0F, 0F, 0F);
      leftupperarm1 = new ModelRenderer(this, 12, 26);
      leftupperarm1.addBox(2.8F, -0.5F, -0.5F, 5, 1, 1);
      leftupperarm1.setRotationPoint(-4F,0F,0F);
      leftupperarm1.setTextureSize(64, 32);
      leftupperarm1.mirror = true;
      setRotation(leftupperarm1, 0F, 0F, 0F);
      lefthand = new ModelRenderer(this, 20, 22);
      lefthand.addBox(1F, -1.5F, -6F, 4, 2, 2);
      lefthand.setRotationPoint(0F, 0F, 0F);
      lefthand.setTextureSize(64, 32);
      lefthand.mirror = true;
      setRotation(lefthand, 0F, 0F, 0F);
      
      LEFTARMPIECE.addChild(leftthumb);
      LEFTARMPIECE.addChild(leftlowerarm1);
      LEFTARMPIECE.addChild(leftupperarm1);
      LEFTARMPIECE.addChild(lefthand);
      LEFTARMPIECE.addChild(leftfingers);
      LEFTARMPIECE.addChild(leftlowerarm2);
      LEFTARMPIECE.addChild(leftupperarm);
      
    RIGHTARMPIECE = new ModelRenderer(this, "RIGHTARMPIECE");
    RIGHTARMPIECE.setRotationPoint(-4F, 20F, 1F);
    setRotation(RIGHTARMPIECE, 0F, 0F, 0F);
    RIGHTARMPIECE.mirror = true;
      rightlowerarm = new ModelRenderer(this, 0, 24);
      rightlowerarm.addBox(-1F, -1F, -4F, 2, 2, 4);
      rightlowerarm.setRotationPoint(-3F,0F,0F);
      rightlowerarm.setTextureSize(64, 32);
      rightlowerarm.mirror = true;
      setRotation(rightlowerarm, 0F, 0F, 0F);
      rightupperarm1 = new ModelRenderer(this, 12, 26);
      rightupperarm1.addBox(-7.8F, -0.5F, -0.5F, 5, 1, 1);
      rightupperarm1.setRotationPoint(4F,0F,0F);
      rightupperarm1.setTextureSize(64, 32);
      rightupperarm1.mirror = true;
      setRotation(rightupperarm1, 0F, 0F, 0F);
      rightfingers = new ModelRenderer(this, 0, 30);
      rightfingers.addBox(-2F, 0.5F, -2F, 4, 1, 1);
      rightfingers.setRotationPoint(-3F,0F,-4F);
      rightfingers.setTextureSize(64, 32);
      rightfingers.mirror = true;
      setRotation(rightfingers, 0F, 0F, 0F);
      rightthumb = new ModelRenderer(this, 12, 24);
      rightthumb.addBox(-1F, 0.5F, -1F, 3, 1, 1);
      rightthumb.setRotationPoint(-3F,0F,-4F);
      rightthumb.setTextureSize(64, 32);
      rightthumb.mirror = true;
      setRotation(rightthumb, 0F, 0F, 0F);
      righthand = new ModelRenderer(this, 20, 22);
      righthand.addBox(-2F, -1.5F, -2F, 4, 2, 2);
      righthand.setRotationPoint(-3F,0F,-4F);
      righthand.setTextureSize(64, 32);
      righthand.mirror = true;
      setRotation(righthand, 0F, 0F, 0F);
      
      
      RIGHTARMPIECE.addChild(righthand);
      RIGHTARMPIECE.addChild(rightlowerarm);
      RIGHTARMPIECE.addChild(rightthumb);
      RIGHTARMPIECE.addChild(rightupperarm1);
      RIGHTARMPIECE.addChild(rightlowerarm);


     
      
      RIGHTARMPIECE.addChild(rightlowerarm1);
      RIGHTARMPIECE.addChild(rightlowerarm2);
      
      RIGHTARMPIECE.addChild(rightupperarm);  
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Body1.render(f5);
    Body1a.render(f5);
    Body1b.render(f5);
    Body1c.render(f5);
    body2.render(f5);
    body2a.render(f5);
    body2b.render(f5);
    body3.render(f5);
    body3a.render(f5);
    body3b.render(f5);
    body3c.render(f5);
    jaw.render(f5);
    Left_Eyebrow.render(f5);
    Right_eyebrow.render(f5);

    LEFTARMPIECE.render(f5);
    RIGHTARMPIECE.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
   
  }

}
