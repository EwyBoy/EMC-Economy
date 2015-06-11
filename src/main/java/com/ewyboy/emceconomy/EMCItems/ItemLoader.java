package com.ewyboy.emceconomy.EMCItems;

import com.ewyboy.emceconomy.Util.Logger;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.concurrent.TimeUnit;

public class ItemLoader {

    public static void log(Item item) {Logger.info(item + " successfully loaded");}

    public static Item EMCWallet;

    public static void loadItems() {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Loading items started");
                EMCWallet = new EMCWallet();
                GameRegistry.registerItem(EMCWallet, "EMCWallet");
                log(EMCWallet);
            Logger.info("Loading items finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
    }
}
