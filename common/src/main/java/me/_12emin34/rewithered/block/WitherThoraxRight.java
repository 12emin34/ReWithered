package me._12emin34.rewithered.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WitherThoraxRight extends Block {
    static final VoxelShape SHAPE = makeShape().optimize();

    public WitherThoraxRight(Properties properties) {
        super(properties);
    }

    public static VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0, 1, 0.125, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.25, 0, 1, 0.375, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.5, 0, 1, 0.625, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0, 1, 0.875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.5, 0, 0.125, 0.625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.25, 0, 0.125, 0.375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 0.125, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.75, 0, 0.125, 0.875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.875, 0.3125, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.25, 0.875, 0.4375, 0.375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.5, 0.875, 0.5625, 0.625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.75, 0.875, 0.6875, 0.875, 1), BooleanOp.OR);

        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }
}
