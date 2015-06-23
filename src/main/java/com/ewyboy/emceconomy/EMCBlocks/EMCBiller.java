package com.ewyboy.emceconomy.EMCBlocks;

import com.ewyboy.emceconomy.EMCTileEntity.TileEntityEnergyBiller;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class EMCBiller extends BlockBase implements ITileEntityProvider {

    public EMCBiller() {
        super(Material.iron);
        setBlockName("EMC Energy Payer");
        setHardness(2.0f);
        setStepSound(soundTypeStone);
    }

    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
        return -1;
    }

    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityEnergyBiller();
    }
}
