package net.gabriel.picklecraft.item;

import net.gabriel.picklecraft.block.custom.IronFurnace;
import net.gabriel.picklecraft.registration.PickleCraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class FurnaceMaster extends Item{
	public FurnaceMaster(Item.Properties itemProperties) {
		super(itemProperties);
	}
	
	@Override
	public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context)
	{
		Level world = context.getLevel();
		BlockPos pos = context.getClickedPos();
		Player player = context.getPlayer();
		Direction side = context.getClickedFace();
		BlockState blockState = world.getBlockState(pos);
		
		BlockState ironFurnace = PickleCraftBlocks.IRON_FURNACE.get().defaultBlockState();

		if(blockState.is(Blocks.FURNACE)) {
			if(world.getBlockState(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ())).is(Blocks.COBBLESTONE)) {
				world.removeBlock(pos, false);
				world.removeBlock(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), false);
				world.setBlock(pos, ironFurnace, Block.UPDATE_CLIENTS);
				player.displayClientMessage(Component.translatable("Furnace Master Awakens"), true);
				return InteractionResult.PASS;
			}
			return InteractionResult.FAIL;
		}
		
		return InteractionResult.FAIL;
	}
}
