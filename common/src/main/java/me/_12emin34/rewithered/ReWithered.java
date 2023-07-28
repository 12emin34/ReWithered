package me._12emin34.rewithered;

import me._12emin34.rewithered.init.ModBlocks;
import me._12emin34.rewithered.init.ModCreativeTabs;
import me._12emin34.rewithered.init.ModItems;

public class ReWithered {
    public static final String MOD_ID = "rewithered";

    private ReWithered() {
        throw new IllegalStateException("This class is not intended to be instantiated");
    }

    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeTabs.init();
    }
}