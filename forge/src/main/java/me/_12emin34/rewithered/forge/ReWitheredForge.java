package me._12emin34.rewithered.forge;

import dev.architectury.platform.forge.EventBuses;
import me._12emin34.rewithered.ReWithered;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ReWithered.MOD_ID)
public class ReWitheredForge {
    public ReWitheredForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ReWithered.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            ReWithered.init();
    }
}