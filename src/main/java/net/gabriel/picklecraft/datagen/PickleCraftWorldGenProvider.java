package net.gabriel.picklecraft.datagen;



import net.gabriel.picklecraft.PickleCraft;
import net.gabriel.picklecraft.worldgen.PickleCraftBiomeModifiers;
import net.gabriel.picklecraft.worldgen.PickleCraftConfiguredFeatures;
import net.gabriel.picklecraft.worldgen.PickleCraftPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class PickleCraftWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, PickleCraftConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, PickleCraftPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, PickleCraftBiomeModifiers::bootstrap);

    public PickleCraftWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(PickleCraft.MODID));
    }
}
