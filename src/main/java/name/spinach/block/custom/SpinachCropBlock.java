package name.spinach.block.custom;

import name.spinach.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SpinachCropBlock extends CropBlock {
    public static final int MAX_AGE = 7;
    public static final IntProperty AGE = Properties.AGE_7;
    public SpinachCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SPINACH;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos);
    }
}
