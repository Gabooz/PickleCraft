package net.gabriel.picklecraft.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class IronFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

	protected IronFurnaceBlockEntity(BlockEntityType<?> p_154991_, BlockPos p_154992_, BlockState p_154993_,
			RecipeType<? extends AbstractCookingRecipe> p_154994_) {
		super(p_154991_, p_154992_, p_154993_, p_154994_);
		// TODO Auto-generated constructor stub
	}

	private final ItemStackHandler itemHandler = new ItemStackHandler(3);
	
	private static final int INPUT_SLOT = 0;
	private static final int OUTPUT_SLOT = 1;
	private static final int FUEL_SLOT = 2;

	private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
	
    int litTime;
    int litDuration;
    int cookingProgress;
    int cookingTotalTime;

	@Override
	protected Component getDefaultName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AbstractContainerMenu createMenu(int p_58627_, Inventory p_58628_) {
		// TODO Auto-generated method stub
		return null;
	}
	
    private boolean isLit() {
        return this.litTime > 0;
    }

}