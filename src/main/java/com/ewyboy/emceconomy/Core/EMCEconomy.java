package com.ewyboy.emceconomy.Core;

import com.ewyboy.emceconomy.EMCBlocks.BlockLoader;
import com.ewyboy.emceconomy.Files.Config;
import com.ewyboy.emceconomy.Logger;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

import java.util.concurrent.TimeUnit;

@Mod(modid = EMCEconomy.ModID, acceptedMinecraftVersions = "[1.7.10]", name = EMCEconomy.ModName , version = EMCEconomy.ModVersion, dependencies = EMCEconomy.ModDependencies)
public final class EMCEconomy {

    public static final String ModID = "EMCEconomy";
    public static final String ModName = "EMC-Economy";
    public static final String ModDependencies = "after:EE3";
    public static final String ModVersion = "@version@";

    public static EMCEconomy instance;

    public EMCEconomy() {
        instance = this;
    }

    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {}

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event) {
        if (Loader.isModLoaded("EE3")) {
            Logger.info("EE3 found");
            Logger.info("Initialization process starting...");
            Stopwatch watch = Stopwatch.createStarted();
                Logger.info("PreInitialization started");
                    Config.init(event.getSuggestedConfigurationFile());
                    BlockLoader.init();
                Logger.info("PreInitialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
        } else {
            Logger.info("EE3 not found. Download it at http://minecraft.curseforge.com/mc-mods/65509-ee3");
        }
    }

    @Mod.EventHandler
    void init(FMLInitializationEvent event) {
        if (Loader.isModLoaded("EE3")) {
            Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Initialization started");

            Logger.info("Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
        } else {
            Logger.info("EE3 not found. Download it at http://minecraft.curseforge.com/mc-mods/65509-ee3");
        }
    }

    @Mod.EventHandler
    void postInit(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("EE3")) {
            Stopwatch watch = Stopwatch.createStarted();
                Logger.info("PostInitialization started");

                Logger.info("PostInitialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
        } else {
            Logger.info("EE3 not found. Download it at http://minecraft.curseforge.com/mc-mods/65509-ee3");
        }
    }
}
