package kr.goldenmine.inumodelloader.inumodelloader.block;

import kr.goldenmine.inumodelloader.inumodelloader.INUModelLoader;
import kr.goldenmine.inumodelloader.inumodelloader.block.blocks.TallINUDoorBlock;
import kr.goldenmine.inumodelloader.inumodelloader.item.ModItemGroup;
import kr.goldenmine.inumodelloader.inumodelloader.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, INUModelLoader.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(15f)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(10f)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> TEST_OBJ_BLOCK = registerBlock("test_obj_block",
            () -> new Block(AbstractBlock.Properties.create(Material.GLASS).hardnessAndResistance(10f)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> TREE_BLOCK = registerBlock("tree_block",
            () -> new Block(AbstractBlock.Properties.create(Material.AIR).hardnessAndResistance(10f)), ModItemGroup.TUTORIAL_TAB);

    //Properties.of(Material.METAL).strength(5f)
    public static final RegistryObject<Block> TALL_INU_DOOR_BLOCK = registerBlock("tall_inu_door_block",
            () -> new TallINUDoorBlock(Blocks.OAK_DOOR), ModItemGroup.INU_MODELS_TAB);

    public static final RegistryObject<Block> INU_WOOD_LOG = registerBlock("inu_wood_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> INU_WOOD_WOOD = registerBlock("inu_wood_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> STRIPPED_INU_WOOD_LOG = registerBlock("stripped_inu_wood_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> STRIPPED_INU_WOOD_WOOD = registerBlock("stripped_inu_wood_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> INU_WOOD_PLANKS = registerBlock("inu_wood_planks",
            () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)), ModItemGroup.TUTORIAL_TAB);

    public static final RegistryObject<Block> BMJ_LAB1 = registerBlock("bmj/b.m.j.lab1",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_BMJ_TAB);

    public static final RegistryObject<Block> BMJ_LAB2 = registerBlock("bmj/b.m.j.lab2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_BMJ_TAB);

    public static final RegistryObject<Block> BMJ_LAB3 = registerBlock("bmj/b.m.j.lab3",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_BMJ_TAB);

    public static final RegistryObject<Block> BSY_LOCKER = registerBlock("bsy/bsy_locker",
            () -> new ThreeByThreeBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_BSY_TAB);

    public static final RegistryObject<Block> BSY_REAGENT1 = registerBlock("bsy/bsy_reagent1",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_BSY_TAB);

    public static final RegistryObject<Block> BSY_REAGENT2 = registerBlock("bsy/bsy_reagent2",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_BSY_TAB);

    public static final RegistryObject<Block> CHAIR_NOBACK_1 = registerBlock("chair_noback_1",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_MODELS_TAB);

    public static final RegistryObject<Block> CHAIR_NOBACK_2 = registerBlock("chair_noback_2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_MODELS_TAB);

    public static final RegistryObject<Block> EUNHA_ELECTRONICS_SHELVES_1 = registerBlock("peh/eunha_electronicshelves1",
            () -> new ThreeByThreeBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_PEH_TAB);

    public static final RegistryObject<Block> EUNHA_ELECTRONICS_SHELVES_2 = registerBlock("peh/eunha_electronicshelves2",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_PEH_TAB);

    public static final RegistryObject<Block> JSY_DESK = registerBlock("jsy/j.s.y_desk",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_JSY_TAB);

    public static final RegistryObject<Block> KJH_HOME = registerBlock("kjh/k.j.h_home",
            () -> new ThreeByThreeBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_HOME2 = registerBlock("kjh/k.j.h_home2",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_SMOKE = registerBlock("kjh/k.j.h_smoke",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_TRASH = registerBlock("kjh/k.j.h_trash",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_GAS = registerBlock("kjh/k.j.h_gas",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_GAS2 = registerBlock("kjh/k.j.h_gas2",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_GASSUP = registerBlock("kjh/k.j.h_gassup",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> KJH_GASSUP2 = registerBlock("kjh/k.j.h_gassup2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KJH_TAB);

    public static final RegistryObject<Block> LEEJUNYONG_OVEN_1 = registerBlock("ljy/leejunyong_oven1",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LEEJUNYONG_OVEN_2 = registerBlock("ljy/leejunyong_oven2",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LEEJUNYONG_OVEN_3 = registerBlock("ljy/leejunyong_oven3",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LEEJUNYONG_SINK_1 = registerBlock("ljy/leejunyong_sink1",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LEEJUNYONG_SINK_2 = registerBlock("ljy/leejunyong_sink2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LEEJUNYONG_PICNIC_CHAIR = registerBlock("ljy/leejunyong_picnic_chair",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LINS_BOOKSHELF = registerBlock("lis/lins_bookshelf",
            () -> new ThreeByThreeBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> PROP_BOX = registerBlock("lis/prop_box",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> PROP_CAMCODER = registerBlock("lis/prop_camcoder",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> PROP_STORAGE_BOX = registerBlock("lis/prop_storage_box",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> PROP_TISSUE_BOX = registerBlock("lis/prop_tissue_box",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> IIS_PRINTER = registerBlock("lis/iis_printer",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> KMS_BLUE_CHAIR_2 = registerBlock("kms/kimmiseung_blue_chair_2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KMS_TAB);

    public static final RegistryObject<Block> KMS_GREEN_CHAIR_2 = registerBlock("kms/kimmiseung_green_chair_2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KMS_TAB);

    public static final RegistryObject<Block> JSY_STAIR_DESK = registerBlock("jsy/jsy_stair_desk",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD).notSolid()), ModItemGroup.INU_JSY_TAB);

    public static final RegistryObject<Block> OHYEJIN_BOOKSHELF2_BT1 = registerBlock("oyj/ohyejin_bookshelf2_bt1",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_BOOKSHELF2_BT2 = registerBlock("oyj/ohyejin_bookshelf2_bt2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_BOOKSHELF2_BT3 = registerBlock("oyj/ohyejin_bookshelf2_bt3",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_BOOKSHELF2_TOP1 = registerBlock("oyj/ohyejin_bookshelf2_top1",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_BOOKSHELF2_TOP2 = registerBlock("oyj/ohyejin_bookshelf2_top2",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_BOOKSHELF2_TOP3 = registerBlock("oyj/ohyejin_bookshelf2_top3",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_LABORATORY_EQUIPMENT_1 = registerBlock("oyj/ohyejin_laboratory_equipment_1",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_LABORATORY_EQUIPMENT_2 = registerBlock("oyj/ohyejin_laboratory_equipment_2",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_LABORATORY_EQUIPMENT_3 = registerBlock("oyj/ohyejin_laboratory_equipment_3",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_LABORATORY_EQUIPMENT_4 = registerBlock("oyj/ohyejin_laboratory_equipment_4",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_TOILET = registerBlock("oyj/ohyejin_toilet",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK1 = registerBlock("oyj/ohyejin_desk1",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK2 = registerBlock("oyj/ohyejin_desk2",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK3 = registerBlock("oyj/ohyejin_desk3",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK4 = registerBlock("oyj/ohyejin_desk4",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK5 = registerBlock("oyj/ohyejin_desk5",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK6 = registerBlock("oyj/ohyejin_desk6",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK7 = registerBlock("oyj/ohyejin_desk7",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_DESK8 = registerBlock("oyj/ohyejin_desk8",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_BUCKET = registerBlock("oyj/ohyejin_bucket",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_CHAIR = registerBlock("oyj/ohyejin_chair",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_FLOWERPOT = registerBlock("oyj/ohyejin_flowerpot",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_LOCKER = registerBlock("oyj/ohyejin_locker",
            () -> new OneByThreeVerticalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_SINK = registerBlock("oyj/ohyejin_sink",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> OHYEJIN_SINKSJ = registerBlock("oyj/ohyejin_sinksj",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_OYJ_TAB);

    public static final RegistryObject<Block> GOHYUNSEO_ANNEALING = registerBlock("ghs/gohyunseo_annealing",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_GHS_TAB);

    public static final RegistryObject<Block> YEWON_SINK2 = registerBlock("syw/yewon_sink2",
            () -> new OneByThreeHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_SYW_TAB);

    public static final RegistryObject<Block> LEESEJIN_DESK = registerBlock("lsj/leesejin_chair5",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LSJ_TAB);

    public static final RegistryObject<Block> LEESEJIN_CHAIR = registerBlock("lsj/leesejin_desk3",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LSJ_TAB);

    public static final RegistryObject<Block> LEESEJIN_TV = registerBlock("lsj/leesejin_tv2",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LSJ_TAB);

    public static final RegistryObject<Block> SONICATOR = registerBlock("sonicator",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_MODELS_TAB);

    public static final RegistryObject<Block> SINK1PLUS = registerBlock("sink1plus",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_MODELS_TAB);

    public static final RegistryObject<Block> CIRCLE_CHAIR = registerBlock("circle_chair",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> KMS_572CHAIR = registerBlock("kms/kms_572chair",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KMS_TAB);

    public static final RegistryObject<Block> KMS_572TABLE = registerBlock("kms/kms_572table",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KMS_TAB);

    public static final RegistryObject<Block> LEEINSEONG_SOFA = registerBlock("lis/leeinseong_sofa",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> LEEINSEONG_ELECTRONICBOARD = registerBlock("lis/leeinseong_electronicboard",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LIS_TAB);

    public static final RegistryObject<Block> KDH_REFRIGERATOR = registerBlock("kdh/kdh_refrigerator",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_KDH_TAB);

    public static final RegistryObject<Block> LEESEJIN_578CABINET = registerBlock("lsj/leesejin_578cabinet",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LSJ_TAB);

    public static final RegistryObject<Block> LJY_580REFRIGERATOR = registerBlock("ljy/ljy_580refrigerator",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    public static final RegistryObject<Block> LJY_580DESK = registerBlock("ljy/ljy_580desk",
            () -> new BaseHorizontalBlock(AbstractBlock.Properties.from(Blocks.GLASS).notSolid()), ModItemGroup.INU_LJY_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup group) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, group);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, ItemGroup group) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(group)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.TUTORIAL_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}