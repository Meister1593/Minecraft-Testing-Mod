package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.item.ItemAxe;

public class ItemToolAxe extends ItemAxe {
    public ItemToolAxe(String name, ToolMaterial material) {
        //То что указано как 2, 2 это урон и скорость рубки. Можете задать свои значения, но лучше не оставлять данные поля пустыми.
        super(material, 2, 2);
        ItemsList.ITEMS.add(this);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
