package com.buuz135.portality.data;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;

public class PortalLinkData {

    private int dimension;
    private BlockPos pos;
    private boolean caller;
    private String name;

    public PortalLinkData(int dimension, BlockPos pos, boolean caller) {
        this(dimension, pos, caller, "");
    }

    public PortalLinkData(int dimension, BlockPos pos, boolean caller, String name) {
        this.dimension = dimension;
        this.pos = pos;
        this.caller = caller;
        this.name = name;
    }

    public static PortalLinkData readFromNBT(NBTTagCompound compound) {
        return new PortalLinkData(compound.getInteger("Dimension"), BlockPos.fromLong(compound.getLong("Position")), compound.getBoolean("Caller"), compound.getString("Name"));
    }

    public int getDimension() {
        return dimension;
    }

    public BlockPos getPos() {
        return pos;
    }

    public boolean isCaller() {
        return caller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NBTTagCompound writeToNBT() {
        NBTTagCompound tagCompound = new NBTTagCompound();
        tagCompound.setInteger("Dimension", dimension);
        tagCompound.setLong("Position", pos.toLong());
        tagCompound.setBoolean("Caller", caller);
        tagCompound.setString("Name", name);
        return tagCompound;
    }

    public enum PortalCallType {
        NORMAL,
        SINGLE,
        FORCE;
    }
}
