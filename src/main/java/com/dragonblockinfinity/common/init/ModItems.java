package com.dragonblockinfinity.common.init;

import com.dragonblockinfinity.common.items.SenzuItem;
import com.dragonblockinfinity.common.items.DinoMeatItem;
import com.dragonblockinfinity.common.items.DinoMeatCookedItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "dragonblockinfinity");

    public static final RegistryObject<Item> SENZU = ITEMS.register("senzu",
            () -> new SenzuItem(new Item.Properties()));
    public static final RegistryObject<Item> DINO_MEAT = ITEMS.register("dino_meat",
            () -> new DinoMeatItem(new Item.Properties()));
    public static final RegistryObject<Item> DINO_MEAT_COOKED = ITEMS.register("dino_meat_cooked",
            () -> new DinoMeatCookedItem(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
