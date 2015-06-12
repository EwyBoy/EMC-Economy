package com.ewyboy.emceconomy.EMCBlocks;

import com.ewyboy.emceconomy.Util.Logger;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.util.concurrent.TimeUnit;

public class BlockLoader {

    public static void log(Block block) {Logger.info(block + " successfully loaded");}

    public static Block EMCBank;
    public static Block EMCEnergyBiller;

    public static void loadBlocks() {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Loading blocks started");
                EMCBank = new EMCBank();
                    GameRegistry.registerBlock(EMCBank, "EMCBank");
                        log(EMCBank);
                EMCEnergyBiller = new EMCBiller();
                    GameRegistry.registerBlock(EMCEnergyBiller, "EMCBiller");
                       log(EMCEnergyBiller);
            Logger.info("Loading blocks finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
    }
}
