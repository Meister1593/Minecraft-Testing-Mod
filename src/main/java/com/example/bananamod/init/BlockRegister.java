package com.example.bananamod.init;

import com.example.bananamod.Reference;
import com.example.bananamod.blocks.BlockBasic;
import com.example.bananamod.blocks.WoodenBlock;
import com.example.bananamod.collections.BlocksList;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid= Reference.MODID)
public class BlockRegister {

    public static void register()
    {
        for (WoodenBlock woodenBlock : BlocksList.WOODEN_BLOCKS){
            setRegister(woodenBlock);
        }
        for (BlockBasic basicBlock : BlocksList.BASIC_BLOCKS){
            setRegister(basicBlock);
        }

    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        for (WoodenBlock woodenBlock : BlocksList.WOODEN_BLOCKS){
            setRender(woodenBlock);
        }
        for (BlockBasic basicBlock : BlocksList.BASIC_BLOCKS){
            setRender(basicBlock);
        }

    }

    private static void setRegister(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
                0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
