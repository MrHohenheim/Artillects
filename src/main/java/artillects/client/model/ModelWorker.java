// Date: 12/16/2013 4:50:34 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package artillects.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWorker extends ModelArtillect
{
	// fields
	ModelRenderer FootRight;
	ModelRenderer Top;
	ModelRenderer Bottom;
	ModelRenderer ToolSlot;
	ModelRenderer FootLeft;
	ModelRenderer UpperLegLeft;
	ModelRenderer UpperLegRight;
	ModelRenderer AntenBottom;
	ModelRenderer AntenTop;
	ModelRenderer LowerLegLeft;
	ModelRenderer LowerLegRight;
	ModelRenderer MiddleBody;
	ModelRenderer Tool_Connector;

	public ModelWorker()
	{
		textureWidth = 128;
		textureHeight = 32;

		FootRight = new ModelRenderer(this, 41, 16);
		FootRight.addBox(-3F, 0F, -2F, 4, 2, 4);
		FootRight.setRotationPoint(7F, 22F, -3.5F);
		FootRight.setTextureSize(128, 32);
		FootRight.mirror = true;
		setRotation(FootRight, 0F, 0F, 0F);
		Top = new ModelRenderer(this, 0, 16);
		Top.addBox(0F, 0F, 0F, 10, 1, 10);
		Top.setRotationPoint(-5F, 12F, -5F);
		Top.setTextureSize(128, 32);
		Top.mirror = true;
		setRotation(Top, 0F, 0F, 0F);
		Bottom = new ModelRenderer(this, 0, 16);
		Bottom.addBox(0F, 0F, 0F, 10, 1, 10);
		Bottom.setRotationPoint(-5F, 15F, -5F);
		Bottom.setTextureSize(128, 32);
		Bottom.mirror = true;
		setRotation(Bottom, 0F, 0F, 0F);
		ToolSlot = new ModelRenderer(this, 53, 0);
		ToolSlot.addBox(-2.5F, -3F, -0.5F, 5, 5, 1);
		ToolSlot.setRotationPoint(0F, 14.5F, -9.5F);
		ToolSlot.setTextureSize(128, 32);
		ToolSlot.mirror = true;
		setRotation(ToolSlot, 0F, 0F, 0F);
		FootLeft = new ModelRenderer(this, 41, 16);
		FootLeft.addBox(-1F, 0F, -2F, 4, 2, 4);
		FootLeft.setRotationPoint(-7F, 22F, -3.5F);
		FootLeft.setTextureSize(128, 32);
		FootLeft.mirror = true;
		setRotation(FootLeft, 0F, 0F, 0F);
		UpperLegLeft = new ModelRenderer(this, 53, 7);
		UpperLegLeft.addBox(-1F, -1F, -1F, 2, 6, 2);
		UpperLegLeft.setRotationPoint(-6.5F, 14.5F, -0.5F);
		UpperLegLeft.setTextureSize(128, 32);
		UpperLegLeft.mirror = true;
		setRotation(UpperLegLeft, 0F, 0F, 0F);
		UpperLegRight = new ModelRenderer(this, 53, 7);
		UpperLegRight.addBox(-1F, -1F, -1F, 2, 6, 2);
		UpperLegRight.setRotationPoint(6.522222F, 14.5F, -0.5F);
		UpperLegRight.setTextureSize(128, 32);
		UpperLegRight.mirror = true;
		setRotation(UpperLegRight, 0F, 0F, 0F);
		AntenBottom = new ModelRenderer(this, 41, 23);
		AntenBottom.addBox(0F, 0F, 0F, 2, 2, 2);
		AntenBottom.setRotationPoint(-4F, 10F, -4F);
		AntenBottom.setTextureSize(128, 32);
		AntenBottom.mirror = true;
		setRotation(AntenBottom, 0F, 0F, 0F);
		AntenTop = new ModelRenderer(this, 58, 16);
		AntenTop.addBox(0F, 0F, 0F, 1, 5, 1);
		AntenTop.setRotationPoint(-3.5F, 5F, -3.5F);
		AntenTop.setTextureSize(128, 32);
		AntenTop.mirror = true;
		setRotation(AntenTop, 0F, 0F, 0F);
		LowerLegLeft = new ModelRenderer(this, 66, 0);
		LowerLegLeft.addBox(-1F, -3F, -1F, 3, 7, 2);
		LowerLegLeft.setRotationPoint(-7.022222F, 20F, -0.5F);
		LowerLegLeft.setTextureSize(128, 32);
		LowerLegLeft.mirror = true;
		setRotation(LowerLegLeft, -0.9666439F, 0F, 0F);
		LowerLegRight = new ModelRenderer(this, 66, 0);
		LowerLegRight.addBox(-1F, -3F, -1F, 3, 7, 2);
		LowerLegRight.setRotationPoint(6F, 20F, -0.5F);
		LowerLegRight.setTextureSize(128, 32);
		LowerLegRight.mirror = true;
		setRotation(LowerLegRight, -0.9666439F, 0F, 0F);
		MiddleBody = new ModelRenderer(this, 0, 0);
		MiddleBody.addBox(0F, 0F, 0F, 13, 2, 13);
		MiddleBody.setRotationPoint(-6.5F, 13F, -6.5F);
		MiddleBody.setTextureSize(128, 32);
		MiddleBody.mirror = true;
		setRotation(MiddleBody, 0F, 0F, 0F);
		Tool_Connector = new ModelRenderer(this, 66, 10);
		Tool_Connector.addBox(0F, 0F, 0F, 2, 2, 3);
		Tool_Connector.setRotationPoint(-1F, 13.5F, -9F);
		Tool_Connector.setTextureSize(128, 32);
		Tool_Connector.mirror = true;
		setRotation(Tool_Connector, 0F, 0F, 0F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.render(par7);
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{

	}

	@Override
	public void render(float f5)
	{
		FootRight.render(f5);
		Top.render(f5);
		Bottom.render(f5);
		ToolSlot.render(f5);
		FootLeft.render(f5);
		UpperLegLeft.render(f5);
		UpperLegRight.render(f5);
		AntenBottom.render(f5);
		AntenTop.render(f5);
		LowerLegLeft.render(f5);
		LowerLegRight.render(f5);
		MiddleBody.render(f5);
		Tool_Connector.render(f5);
	}

}
