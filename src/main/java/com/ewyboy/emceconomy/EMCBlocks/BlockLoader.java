package com.ewyboy.emceconomy.EMCBlocks;

import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.util.concurrent.TimeUnit;

public class BlockLoader {

    public static void init() {
        loadBlocks();
    }

    public static void log(Block block) {System.out.println(block + " successfully loaded");}

    public static Block EMCBank;
    public static Block EMCEnergyBiller;

    public static void loadBlocks() {
        Stopwatch watch = Stopwatch.createStarted();
            System.out.println("Loading blocks started");
                EMCBank = new EMCBank();
                    GameRegistry.registerBlock(EMCBank, "EMCBank");
                        log(EMCBank);
                EMCEnergyBiller = new EMCEnergyBiller();
                    GameRegistry.registerBlock(EMCEnergyBiller, "EMCEnergyBiller");
                       log(EMCEnergyBiller);
            System.out.println("Loading blocks finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
    }
}
