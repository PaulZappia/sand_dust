package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockBaseBT extends Block {

    public BlockBaseBT(String name, float hardness, float resistance, Material material, BlockSoundGroup sound, ItemGroup itemgroup, Tag<Item> tag, int mininglevel, MaterialColor color) {
        super(FabricBlockSettings.of(material, color).sounds(sound).breakByTool(tag, mininglevel).strength(hardness, resistance));
        Registry.register(Registry.BLOCK, new Identifier(Sand_Dust.MOD_ID, name), this);
    }

}
