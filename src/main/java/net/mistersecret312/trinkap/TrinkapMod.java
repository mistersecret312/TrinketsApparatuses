package net.mistersecret312.trinkap;

import net.fabricmc.api.ModInitializer;
import net.mistersecret312.trinkap.block.ModBlocks;
import net.mistersecret312.trinkap.item.ModItems;
import net.mistersecret312.trinkap.sound.ModSounds;
import net.mistersecret312.trinkap.util.ModCustomTrades;
import net.mistersecret312.trinkap.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrinkapMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.registerSounds();
	}
}