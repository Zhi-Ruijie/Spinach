package name.spinach.block;

import name.spinach.Spinach;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SPINACH_BLOCK = registerBlocks("spinach_block",new Block(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    private static Block registerBlocks(String name,Block block){
        return Registry.register(Registries.BLOCK,new Identifier(Spinach.MOD_ID,name),block);
    }
    public static void registerModBlocks(){

    }
}
