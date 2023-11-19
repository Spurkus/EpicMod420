package net.pog.shicken.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.pog.shicken.ShickenAndCo;
import net.minecraft.util.Identifier;

public class ModItems {
    // Add items below:
    public static Item WEGG = registerItem("wegg", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        // Add item to entries below:
        entries.add(WEGG);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ShickenAndCo.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ShickenAndCo.LOGGER.info("Registering Mod Items for " + ShickenAndCo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
