package com.cifru.additionalblocks.indoors;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Created 11/30/2020 by SuperMartijn642
 */
public class AdditionalBlocksConfig {

    static{
        Pair<AdditionalBlocksConfig,ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(AdditionalBlocksConfig::new);
        CONFIG_SPEC = pair.getRight();
        INSTANCE = pair.getLeft();
    }

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final AdditionalBlocksConfig INSTANCE;

    private AdditionalBlocksConfig(ForgeConfigSpec.Builder builder){
        builder.push("General");
    }

}
