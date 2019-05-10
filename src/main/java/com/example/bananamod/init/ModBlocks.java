package com.example.bananamod.init;

import com.example.bananamod.Reference;
import com.example.bananamod.blocks.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid= Reference.MODID)
public class ModBlocks {
    static Block palmwoodBlock = new BlockBasic("palmwood", Material.WOOD).
            setCreativeTab(CreativeTabs.MATERIALS).setHardness(2f);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        palmwoodBlock.setHarvestLevel("axe",0);
        event.getRegistry().registerAll(palmwoodBlock);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(palmwoodBlock).setRegistryName(palmwoodBlock.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(palmwoodBlock));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
