package com.ewyboy.emceconomy.EMCBlocks;

import com.ewyboy.emceconomy.EMCCreativeTab;
import com.pahimar.ee3.tileentity.TileEntityEE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class BlockBase extends Block {

    public BlockBase() {
        this(Material.rock);
    }

    public BlockBase(Material material) {
        super(material);
        setCreativeTab(EMCCreativeTab.EMCEconomyTab);
    }
    
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        this.dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, block, meta);
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack) {
        super.onBlockPlacedBy(world, x, y, z, entityLiving, itemStack);
        if(world.getTileEntity(x, y, z) instanceof TileEntityEE) {
            int direction = 0;
            int facing = MathHelper.floor_double((double) (entityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
            if(facing == 0) {
                direction = ForgeDirection.NORTH.ordinal();
            } else if(facing == 1) {
                direction = ForgeDirection.EAST.ordinal();
            } else if(facing == 2) {
                direction = ForgeDirection.SOUTH.ordinal();
            } else if(facing == 3) {
                direction = ForgeDirection.WEST.ordinal();
            }

            if(itemStack.hasDisplayName()) {
                ((TileEntityEE)world.getTileEntity(x, y, z)).setCustomName(itemStack.getDisplayName());
            }
            ((TileEntityEE)world.getTileEntity(x, y, z)).setOrientation(direction);
        }
    }

    protected void dropInventory(World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity instanceof IInventory) {
            IInventory inventory = (IInventory)tileEntity;

            for(int i = 0; i < inventory.getSizeInventory(); ++i) {
                ItemStack itemStack = inventory.getStackInSlot(i);
                if(itemStack != null && itemStack.stackSize > 0) {
                    Random rand = new Random();
                    float dX = rand.nextFloat() * 0.8F + 0.1F;
                    float dY = rand.nextFloat() * 0.8F + 0.1F;
                    float dZ = rand.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityItem = new EntityItem(world, (double)((float)x + dX), (double)((float)y + dY), (double)((float)z + dZ), itemStack.copy());
                    if(itemStack.hasTagCompound()) {
                        entityItem.getEntityItem().setTagCompound((NBTTagCompound)itemStack.getTagCompound().copy());
                    }

                    float factor = 0.05F;
                    entityItem.motionX = rand.nextGaussian() * (double)factor;
                    entityItem.motionY = rand.nextGaussian() * (double)factor + 0.20000000298023224D;
                    entityItem.motionZ = rand.nextGaussian() * (double)factor;
                    world.spawnEntityInWorld(entityItem);
                    itemStack.stackSize = 0;
                }
            }

        }
    }
}
