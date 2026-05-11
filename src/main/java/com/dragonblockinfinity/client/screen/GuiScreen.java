package com.dragonblockinfinity.client.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class GuiScreen extends Screen {

    private static final ResourceLocation GuiScreen = new ResourceLocation("dragonblockinfinity", "textures/gui/menus/menu_base.png");

    private int GuiScreenWidth = 256;
    private int GuiScreenHeight = 200;

    public GuiScreen() {
        super(Component.literal("Dragon Block Infinity GUI"));
    }

    @Override
    public void renderBackground(GuiGraphics graphics) {
        graphics.blit(GuiScreen, 0, 0, 0, 0, this.width, this.height);
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(graphics);
        graphics.blit(GuiScreen,
            (this.width - GuiScreenWidth) / 2,
            (this.height - GuiScreenHeight) / 2,
            0, 0, GuiScreenWidth, GuiScreenHeight
        );
        super.render(graphics, mouseX, mouseY, partialTicks);
    }
}
