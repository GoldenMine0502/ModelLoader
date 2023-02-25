package kr.goldenmine.inumodelloader.inumodelloader.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class InuSignItem extends SignItem {
    public InuSignItem(Properties propertiesIn, Block floorBlockIn, Block wallBlockIn) {
        super(propertiesIn, floorBlockIn, wallBlockIn);
    }

    @Override
    protected boolean onBlockPlaced(@NotNull BlockPos pos, @NotNull World worldIn, @Nullable PlayerEntity player, @NotNull ItemStack stack, @NotNull BlockState state) {

//        if (!worldIn.isRemote && !flag && player != null) { // 이로써 GUI가 열리지 않음
//            player.openSignEditor((SignTileEntity)worldIn.getTileEntity(pos));
//        }

        return setTileEntityNBT(worldIn, player, pos, stack);
    }
}
