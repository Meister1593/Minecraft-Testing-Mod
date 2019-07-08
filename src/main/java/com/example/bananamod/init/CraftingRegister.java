package com.example.bananamod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingRegister {

    private static final String bananapickaxe = "bananapickaxe";
    private static final String bananastick = "bananastick";
    private static final String bananahead = "bananahead";
    private static final String bananachetplate = "bananachetplate";
    private static final String bananaleggs = "bananaleggs";
    private static final String bananaboots = "bananaboots";
    private static final String bananablock = "bananablock";
    private static final String banana = "banana";

    public static void register() {
        registerRecipes(bananapickaxe);
        registerRecipes(bananastick);
        registerRecipes(bananahead);
        registerRecipes(bananachetplate);
        registerRecipes(bananaleggs);
        registerRecipes(bananaboots);
        registerRecipes(bananablock);
        registerRecipes(banana);
    }

    private static void registerRecipes(String name) {
        CraftingHelper.register(new ResourceLocation("bananamod", name), (IRecipeFactory)
                (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
