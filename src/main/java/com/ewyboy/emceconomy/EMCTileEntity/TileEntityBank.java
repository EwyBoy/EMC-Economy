package com.ewyboy.emceconomy.EMCTileEntity;

import com.pahimar.ee3.tileentity.TileEntityEE;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class TileEntityBank extends TileEntityEE implements IInventory {

    public static final int INVENTORY_SIZE = 2;
    public static final int ITEM_SLOT_INVENTORY_INDEX = 0;
    public static final int TOME_SLOT_INVENTORY_INDEX = 1;
    public int itemLearnTime;
    public boolean isItemKnown;
    private ItemStack[] inventory = new ItemStack[2];

    public TileEntityBank() {
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int i, int i1) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack stack) {

    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return false;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack stack) {
        return false;
    }
}
