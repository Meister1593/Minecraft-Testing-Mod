package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.ItemSpade;

public class ItemToolSpade extends ItemSpade {
    public ItemToolSpade(String name, ToolMaterial material) {
        super(material);
        ItemsList.ITEMS.add(this);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}