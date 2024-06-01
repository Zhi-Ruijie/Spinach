package zrj.spinach;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spinach implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("spinach");
	public static final Item SPINACH = new Item(new Item.Settings());
	public static final Item SPINACH_BUNDLE = new Item(new Item.Settings());
	public static final Item SPINACH_SEEDS = new Item(new Item.Settings());
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(SPINACH))
			.displayName(Text.translatable("itemGroup.spinach.spinach"))
			.entries((context,entries) -> {
				entries.add(SPINACH);
				entries.add(SPINACH_BUNDLE);
				entries.add(SPINACH_SEEDS);
			})
			.build();
    public static final Block SPINACH_CROPS = new Block(Block.Settings.create().strength(4.0f));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		Registry.register(Registries.ITEM, new Identifier("spinach","spinach"),SPINACH);
		Registry.register(Registries.ITEM, new Identifier("spinach","spinach_bundle"),SPINACH_BUNDLE);
		Registry.register(Registries.ITEM, new Identifier("spinach","spinach_seeds"),SPINACH_SEEDS);
		Registry.register(Registries.ITEM_GROUP,new Identifier("spinach","spinach"),ITEM_GROUP);
		Registry.register(Registries.BLOCK, new Identifier("spinach", "spinach_block"), SPINACH_CROPS);
	}

}