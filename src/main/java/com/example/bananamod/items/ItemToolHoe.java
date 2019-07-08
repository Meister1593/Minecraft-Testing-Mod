package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.ItemHoe;

public class ItemToolHoe extends ItemHoe {
    public ItemToolHoe(String name, ToolMaterial material) {
        super(material);
        ItemsList.ITEMS.add(this);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}