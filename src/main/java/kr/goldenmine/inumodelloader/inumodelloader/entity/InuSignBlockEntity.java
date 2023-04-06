package kr.goldenmine.inumodelloader.inumodelloader.entity;

//import net.minecraft.tileentity.SignTileEntity;
//import net.minecraft.tileentity.TileEntityType;
//import net.minecraftforge.fml.RegistryObject;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class InuSignBlockEntity extends SignBlockEntity {
//    private final String inuModelType;

    private final String signType;

    private Supplier<BlockEntityType<?>> tileEntityType;

    public InuSignBlockEntity(BlockPos blockPos, BlockState blockState, String signType) {
        super(blockPos, blockState);
        this.signType = signType;
    }

    public String getSignType() {
        return signType;
    }

    @NotNull
    @Override
    public BlockEntityType<?> getType() {
        if(tileEntityType != null && tileEntityType.get() != null) {
            return tileEntityType.get();
        } else {
            return super.getType();
        }
    }

    public void setTileEntityType(RegistryObject<BlockEntityType<InuSignBlockEntity>> sign_tile_entities) {
        this.tileEntityType = sign_tile_entities::get;
    }
}