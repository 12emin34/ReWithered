package me._12emin34.rewithered.fabric;

import me._12emin34.rewithered.ReWithered;
import net.fabricmc.api.ModInitializer;

public class ReWitheredFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ReWithered.init();
    }
}