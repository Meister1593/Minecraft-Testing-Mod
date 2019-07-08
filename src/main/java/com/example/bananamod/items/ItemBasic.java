package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.Item;

public class ItemBasic extends Item
{
    public ItemBasic(String name)
    {
        ItemsList.ITEMS.add(this);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

}
