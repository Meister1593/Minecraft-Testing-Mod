package com.example.bananamod.collections;

import com.example.bananamod.items.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import java.util.*;

public class ItemsList {

    public static final List<Item> ITEMS = new ArrayList<>();

    // Items (required by ArmorMaterial)
    public static final Item BANANA = new ItemCustomFood("banana", 2, 0.3f, false);
    //Armor Materials
    private static final ItemArmor.ArmorMaterial ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("armour_banana",
            "bananamod:bananaarmor", 5, new int[]{1, 2, 3, 1}, 5,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0F).
            setRepairItem(new ItemStack(BANANA));
    //Item Tools
    private static final Item BANANA_PICKAXE = new ItemToolPickaxe("bananapickaxe", EnumHelper.addToolMaterial(
            "bananamod:tool", 2, 48, 15.0F, 1.0F, 5));
    private static final Item BANANA_AXE = new ItemToolAxe("bananaaxe", EnumHelper.addToolMaterial(
            "bananamod:tool", 2, 48, 15.0F, 2.0F, 5));
    private static final Item BANANA_HOE = new ItemToolHoe("bananahoe", EnumHelper.addToolMaterial(
            "bananamod:tool", 2, 48, 15.0F, 1.0F, 5));
    private static final Item BANANA_SHOVEL = new ItemToolSpade("bananashovel", EnumHelper.addToolMaterial(
            "bananamod:tool", 2, 48, 15.0F, 1.0F, 5));
    private static final Item BANANA_SWORD = new ItemAttackSword("bananasword", EnumHelper.addToolMaterial(
            "bananamod:tool", 2, 48, 15.0F, 2.0F, 5));
    //Actual Items
    private static final Item BANANA_BOOTS = new ItemExtraArmor("boots_bananaarmor", ARMOUR_MATERIAL,
            1, EntityEquipmentSlot.FEET);
    private static final Item BANANA_LEGGS = new ItemExtraArmor("leggs_bananaarmor", ARMOUR_MATERIAL,
            2, EntityEquipmentSlot.LEGS);
    private static final Item BANANA_CHESTPLATE = new ItemExtraArmor("chestplate_bananaarmor", ARMOUR_MATERIAL,
            1, EntityEquipmentSlot.CHEST);
    private static final Item BANANA_HEAD = new ItemExtraArmor("head_bananaarmor", ARMOUR_MATERIAL,
            1, EntityEquipmentSlot.HEAD);
    private static final Item BANANA_STICK = new ItemCustomFood("bananastick", 1,
            0.3f, false);
}
