package kr.goldenmine.inumodelloader.inumodelloader.entity;

import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class InuSignTileEntity extends SignTileEntity {
//    private final String inuModelType;

    private final String signType;

    private Supplier<TileEntityType<?>> tileEntityType;

    public InuSignTileEntity(String signType) {
        this.signType = signType;
    }

    public String getSignType() {
        return signType;
    }

    @NotNull
    @Override
    public TileEntityType<?> getType() {
        if(tileEntityType != null && tileEntityType.get() != null) {
            return tileEntityType.get();
        } else {
            return super.getType();
        }
    }

    public void setTileEntityType(RegistryObject<TileEntityType<InuSignTileEntity>> sign_tile_entities) {
        this.tileEntityType = sign_tile_entities::get;
    }
}