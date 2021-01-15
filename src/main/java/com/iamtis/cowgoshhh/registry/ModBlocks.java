package com.iamtis.cowgoshhh.registry;

import com.iamtis.cowgoshhh.CowGoShhh;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MUFFLER_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOL)
            .breakByHand(true)
            .strength(1f, 1f)
            .sounds(BlockSoundGroup.WOOL));

    public static void registerBlocks(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(CowGoShhh.MOD_ID, name), block);
    }
}
