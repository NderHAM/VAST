package net.vast;

import net.fabricmc.api.ModInitializer;

import net.vast.block.VastBlocks;
import net.vast.item.VastItemGroups;
import net.vast.item.VastItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VAST implements ModInitializer {
	public static final String MOD_ID = "vast";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("BEANS!");
		VastItems.registerItems();
		VastItemGroups.registerItemGroups();
		VastBlocks.registerBlocks();
	}
}