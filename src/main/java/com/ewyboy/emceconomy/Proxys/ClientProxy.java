package com.ewyboy.emceconomy.Proxys;

import com.ewyboy.emceconomy.EMCTileEntity.TileEntityBank;
import com.ewyboy.emceconomy.Util.Logger;
import com.ewyboy.emceconomy.Util.RenderIDs;
import com.ewyboy.emceconomy.Rendering.Renderer.EMCBankRenderer;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

import java.util.concurrent.TimeUnit;

public class ClientProxy extends CommonProxy {

    public void initRenderingAndTextures() {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Loading models started");
                RenderIDs.EMCBank = RenderingRegistry.getNextAvailableRenderId();
                ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBank.class, new EMCBankRenderer());
                    Logger.info("EMCBank model successfully bound to EMCBank block");
                RenderIDs.EMCEnergyBiller = RenderingRegistry.getNextAvailableRenderId();
            Logger.info("Loading models finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
    }

    public ClientProxy getClientProxy() {
        return this;
    }
}
