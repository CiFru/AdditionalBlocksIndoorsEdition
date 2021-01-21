package com.cifru.additionalblocks.indoors;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

/**
 * Created 1/17/2021 by SuperMartijn642
 */
public class StairBlock extends StairsBlock {
    public StairBlock(Block block, Properties properties){
        super(block::getDefaultState, properties);
        this.setRegistryName(block.getRegistryName().getPath() + "_stairs");
    }
}
