package net.alminoris.aestheticstairs;

import net.alminoris.aestheticstairs.datagen.ModBlockTagProvider;
import net.alminoris.aestheticstairs.datagen.ModLootTableProvider;
import net.alminoris.aestheticstairs.datagen.ModModelProvider;
import net.alminoris.aestheticstairs.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticStairsDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
	}
}
