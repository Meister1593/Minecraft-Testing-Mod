package com.example.bananamod.items;

import com.example.bananamod.collections.ItemsList;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemExtraArmor extends ItemArmor
{
    public ItemExtraArmor(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        ItemsList.ITEMS.add(this);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
