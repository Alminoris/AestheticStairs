package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block = Registries.BLOCK.get(Identifier.ofVanilla("stripped_"+name+"_"+blockName));

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("#  ")
                    .pattern("/# ")
                    .pattern(" /#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("# ")
                    .pattern("/#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STAIRAILS.get(name), 4)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("/#/")
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SMALL_STAIRAILS.get(name), 3)
                    .input('#', block)
                    .input('/', Items.STICK)
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "arborealnature:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "wildfields:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "silverwoodtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "whisperleaftrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "missingtrees:stripped_" + name + "_log", "minecraft:stick",
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
        {
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