package com.pranay.blocks;

import com.pranay.Pranay;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item.Settings;

public class ModBlocks {

    public static final Block BioSteel_Ore = registerBlock("biosteel_ore",new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.IRON_ORE)));
    public static final Block BioSteel_Block = registerBlock("biosteel_block",new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    // Register a block and its BlockItem
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        // Use Identifier.tryParse() to handle Identifier creation
        return Registry.register(Registries.BLOCK, Identifier.tryParse(Pranay.MOD_ID + ":" + name), block);
    }

    // Register the BlockItem for a Block
    private static Item registerBlockItem(String name, Block block) {
        // Use Identifier.tryParse() for registering the block item
        return Registry.register(Registries.ITEM, Identifier.tryParse(Pranay.MOD_ID + ":" + name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Pranay.LOGGER.info("Registering Mod Blocks for " + Pranay.MOD_ID);
        // Example block registration
        // registerBlock("ruby_block", new Block(Block.Settings.of(Material.METAL))); // Replace with actual block settings
    }
}
