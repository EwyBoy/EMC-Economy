package com.ewyboy.emceconomy.Core;

import com.ewyboy.emceconomy.Commands.CommandPayPlayer;
import com.ewyboy.emceconomy.Commands.EMCCommandBase;
import com.ewyboy.emceconomy.EMCBlocks.BlockLoader;
import com.ewyboy.emceconomy.EMCItems.ItemLoader;
import com.ewyboy.emceconomy.EMCTileEntity.TileEntityLoader;
import com.ewyboy.emceconomy.Files.Config;
import com.ewyboy.emceconomy.Recipes.RecipeLoader;
import com.ewyboy.emceconomy.Util.Logger;
import com.ewyboy.emceconomy.Proxys.IProxy;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;

import java.util.concurrent.TimeUnit;

@Mod (
    modid = EMCEconomy.ModID,
    acceptedMinecraftVersions = "[1.7.10]",
    name = EMCEconomy.ModName ,
    version = EMCEconomy.ModVersion,
    dependencies = EMCEconomy.ModDependencies
)

public final class EMCEconomy {

    public static final String ModID = "EMCEconomy";
    public static final String ModName = "EMC-Economy";
    public static final String ModDependencies = "after:EE3";
    public static final String ModVersion = "@version@";

    public static EMCEconomy instance;

    public EMCEconomy() {
        instance = this;
    }

    @SidedProxy (
       modId = ModID,
       clientSide = "com.ewyboy.emceconomy.Proxys.ClientProxy",
       serverSide = "com.ewyboy.emceconomy.Proxys.CommonProxy"
    )
    public static IProxy proxy;

    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        Logger.warn("STARTING TO LOAD EMC-ECONOMY ON THE SERVER");
        if (Loader.isModLoaded("EE3")) {
            Stopwatch watch = Stopwatch.createStarted();
                Logger.info("Loading commands started");
                    MinecraftServer server = MinecraftServer.getServer();
                    ICommandManager command = server.getCommandManager();
                    ServerCommandManager manager = (ServerCommandManager) command;
                    manager.registerCommand(new EMCCommandBase());
                Logger.info("Commands successfully loaded after + " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        } else {
            Logger.info("EE3 not found. Download it at http://minecraft.curseforge.com/mc-mods/65509-ee3");
        }

    }

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event) {
        Logger.warn("STARTING TO LOAD EMC-ECONOMY");
        if (Loader.isModLoaded("EE3")) {
            Logger.info("EE3 found");
            Logger.info("Initialization process starting...");
            Stopwatch watch = Stopwatch.createStarted();
                Logger.info("PreInitialization started");
                    Config.init(event.getSuggestedConfigurationFile());
                    BlockLoader.loadBlocks();
                    ItemLoader.loadItems();
                    TileEntityLoader.loadTileEntitys();
                    RecipeLoader.loadRecipes();
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
                    proxy.initRenderingAndTextures();
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
                Logger.info("Initialization process successfully done");
        } else {
            Logger.info("EE3 not found. Download it at http://minecraft.curseforge.com/mc-mods/65509-ee3");
        }
    }
}
