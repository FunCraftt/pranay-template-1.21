package com.pranay.items;

import com.pranay.Pranay;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Register an item (example item registration)
    public static final Item BIOSTEEL = registerItem(new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BIOSTEEL);
    }

    private static Item registerItem(Item item) {
        // Use tryParse method instead of the private constructor
        return Registry.register(Registries.ITEM, Identifier.tryParse(Pranay.MOD_ID + ":" + "biosteel"), item);
    }

    public static void registerModItems() {
        // Register items when this method is called
        Pranay.LOGGER.info("Registering Mod Items for " + Pranay.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
