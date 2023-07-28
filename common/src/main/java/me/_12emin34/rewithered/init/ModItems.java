package me._12emin34.rewithered.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me._12emin34.rewithered.ReWithered;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ReWithered.MOD_ID, Registries.ITEM);
    public static final RegistrySupplier<BlockItem> WITHER_THORAX_RIGHT_ITEM = BLOCK_ITEMS.register("wither_thorax_right", () -> new BlockItem(ModBlocks.WITHER_THORAX_RIGHT.get(), new Item.Properties().arch$tab(ModCreativeTabs.REWITHERED_MAIN)));
    public static final RegistrySupplier<BlockItem> WITHER_THORAX_LEFT_ITEM = BLOCK_ITEMS.register("wither_thorax_left", () -> new BlockItem(ModBlocks.WITHER_THORAX_LEFT.get(), new Item.Properties().arch$tab(ModCreativeTabs.REWITHERED_MAIN)));

    private ModItems() {
        throw new IllegalStateException("This class is not intended to be instantiated");
    }

    public static void init() {
        BLOCK_ITEMS.register();
    }
}
