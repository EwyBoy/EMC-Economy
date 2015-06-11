package com.ewyboy.emceconomy.EMCItems;

import com.ewyboy.emceconomy.Util.EMCCreativeTab;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        this.maxStackSize = 1;
        this.setCreativeTab(EMCCreativeTab.EMCEconomyTab);
        this.setNoRepair();
    }
}
