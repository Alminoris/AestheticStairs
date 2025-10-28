package net.alminoris.aestheticstairs.datagen;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
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