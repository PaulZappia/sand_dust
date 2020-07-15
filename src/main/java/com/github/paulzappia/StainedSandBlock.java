package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StainedSandBlock extends FallingBlock {
    public StainedSandBlock(String name, Settings settings) {
        super(FabricBlockSettings.copyOf(Blocks.SAND).breakByHand(true).breakByTool(FabricToolTags.SHOVELS));
        Registry.register(Registry.BLOCK, new Identifier(Sand_Dust.MOD_ID, name), this);
    }

    @Override
    protected Block asBlock() {
        return super.asBlock();
    }
}
