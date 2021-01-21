package com.cifru.additionalblocks.indoors;

import net.minecraft.block.Block;

/**
 * Created 11/30/2020 by SuperMartijn642
 */
public class BasicBlock extends Block {

    public BasicBlock(String registryName, Block.Properties properties){
        super(properties);
        this.setRegistryName(registryName);
    }
}
