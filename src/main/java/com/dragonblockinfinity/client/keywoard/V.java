package com.dragonblockinfinity.client.keywoard;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class V extends KeyMapping {

    public V() {
        super("key.dragonblockinfinity.V", 86, "key.categories.dragonblockinfinity");
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.Key event) {
        if (this.isDown()) {

        }
    }
}
