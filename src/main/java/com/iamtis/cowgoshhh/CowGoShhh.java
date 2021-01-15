package com.iamtis.cowgoshhh;

import com.iamtis.cowgoshhh.registry.ModBlocks;
import com.iamtis.cowgoshhh.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class CowGoShhh implements ModInitializer {

    public static final String MOD_ID = "cowgoshhh";

    @Override
    public void onInitialize() {
        ModItems.registerItems("muffler_block", ModItems.MUFFLER_BLOCK);
        ModBlocks.registerBlocks("muffler_block", ModBlocks.MUFFLER_BLOCK);
    }
}
