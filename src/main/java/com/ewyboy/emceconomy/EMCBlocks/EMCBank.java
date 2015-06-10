package com.ewyboy.emceconomy.EMCBlocks;

import com.pahimar.ee3.block.BlockTransmutationTablet;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EMCBank extends Block {

    public EMCBank( ) {
        super(Material.iron);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        if(world.getBlock(x,y+1,z) instanceof BlockTransmutationTablet) {

        }
    }
}
