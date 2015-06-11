package com.ewyboy.emceconomy.EMCBlocks;

import com.ewyboy.emceconomy.EMCTileEntity.TileEntityBank;
import com.ewyboy.emceconomy.Util.RenderIDs;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class EMCBank extends BlockBase implements ITileEntityProvider {

    public EMCBank() {
        super(Material.iron);
        setBlockName("EMC-Bank");
        setHardness(2.0f);
        setStepSound(soundTypeStone);
    }

    public TileEntity createNewTileEntity(World world, int metaData) {
        return new TileEntityBank();
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public int getRenderType() {
        return RenderIDs.EMCBank;
    }
}
