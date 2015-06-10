package com.ewyboy.emceconomy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EMCCreativeTab {

    public static CreativeTabs EMCEconomyTab = new CreativeTabs("EMC Economy") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Blocks.anvil);
        }
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };
}
