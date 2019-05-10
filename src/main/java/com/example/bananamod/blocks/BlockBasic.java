package com.example.bananamod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

    public BlockBasic(String name, Material blockMaterialIn) {
        super(blockMaterialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
