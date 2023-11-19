package net.pog.shicken;

import net.fabricmc.api.ModInitializer;

import net.pog.shicken.block.ModBlocks;
import net.pog.shicken.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShickenAndCo implements ModInitializer {
	public static final String MOD_ID = "shicken-and-co";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}