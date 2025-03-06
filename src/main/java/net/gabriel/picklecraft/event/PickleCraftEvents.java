package net.gabriel.picklecraft.event;

import net.gabriel.picklecraft.PickleCraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PickleCraft.MODID)
public class PickleCraftEvents {
	
	@SubscribeEvent
	public static void RemovePlayerInventory(TickEvent event) {
	} //WIP
	
	@SubscribeEvent
	public static void onEntityJoinWorld(EntityJoinLevelEvent event) {
		
		Entity entity = event.getEntity();
		if (entity.getType() != EntityType.PLAYER) {
			event.setCanceled(true); //Stop entities from spawning
		}
	}
}
