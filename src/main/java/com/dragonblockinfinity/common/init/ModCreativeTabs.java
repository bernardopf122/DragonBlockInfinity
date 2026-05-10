package com.dragonblockinfinity.common.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, "dragonblockinfinity");

    public static final RegistryObject<CreativeModeTab> DRAGON_BLOCK_TAB =
        CREATIVE_MODE_TABS.register("dragon_block_tab",
            () -> CreativeModeTab.builder()
                .title(net.minecraft.network.chat.Component.literal("Dragon Block Infinity"))
                .icon(() -> new ItemStack(ModBlocks.NAMEK_GRASS.get()))
                .displayItems((parameters, output) -> {
                    output.accept(new ItemStack(ModBlocks.NAMEK_GRASS.get()));
                    output.accept(new ItemStack(ModBlocks.NAMEK_LOG.get()));
                    output.accept(new ItemStack(ModBlocks.NAMEK_LEAVES.get()));
                    output.accept(new ItemStack(ModBlocks.NAMEK_DIRT.get()));
                    output.accept(new ItemStack(ModBlocks.DIRTYSTONE.get()));
                    output.accept(new ItemStack(ModBlocks.DIRTYSTONE_COBBLESTONE.get()));
                    output.accept(new ItemStack(ModBlocks.DIRTYSTONE_STONE.get()));
                    output.accept(new ItemStack(ModBlocks.LOOKOUT_FLOOR_RED.get()));
                    output.accept(new ItemStack(ModBlocks.LOOKOUT_FLOOR_WHITE.get()));
                    output.accept(new ItemStack(ModBlocks.LOOKOUT_WALL.get()));
                    output.accept(new ItemStack(ModBlocks.LOOKOUT_YELLOW_BLOCK.get()));
                })
                .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
