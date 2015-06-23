package com.ewyboy.emceconomy.Rendering.Renderer;

import com.ewyboy.emceconomy.Rendering.Models.EMCBillerModel;
import com.pahimar.ee3.util.ResourceLocationHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EMCBillerRenderer extends TileEntitySpecialRenderer {

    private final EMCBillerModel model;
    private static final ResourceLocation EMCBillerTexture = ResourceLocationHelper.getResourceLocation("textures/models/EMCBiller.png");

    public EMCBillerRenderer() {
        this.model = new EMCBillerModel();
    }

    @Override
    public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float scale) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);

            this.bindTexture(EMCBillerTexture);
                GL11.glPushMatrix();
                    GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
                    this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
                GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
