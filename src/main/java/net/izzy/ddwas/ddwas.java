package net.izzy.ddwas;

import net.fabricmc.api.ModInitializer;

import net.izzy.ddwas.block.ModBlocks;
import net.izzy.ddwas.item.ModItems;
import net.izzy.ddwas.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ddwas implements ModInitializer {
	public static final String MOD_ID = "ddwas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}