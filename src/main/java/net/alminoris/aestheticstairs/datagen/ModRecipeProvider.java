package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItems;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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
            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.WOODEN_STICKS.get(name), 4)
                    .input('#', Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks")))
                    .pattern("# ")
                    .pattern(" #")
                    .criterion(hasItem(Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"))),
                            conditionsFromItem(Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"))))
                    .offerTo(recipeExporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', ModItems.WOODEN_STICKS.get(name))
                    .pattern("# #")
                    .pattern("###")
                    .pattern("# #")
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', ModItems.WOODEN_STICKS.get(name))
                    .pattern("# #")
                    .pattern("###")
                    .pattern("# #")
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STAIRCASES.get(name), 3)
                    .input('#', ModItems.WOODEN_STICKS.get(name))
                    .pattern("# #")
                    .pattern("###")
                    .pattern("# #")
                    .criterion(hasItem(ModItems.WOODEN_STICKS.get(name)), conditionsFromItem(ModItems.WOODEN_STICKS.get(name)))
                    .offerTo(recipeExporter);
        }
    }
}