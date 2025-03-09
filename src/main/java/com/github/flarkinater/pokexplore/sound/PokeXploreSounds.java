package com.github.flarkinater.pokexplore.sound;

import com.github.flarkinater.pokexplore.PokeXploreData;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class PokeXploreSounds {
    public static void initialize() {
        PokeXploreData.LOGGER.info("Registering " + PokeXploreData.MOD_ID + " Sounds");
    }

    private static SoundEvent registerSound(String id) {
        Identifier soundID = Identifier.of(PokeXploreData.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, soundID, SoundEvent.of(soundID));
    }

    private static RegistryKey<JukeboxSong> registerSongKey(String id) {
        Identifier songID = Identifier.of(PokeXploreData.MOD_ID, id);
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, songID);
    }

    public static final SoundEvent QUILL = registerSound("quill");
    public static final RegistryKey<JukeboxSong> QUILL_KEY = registerSongKey("quill");
    public static final SoundEvent CHALICE_AND_REQUIEM = registerSound("chalice_and_requiem");
    public static final RegistryKey<JukeboxSong> CHALICE_AND_REQUIEM_KEY = registerSongKey("chalice_and_requiem");
    public static final SoundEvent THE_DRILL = registerSound("the_drill");
    public static final RegistryKey<JukeboxSong> THE_DRILL_KEY = registerSongKey("the_drill");
}
