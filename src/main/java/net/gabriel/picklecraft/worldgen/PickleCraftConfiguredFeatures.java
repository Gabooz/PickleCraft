package net.gabriel.picklecraft.worldgen;

import net.gabriel.picklecraft.PickleCraft;
import net.gabriel.picklecraft.registration.PickleCraftBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class PickleCraftConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ROCK_KEY = registerKey("rock_block");
	
	public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context) {
		RuleTest grassReplaceables = new BlockMatchTest(Blocks.SHORT_GRASS);
		
        register(context, OVERWORLD_ROCK_KEY, Feature.ORE, new OreConfiguration(grassReplaceables,
                PickleCraftBlocks.ROCK_BLOCK.get().defaultBlockState(), 9));
	}
	
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(PickleCraft.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
