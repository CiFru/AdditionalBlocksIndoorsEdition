package com.cifru.additionalblocks.indoors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;

/**
 * Created 1/16/2021 by SuperMartijn642
 */
public class FullRotationBlock extends BasicBlock {

    private final boolean reversePlacement;

    public FullRotationBlock(String registryName, boolean reversePlacement, Properties properties){
        super(registryName, properties);
        this.reversePlacement = reversePlacement;
        this.setDefaultState(this.getDefaultState().with(BlockProperties.FACING, Direction.NORTH));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context){
        Direction facing = context.getNearestLookingDirection();
        return this.getDefaultState().with(BlockProperties.FACING, this.reversePlacement ? facing.getOpposite() : facing);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block,BlockState> builder){
        builder.add(BlockProperties.FACING);
    }
}
