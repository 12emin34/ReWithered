package me._12emin34.rewithered.init;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me._12emin34.rewithered.ReWithered;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(ReWithered.MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> REWITHERED_MAIN = CREATIVE_TABS.register("rewithered", () -> CreativeTabRegistry.create(Component.literal("ReWithered"), () -> new ItemStack(Items.WITHER_SKELETON_SKULL)));

    private ModCreativeTabs() {
        throw new IllegalStateException("This class is not intended to be instantiated");
    }

    public static void init() {
        CREATIVE_TABS.register();
    }
}
