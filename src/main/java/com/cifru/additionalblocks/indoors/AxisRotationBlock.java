package com.cifru.additionalblocks.indoors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;

/**
 * Created 1/15/2021 by SuperMartijn642
 */
public class AxisRotationBlock extends BasicBlock {

    public AxisRotationBlock(String registryName, Properties properties){
        super(registryName, properties);
        this.setDefaultState(this.getDefaultState().with(BlockProperties.AXIS, Direction.Axis.Y));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context){
        Direction facing = context.getFace();
        return this.getDefaultState().with(BlockProperties.AXIS, facing.getAxis());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block,BlockState> builder){
        builder.add(BlockProperties.AXIS);
    }
}
