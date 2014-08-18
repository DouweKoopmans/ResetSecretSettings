package com.FallingDutchman.rss.proxy;

import com.FallingDutchman.rss.RSSEvents;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy
{
    public void registerEvents(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(RSSEvents.instance);
    }
    public void initMod(){}
}
