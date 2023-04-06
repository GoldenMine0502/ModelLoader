package kr.goldenmine.inumodelloader.inumodelloader.block.blocks;

//import kr.goldenmine.inumodelloader.inumodelloader.entity.InuSignTileEntity;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

public class InuStandingSignBlock extends StandingSignBlock {

    private final String signType;

    public InuStandingSignBlock(Properties properties, WoodType type, String signType) {
        super(properties, type);

        this.signType = signType;
    }

    public String getSignType() {
        return signType;
    }


//    @Nullable
//    @Override
//    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
//        return new InuSignTileEntity(signType);
//    }

    // 공중에 뜰 수 있도록 함
//    @Override
//    public boolean isValidPosition(@NotNull BlockState state, @NotNull IWorldReader worldIn, @NotNull BlockPos pos) {
//        return true;
//    }
}
