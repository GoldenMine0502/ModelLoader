package kr.goldenmine.inumodelloader.inumodelloader.properties;

import net.minecraft.util.IStringSerializable;
import org.jetbrains.annotations.NotNull;

public enum TripleBlockPart implements IStringSerializable  {
    UPPER,
    MIDDLE,
    LOWER;

    public String toString() { return this.getString(); }

    @NotNull
    @Override
    public String getString() {
        return this == UPPER ? "upper" : this == MIDDLE ? "middle" : "lower";
    }
}