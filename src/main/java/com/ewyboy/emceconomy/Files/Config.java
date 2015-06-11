package com.ewyboy.emceconomy.Files;

import com.ewyboy.emceconomy.Core.EMCEconomy;
import com.ewyboy.emceconomy.Util.Logger;
import com.google.common.base.Stopwatch;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Config {

    public static int configPlaceholderName;

    public static void init (File file) {

        Configuration config = new Configuration(file);

        config.load();
            Stopwatch watch = Stopwatch.createStarted();
                Logger.info("Loading configs from " + EMCEconomy.ModName);

                Logger.info("Loading all configs successfully was done after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
        config.save();
    }
}
