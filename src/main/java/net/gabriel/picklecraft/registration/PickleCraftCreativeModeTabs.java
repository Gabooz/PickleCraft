package net.gabriel.picklecraft.registration;

import net.gabriel.picklecraft.PickleCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PickleCraftCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PickleCraft.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> PickleCraftItems.ROCK.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(PickleCraftItems.ROCK.get());
                output.accept(PickleCraftItems.FURNACE_MASTER.get());
                output.accept(PickleCraftItems.IRON_FURNACE_ITEM.get());
                output.accept(PickleCraftItems.BARREL_ITEM.get());
            }).build());
}
