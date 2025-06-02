package net.alminoris.aestheticstairs.item;

import net.alminoris.aestheticstairs.AestheticStairs;
import net.alminoris.aestheticstairs.util.helper.BlockSetsHelper;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModItems
{
    public static final Dictionary<String, Item> WOODEN_STICKS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerItem(name+"_stick", new Item(new Item.Settings().group(ModItemGroups.ASTAIRS_TAB))));
        }
    }};

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, Identifier.of(AestheticStairs.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
