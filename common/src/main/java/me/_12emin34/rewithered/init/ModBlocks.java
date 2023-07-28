package me._12emin34.rewithered.init;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me._12emin34.rewithered.ReWithered;
import me._12emin34.rewithered.block.WitherThoraxLeft;
import me._12emin34.rewithered.block.WitherThoraxRight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ReWithered.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> WITHER_THORAX_RIGHT = BLOCKS.register("wither_thorax_right", () -> new WitherThoraxRight(BlockBehaviour.Properties.of().strength(-1.0F, 3600000.0F)));
    public static final RegistrySupplier<Block> WITHER_THORAX_LEFT = BLOCKS.register("wither_thorax_left", () -> new WitherThoraxLeft(BlockBehaviour.Properties.of().strength(-1.0F, 3600000.0F)));

    private ModBlocks() {
        throw new IllegalStateException("This class is not intended to be instantiated");
    }

    public static void init() {
        BLOCKS.register();
    }
}
