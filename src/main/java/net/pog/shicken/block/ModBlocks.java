package net.pog.shicken.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pog.shicken.ShickenAndCo;

public class ModBlocks {

    public static final Block HARD_OBSIDIAN = registerBlock("hard_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(150.0f, 2200.0f)));

    private static void addBlocktoBlockGroup(FabricItemGroupEntries entries) {
        entries.add(HARD_OBSIDIAN);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ShickenAndCo.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ShickenAndCo.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        ShickenAndCo.LOGGER.info("Registering ModBlocks for " + ShickenAndCo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlocktoBlockGroup);
    }
}
