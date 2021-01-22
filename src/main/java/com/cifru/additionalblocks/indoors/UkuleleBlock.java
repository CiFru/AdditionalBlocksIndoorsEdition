package com.cifru.additionalblocks.indoors;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class UkuleleBlock extends HorizontalRotationBlock {

    private static final VoxelShape SHAPE = VoxelShapes.or(
            VoxelShapes.create(4.5/16, 0, 6.5/16, 11.5/16, 5d/16, 9.5/16),
            VoxelShapes.create(5.5/16, 5d/16, 6.5/16, 10.5/16, 9d/16, 9.5/16),
            VoxelShapes.create(7d/16, 9d/16, 7.5/16, 9d/16, 9.5/16, 8.5/16),
            VoxelShapes.create(7d/16, 9d/16, 6.5/16, 9d/16, 16d/16, 7.5/16),
            VoxelShapes.create(7d/16, 14.5d/16, 7.5/16, 9d/16, 16d/16, 8d/16)
    );

    /**
     * Credits to wyn_price
     * @see <a href="https://forums.minecraftforge.net/topic/74979-1144-rotate-voxel-shapes/?do=findComment&comment=391969">Minecraft Forge forum post</a>
     */
    public static VoxelShape rotateShape(Direction from, Direction to, VoxelShape shape){
        VoxelShape[] buffer = new VoxelShape[]{shape, VoxelShapes.empty()};

        int times = (to.getHorizontalIndex() - from.getHorizontalIndex() + 4) % 4;
        for(int i = 0; i < times; i++){
            buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1], VoxelShapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        return buffer[0];
    }

    public UkuleleBlock(String registryName, boolean reversePlacement, Properties properties) {
        super(registryName, reversePlacement, properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.get(BlockProperties.HORIZONTAL_FACING);
        return rotateShape(Direction.NORTH, direction, SHAPE);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        Random random = new Random();
        int randomsound = random.nextInt(4);
        if (randomsound == 0)
            player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_BANJO, 1, 1.059463f);
        else if (randomsound == 1)
            player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_BANJO, 1, 0.707107f);
        else if (randomsound == 2)
            player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_BANJO, 1, 0.890899f);
        else if (randomsound == 3)
            player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_BANJO, 1, 1.189207f);
        if (worldIn.isRemote)
            return ActionResultType.SUCCESS;
        return ActionResultType.CONSUME;
    }
}
