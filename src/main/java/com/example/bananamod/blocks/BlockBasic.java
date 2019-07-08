package com.example.bananamod.blocks;

import com.example.bananamod.collections.BlocksList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block {

    public BlockBasic(String name, Material blockMaterialIn, SoundType sound, float hardness, String harvestTool, int harvestLevel, CreativeTabs tab) {
        super(blockMaterialIn);
        BlocksList.BASIC_BLOCKS.add(this);
        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(sound);
        setHardness(hardness);
        setHarvestLevel(harvestTool, harvestLevel);
        setCreativeTab(tab);
    }
}
