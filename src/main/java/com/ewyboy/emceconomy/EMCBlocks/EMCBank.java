package com.ewyboy.emceconomy.EMCBlocks;

import net.minecraft.block.material.Material;

public class EMCBank extends EMCBaseBlock {

    public EMCBank() {
        super(Material.iron);
        setBlockName("EMC-Bank");
        setHardness(2.0f);
        setStepSound(soundTypeStone);
    }
}
