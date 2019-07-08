package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.ItemSword;

public class ItemAttackSword extends ItemSword {
    public ItemAttackSword(String name, ToolMaterial material) {
        super(material);
        ItemsList.ITEMS.add(this);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}