package net.gabriel.picklecraft.inventory;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;

//This class will, in the future, be used to replace the vanilla inventory with mine, which will largely remain the same as it's vanilla counterpart.

public class PickleCraftPlayerInventory extends Inventory{
	protected static Player player = Minecraft.getInstance().player;
	
	PickleCraftPlayerInventory() {
		super(player);
	}
}
