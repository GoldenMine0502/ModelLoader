package kr.goldenmine.inumodelloader.inumodelloader.block.blocks;

//import kr.goldenmine.inumodelloader.inumodelloader.entity.InuSignTileEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

// https://github.com/Myrathi/FlatSignsEx
public class InuWallSignBlock extends WallSignBlock {

    private final String signType;

    public InuWallSignBlock(Properties properties, WoodType type, String signType) {
        super(properties, type);

        this.signType = signType;
    }

    public String getSignType() {
        return signType;
    }

    @Override
    public boolean isValidSpawn(BlockState state, BlockGetter level, BlockPos pos, SpawnPlacements.Type type, EntityType<?> entityType) {
        return true;
    }



    //    @Override
//    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
//        return new InuSignBlockEntity(signType);
//    }
//
//    // 공중에 뜨도록 함
//    @Override
//    public boolean isValidPosition(@NotNull BlockState state, @NotNull IWorldReader worldIn, @NotNull BlockPos pos) {
//        return true;
//    }
}