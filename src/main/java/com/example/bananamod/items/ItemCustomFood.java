package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood {

    public ItemCustomFood(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        ItemsList.ITEMS.add(this);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
