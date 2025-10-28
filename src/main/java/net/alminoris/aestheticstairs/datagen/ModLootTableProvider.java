package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            addDrop(ModBlocks.SMALL_STAIRS.get(name));
            addDrop(ModBlocks.SMALL_HALFSTAIRS.get(name));
            addDrop(ModBlocks.STAIRCASES.get(name));
            addDrop(ModBlocks.SMALL_STAIRCASES.get(name));
            addDrop(ModBlocks.STAIRAILS.get(name));
            addDrop(ModBlocks.SMALL_STAIRAILS.get(name));
        }
    }
}