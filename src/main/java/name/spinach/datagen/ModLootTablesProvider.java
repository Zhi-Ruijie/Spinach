package name.spinach.datagen;

import name.spinach.block.ModBlocks;
import name.spinach.block.custom.SpinachCropBlock;
import name.spinach.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTablesProvider extends FabricBlockLootTableProvider {
    public ModLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.SPINACH_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(SpinachCropBlock.AGE,7));
        addDrop(ModBlocks.SPINACH_CROP,cropDrops(ModBlocks.SPINACH_CROP, ModItems.SPINACH,ModItems.SPINACH,builder));
    }
}
