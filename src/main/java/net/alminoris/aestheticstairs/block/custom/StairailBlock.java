package net.alminoris.aestheticstairs.block.custom;

import net.alminoris.aestheticstairs.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.List;

public class StairailBlock extends YAxisRotatedBlock
{
    private static final VoxelShape SHAPE = Block.createCuboidShape(7, 0, 0, 9, 15, 2);

    private static final VoxelShape SHAPESIDE = Block.createCuboidShape(0, 0, 0, 16, 15, 2);

    private static final VoxelShape SHAPERC = Block.createCuboidShape(14, 0, 0, 16, 15, 16);

    private static final VoxelShape SHAPELC = Block.createCuboidShape(0, 0, 0, 2, 15, 16);

    private static final VoxelShape SHAPE_HEAD = Block.createCuboidShape(6.5D, 15, -0.5D, 9.5D, 16, 2.5D);

    private static final VoxelShape SHAPESIDE_HEAD = Block.createCuboidShape(0, 15, -0.5D, 16, 16, 2.5D);

    private static final VoxelShape SHAPELC_HEAD = Block.createCuboidShape(-0.5D, 15, -0.5D, 2.5D, 16, 16);

    private static final VoxelShape SHAPERC_HEAD = Block.createCuboidShape(13.5D, 15, -0.5D, 16.5D, 16, 16);

    private static final VoxelShape SMALL_SHAPE = Block.createCuboidShape(7, 0, 0, 9, 12, 2);

    private static final VoxelShape SMALL_SHAPESIDE = Block.createCuboidShape(0, 0, 0, 16, 12, 2);

    private static final VoxelShape SMALL_SHAPERC = Block.createCuboidShape(14, 0, 0, 16, 12, 16);

    private static final VoxelShape SMALL_SHAPELC = Block.createCuboidShape(0, 0, 0, 2, 12, 16);

    private static final VoxelShape SMALL_SHAPE_HEAD = Block.createCuboidShape(6.5D, 12, -0.5D, 9.5D, 14.25D, 2.5D);

    private static final VoxelShape SMALL_SHAPESIDE_HEAD = Block.createCuboidShape(0, 12, -0.5D, 16, 14.25D, 2.5D);

    private static final VoxelShape SMALL_SHAPELC_HEAD = Block.createCuboidShape(-0.5D, 12, -0.5D, 2.5D, 14.25D, 16);

    private static final VoxelShape SMALL_SHAPERC_HEAD = Block.createCuboidShape(13.5D, 12, -0.5D, 16.5D, 14.25D, 16);

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        SIDE("side"),
        LEFTCORNER("leftcorner"),
        RIGHTCORNER("rightcorner");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    private final String BLOCK_NAME;

    public StairailBlock(Settings settings, String blockName)
    {
        super(settings.nonOpaque());
        BLOCK_NAME = blockName;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(VARIANT, Variant.NORMAL));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();

        if (BLOCK_NAME.split("_")[0].equals("small"))
        {
            switch (state.get(VARIANT))
            {
                case NORMAL:
                    boxes.add(SMALL_SHAPE_HEAD.getBoundingBox());
                    boxes.add(SMALL_SHAPE.getBoundingBox());
                    break;
                case SIDE:
                    boxes.add(SMALL_SHAPESIDE_HEAD.getBoundingBox());
                    boxes.add(SMALL_SHAPESIDE.getBoundingBox());
                    break;
                case LEFTCORNER:
                    boxes.add(SMALL_SHAPESIDE_HEAD.getBoundingBox());
                    boxes.add(SMALL_SHAPESIDE.getBoundingBox());
                    boxes.add(SMALL_SHAPELC_HEAD.getBoundingBox());
                    boxes.add(SMALL_SHAPELC.getBoundingBox());
                    break;
                case RIGHTCORNER:
                    boxes.add(SMALL_SHAPESIDE_HEAD.getBoundingBox());
                    boxes.add(SMALL_SHAPESIDE.getBoundingBox());
                    boxes.add(SMALL_SHAPERC_HEAD.getBoundingBox());
                    boxes.add(SMALL_SHAPERC.getBoundingBox());
                    break;
            }
        }
        else
        {
            switch (state.get(VARIANT))
            {
                case NORMAL:
                    boxes.add(SHAPE_HEAD.getBoundingBox());
                    boxes.add(SHAPE.getBoundingBox());
                    break;
                case SIDE:
                    boxes.add(SHAPESIDE_HEAD.getBoundingBox());
                    boxes.add(SHAPESIDE.getBoundingBox());
                    break;
                case LEFTCORNER:
                    boxes.add(SHAPESIDE_HEAD.getBoundingBox());
                    boxes.add(SHAPESIDE.getBoundingBox());
                    boxes.add(SHAPELC_HEAD.getBoundingBox());
                    boxes.add(SHAPELC.getBoundingBox());
                    break;
                case RIGHTCORNER:
                    boxes.add(SHAPESIDE_HEAD.getBoundingBox());
                    boxes.add(SHAPESIDE.getBoundingBox());
                    boxes.add(SHAPERC_HEAD.getBoundingBox());
                    boxes.add(SHAPERC.getBoundingBox());
                    break;
            }
        }



        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED, VARIANT);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        return updateStairailVariant(world, state, pos);
    }


    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);

        BlockState updatedState = updateStairailVariant(world, state, pos);
        if (!updatedState.equals(state))
        {
            world.setBlockState(pos, updatedState, Block.NOTIFY_ALL);
        }

        updateSurroundingStairails(world, pos);
    }


    private void updateSurroundingStairails(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() == this)
            {
                BlockState updatedState = updateStairailVariant(world, neighborState, neighborPos);
                if (!neighborState.equals(updatedState))
                {
                    world.setBlockState(neighborPos, updatedState);
                }
            }
        }
    }

    private BlockState updateStairailVariant(WorldAccess world, BlockState state, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        if (isStairailL(world, rightPos.offset(facing.rotateYCounterclockwise()).offset(facing.rotateYClockwise().rotateYClockwise()), facing))
        {
            return state.with(VARIANT, Variant.RIGHTCORNER);
        } else if (isStairailR(world, leftPos.offset(facing.rotateYClockwise()).offset(facing.rotateYCounterclockwise().rotateYCounterclockwise()), facing))
        {
            return state.with(VARIANT, Variant.LEFTCORNER);
        }

        boolean leftConnected = isStairail(world, leftPos, facing, Variant.RIGHTCORNER);
        boolean rightConnected = isStairail(world, rightPos, facing, Variant.LEFTCORNER);

        if (leftConnected || rightConnected)
        {
            return state.with(VARIANT, Variant.SIDE);
        }

        return state.with(VARIANT, Variant.NORMAL);
    }

    private boolean isStairail(WorldAccess world, BlockPos pos, Direction expectedFacing, Variant variant)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() == this && (state.get(FACING) == expectedFacing || state.get(VARIANT) == variant);
    }

    private boolean isStairailL(WorldAccess world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() == this && state.get(FACING) == expectedFacing.rotateYClockwise();
    }

    private boolean isStairailR(WorldAccess world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() == this && state.get(FACING) == expectedFacing.rotateYCounterclockwise();
    }
}