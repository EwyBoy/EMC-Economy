package com.ewyboy.emceconomy.Proxys;

import com.ewyboy.emceconomy.EMCTileEntity.TileEntityBank;
import com.ewyboy.emceconomy.RenderIDs;
import com.ewyboy.emceconomy.Rendering.Renderer.EMCBankRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public void initRenderingAndTextures() {
        RenderIDs.EMCBank = RenderingRegistry.getNextAvailableRenderId();
        RenderIDs.EMCEnergyBiller = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBank.class, new EMCBankRenderer());
    }
}
