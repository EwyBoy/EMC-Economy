package com.ewyboy.emceconomy.Recipes;

import com.ewyboy.emceconomy.EMCItems.ItemLoader;
import com.ewyboy.emceconomy.Util.Logger;
import com.google.common.base.Stopwatch;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.concurrent.TimeUnit;

public class RecipeLoader {

    public static void loadRecipes() {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Loading crafting recipes started");
                GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.EMCWallet,1),"","","",'x',Items.apple);
                Logger.info(ItemLoader.EMCWallet + " recipe successfully loaded");
        Logger.info("Loading crafting recipes finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms )");
    }
}
