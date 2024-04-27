package zrj.spinach.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import zrj.spinach.Spinach;
import zrj.spinach.SpinachDataGenerator;

import java.util.Arrays;

public class ModItems implements ModInitializer{
    public static final Item SPINACH = new Item(new Item.Settings());


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM,new Identifier("spinach","spinach"), SPINACH);
    }
}
