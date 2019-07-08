package com.example.bananamod.init;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRegister {

    public static void register() {
        for (Item item : ItemsList.ITEMS){
            setRegister(item);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        for (Item item : ItemsList.ITEMS){
            setRender(item);
        }
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
