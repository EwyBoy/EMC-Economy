package com.ewyboy.emceconomy.EMCItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;

public class EMCWallet extends ItemBase {

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public EMCWallet() {
        this.setUnlocalizedName("EMCWallet");
    }
}
