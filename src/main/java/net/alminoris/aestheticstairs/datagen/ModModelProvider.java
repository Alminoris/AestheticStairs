package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.AestheticStairs;
import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItems;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            registerStaircase(blockStateModelGenerator,  ModBlocks.STAIRCASES.get(name),"minecraft:block/", "staircase_"+name, "stripped_"+name+"_"+logName, name+"_"+logName);
            registerSmallStaircase(blockStateModelGenerator,  ModBlocks.SMALL_STAIRCASES.get(name),"minecraft:block/", "small_staircase_"+name, "stripped_"+name+"_"+logName, name+"_"+logName);

            registerStairail(blockStateModelGenerator,  ModBlocks.STAIRAILS.get(name),"minecraft:block/", "stairail_"+name, "stripped_"+name+"_"+logName, name+"_"+logName);
            registerSmallStairail(blockStateModelGenerator,  ModBlocks.SMALL_STAIRAILS.get(name),"minecraft:block/", "small_stairail_"+name, "stripped_"+name+"_"+logName, name+"_"+logName);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            registerStaircase(blockStateModelGenerator,  ModBlocks.STAIRCASES.get(name),"aestheticstairs:block/", "staircase_"+name, "stripped_"+name+"_log", name+"_log");
            registerSmallStaircase(blockStateModelGenerator,  ModBlocks.SMALL_STAIRCASES.get(name),"aestheticstairs:block/", "small_staircase_"+name, "stripped_"+name+"_log", name+"_log");

            registerStairail(blockStateModelGenerator,  ModBlocks.STAIRAILS.get(name),"aestheticstairs:block/", "stairail_"+name, "stripped_"+name+"_log", name+"_log");
            registerSmallStairail(blockStateModelGenerator,  ModBlocks.SMALL_STAIRAILS.get(name),"aestheticstairs:block/", "small_stairail_"+name, "stripped_"+name+"_log", name+"_log");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            registerStaircase(blockStateModelGenerator, ModBlocks.STAIRCASES.get(name), "aestheticstairs:block/", "staircase_"+name, "stripped_"+name+"_log", name+"_log");
            registerSmallStaircase(blockStateModelGenerator,  ModBlocks.SMALL_STAIRCASES.get(name),"aestheticstairs:block/", "small_staircase_"+name, "stripped_"+name+"_log", name+"_log");

            registerStairail(blockStateModelGenerator,  ModBlocks.STAIRAILS.get(name),"aestheticstairs:block/", "stairail_"+name, "stripped_"+name+"_log", name+"_log");
            registerSmallStairail(blockStateModelGenerator,  ModBlocks.SMALL_STAIRAILS.get(name),"aestheticstairs:block/", "small_stairail_"+name, "stripped_"+name+"_log", name+"_log");
        }
    }

    public void registerStaircase(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName, String legName)
    {
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE, name, modId+baseName, modId+legName, "normal", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_LEFT, name, modId+baseName, modId+legName, "left", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_RIGHT, name, modId+baseName, modId+legName, "right", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_CENTER, name, modId+baseName, modId+legName, "center", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UP, name, modId+baseName, modId+legName, "up", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UPLEFT, name, modId+baseName, modId+legName, "upleft", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UPRIGHT, name, modId+baseName, modId+legName, "upright", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UPCENTER, name, modId+baseName, modId+legName, "upcenter", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_LEFTCORNER, name, modId+baseName, modId+legName, "leftcorner", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_RIGHTCORNER, name, modId+baseName, modId+legName, "rightcorner", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_RAILED, name, modId+baseName, modId+legName, "normal", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_LEFT_RAILED, name, modId+baseName, modId+legName, "left", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_RIGHT_RAILED, name, modId+baseName, modId+legName, "right", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UP_RAILED, name, modId+baseName, modId+legName, "up", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UPLEFT_RAILED, name, modId+baseName, modId+legName, "upleft", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRCASE_UPRIGHT_RAILED, name, modId+baseName, modId+legName, "upright", true);
        ModJsonHelper.createBlockstate(ModJsonTemplates.STAIRCASE_BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticStairs.MOD_ID, "block/"+ name));
    }

    public void registerSmallStaircase(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName, String legName)
    {
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE, name, modId+baseName, modId+legName, "normal", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_LEFT, name, modId+baseName, modId+legName, "left", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_RIGHT, name, modId+baseName, modId+legName, "right", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_CENTER, name, modId+baseName, modId+legName, "center", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UP, name, modId+baseName, modId+legName, "up", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UPLEFT, name, modId+baseName, modId+legName, "upleft", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UPRIGHT, name, modId+baseName, modId+legName, "upright", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UPCENTER, name, modId+baseName, modId+legName, "upcenter", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_LEFTCORNER, name, modId+baseName, modId+legName, "leftcorner", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_RIGHTCORNER, name, modId+baseName, modId+legName, "rightcorner", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_RAILED, name, modId+baseName, modId+legName, "normal", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_LEFT_RAILED, name, modId+baseName, modId+legName, "left", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_RIGHT_RAILED, name, modId+baseName, modId+legName, "right", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UP_RAILED, name, modId+baseName, modId+legName, "up", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UPLEFT_RAILED, name, modId+baseName, modId+legName, "upleft", true);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRCASE_UPRIGHT_RAILED, name, modId+baseName, modId+legName, "upright", true);
        ModJsonHelper.createBlockstate(ModJsonTemplates.STAIRCASE_BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticStairs.MOD_ID, "block/"+ name));
    }

    public void registerStairail(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName, String legName)
    {
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRAIL, name, modId+baseName, modId+legName, "normal", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRAIL_SIDE, name, modId+baseName, modId+legName, "side", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRAIL_LEFTCORNER, name, modId+baseName, modId+legName, "leftcorner", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.STAIRAIL_RIGHTCORNER, name, modId+baseName, modId+legName, "rightcorner", false);
        ModJsonHelper.createBlockstate(ModJsonTemplates.STAIRAIL_BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticStairs.MOD_ID, "block/"+ name+"_side"));
    }

    public void registerSmallStairail(BlockStateModelGenerator blockStateModelGenerator, Block block, String modId, String name, String baseName, String legName)
    {
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRAIL, name, modId+baseName, modId+legName, "normal", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRAIL_SIDE, name, modId+baseName, modId+legName, "side", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRAIL_LEFTCORNER, name, modId+baseName, modId+legName, "leftcorner", false);
        ModJsonHelper.createStaircase(ModJsonTemplates.SMALL_STAIRAIL_RIGHTCORNER, name, modId+baseName, modId+legName, "rightcorner", false);
        ModJsonHelper.createBlockstate(ModJsonTemplates.STAIRAIL_BLOCKSTATE, name);
        blockStateModelGenerator.registerParentedItemModel(block, Identifier.of(AestheticStairs.MOD_ID, "block/"+ name+"_side"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            itemModelGenerator.register(ModItems.WOODEN_STICKS.get(name), Models.GENERATED);
        }
    }
}