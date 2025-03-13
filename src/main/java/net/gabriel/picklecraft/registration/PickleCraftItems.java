package net.gabriel.picklecraft.registration;

import net.gabriel.picklecraft.PickleCraft;
import net.gabriel.picklecraft.block.custom.RockBlock;
import net.gabriel.picklecraft.item.FurnaceMaster;
import net.gabriel.picklecraft.registration.PickleCraftBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PickleCraftItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PickleCraft.MODID);
    
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(PickleCraftBlocks.EXAMPLE_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock", () -> new BlockItem(PickleCraftBlocks.ROCK_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> IRON_FURNACE_ITEM = ITEMS.register("iron_furnace_item", () -> new BlockItem(PickleCraftBlocks.IRON_FURNACE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BARREL_ITEM = ITEMS.register("barrel_item", () -> new BlockItem(PickleCraftBlocks.BARREL.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> FURNACE_MASTER = ITEMS.register("furnace_master", () -> new FurnaceMaster(new Item.Properties()));
    
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build())));
}
