package com.ewyboy.emceconomy.Rendering.Renderer;

import com.ewyboy.emceconomy.Rendering.Models.EMCBankModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class EMCBankRenderer extends TileEntitySpecialRenderer {

    private final EMCBankModel model;

    public EMCBankRenderer() {
        this.model = new EMCBankModel();
    }

    @Override
    public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
            GL11.glScalef(1.0f,1.0f,1.0f);
            GL11.glTranslated(x, y, z);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();

    }
}
