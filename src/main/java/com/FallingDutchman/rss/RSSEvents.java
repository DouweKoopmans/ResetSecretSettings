package com.FallingDutchman.rss;

import com.FallingDutchman.rss.Client.Gui.GuiOptionReplace;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiOptions;
import net.minecraftforge.client.event.GuiOpenEvent;

public class RSSEvents
{
    public static RSSEvents instance = new RSSEvents();

    protected static final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void GuiOpenEvent(GuiOpenEvent event)
    {
        if (event.gui instanceof GuiOptions && mc.theWorld != null)
        {
           event.gui = new GuiOptionReplace(new GuiIngameMenu(), mc.gameSettings);
        }
    }
}
