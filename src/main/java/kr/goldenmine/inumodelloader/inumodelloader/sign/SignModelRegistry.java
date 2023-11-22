package kr.goldenmine.inumodelloader.inumodelloader.sign;

import kr.goldenmine.inumodelloader.inumodelloader.INUModelLoader;
import kr.goldenmine.inumodelloader.inumodelloader.block.blocks.InuStandingSignBlock;
import kr.goldenmine.inumodelloader.inumodelloader.block.blocks.InuWallSignBlock;
import kr.goldenmine.inumodelloader.inumodelloader.entity.InuSignBlockEntity;
import kr.goldenmine.inumodelloader.inumodelloader.item.InuSignItem;
import kr.goldenmine.inumodelloader.inumodelloader.item.ModItemGroup;
import kr.goldenmine.inumodelloader.inumodelloader.render.InuSignTileEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SignModelRegistry {
    public static DeferredRegister<Block> SIGN_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, INUModelLoader.MOD_ID);
    public static DeferredRegister<Item> SIGN_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, INUModelLoader.MOD_ID);
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, INUModelLoader.MOD_ID);

    private static final List<SignModelRegistry> registryList = new ArrayList<SignModelRegistry>();

    private final RegistryObject<Block> blockSign;
    private final RegistryObject<Block> blockWallSign;
    private final RegistryObject<Item> itemSign;
    private final RegistryObject<BlockEntityType<InuSignBlockEntity>> tileEntity;

    private final String type;

    private static final List<String> registeredTypes = new ArrayList<>();

    public SignModelRegistry(String type, WoodType texture) {
        this.type = type;

        String signFolder = "signs/";

        blockSign = SIGN_BLOCKS.register(signFolder + "inu_sign_" + type,
                () -> new InuStandingSignBlock(AbstractBlock.Properties.create(Material.IRON).doesNotBlockMovement(), texture, type) {
                    @Nullable
                    @Override
                    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
                        return SignModelRegistry.this.createBlockEntity(blockPos, blockState);
                    }
                });

        blockWallSign = SIGN_BLOCKS.register(signFolder + "inu_wall_sign_" + type,
                () -> new InuWallSignBlock(AbstractBlock.Properties.create(Material.IRON).doesNotBlockMovement(), texture, type) {
                    @Override
                    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
                        return SignModelRegistry.this.createBlockEntity(blockPos, blockState);
                    }
                });

        itemSign = SIGN_ITEMS.register(signFolder + "inu_sign_" + type,
                () -> new InuSignItem(new Item.Properties().maxStackSize(1).group(ModItemGroup.INU_SIGNS_TAB), blockSign.get(), blockWallSign.get()));

        tileEntity =
                TILE_ENTITIES.register(signFolder + "inu_sign_" + type, () -> TileEntityType.Builder.create(SignModelRegistry.this::createTileEntity,
                        blockSign.get(),
                        blockWallSign.get()
                ).build(null));
    }


    public RegistryObject<Block> getBlockSign() {
        return blockSign;
    }

    public RegistryObject<Block> getBlockWallSign() {
        return blockWallSign;
    }

    public RegistryObject<Item> getItemSign() {
        return itemSign;
    }

    public RegistryObject<BlockEntityType<InuSignBlockEntity>> getTileEntity() {
        return tileEntity;
    }

    private InuSignBlockEntity createBlockEntity(BlockPos blockPos, BlockState blockState) {
        InuSignBlockEntity entity = new InuSignBlockEntity(blockPos, blockState, type);

        entity.setTileEntityType(tileEntity);

        return entity;
    }

    public static List<String> getRegisteredTypes() {
        return registeredTypes;
    }

    public static synchronized void registerSign(String type, WoodType woodType) {
        SignModelRegistry registry = new SignModelRegistry(type, woodType);

        registeredTypes.add(type);
        registryList.add(registry);
    }

    public static void register(IEventBus eventBus) {
        SIGN_BLOCKS.register(eventBus);
        SIGN_ITEMS.register(eventBus);
        BLOCK_ENTITIES.register(eventBus);
    }

    public static void bindAllRenderers() {
//        registryList.forEach(it -> ClientRegistry.bindTileEntityRenderer(it.tileEntity.get(), InuSignTileEntityRenderer::new));
    }

}
