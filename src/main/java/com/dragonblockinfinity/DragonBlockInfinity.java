package com.dragonblockinfinity;

import com.dragonblockinfinity.common.init.ModBlocks;
import com.dragonblockinfinity.common.init.ModItems;
import com.dragonblockinfinity.common.init.ModCreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DragonBlockInfinity.MOD_ID)
public class DragonBlockInfinity {

    public static final String MOD_ID = "dragonblockinfinity";

    public DragonBlockInfinity() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

    

        System.out.println("=== DRAGON BLOCK INFINITY CARREGADO ===");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            System.out.println("[DBI] Common setup...");
            // NetworkHandler.register(); // descomente se disponível
        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            System.out.println("[DBI] Client setup concluído!");
        });
    }
}
