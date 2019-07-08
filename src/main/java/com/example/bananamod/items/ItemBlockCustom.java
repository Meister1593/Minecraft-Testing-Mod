package com.example.bananamod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockCustom extends ItemBlock {
    public ItemBlockCustom(Block block, String name) {
        super(block);
        setRegistryName(name);
    }
}
