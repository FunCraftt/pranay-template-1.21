package com.pranay;

import com.pranay.blocks.ModBlocks;
import com.pranay.items.ModItemGroups;
import com.pranay.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pranay implements ModInitializer {
	public static final String MOD_ID = "pranay";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}