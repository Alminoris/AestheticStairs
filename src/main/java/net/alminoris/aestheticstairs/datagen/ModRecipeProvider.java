package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItems;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block = Registry.BLOCK.get(new Identifier("minecraft","stripped_"+name+"_"+blockName));

            ShapedRecipeJsonBuilder.create(ModItems.WOODEN_STICKS.get(name), 4)
                    .input('#', Registry.BLOCK.get(new Identifier("minecraft",name+"_planks")))
                    .pattern("# ")
                    .pattern(" #")
                    .criterion(hasItem(Registry.BLOCK.get(new Identifier("minecraft",name+"_planks"))),
                            conditionsFromItem(Registry.BLOCK.get(new Identifier("minecraft",name+"_planks"))))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', ModItems.WOODEN_STICKS.get(name))
                    .pattern("#  ")
                    .pattern("/# ")
                    .pattern(" /#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRCASES.get(name), 3)
                    .input('#', block)
                    .input('/', ModItems.WOODEN_STICKS.get(name))
                    .pattern("# ")
                    .pattern("/#")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.STAIRAILS.get(name), 4)
                    .input('#', block)
                    .input('/', ModItems.WOODEN_STICKS.get(name))
                    .pattern("/#/")
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(ModBlocks.SMALL_STAIRAILS.get(name), 3)
                    .input('#', block)
                    .input('/', ModItems.WOODEN_STICKS.get(name))
                    .pattern("/#/")
                    .criterion(hasItem(block), conditionsFromItem(block))
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createShapedRecipe(name+"_stick", "4", "arborealnature:" + name + "_planks",
                    "\"# \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "arborealnature:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "arborealnature:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "arborealnature:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "arborealnature:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"/#/\"", "", "");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createShapedRecipe(name+"_stick", "4", "wildfields:" + name + "_planks",
                    "\"# \",", "\" #\"", "");

            ModJsonHelper.createShapedRecipe("staircase_"+name, "3", "wildfields:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"#  \",", "\"/# \",", "\" /#\"");

            ModJsonHelper.createShapedRecipe("small_staircase_"+name, "3", "wildfields:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"# \",", "\"/#\"", "");

            ModJsonHelper.createShapedRecipe("stairail_"+name, "3", "wildfields:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"/#/\",", "\"/#/\"", "");

            ModJsonHelper.createShapedRecipe("small_stairail_"+name, "3", "wildfields:stripped_" + name + "_log", "aestheticstairs:" + name + "_stick",
                    "\"/#/\"", "", "");
        }
    }
}