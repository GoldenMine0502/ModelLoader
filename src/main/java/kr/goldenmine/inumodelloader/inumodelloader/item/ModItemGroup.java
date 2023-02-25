package kr.goldenmine.inumodelloader.inumodelloader.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ModItemGroup {
    public static final ItemGroup  TUTORIAL_TAB = new ItemGroup ("tutorial_tab") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };

    public static final ItemGroup  INU_MODELS_TAB = new ItemGroup ("inu_models") {
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
}
