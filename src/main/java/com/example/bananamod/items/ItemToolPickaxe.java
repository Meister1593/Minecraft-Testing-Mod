package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.ItemPickaxe;

public class ItemToolPickaxe extends ItemPickaxe {
    public ItemToolPickaxe(String name, ToolMaterial material) {
        super(material);
        ItemsList.ITEMS.add(this);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}