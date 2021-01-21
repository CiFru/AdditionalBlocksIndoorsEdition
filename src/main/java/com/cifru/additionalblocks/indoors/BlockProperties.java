package com.cifru.additionalblocks.indoors;

import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;

/**
 * Created 1/16/2021 by SuperMartijn642
 */
public class BlockProperties {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final EnumProperty<Direction> HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<Direction> FACING = BlockStateProperties.FACING;

}
