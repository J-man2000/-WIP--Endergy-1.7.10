package com.J_man_2000.Endergy;

import com.J_man_2000.Endergy.Proxy.IProxy;
import com.J_man_2000.Endergy.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static cpw.mods.fml.common.Mod.*;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION)


/**
 * Created by Jens on 23/09/2014.
 */
public class Endergy
{
    @Mod.Instance(Reference.MOD_ID)
    public static Endergy instance;

    @SidedProxy(clientSide = "com.J_man_2000.Endergy.Proxy.ClientProxy", serverSide = "com.J_man_2000.Endergy.Proxy.ServerProxy" )
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
//networkhandeling, mod config, ini items blocks
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

