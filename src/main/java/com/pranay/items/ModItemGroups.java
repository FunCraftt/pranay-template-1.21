package com.pranay.items;

import com.pranay.Pranay;
import com.pranay.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier; // Ensure this import is present

public class ModItemGroups {

    // Create the custom item group using Identifier.tryParse()
    public static final ItemGroup BIOSTEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(Pranay.MOD_ID + ":biosteel"),  // Use tryParse for identifier
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pranay.biosteel")) // Name in the creative inventory
                    .icon(() -> new ItemStack(ModItems.BIOSTEEL)) // Icon for the item group (Make sure ModItems.BIOSTEEL exists)
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BIOSTEEL); // Add the BioSteel item to the custom group
                        entries.add(ModBlocks.BioSteel_Ore);
                        entries.add(ModBlocks.BioSteel_Block);
                    })
                    .build()
    );

    // Register the item group
    public static void registerModItemGroups() {
        Pranay.LOGGER.info("Registering Mod Item Groups for " + Pranay.MOD_ID);
    }
}
