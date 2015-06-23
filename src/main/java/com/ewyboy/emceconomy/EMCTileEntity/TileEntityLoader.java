package com.ewyboy.emceconomy.EMCTileEntity;

import com.ewyboy.emceconomy.Util.Logger;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

import java.util.concurrent.TimeUnit;

public class TileEntityLoader {

    public static void log(TileEntity entity) {Logger.info(entity + " successfully loaded");}

    public static TileEntity EMCBankTileEntity;
    public static TileEntity EMCBillerTileEntity;

    public static void loadTileEntitys() {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Loading tile entities started");
                EMCBankTileEntity = new TileEntityBank();
                EMCBillerTileEntity = new TileEntityEnergyBiller();
                GameRegistry.registerTileEntity(TileEntityBank.class, "TileEntityEMCBank");
                GameRegistry.registerTileEntity(TileEntityEnergyBiller.class, "TileEntityEMCBiller");
            Logger.info("Loading tile entities finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
    }

}
