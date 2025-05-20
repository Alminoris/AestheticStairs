package net.alminoris.aestheticstairs.item;

import net.alminoris.aestheticstairs.AestheticStairs;
import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper"
            };

    public static final ItemGroup ALADRS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticStairs.MOD_ID, "aladrstab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aladrstab"))
                    .icon(() -> new ItemStack(Blocks.LADDER)).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.STAIRCASES.get(name));

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModItems.WOODEN_STICKS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModItems.WOODEN_STICKS.get(name));
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModItems.WOODEN_STICKS.get(name));
                            }
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}