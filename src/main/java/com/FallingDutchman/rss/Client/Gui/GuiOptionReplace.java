package com.FallingDutchman.rss.Client.Gui;

import com.FallingDutchman.rss.Logger;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;

public class GuiOptionReplace extends GuiOptions
{
    private GuiButton btnRssReset;

    public GuiOptionReplace(GuiScreen parentScreen, GameSettings settings)
    {
        super(parentScreen, settings);
    }

    public void initGui()
    {
        super.initGui();

        btnRssReset = new GuiButton(9998, this.width / 2 + 157, this.height / 6 + 66, 50, 20, "Reset");
        this.buttonList.add(btnRssReset);
    }

    protected void actionPerformed(GuiButton buttonPressed)
    {
        super.actionPerformed(buttonPressed);
        if(buttonPressed.id == 9998)
        {
            this.mc.entityRenderer.deactivateShader();
            Logger.info("No effect selected");
        }
    }
}
