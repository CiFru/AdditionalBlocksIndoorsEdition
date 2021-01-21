package com.cifru.additionalblocks.indoors;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Created 1/20/2021 by SuperMartijn642
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WorldGeneration {

//    public static ConfiguredFeature<?,?> ore_marble;

//    public static void onFeatureRegistry(final RegistryEvent.Register<Feature<?>> e){
//        ore_marble = Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, AdditionalBlocks.smooth_marble.getDefaultState(), 33));
//        ore_marble.range(80).square().func_242731_b(10);
//        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,
//            new ResourceLocation("abstoneedition", "ore_marble"),
//            ore_marble
//        );
//    }

//    @SubscribeEvent(priority = EventPriority.LOW)
//    public static void onBiomeLoad(BiomeLoadingEvent e){
//        RegistryKey<Biome> biomeKey = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES, e.getName());
//
//        // all overworld biomes
//        if(BiomeDictionary.getBiomes(BiomeDictionary.Type.OVERWORLD).contains(biomeKey)){
//
//        }
//
//        // all nether biomes
//        if(BiomeDictionary.getBiomes(BiomeDictionary.Type.OVERWORLD).contains(biomeKey)){
//
//        }
//
//        // all end biomes
//        if(BiomeDictionary.getBiomes(BiomeDictionary.Type.OVERWORLD).contains(biomeKey)){
//
//        }
//    }

}
