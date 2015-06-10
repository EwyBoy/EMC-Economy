package com.ewyboy.emceconomy.Files;

import com.ewyboy.emceconomy.Core.EMCEconomy;
import com.google.common.base.Stopwatch;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Config {

    public static int configName;

    public static void init (File file) {

        Configuration config = new Configuration(file);

        config.load();
            Stopwatch watch = Stopwatch.createStarted();
                System.out.println("Loading configs from " + EMCEconomy.ModName);

                System.out.println("Loading all configs successfully was done after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
        config.save();
    }
}
