package com.example.bananamod;

import com.example.bananamod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS)

//@TODO Сделать генератор на бананах
public class MainClass {

    @SidedProxy(clientSide = "com.example.bananamod.proxy.ClientProxy", serverSide = "com.example.bananamod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MainClass instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        System.out.println(Reference.MODID + ":PreInitialisation");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        System.out.println(Reference.MODID + ":Initialisaiton");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        System.out.println(Reference.MODID + ":PostInitialisation");
    }
}
