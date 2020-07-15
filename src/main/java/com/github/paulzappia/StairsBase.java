package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StairsBase extends StairsBlock {

    public StairsBase(BlockState state, String name, AbstractBlock copy) {
        super(state, FabricBlockSettings.copy(copy));
        Registry.register(Registry.BLOCK, new Identifier(Sand_Dust.MOD_ID, name), this);
    }
}
