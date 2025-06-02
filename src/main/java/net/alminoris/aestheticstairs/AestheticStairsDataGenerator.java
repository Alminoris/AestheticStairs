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
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
