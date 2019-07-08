package com.example.bananamod.collections;

import com.example.bananamod.blocks.BlockBasic;
import com.example.bananamod.blocks.WoodenBlock;
import jdk.nashorn.internal.ir.Block;

import java.util.ArrayList;
import java.util.List;

public class BlocksList {
    public static final List<BlockBasic> BASIC_BLOCKS = new ArrayList<>();
    public static final List<WoodenBlock> WOODEN_BLOCKS = new ArrayList<>();
    // Actual Blocks
    public static final WoodenBlock WOODEN_BLOCK = new WoodenBlock("palmwood");
}
