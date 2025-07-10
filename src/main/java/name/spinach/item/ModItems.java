package name.spinach.item;

import name.spinach.Spinach;
import name.spinach.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(SPINACH);
    }
    public static Item SPINACH = registerItems("spinach",new AliasedBlockItem(ModBlocks.SPINACH_CROP,new FabricItemSettings().food(ModFoodComponents.SPINACH)));
    public static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(Spinach.MOD_ID,name),item);

    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroup);
    }

}
