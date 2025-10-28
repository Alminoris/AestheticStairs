package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItemGroups;
import net.alminoris.aestheticstairs.item.ModItems;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    private static final Dictionary<String, Block> SECONDARY_STONES = new Hashtable<>()
    {{
        put("stone", Blocks.COBBLESTONE);
        put("tuff", Blocks.TUFF);
        put("blackstone", Blocks.POLISHED_BLACKSTONE);
        put("andesite", Blocks.POLISHED_ANDESITE);
        put("diorite", Blocks.POLISHED_DIORITE);
        put("granite", Blocks.POLISHED_GRANITE);
        put("deepslate", Blocks.POLISHED_DEEPSLATE);
        put("basalt_side", Blocks.SMOOTH_BASALT);
        put("quartz_block_bottom", Blocks.QUARTZ_PILLAR);
        put("stone_bricks", Blocks.SMOOTH_STONE);
        put("bricks", Blocks.CHISELED_STONE_BRICKS);
        put("mud_bricks", Blocks.PACKED_MUD);
        put("sandstone", Blocks.SANDSTONE);
    }};

    public ModRecipeProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registry.BLOCK.get(new Identifier("minecraft", name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRS.get(name), 3)
                    .input('#', block)
                    .pattern("# ")
                    .pattern("##")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_HALFSTAIRS.get(name), 3)
                    .input('#', block)
                    .pattern("# ")
                    .pattern(" #")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', SECONDARY_STONES.get(name))
                    .pattern("#  ")
                    .pattern("/# ")
                    .pattern(" /#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', SECONDARY_STONES.get(name))
                    .pattern("# ")
                    .pattern("/#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.STAIRAILS.get(name), 4)
                    .input('#', block)
                    .input('/', SECONDARY_STONES.get(name))
                    .pattern("/#/")
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRAILS.get(name), 3)
                    .input('#', block)
                    .input('/', SECONDARY_STONES.get(name))
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .offerTo(recipeExporter);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "wildfields:" + name,
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "wildfields:" + name,
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "wildfields:" + name, "wildfields:" + name.replace("block", "cobbled"),
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "wildfields:" + name, "wildfields:" + name.replace("block", "cobbled"),
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "wildfields:" + name, "wildfields:" + name.replace("block", "cobbled"),
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "wildfields:" + name, "wildfields:" + name.replace("block", "cobbled"),
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block = Registry.BLOCK.get(new Identifier("minecraft", "stripped_"+name+"_"+blockName));
            Block block1 = Registry.BLOCK.get(new Identifier("minecraft",name+"_planks"));

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRS.get(name), 3)
                    .input('#', block1)
                    .pattern("# ")
                    .pattern("##")
                    .criterion(hasItem(block1), conditionsFromItem(block1))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_HALFSTAIRS.get(name), 3)
                    .input('#', block1)
                    .pattern("# ")
                    .pattern(" #")
                    .criterion(hasItem(block1), conditionsFromItem(block1))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("#  ")
                    .pattern("/# ")
                    .pattern(" /#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("# ")
                    .pattern("/#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.STAIRAILS.get(name), 4)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("/#/")
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRAILS.get(name), 3)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "arborealnature:" + name + "_planks",
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "arborealnature:" + name + "_planks",
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "wildfields:" + name + "_planks",
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "wildfields:" + name + "_planks",
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "silverwoodtrees:" + name + "_planks",
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "silverwoodtrees:" + name + "_planks",
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "whisperleaftrees:" + name + "_planks",
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "whisperleaftrees:" + name + "_planks",
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "missingtrees:" + name + "_planks",
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "missingtrees:" + name + "_planks",
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("small_stairs_"+name, "3", "natures_spirit:" + name.replace("_nss", "") + "_planks",
                    "\"#  \",", "\"## \"", "");

            ModJsonHelper.createShapedRecipe("small_halfstairs_"+name, "3", "natures_spirit:" + name.replace("_nss", "") + "_planks",
                    "\"#  \",", "\" # \"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "natures_spirit:stripped_" + name.replace("_nss", "") + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }
    }
}