package com.dragonblockinfinity.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;

public class NamekLog extends RotatedPillarBlock {

    protected static final VoxelShape SHAPE_Y = Shapes.box(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);
    protected static final VoxelShape SHAPE_X = Shapes.box(0.0, 0.375, 0.375, 1.0, 0.625, 0.625);
    protected static final VoxelShape SHAPE_Z = Shapes.box(0.375, 0.375, 0.0, 0.625, 0.625, 1.0);

    public NamekLog(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(AXIS)) {
            case X -> SHAPE_X;
            case Z -> SHAPE_Z;
            default -> SHAPE_Y;
        };
    }
}
