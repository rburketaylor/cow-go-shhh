package com.iamtis.cowgoshhh.registry;

import com.iamtis.cowgoshhh.CowGoShhh;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem MUFFLER_BLOCK = new BlockItem(ModBlocks.MUFFLER_BLOCK, new Item.Settings().group(ItemGroup.REDSTONE));

    public static void registerItems(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(CowGoShhh.MOD_ID, name), item);
    }
}
