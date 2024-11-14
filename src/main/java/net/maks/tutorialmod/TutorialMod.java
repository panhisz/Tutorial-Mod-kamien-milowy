package net.maks.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.maks.tutorialmod.Item.ModItemGroups;
import net.maks.tutorialmod.Item.ModItems;
import net.maks.tutorialmod.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}