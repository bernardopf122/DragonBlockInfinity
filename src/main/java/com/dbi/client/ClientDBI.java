package com.dbi.client;

import com.dbi.DBI;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class ClientDBI implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(DBI.DINO1,
            (dispatcher, context) -> new Dino1Renderer(dispatcher));
    }
}
