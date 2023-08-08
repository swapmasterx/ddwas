package net.izzy.ddwas.sound;

import net.izzy.ddwas.ddwas;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static final SoundEvent STUNNING_BLOW_IMPACT = registerSoundEvent("stunning_blow_impact");


    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier("ddwas.MOD_ID", "name");
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
