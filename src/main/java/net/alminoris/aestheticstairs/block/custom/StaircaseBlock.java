package net.alminoris.aestheticstairs.block.custom;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItems;
import net.alminoris.aestheticstairs.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.List;

public class StaircaseBlock extends YAxisRotatedBlock
{
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 8, 16, 3, 16);

    private static final VoxelShape SHAPE1 = Block.createCuboidShape(0, 7, 0, 16, 10, 8);

    private static final VoxelShape SHAPELC = Block.createCuboidShape(0, 7, 8, 8, 10, 16);

    private static final VoxelShape RSHAPEC = Block.createCuboidShape(0, 0, 8, 8, 3, 16);

    private static final VoxelShape LSHAPEC = Block.createCuboidShape(8, 0, 8, 16, 3, 16);

    private static final VoxelShape SHAPEC = Block.createCuboidShape(0, 7, 0, 16, 10, 8);

    private static final VoxelShape SHAPERC = Block.createCuboidShape(8, 7, 8, 16, 10, 16);

    private static final VoxelShape SMALL_SHAPE = Block.createCuboidShape(0, 2, 11, 16, 4, 15);

    private static final VoxelShape SMALL_SHAPE1 = Block.createCuboidShape(0, 7, 5.5D, 16, 9, 9.5D);

    private static final VoxelShape SMALL_SHAPE2 = Block.createCuboidShape(0, 12, 0, 16, 14, 4);

    private static final VoxelShape SMALL_SHAPERC = Block.createCuboidShape(12, 12, 0, 16, 14, 16);

    private static final VoxelShape SMALL_SHAPERC1 = Block.createCuboidShape(6.5D, 7, 9.5D, 10.5D, 9, 16);

    private static final VoxelShape SMALL_SHAPERC2 = Block.createCuboidShape(1, 2, 15, 5, 4, 16);

    private static final VoxelShape SMALL_RSHAPEC = Block.createCuboidShape(0, 2, 11, 5, 4, 15);

    private static final VoxelShape SMALL_RSHAPEC1 = Block.createCuboidShape(0, 7, 5.5D, 10.5D, 9, 9.5D);

    private static final VoxelShape SMALL_RSHAPEC2 = Block.createCuboidShape(0, 12, 0, 16, 14, 4);

    private static final VoxelShape SMALL_SHAPELC = Block.createCuboidShape(0, 2, 0, 4, 14, 16);

    private static final VoxelShape SMALL_SHAPELC1 = Block.createCuboidShape(5.5D, 7, 11, 9.5D, 9, 16);

    private static final VoxelShape SMALL_SHAPELC2 = Block.createCuboidShape(11, 2, 15, 15, 4, 16);

    private static final VoxelShape SMALL_LSHAPEC = Block.createCuboidShape(9, 2, 11, 15, 4, 15);

    private static final VoxelShape SMALL_LSHAPEC1 = Block.createCuboidShape(4, 7, 5.5D, 9, 9, 9.5D);

    private static final VoxelShape SMALL_LSHAPEC2 = Block.createCuboidShape(0, 12, 0, 4, 14, 4);

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        LEFT("left"),
        RIGHT("right"),
        LEFTCORNER("leftcorner"),
        RIGHTCORNER("rightcorner"),
        CENTER("center"),
        UP("up"),
        UPLEFT("upleft"),
        UPRIGHT("upright"),
        UPCENTER("upcenter");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    public static final BooleanProperty RAILED = BooleanProperty.of("railed");

    private final String NAME;

    private final String BLOCK_NAME;

    public StaircaseBlock(Settings settings, String name, String blockName)
    {
        super(settings.nonOpaque());
        NAME = name;
        BLOCK_NAME = blockName;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(VARIANT, Variant.NORMAL).with(RAILED, false));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        Variant currentVariant = state.get(VARIANT);
        boolean currentRailed = state.get(RAILED);
        Direction currentFacing = state.get(FACING);

        if (player.getMainHandStack().isEmpty()
                && (currentVariant.equals(Variant.CENTER) || currentVariant.equals(Variant.UPCENTER)
                || currentVariant.equals(Variant.LEFTCORNER) || currentVariant.equals(Variant.RIGHTCORNER)))
        {
            return ActionResult.PASS;
        }

        if (!world.isClient)
        {
            ItemStack stack = player.getMainHandStack();

            boolean isStackFound = (!BLOCK_NAME.split("_")[0].equals("small") && stack.isOf(ModBlocks.STAIRAILS.get(NAME).asItem())) || (BLOCK_NAME.split("_")[0].equals("small") && stack.isOf(ModBlocks.SMALL_STAIRAILS.get(NAME).asItem()));

            if (!currentRailed && isStackFound && stack.getCount() >= 5)
            {
                stack.decrement(5);
                currentRailed = true;

                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(VARIANT, currentVariant)
                        .with(RAILED, currentRailed));

                return ActionResult.SUCCESS;
            }

            if (currentRailed && stack.isIn(ItemTags.AXES))
            {
                if (stack.getDamage() < stack.getMaxDamage() - 1)
                    stack.setDamage(stack.getDamage() + 1);
                else
                    stack.decrement(1);

                ItemStack stickStack = new ItemStack(ModItems.WOODEN_STICKS.get(NAME));
                stickStack.setCount(3);
                if (!player.getInventory().insertStack(stickStack))
                    player.dropItem(stickStack, false);

                currentRailed = false;

                world.setBlockState(pos, state
                        .with(FACING, currentFacing)
                        .with(VARIANT, currentVariant)
                        .with(RAILED, currentRailed));

                return ActionResult.SUCCESS;
            }
        }
        return super.onUse(state, world, pos, player, hand, hit);
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
            if (state.get(VARIANT) == Variant.LEFTCORNER)
            {
                boxes.add(SMALL_LSHAPEC.getBoundingBox());
                boxes.add(SMALL_LSHAPEC1.getBoundingBox());
                boxes.add(SMALL_LSHAPEC2.getBoundingBox());
                boxes.add(SMALL_SHAPELC.getBoundingBox());
                boxes.add(SMALL_SHAPELC1.getBoundingBox());
                boxes.add(SMALL_SHAPELC2.getBoundingBox());
            }
            else if (state.get(VARIANT) == Variant.RIGHTCORNER)
            {
                boxes.add(SMALL_RSHAPEC.getBoundingBox());
                boxes.add(SMALL_RSHAPEC1.getBoundingBox());
                boxes.add(SMALL_RSHAPEC2.getBoundingBox());
                boxes.add(SMALL_SHAPERC.getBoundingBox());
                boxes.add(SMALL_SHAPERC1.getBoundingBox());
                boxes.add(SMALL_SHAPERC2.getBoundingBox());
            }
            else
            {
                boxes.add(SMALL_SHAPE.getBoundingBox());
                boxes.add(SMALL_SHAPE1.getBoundingBox());
                boxes.add(SMALL_SHAPE2.getBoundingBox());
            }
        }
        else
        {
            if (state.get(VARIANT) == Variant.LEFTCORNER)
            {
                boxes.add(LSHAPEC.getBoundingBox());
                boxes.add(SHAPELC.getBoundingBox());
                boxes.add(SHAPEC.getBoundingBox());
            }
            else if (state.get(VARIANT) == Variant.RIGHTCORNER)
            {
                boxes.add(RSHAPEC.getBoundingBox());
                boxes.add(SHAPERC.getBoundingBox());
                boxes.add(SHAPEC.getBoundingBox());
            }
            else
            {
                boxes.add(SHAPE.getBoundingBox());
                boxes.add(SHAPE1.getBoundingBox());
            }
        }

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, WATERLOGGED, VARIANT, RAILED);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        return updateStaircaseVariant(state, world, pos);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);

        BlockState updatedSelf = updateStaircaseVariant(state, world, pos);
        if (updatedSelf != state)
            world.setBlockState(pos, updatedSelf, Block.NOTIFY_ALL);

        updateSurroundingStaircases(world, pos);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved)
    {
        super.onStateReplaced(state, world, pos, newState, moved);

        if (state.getBlock() != newState.getBlock())
        {
            for (Direction direction : Direction.Type.HORIZONTAL)
            {
                BlockPos diagonalAboveForward = pos.offset(direction).up(); // вперед і вгору
                BlockState neighborState = world.getBlockState(diagonalAboveForward);

                if (neighborState.getBlock() == this)
                {
                    BlockState updated = updateStaircaseVariant(neighborState, world, diagonalAboveForward);
                    if (updated != neighborState)
                        world.setBlockState(diagonalAboveForward, updated);
                }
            }
        }
    }

    private void updateSurroundingStaircases(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos diagonalAboveForward = pos.offset(direction).up(); // вперед і вгору
            BlockState neighborState = world.getBlockState(diagonalAboveForward);

            if (neighborState.getBlock() == this)
            {
                BlockState updated = updateStaircaseVariant(neighborState, world, diagonalAboveForward);
                if (updated != neighborState)
                    world.setBlockState(diagonalAboveForward, updated);
            }
        }
    }

    private BlockState updateStaircaseVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos diagonalBelowBehind = pos.offset(facing.getOpposite()).down();
        BlockState belowState = world.getBlockState(diagonalBelowBehind);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isStaircase(world, leftPos, facing, Variant.RIGHTCORNER);
        boolean rightConnected = isStaircase(world, rightPos, facing, Variant.LEFTCORNER);

        BlockPos diagonalAboveAhead = pos.offset(facing).up();
        BlockState aheadState = world.getBlockState(diagonalAboveAhead);

        if (state.get(VARIANT) == Variant.NORMAL && aheadState.getBlock() == this && aheadState.get(FACING) == facing)
        {
            Variant aheadVariant = aheadState.get(VARIANT);
            if (aheadVariant == Variant.RIGHT)
            {
                world.setBlockState(diagonalAboveAhead, aheadState.with(VARIANT, Variant.UPRIGHT), Block.NOTIFY_ALL);
                return state.with(VARIANT, Variant.RIGHT);
            }
            else if (aheadVariant == Variant.LEFT)
            {
                world.setBlockState(diagonalAboveAhead, aheadState.with(VARIANT, Variant.UPLEFT), Block.NOTIFY_ALL);
                return state.with(VARIANT, Variant.LEFT);
            }
            else if (aheadVariant == Variant.CENTER)
            {
                world.setBlockState(diagonalAboveAhead, aheadState.with(VARIANT, Variant.UPCENTER), Block.NOTIFY_ALL);
                return state.with(VARIANT, Variant.CENTER);
            }
        }

        if (belowState.getBlock() == this && belowState.get(FACING) == facing)
        {
            switch (belowState.get(VARIANT))
            {
                case CENTER, UPCENTER:
                    return state.with(VARIANT, Variant.UPCENTER);
                case RIGHT, UPRIGHT:
                    return state.with(VARIANT, Variant.UPRIGHT);
                case LEFT, UPLEFT:
                    return state.with(VARIANT, Variant.UPLEFT);
                case NORMAL, UP:
                    return state.with(VARIANT, Variant.UP);
            }
        }

        if (isStaircaseL(world, rightPos.offset(facing.rotateYCounterclockwise()).offset(facing.rotateYClockwise().rotateYClockwise()), facing))
        {
            return state.with(VARIANT, Variant.RIGHTCORNER);
        }
        else if (isStaircaseR(world, leftPos.offset(facing.rotateYClockwise()).offset(facing.rotateYCounterclockwise().rotateYCounterclockwise()), facing))
        {
            return state.with(VARIANT, Variant.LEFTCORNER);
        }
        else if (leftConnected && rightConnected)
        {
            return state.with(VARIANT, Variant.CENTER);
        }
        else if (leftConnected)
        {
            return state.with(VARIANT, Variant.RIGHT);
        }
        else if (rightConnected)
        {
            return state.with(VARIANT, Variant.LEFT);
        }
        else
        {
            return state.with(VARIANT, Variant.NORMAL);
        }
    }

    private boolean isStaircase(WorldAccess world, BlockPos pos, Direction expectedFacing, Variant variant)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() == this && (state.get(FACING) == expectedFacing || state.get(VARIANT) == variant);
    }

    private boolean isStaircaseL(WorldAccess world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() == this && state.get(FACING) == expectedFacing.rotateYClockwise();
    }

    private boolean isStaircaseR(WorldAccess world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);

        return state.getBlock() == this && state.get(FACING) == expectedFacing.rotateYCounterclockwise();
    }
}