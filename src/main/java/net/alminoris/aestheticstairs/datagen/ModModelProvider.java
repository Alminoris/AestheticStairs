package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItems;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonHelper;
import net.alminoris.aestheticstairs.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            ModJsonHelper.createBlockModel(ModJsonTemplates.LADDER_BLOCK_MODEL, name+"_ladder");
            blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STAIRCASES.get(name));
            blockStateModelGenerator.registerItemModel(ModBlocks.STAIRCASES.get(name));
        }
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