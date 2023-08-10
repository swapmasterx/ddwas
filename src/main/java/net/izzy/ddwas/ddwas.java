package net.izzy.ddwas;

import net.fabricmc.api.ModInitializer;

import net.izzy.ddwas.block.ModBlocks;
import net.izzy.ddwas.item.ModItems;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ddwas implements ModInitializer {

	public static final String MOD_ID = "ddwas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Identifier STUNNING_BLOW_IMPACT = new Identifier("ddwas","stunning_blow_impact");
	public static SoundEvent STUNNING_BLOW_IMPACT_EVENT = new SoundEvent(STUNNING_BLOW_IMPACT);
	public static final Identifier BATTLE_HEAL_SUCCESS = new Identifier("ddwas","battle_heal_success");
	public static SoundEvent BATTLE_HEAL_SUCCESS_EVENT = new SoundEvent(BATTLE_HEAL_SUCCESS);
	public static final Identifier INSPIRING_CRY = new Identifier("ddwas","inspiring_cry");
	public static SoundEvent INSPIRING_CRY_EVENT = new SoundEvent(INSPIRING_CRY);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registry.SOUND_EVENT, ddwas.STUNNING_BLOW_IMPACT, STUNNING_BLOW_IMPACT_EVENT);
		Registry.register(Registry.SOUND_EVENT, ddwas.BATTLE_HEAL_SUCCESS, BATTLE_HEAL_SUCCESS_EVENT);
		Registry.register(Registry.SOUND_EVENT, ddwas.INSPIRING_CRY, INSPIRING_CRY_EVENT);

	}
}

