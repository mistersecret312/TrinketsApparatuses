package net.mistersecret312.trinkap.sound;

import net.mistersecret312.trinkap.TrinkapMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TrinkapMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TrinkapMod.LOGGER.info("Registering Sounds for " + TrinkapMod.MOD_ID);
    }
}
