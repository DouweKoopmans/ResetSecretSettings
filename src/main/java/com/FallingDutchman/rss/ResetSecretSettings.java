package com.FallingDutchman.rss;

import com.FallingDutchman.rss.proxy.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod
        (
            modid = Refrences.MODID,
            name = Refrences.MODNAME,
            version = Refrences.MODVERSION
        )

public class ResetSecretSettings
{
    @Mod.Instance("com.FallingDutchman.rss.ResetSecretSettings")
    public static ResetSecretSettings instance;

    @SidedProxy
            (clientSide = Refrences.CLIENT_PROXY_CLASS)
    public static ClientProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        proxy.registerEvents(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.initMod();
    }
}
