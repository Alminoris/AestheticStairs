package net.alminoris.aestheticstairs.block;

import net.alminoris.aestheticstairs.AestheticStairs;
import net.alminoris.aestheticstairs.block.custom.StairailBlock;
import net.alminoris.aestheticstairs.block.custom.StaircaseBlock;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> STAIRCASES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("staircase_"+name, new StaircaseBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), name, "staircase_"+name)));
        }
    }};

    public static final Dictionary<String, Block> SMALL_STAIRCASES = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("small_staircase_"+name, new StaircaseBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), name, "small_staircase_"+name)));
        }
    }};

    public static final Dictionary<String, Block> STAIRAILS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("stairail_"+name, new StairailBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), "stairail_"+name)));
        }
    }};

    public static final Dictionary<String, Block> SMALL_STAIRAILS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("small_stairail_"+name, new StairailBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS), "small_stairail"+name)));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticStairs.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticStairs.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}