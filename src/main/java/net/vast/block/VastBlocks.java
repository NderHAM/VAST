package net.vast.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.vast.VAST;

public class VastBlocks {
    public static final Block CHRONOMIUM_ORE = registerBlock("chronomium_ore",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)
                    .requiresTool().strength(3.0f, 9.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VAST.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM,Identifier.of(VAST.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        VAST.LOGGER.info("the blcoks are registeringggg for VAST");
    }
}
