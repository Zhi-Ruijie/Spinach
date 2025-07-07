package name.spinach.item;

import name.spinach.Spinach;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SPINACH = registerItems("spinach",new Item(new FabricItemSettings()));
    public static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(Spinach.MOD_ID,name),item);

    }
    public static void registerModItems(){

    }
}
