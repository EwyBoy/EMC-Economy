package com.ewyboy.emceconomy.EMCBlocks;

import net.minecraft.block.material.Material;

public class EMCEnergyBiller extends EMCBaseBlock {

    public EMCEnergyBiller() {
        super(Material.iron);
        setBlockName("EMC Energy Payer");
        setHardness(2.0f);
        setStepSound(soundTypeStone);
    }
}
