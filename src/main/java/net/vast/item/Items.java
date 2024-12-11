package net.vast.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vast.VAST;

public class Items {

    public static final Item CHRONOMIUM = registerItem("chronomium", new Item(new Item.Settings()));
    public static final Item ACTIVATED_CHRONOMIUM = registerItem("activated chronomium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VAST.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(CHRONOMIUM);
        entries.add(ACTIVATED_CHRONOMIUM);
    }

    public static void registerItems() {
        VAST.LOGGER.info("the itemmmssss are registeringggg for VAST");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Items::customIngredients);
    }
}
