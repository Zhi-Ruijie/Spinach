package zrj.spinach.registry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems implements ModInitializer{
    public static final Item SPINACH = new Item(new Item.Settings());
    public static final Item SPINACH_BUNDLE = new Item(new Item.Settings());


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM,new Identifier("spinach","spinach"), SPINACH);
        Registry.register(Registries.ITEM,new Identifier("spinach_bundle","spinach bundle"), SPINACH_BUNDLE);
    }

}
