package net.gabriel.picklecraft.registration;

import net.gabriel.picklecraft.PickleCraft;
import net.gabriel.picklecraft.block.custom.IronFurnace;
import net.gabriel.picklecraft.block.custom.RockBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PickleCraftBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PickleCraft.MODID);
    
    public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("rock_block", () -> new RockBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    
    public static final RegistryObject<Block> IRON_FURNACE = BLOCKS.register("iron_furnace", () -> new IronFurnace(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
}
