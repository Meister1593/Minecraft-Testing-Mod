package com.example.bananamod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingRegister {

    public static final String bananapickaxe = "bananapickaxe";

    public static void register() {
        registerRecipes(bananapickaxe);
    }

    private static void registerRecipes(String name) {
        CraftingHelper.register(new ResourceLocation("bananamod", name), (IRecipeFactory)
                (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
