package com.example.bananamod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

    public BlockBasic(String name, Material blockMaterialIn, SoundType sound) {
        super(blockMaterialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(sound);
    }
}
