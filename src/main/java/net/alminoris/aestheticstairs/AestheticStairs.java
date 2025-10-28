package net.alminoris.aestheticstairs;

import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.item.ModItemGroups;
import net.alminoris.aestheticstairs.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AestheticStairs implements ModInitializer
{
	public static final String MOD_ID = "aestheticstairs";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}