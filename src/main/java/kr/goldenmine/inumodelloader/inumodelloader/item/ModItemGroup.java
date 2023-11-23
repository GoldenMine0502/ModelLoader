package kr.goldenmine.inumodelloader.inumodelloader.item;

import kr.goldenmine.inumodelloader.inumodelloader.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.function.Supplier;

public class ModItemGroup {
    public static final ItemGroup TUTORIAL_TAB = new ItemGroup("tutorial_tab") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };

    public static final ItemGroup INU_MODELS_TAB = new ItemGroup("inu_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.INU_ITEM.get());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
//            List<Item> registryItems = new ArrayList<Item>();
//            for(Item item : Registry.ITEM) {
//                registryItems.add(item);
//            }
//
//            registryItems.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
//
//            for(Item item : registryItems) {
//                item.fillItemGroup(this, items);
//            }

            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_SIGNS_TAB = new DefaultItemGroup("Signs", () -> ModBlocks.TALL_INU_DOOR_BLOCK);

    public static final ItemGroup INU_KMS_TAB = new DefaultItemGroup("KimMiSeung_models", () -> ModBlocks.KMS_BLUE_CHAIR_2);

    public static final ItemGroup INU_LIS_TAB = new DefaultItemGroup("LeeInSeong_models", () -> ModBlocks.LEEINSEONG_SOFA);

    public static final ItemGroup INU_KDH_TAB = new DefaultItemGroup("KimDongHwi_models", () -> ModBlocks.KDH_REFRIGERATOR);

    public static final ItemGroup INU_LSJ_TAB = new DefaultItemGroup("LeeSeJin_models", () -> ModBlocks.LEESEJIN_578CABINET);

    public static final ItemGroup INU_OYJ_TAB = new DefaultItemGroup("OhYeJin_models", () -> ModBlocks.OHYEJIN_BOOKSHELF2_TOP1);

    public static final ItemGroup INU_LJY_TAB = new DefaultItemGroup("LeeJunYong_models", () -> ModBlocks.LEEJUNYONG_OVEN_1);

    public static final ItemGroup INU_KJH_TAB = new DefaultItemGroup("KimJeongHyun_models", () -> ModBlocks.KJH_EEDESK_V1);

    public static final ItemGroup INU_BSY_TAB = new DefaultItemGroup("BSY_models", () -> ModBlocks.BSY_LOCKER);

    public static final ItemGroup INU_BMJ_TAB = new DefaultItemGroup("BaeMinJun_models", () -> ModBlocks.BMJ_LAB1);

    public static final ItemGroup INU_PEH_TAB = new DefaultItemGroup("ParkEunHa_models", () -> ModBlocks.EUNHA_ELECTRONICS_SHELVES_1);

    public static final ItemGroup INU_GHS_TAB = new DefaultItemGroup("SonYeWon_models", () -> ModBlocks.GOHYUNSEO_ANNEALING);

    public static final ItemGroup INU_SYW_TAB = new DefaultItemGroup("SonYeWon_models", () -> ModBlocks.JSY_STAIR_DESK);

    public static final ItemGroup INU_JSY_TAB = new DefaultItemGroup("JeonSoYeon_models", () -> ModBlocks.JSY_STAIR_DESK);

    public static final ItemGroup INU_NJH_TAB = new DefaultItemGroup("NamJunHyung_models", () -> ModBlocks.NJH_BROWNTABLE);

    public static final ItemGroup INU_JHB_TAB = new DefaultItemGroup("JoHyunBin_models", () -> ModBlocks.JHB_FENCE);

    static class DefaultItemGroup extends ItemGroup {
        private final Supplier<RegistryObject<Block>> consumer;

        public DefaultItemGroup(String name, Supplier<RegistryObject<Block>> consumer) {
            super(name);
            this.consumer = consumer;
        }

        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(consumer.get().get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    }
}