package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;

public class StainedSandBlock extends FallingBlock {
    public StainedSandBlock(Settings settings) {
        super(FabricBlockSettings.copyOf(Blocks.SAND).breakByHand(true).breakByTool(FabricToolTags.SHOVELS));
    }

    @Override
    protected Block asBlock() {
        return super.asBlock();
    }
}
