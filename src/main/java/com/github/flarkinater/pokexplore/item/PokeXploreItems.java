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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_BASILISK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_BIOLUMINESCENCE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_CHILLING));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_DREADNOUGHT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_DUALITY));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_FABLE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_INFERNAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_METEOR));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(PokeXploreItems.BADGE_TERRABYTE));

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
    public static final Item BADGE_BASILISK = register(
            new Item(new Item.Settings()),
            "badge_basilisk"
    );
    public static final Item BADGE_BIOLUMINESCENCE = register(
            new Item(new Item.Settings()),
            "badge_bioluminescence"
    );
    public static final Item BADGE_CHILLING = register(
            new Item(new Item.Settings()),
            "badge_chilling"
    );
    public static final Item BADGE_DREADNOUGHT = register(
            new Item(new Item.Settings()),
            "badge_dreadnought"
    );
    public static final Item BADGE_DUALITY = register(
            new Item(new Item.Settings()),
            "badge_duality"
    );
    public static final Item BADGE_FABLE = register(
            new Item(new Item.Settings()),
            "badge_fable"
    );
    public static final Item BADGE_INFERNAL = register(
            new Item(new Item.Settings()),
            "badge_infernal"
    );
    public static final Item BADGE_METEOR = register(
            new Item(new Item.Settings()),
            "badge_meteor"
    );
    public static final Item BADGE_TERRABYTE = register(
            new Item(new Item.Settings()),
            "badge_terrabyte"
    );
}