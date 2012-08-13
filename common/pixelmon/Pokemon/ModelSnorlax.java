package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelSnorlax extends ModelBase
{
  //fields
    ModelRenderer EarR;
    ModelRenderer EarthickRR;
    ModelRenderer EarthickLR;
    ModelRenderer EarInnerthickR;
    ModelRenderer EarL;
    ModelRenderer EarthickLL;
    ModelRenderer EarthickRL;
    ModelRenderer EarInnerthickL;
    ModelRenderer Head;
    ModelRenderer HeadThick;
    ModelRenderer HeadWide;
    ModelRenderer HeadCheek;
    ModelRenderer ToothR;
    ModelRenderer ToothL;
    ModelRenderer BodyBase;
    ModelRenderer BodyFatWide;
    ModelRenderer BodyFatThick;
    ModelRenderer BodyFatBelly;
    ModelRenderer BodyFatBack;
    ModelRenderer UpperArmR;
    ModelRenderer LowerArmR;
    ModelRenderer UpperThumbR;
    ModelRenderer LowerThumbR;
    ModelRenderer UpperFingerIndexR;
    ModelRenderer LowerFingerIndexR;
    ModelRenderer UpperFingerMiddleR;
    ModelRenderer LowerFingerMiddleR;
    ModelRenderer UpperFingerRingR;
    ModelRenderer LowerFingerRingR;
    ModelRenderer UpperFingerPinkyR;
    ModelRenderer LowerFingerPinkyR;
    ModelRenderer UpperArmL;
    ModelRenderer LowerArmL;
    ModelRenderer UpperThumbL;
    ModelRenderer LowerThumbL;
    ModelRenderer UpperFingerIndexL;
    ModelRenderer LowerFingerIndexL;
    ModelRenderer UpperFingerMiddleL;
    ModelRenderer LowerFingerMiddleL;
    ModelRenderer UpperFingerRingL;
    ModelRenderer LowerFingerRingL;
    ModelRenderer UpperFingerPinkyL;
    ModelRenderer LowerFingerPinkyL;
    ModelRenderer FootBaseL;
    ModelRenderer FootFatL;
    ModelRenderer UpperToeUnoR;
    ModelRenderer UpperToeMiddleR;
    ModelRenderer UpperToePinkyR;
    ModelRenderer FootBaseR;
    ModelRenderer FootFatR;
    ModelRenderer ToeUnoL;
    ModelRenderer ToeMiddleL;
    ModelRenderer ToePinkyL;
  
  public ModelSnorlax()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      EarR = new ModelRenderer(this, 59, 49);
      EarR.addBox(-1F, -7F, -5F, 2, 7, 7);
      EarR.setRotationPoint(-5.8F, -28.5F, 4.333333F);
      EarR.setTextureSize(512, 256);
      EarR.mirror = true;
      setRotation(EarR, 0.6632251F, -0.1745329F, 0F);
      EarthickRR = new ModelRenderer(this, 99, 52);
      EarthickRR.addBox(-1F, -3F, -3F, 2, 6, 6);
      EarthickRR.setRotationPoint(-5.8F, -30F, 1F);
      EarthickRR.setTextureSize(512, 256);
      EarthickRR.mirror = true;
      setRotation(EarthickRR, 0.6632251F, -0.1745329F, 0F);
      EarthickLR = new ModelRenderer(this, 81, 51);
      EarthickLR.addBox(-1F, -3F, -3F, 2, 6, 6);
      EarthickLR.setRotationPoint(-4.5F, -30F, 1F);
      EarthickLR.setTextureSize(512, 256);
      EarthickLR.mirror = true;
      setRotation(EarthickLR, 0.6632251F, -0.1745329F, 0F);
      EarInnerthickR = new ModelRenderer(this, 83, 38);
      EarInnerthickR.addBox(-1F, -2.5F, -2.5F, 2, 5, 5);
      EarInnerthickR.setRotationPoint(-3.8F, -29.7F, 1.2F);
      EarInnerthickR.setTextureSize(512, 256);
      EarInnerthickR.mirror = true;
      setRotation(EarInnerthickR, 0.6632251F, -0.1745329F, 0F);
      EarL = new ModelRenderer(this, 59, 49);
      EarL.addBox(-1F, -7F, -5F, 2, 7, 7);
      EarL.setRotationPoint(5.8F, -28.5F, 4.3F);
      EarL.setTextureSize(512, 256);
      EarL.mirror = true;
      setRotation(EarL, 0.6632251F, 0.1745329F, 0F);
      EarthickLL = new ModelRenderer(this, 99, 52);
      EarthickLL.addBox(-1F, -3F, -3F, 2, 6, 6);
      EarthickLL.setRotationPoint(5.8F, -30F, 1F);
      EarthickLL.setTextureSize(512, 256);
      EarthickLL.mirror = true;
      setRotation(EarthickLL, 0.6632251F, 0.1745329F, 0F);
      EarthickRL = new ModelRenderer(this, 81, 51);
      EarthickRL.addBox(-1F, -3F, -3F, 2, 6, 6);
      EarthickRL.setRotationPoint(4.5F, -30F, 1F);
      EarthickRL.setTextureSize(512, 256);
      EarthickRL.mirror = true;
      setRotation(EarthickRL, 0.6632251F, 0.1745329F, 0F);
      EarInnerthickL = new ModelRenderer(this, 83, 38);
      EarInnerthickL.addBox(-1F, -2.5F, -2.5F, 2, 5, 5);
      EarInnerthickL.setRotationPoint(3.8F, -29.7F, 1.2F);
      EarInnerthickL.setTextureSize(512, 256);
      EarInnerthickL.mirror = true;
      setRotation(EarInnerthickL, 0.6632251F, 0.1745329F, 0F);
      Head = new ModelRenderer(this, 1, 61);
      Head.addBox(-7.5F, -12F, -6.5F, 15, 14, 13);
      Head.setRotationPoint(0F, -19F, 0F);
      Head.setTextureSize(512, 256);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      HeadThick = new ModelRenderer(this, 1, 33);
      HeadThick.addBox(-6.5F, -5.5F, -7F, 13, 13, 14);
      HeadThick.setRotationPoint(0F, -24.5F, 0F);
      HeadThick.setTextureSize(512, 256);
      HeadThick.mirror = true;
      setRotation(HeadThick, 0F, 0F, 0F);
      HeadWide = new ModelRenderer(this, 1, 7);
      HeadWide.addBox(-8.5F, -5.5F, -6F, 17, 13, 12);
      HeadWide.setRotationPoint(0F, -24.5F, 0F);
      HeadWide.setTextureSize(512, 256);
      HeadWide.mirror = true;
      setRotation(HeadWide, 0F, 0F, 0F);
      HeadCheek = new ModelRenderer(this, 58, 65);
      HeadCheek.addBox(-9F, -5.5F, -5F, 18, 11, 10);
      HeadCheek.setRotationPoint(0F, -23F, 0F);
      HeadCheek.setTextureSize(512, 256);
      HeadCheek.mirror = true;
      setRotation(HeadCheek, 0F, 0F, 0F);
      ToothR = new ModelRenderer(this, 0, 0);
      ToothR.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      ToothR.setRotationPoint(-2F, -20F, -6.5F);
      ToothR.setTextureSize(512, 256);
      ToothR.mirror = true;
      setRotation(ToothR, -0.7853982F, 0F, 0F);
      ToothL = new ModelRenderer(this, 0, 0);
      ToothL.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      ToothL.setRotationPoint(2F, -20F, -6.5F);
      ToothL.setTextureSize(512, 256);
      ToothL.mirror = true;
      setRotation(ToothL, -0.7853982F, 0F, 0F);
      BodyBase = new ModelRenderer(this, 1, 199);
      BodyBase.addBox(-18F, -18F, -10F, 36, 36, 20);
      BodyBase.setRotationPoint(0F, 1F, 0F);
      BodyBase.setTextureSize(512, 256);
      BodyBase.mirror = true;
      setRotation(BodyBase, 0F, 0F, 0F);
      BodyFatWide = new ModelRenderer(this, 114, 203);
      BodyFatWide.addBox(-19F, -18F, -9F, 38, 34, 18);
      BodyFatWide.setRotationPoint(0F, 2.5F, 0F);
      BodyFatWide.setTextureSize(512, 256);
      BodyFatWide.mirror = true;
      setRotation(BodyFatWide, 0F, 0F, 0F);
      BodyFatThick = new ModelRenderer(this, 1, 142);
      BodyFatThick.addBox(-17F, -17F, -11F, 34, 34, 22);
      BodyFatThick.setRotationPoint(0F, 1.5F, 0F);
      BodyFatThick.setTextureSize(512, 256);
      BodyFatThick.mirror = true;
      setRotation(BodyFatThick, 0F, 0F, 0F);
      BodyFatBelly = new ModelRenderer(this, 1, 89);
      BodyFatBelly.addBox(-15F, -16F, -10F, 30, 32, 20);
      BodyFatBelly.setRotationPoint(0F, 2F, -2F);
      BodyFatBelly.setTextureSize(512, 256);
      BodyFatBelly.mirror = true;
      setRotation(BodyFatBelly, 0F, 0F, 0F);
      BodyFatBack = new ModelRenderer(this, 115, 150);
      BodyFatBack.addBox(-16F, -16F, -10F, 32, 32, 20);
      BodyFatBack.setRotationPoint(0F, 1.5F, 2F);
      BodyFatBack.setTextureSize(512, 256);
      BodyFatBack.mirror = true;
      setRotation(BodyFatBack, 0F, 0F, 0F);
      UpperArmR = new ModelRenderer(this, 168, 123);
      UpperArmR.addBox(-3F, 0F, -6F, 6, 14, 12);
      UpperArmR.setRotationPoint(-16.2F, -14F, 0F);
      UpperArmR.setTextureSize(512, 256);
      UpperArmR.mirror = true;
      setRotation(UpperArmR, 0F, 0F, 0.4363323F);
      LowerArmR = new ModelRenderer(this, 168, 101);
      LowerArmR.addBox(-2.5F, 0F, -6F, 5, 10, 11);
      LowerArmR.setRotationPoint(-22F, -2F, 0.5F);
      LowerArmR.setTextureSize(512, 256);
      LowerArmR.mirror = true;
      setRotation(LowerArmR, 0F, 0F, 0.1745329F);
      UpperThumbR = new ModelRenderer(this, 0, 0);
      UpperThumbR.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperThumbR.setRotationPoint(-21.8F, 5.5F, -4.6F);
      UpperThumbR.setTextureSize(512, 256);
      UpperThumbR.mirror = true;
      setRotation(UpperThumbR, 0F, 1.134464F, -1.134464F);
      LowerThumbR = new ModelRenderer(this, 0, 0);
      LowerThumbR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerThumbR.setRotationPoint(-21.4F, 6F, -5.4F);
      LowerThumbR.setTextureSize(512, 256);
      LowerThumbR.mirror = true;
      setRotation(LowerThumbR, 0F, 1.134464F, -1.134464F);
      UpperFingerIndexR = new ModelRenderer(this, 0, 0);
      UpperFingerIndexR.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerIndexR.setRotationPoint(-24F, 7.5F, -4F);
      UpperFingerIndexR.setTextureSize(512, 256);
      UpperFingerIndexR.mirror = true;
      setRotation(UpperFingerIndexR, 0F, 0F, 0F);
      LowerFingerIndexR = new ModelRenderer(this, 0, 0);
      LowerFingerIndexR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerIndexR.setRotationPoint(-24F, 8.5F, -4F);
      LowerFingerIndexR.setTextureSize(512, 256);
      LowerFingerIndexR.mirror = true;
      setRotation(LowerFingerIndexR, 0F, 0F, 0F);
      UpperFingerMiddleR = new ModelRenderer(this, 0, 0);
      UpperFingerMiddleR.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerMiddleR.setRotationPoint(-24F, 7.5F, -1.5F);
      UpperFingerMiddleR.setTextureSize(512, 256);
      UpperFingerMiddleR.mirror = true;
      setRotation(UpperFingerMiddleR, 0F, 0F, 0F);
      LowerFingerMiddleR = new ModelRenderer(this, 0, 0);
      LowerFingerMiddleR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerMiddleR.setRotationPoint(-24F, 8.5F, -1.5F);
      LowerFingerMiddleR.setTextureSize(512, 256);
      LowerFingerMiddleR.mirror = true;
      setRotation(LowerFingerMiddleR, 0F, 0F, 0F);
      UpperFingerRingR = new ModelRenderer(this, 0, 0);
      UpperFingerRingR.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerRingR.setRotationPoint(-24F, 7.5F, 1F);
      UpperFingerRingR.setTextureSize(512, 256);
      UpperFingerRingR.mirror = true;
      setRotation(UpperFingerRingR, 0F, 0F, 0F);
      LowerFingerRingR = new ModelRenderer(this, 0, 0);
      LowerFingerRingR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerRingR.setRotationPoint(-24F, 8.5F, 1F);
      LowerFingerRingR.setTextureSize(512, 256);
      LowerFingerRingR.mirror = true;
      setRotation(LowerFingerRingR, 0F, 0F, 0F);
      UpperFingerPinkyR = new ModelRenderer(this, 0, 0);
      UpperFingerPinkyR.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerPinkyR.setRotationPoint(-24F, 7.5F, 3.5F);
      UpperFingerPinkyR.setTextureSize(512, 256);
      UpperFingerPinkyR.mirror = true;
      setRotation(UpperFingerPinkyR, 0F, 0F, 0F);
      LowerFingerPinkyR = new ModelRenderer(this, 0, 0);
      LowerFingerPinkyR.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerPinkyR.setRotationPoint(-24F, 8.5F, 3.5F);
      LowerFingerPinkyR.setTextureSize(512, 256);
      LowerFingerPinkyR.mirror = true;
      setRotation(LowerFingerPinkyR, 0F, 0F, 0F);
      UpperArmL = new ModelRenderer(this, 168, 123);
      UpperArmL.addBox(-3F, 0F, -6F, 6, 14, 12);
      UpperArmL.setRotationPoint(16.2F, -14F, 0F);
      UpperArmL.setTextureSize(512, 256);
      UpperArmL.mirror = true;
      setRotation(UpperArmL, 0F, 0F, -0.4363323F);
      LowerArmL = new ModelRenderer(this, 168, 101);
      LowerArmL.addBox(-2.5F, 0F, -6F, 5, 10, 11);
      LowerArmL.setRotationPoint(22F, -2F, 0.5F);
      LowerArmL.setTextureSize(512, 256);
      LowerArmL.mirror = true;
      setRotation(LowerArmL, 0F, 0F, -0.1745329F);
      UpperThumbL = new ModelRenderer(this, 0, 0);
      UpperThumbL.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperThumbL.setRotationPoint(21.8F, 5.5F, -4.8F);
      UpperThumbL.setTextureSize(512, 256);
      UpperThumbL.mirror = true;
      setRotation(UpperThumbL, 0F, 2.094395F, -1.134464F);
      LowerThumbL = new ModelRenderer(this, 0, 0);
      LowerThumbL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerThumbL.setRotationPoint(21.4F, 6F, -5.4F);
      LowerThumbL.setTextureSize(512, 256);
      LowerThumbL.mirror = true;
      setRotation(LowerThumbL, 0F, 2.094395F, -1.134464F);
      UpperFingerIndexL = new ModelRenderer(this, 0, 0);
      UpperFingerIndexL.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerIndexL.setRotationPoint(24F, 7.5F, -4F);
      UpperFingerIndexL.setTextureSize(512, 256);
      UpperFingerIndexL.mirror = true;
      setRotation(UpperFingerIndexL, 0F, 0F, 0F);
      LowerFingerIndexL = new ModelRenderer(this, 0, 0);
      LowerFingerIndexL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerIndexL.setRotationPoint(24F, 8.5F, -4F);
      LowerFingerIndexL.setTextureSize(512, 256);
      LowerFingerIndexL.mirror = true;
      setRotation(LowerFingerIndexL, 0F, 0F, 0F);
      UpperFingerMiddleL = new ModelRenderer(this, 0, 0);
      UpperFingerMiddleL.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerMiddleL.setRotationPoint(24F, 7.5F, -1.5F);
      UpperFingerMiddleL.setTextureSize(512, 256);
      UpperFingerMiddleL.mirror = true;
      setRotation(UpperFingerMiddleL, 0F, 0F, 0F);
      LowerFingerMiddleL = new ModelRenderer(this, 0, 0);
      LowerFingerMiddleL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerMiddleL.setRotationPoint(24F, 8.5F, -1.5F);
      LowerFingerMiddleL.setTextureSize(512, 256);
      LowerFingerMiddleL.mirror = true;
      setRotation(LowerFingerMiddleL, 0F, 0F, 0F);
      UpperFingerRingL = new ModelRenderer(this, 0, 0);
      UpperFingerRingL.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerRingL.setRotationPoint(24F, 7.5F, 1F);
      UpperFingerRingL.setTextureSize(512, 256);
      UpperFingerRingL.mirror = true;
      setRotation(UpperFingerRingL, 0F, 0F, 0F);
      LowerFingerRingL = new ModelRenderer(this, 0, 0);
      LowerFingerRingL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerRingL.setRotationPoint(24F, 8.5F, 1F);
      LowerFingerRingL.setTextureSize(512, 256);
      LowerFingerRingL.mirror = true;
      setRotation(LowerFingerRingL, 0F, 0F, 0F);
      UpperFingerPinkyL = new ModelRenderer(this, 0, 0);
      UpperFingerPinkyL.addBox(-1F, 0F, -1F, 2, 2, 2);
      UpperFingerPinkyL.setRotationPoint(24F, 7.5F, 3.5F);
      UpperFingerPinkyL.setTextureSize(512, 256);
      UpperFingerPinkyL.mirror = true;
      setRotation(UpperFingerPinkyL, 0F, 0F, 0F);
      LowerFingerPinkyL = new ModelRenderer(this, 0, 0);
      LowerFingerPinkyL.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
      LowerFingerPinkyL.setRotationPoint(24F, 8.5F, 3.5F);
      LowerFingerPinkyL.setTextureSize(512, 256);
      LowerFingerPinkyL.mirror = true;
      setRotation(LowerFingerPinkyL, 0F, 0F, 0F);
      FootBaseL = new ModelRenderer(this, 115, 131);
      FootBaseL.addBox(-6F, 0F, -9F, 11, 5, 13);
      FootBaseL.setRotationPoint(-11.5F, 19F, 2.3F);
      FootBaseL.setTextureSize(512, 256);
      FootBaseL.mirror = true;
      setRotation(FootBaseL, 0F, 0.3490659F, 0F);
      FootFatL = new ModelRenderer(this, 115, 112);
      FootFatL.addBox(-6F, 0F, -8F, 12, 4, 14);
      FootFatL.setRotationPoint(-12.5F, 19.5F, 1F);
      FootFatL.setTextureSize(512, 256);
      FootFatL.mirror = true;
      setRotation(FootFatL, 0F, 0.3490659F, 0F);
      UpperToeUnoR = new ModelRenderer(this, 59, 43);
      UpperToeUnoR.addBox(-1F, 0F, -1F, 2, 3, 2);
      UpperToeUnoR.setRotationPoint(-11F, 21F, -7.1F);
      UpperToeUnoR.setTextureSize(512, 256);
      UpperToeUnoR.mirror = true;
      setRotation(UpperToeUnoR, -0.8028515F, 0.3490659F, 0F);
      UpperToeMiddleR = new ModelRenderer(this, 59, 43);
      UpperToeMiddleR.addBox(-1F, 0F, -1F, 2, 3, 2);
      UpperToeMiddleR.setRotationPoint(-14.8F, 21F, -5.9F);
      UpperToeMiddleR.setTextureSize(512, 256);
      UpperToeMiddleR.mirror = true;
      setRotation(UpperToeMiddleR, -0.8028515F, 0.3490659F, 0F);
      UpperToePinkyR = new ModelRenderer(this, 59, 43);
      UpperToePinkyR.addBox(-1F, 0F, -1F, 2, 3, 2);
      UpperToePinkyR.setRotationPoint(-18.7F, 21F, -4.3F);
      UpperToePinkyR.setTextureSize(512, 256);
      UpperToePinkyR.mirror = true;
      setRotation(UpperToePinkyR, -0.8028515F, 0.3490659F, 0F);
      FootBaseR = new ModelRenderer(this, 115, 131);
      FootBaseR.addBox(-5F, 0F, -9F, 11, 5, 13);
      FootBaseR.setRotationPoint(11.5F, 19F, 2.3F);
      FootBaseR.setTextureSize(512, 256);
      FootBaseR.mirror = true;
      setRotation(FootBaseR, 0F, -0.3490659F, 0F);
      FootFatR = new ModelRenderer(this, 115, 112);
      FootFatR.addBox(-6F, 0F, -8F, 12, 4, 14);
      FootFatR.setRotationPoint(12.5F, 19.5F, 1F);
      FootFatR.setTextureSize(512, 256);
      FootFatR.mirror = true;
      setRotation(FootFatR, 0F, -0.3490659F, 0F);
      ToeUnoL = new ModelRenderer(this, 59, 43);
      ToeUnoL.addBox(-1F, 0F, -1F, 2, 3, 2);
      ToeUnoL.setRotationPoint(11.2F, 21F, -6.9F);
      ToeUnoL.setTextureSize(512, 256);
      ToeUnoL.mirror = true;
      setRotation(ToeUnoL, -0.8028515F, -0.3490659F, 0F);
      ToeMiddleL = new ModelRenderer(this, 59, 43);
      ToeMiddleL.addBox(-1F, 0F, -1F, 2, 3, 2);
      ToeMiddleL.setRotationPoint(15.1F, 21F, -5.7F);
      ToeMiddleL.setTextureSize(512, 256);
      ToeMiddleL.mirror = true;
      setRotation(ToeMiddleL, -0.8028515F, -0.3490659F, 0F);
      ToePinkyL = new ModelRenderer(this, 59, 43);
      ToePinkyL.addBox(-1F, 0F, -1F, 2, 3, 2);
      ToePinkyL.setRotationPoint(18.8F, 21F, -4.1F);
      ToePinkyL.setTextureSize(512, 256);
      ToePinkyL.mirror = true;
      setRotation(ToePinkyL, -0.8028515F, -0.3490659F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    EarR.render(f5);
    EarthickRR.render(f5);
    EarthickLR.render(f5);
    EarInnerthickR.render(f5);
    EarL.render(f5);
    EarthickLL.render(f5);
    EarthickRL.render(f5);
    EarInnerthickL.render(f5);
    Head.render(f5);
    HeadThick.render(f5);
    HeadWide.render(f5);
    HeadCheek.render(f5);
    ToothR.render(f5);
    ToothL.render(f5);
    BodyBase.render(f5);
    BodyFatWide.render(f5);
    BodyFatThick.render(f5);
    BodyFatBelly.render(f5);
    BodyFatBack.render(f5);
    UpperArmR.render(f5);
    LowerArmR.render(f5);
    UpperThumbR.render(f5);
    LowerThumbR.render(f5);
    UpperFingerIndexR.render(f5);
    LowerFingerIndexR.render(f5);
    UpperFingerMiddleR.render(f5);
    LowerFingerMiddleR.render(f5);
    UpperFingerRingR.render(f5);
    LowerFingerRingR.render(f5);
    UpperFingerPinkyR.render(f5);
    LowerFingerPinkyR.render(f5);
    UpperArmL.render(f5);
    LowerArmL.render(f5);
    UpperThumbL.render(f5);
    LowerThumbL.render(f5);
    UpperFingerIndexL.render(f5);
    LowerFingerIndexL.render(f5);
    UpperFingerMiddleL.render(f5);
    LowerFingerMiddleL.render(f5);
    UpperFingerRingL.render(f5);
    LowerFingerRingL.render(f5);
    UpperFingerPinkyL.render(f5);
    LowerFingerPinkyL.render(f5);
    FootBaseL.render(f5);
    FootFatL.render(f5);
    UpperToeUnoR.render(f5);
    UpperToeMiddleR.render(f5);
    UpperToePinkyR.render(f5);
    FootBaseR.render(f5);
    FootFatR.render(f5);
    ToeUnoL.render(f5);
    ToeMiddleL.render(f5);
    ToePinkyL.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}