package com.buuz135.portality.tile;

import com.hrznstudio.titanium.block.BlockTileBase;
import com.hrznstudio.titanium.block.tile.TileBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;

public class TileFrame extends TileBase {

    private BlockPos controllerPos;

    public TileFrame(BlockTileBase base) {
        super(base);
    }

    @Override
    public NBTTagCompound write(NBTTagCompound compound) {
        compound = super.write(compound);
        if (controllerPos != null) {
            compound.setInt("X", controllerPos.getX());
            compound.setInt("Y", controllerPos.getY());
            compound.setInt("Z", controllerPos.getZ());
        }
        return compound;
    }

    @Override
    public void read(NBTTagCompound compound) {
        super.read(compound);
        if (compound.hasKey("X")) {
            controllerPos = new BlockPos(compound.getInt("X"), compound.getInt("Y"), compound.getInt("Z"));
        }
    }

    public BlockPos getControllerPos() {
        return controllerPos;
    }

    public void setControllerPos(BlockPos controllerPos) {
        this.controllerPos = controllerPos;
    }
}