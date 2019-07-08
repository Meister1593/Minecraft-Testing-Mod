package com.example.bananamod.collections;

import com.example.bananamod.blocks.BlockBasic;
import com.example.bananamod.blocks.LeavesBlock;
import com.example.bananamod.blocks.WoodenBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class BlocksList {
    public static final List<BlockBasic> BASIC_BLOCKS = new ArrayList<>();
    public static final List<WoodenBlock> WOODEN_BLOCKS = new ArrayList<>();
    public static final List<LeavesBlock> LEAVES_BLOCKS = new ArrayList<>();

    // Actual Blocks
    public static final WoodenBlock WOODEN_BLOCK = new WoodenBlock("palmwood");
    public static final BlockBasic BANANA_BLOCK = new BlockBasic("bananablock", Material.ROCK,
            SoundType.SLIME, 0.3f, "axe", 0, CreativeTabs.DECORATIONS);
    public static final LeavesBlock LEAVES_BLOCK = new LeavesBlock("palmleaves");
}
