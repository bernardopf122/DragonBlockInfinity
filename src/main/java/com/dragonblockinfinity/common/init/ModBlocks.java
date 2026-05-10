package com.dragonblockinfinity.common.init;

import com.dragonblockinfinity.common.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "dragonblockinfinity");

    public static final RegistryObject<Block> NAMEK_GRASS = BLOCKS.register("namek_grass",
            () -> new NamekGrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> NAMEK_LOG = BLOCKS.register("namek_log",
            () -> new NamekLog(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> NAMEK_LEAVES = BLOCKS.register("namek_leaves",
            () -> new NamekLeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> NAMEK_DIRT = BLOCKS.register("namek_dirt",
            () -> new NamekDirtBlock(Block.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> DIRTYSTONE = BLOCKS.register("dirtystone",
            () -> new DirtystoneBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DIRTYSTONE_COBBLESTONE = BLOCKS.register("dirtystone_cobblestone",
            () -> new DirtystoneCobblestoneBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DIRTYSTONE_STONE = BLOCKS.register("dirtystone_stone",
            () -> new DirtystoneStoneBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LOOKOUT_FLOOR_RED = BLOCKS.register("lookout_floor_red",
            () -> new LookoutFloorRedBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LOOKOUT_FLOOR_WHITE = BLOCKS.register("lookout_floor_white",
            () -> new LookoutFloorWhiteBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LOOKOUT_WALL = BLOCKS.register("lookout_wall",
            () -> new LookoutWallBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LOOKOUT_YELLOW_BLOCK = BLOCKS.register("lookout_yellow_block",
            () -> new LookoutYellowBlock(Block.Properties.copy(Blocks.STONE)));

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
