package com.ewyboy.emceconomy.EMCBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockLoader {

    public static void init() {
        registerBlocks();
    }

    public static Block EMCBank;
    public static Block EMCEnergyBiller;

    public static void registerBlocks() {
        EMCBank = new EMCBank();
        EMCEnergyBiller = new EMCEnergyBiller();

        GameRegistry.registerBlock(EMCBank, "EMCBank");
        GameRegistry.registerBlock(EMCEnergyBiller, "EMCEnergyBiller");
    }
}
