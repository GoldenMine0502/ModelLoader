package kr.goldenmine.inumodelloader.inumodelloader.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class OneByThreeHorizontalBlock extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE_N = java.util.Optional.of(Block.makeCuboidShape(-16, 0, 0, 32, 16, 16)).get();

    private static final VoxelShape SHAPE_W = java.util.Optional.of(Block.makeCuboidShape(0, 0, -16, 16, 16, 32)).get();

    public OneByThreeHorizontalBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
            case SOUTH:
            default:
                return SHAPE_N;
            case WEST:
            case EAST:
                return SHAPE_W;
        }
    }
}
