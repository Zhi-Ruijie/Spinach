package name.spinach.block;

import name.spinach.Spinach;
import name.spinach.block.custom.SpinachCropBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SPINACH_CROP = Registry.register(Registries.BLOCK,new Identifier(Spinach.MOD_ID,"spinach_crop"),
            new SpinachCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static void registerModBlocks(){

    }
}
