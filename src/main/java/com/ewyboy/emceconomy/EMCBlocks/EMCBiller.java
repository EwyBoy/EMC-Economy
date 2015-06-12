package com.ewyboy.emceconomy.EMCBlocks;

import net.minecraft.block.material.Material;

public class EMCBiller extends BlockBase {

    public EMCBiller() {
        super(Material.iron);
        setBlockName("EMC Energy Payer");
        setHardness(2.0f);
        setStepSound(soundTypeStone);
    }
}
