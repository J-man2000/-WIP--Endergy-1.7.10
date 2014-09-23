package com.J_man_2000.Endergy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static cpw.mods.fml.common.Mod.*;

@Mod(modid="Endergy", name= "Endergy", version="1.7.10-1.0")


/**
 * Created by Jens on 23/09/2014.
 */
public class Endergy
{
    @Mod.Instance("Endergy")
    public static Endergy instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
//networkhandelin, mod config, ini items blocks
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
//reg gui, tile enteties, recepies, eventhandlers
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
//
    }
}

