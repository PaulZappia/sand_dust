package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabBase extends SlabBlock {

    public SlabBase(String name, AbstractBlock copy) {
        super(FabricBlockSettings.copy(copy));
        Registry.register(Registry.BLOCK, new Identifier(Sand_Dust.MOD_ID, name), this);
    }

}
