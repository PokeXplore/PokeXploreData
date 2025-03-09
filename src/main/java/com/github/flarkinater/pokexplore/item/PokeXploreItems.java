package com.github.flarkinater.pokexplore.item;

import com.github.flarkinater.pokexplore.PokeXploreData;
import com.github.flarkinater.pokexplore.sound.PokeXploreSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class PokeXploreItems {
    public static void initialize() {
        PokeXploreData.LOGGER.info("Registering " + PokeXploreData.MOD_ID + " Items");
        // Register an event handler that adds our items to groups (creative tabs).
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.POKEXPLORE_ICON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.MUSIC_DISC_QUILL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.MUSIC_DISC_CHALICE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.MUSIC_DISC_THE_DRILL));
    }

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(PokeXploreData.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

    public static final Item POKEXPLORE_ICON = register(
            new Item(new Item.Settings()),
            "pokexplore_icon"
    );
    public static final Item MUSIC_DISC_QUILL = register(
            new Item(new Item.Settings().jukeboxPlayable(PokeXploreSounds.QUILL_KEY).maxCount(1)),
            "music_disc_quill"
    );
    public static final Item MUSIC_DISC_CHALICE = register(
            new Item(new Item.Settings().jukeboxPlayable(PokeXploreSounds.CHALICE_AND_REQUIEM_KEY).maxCount(1)),
            "music_disc_chalice"
    );
    public static final Item MUSIC_DISC_THE_DRILL = register(
            new Item(new Item.Settings().jukeboxPlayable(PokeXploreSounds.THE_DRILL_KEY).maxCount(1)),
            "music_disc_the_drill"
    );
}