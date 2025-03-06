package net.gabriel.picklecraft.registration;


import net.minecraftforge.eventbus.api.IEventBus;

public class Registration {
	public static void RegisterPickleCraft(IEventBus modEventBus) {
        PickleCraftBlocks.BLOCKS.register(modEventBus);
        PickleCraftItems.ITEMS.register(modEventBus);
        PickleCraftCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);

	}
}
