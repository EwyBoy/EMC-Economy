package com.ewyboy.emceconomy.Rendering.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EMCBillerModel extends ModelBase {

    public ModelRenderer shape1;
    public ModelRenderer shape3;
    public ModelRenderer shape3_1;
    public ModelRenderer shape3_2;
    public ModelRenderer shape3_3;
    public ModelRenderer shape8;
    public ModelRenderer shape8_1;
    public ModelRenderer shape8_2;
    public ModelRenderer shape8_3;
    public ModelRenderer shape8_4;
    public ModelRenderer shape8_5;
    public ModelRenderer shape8_6;
    public ModelRenderer shape8_7;

    public EMCBillerModel() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape8_2 = new ModelRenderer(this, 0, 42);
        this.shape8_2.setRotationPoint(0.0F, 23.5F, -7.5F);
        this.shape8_2.addBox(-7.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F);
        this.shape3 = new ModelRenderer(this, 60, 0);
        this.shape3.setRotationPoint(-7.5F, 16.0F, 7.5F);
        this.shape3.addBox(-0.5F, -8.0F, -0.5F, 1, 16, 1, 0.0F);
        this.shape3_3 = new ModelRenderer(this, 60, 0);
        this.shape3_3.setRotationPoint(7.5F, 16.0F, 7.5F);
        this.shape3_3.addBox(-0.5F, -8.0F, -0.5F, 1, 16, 1, 0.0F);
        this.shape8_6 = new ModelRenderer(this, 0, 42);
        this.shape8_6.setRotationPoint(0.0F, 8.5F, -7.5F);
        this.shape8_6.addBox(-7.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F);
        this.shape3_2 = new ModelRenderer(this, 60, 0);
        this.shape3_2.setRotationPoint(7.5F, 16.0F, -7.5F);
        this.shape3_2.addBox(-0.5F, -8.0F, -0.5F, 1, 16, 1, 0.0F);
        this.shape8_7 = new ModelRenderer(this, 0, 28);
        this.shape8_7.setRotationPoint(7.5F, 8.5F, 0.0F);
        this.shape8_7.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 14, 0.0F);
        this.shape8_3 = new ModelRenderer(this, 0, 28);
        this.shape8_3.setRotationPoint(7.5F, 23.5F, 0.0F);
        this.shape8_3.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 14, 0.0F);
        this.shape8 = new ModelRenderer(this, 0, 28);
        this.shape8.setRotationPoint(-7.5F, 23.5F, 0.0F);
        this.shape8.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 14, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.shape1.addBox(-7.0F, -7.0F, -7.0F, 14, 14, 14, 0.0F);
        this.shape8_4 = new ModelRenderer(this, 0, 28);
        this.shape8_4.setRotationPoint(-7.5F, 8.5F, 0.0F);
        this.shape8_4.addBox(-0.5F, -0.5F, -7.0F, 1, 1, 14, 0.0F);
        this.shape8_1 = new ModelRenderer(this, 0, 42);
        this.shape8_1.setRotationPoint(0.0F, 23.5F, 7.5F);
        this.shape8_1.addBox(-7.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F);
        this.shape8_5 = new ModelRenderer(this, 0, 42);
        this.shape8_5.setRotationPoint(0.0F, 8.5F, 7.5F);
        this.shape8_5.addBox(-7.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F);
        this.shape3_1 = new ModelRenderer(this, 60, 0);
        this.shape3_1.setRotationPoint(-7.5F, 16.0F, -7.5F);
        this.shape3_1.addBox(-0.5F, -8.0F, -0.5F, 1, 16, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape8_2.render(f5);
        this.shape3.render(f5);
        this.shape3_3.render(f5);
        this.shape8_6.render(f5);
        this.shape3_2.render(f5);
        this.shape8_7.render(f5);
        this.shape8_3.render(f5);
        this.shape8.render(f5);
        this.shape1.render(f5);
        this.shape8_4.render(f5);
        this.shape8_1.render(f5);
        this.shape8_5.render(f5);
        this.shape3_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
