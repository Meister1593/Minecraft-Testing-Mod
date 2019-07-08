package com.example.bananamod.proxy;

import com.example.bananamod.init.BlockRegister;
import com.example.bananamod.init.CraftingRegister;
import com.example.bananamod.init.ItemRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// Сторона клиента и сервера

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ItemRegister.register();
        BlockRegister.register();
        CraftingRegister.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
