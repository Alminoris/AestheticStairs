package net.alminoris.aestheticstairs.item;

import net.alminoris.aestheticstairs.AestheticStairs;
import net.alminoris.aestheticstairs.block.ModBlocks;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.alminoris.aestheticstairs.util.helper.BlockSetsHelper.*;

public class ModItemGroups
{
    public static final ItemGroup ASTAIRS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticStairs.MOD_ID, "astairstab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astairstab"))
                    .icon(() -> new ItemStack(ModBlocks.STAIRCASES.get("oak"))).entries((displayContext, entries) ->
                    {
                        for(String name : STONES)
                            entries.add(ModBlocks.STAIRCASES.get(name));

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        for(String name : STONES)
                            entries.add(ModBlocks.SMALL_STAIRCASES.get(name));

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        for(String name : STONES)
                            entries.add(ModBlocks.STAIRAILS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        for(String name : STONES)
                            entries.add(ModBlocks.SMALL_STAIRAILS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        for(String name : STONES)
                            entries.add(ModBlocks.SMALL_STAIRS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        for(String name : STONES)
                            entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.STAIRCASES.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRCASES.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.SMALL_STAIRCASES.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRCASES.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.STAIRAILS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.STAIRAILS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.SMALL_STAIRAILS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRAILS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.SMALL_STAIRS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_STAIRS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                            entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("silverwoodtrees"))
                        {
                            for(String name : ST_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("whisperleaftrees"))
                        {
                            for(String name : WT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("missingtrees"))
                        {
                            for(String name : MT_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("natures_spirit"))
                        {
                            for(String name : NSS_WOOD_NAMES)
                            {
                                entries.add(ModBlocks.SMALL_HALFSTAIRS.get(name));
                            }
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}