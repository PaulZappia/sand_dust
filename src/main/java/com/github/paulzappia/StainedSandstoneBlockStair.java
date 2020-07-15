package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;

public class StainedSandstoneBlockStair extends StairsBlock {
    public StainedSandstoneBlockStair(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS).breakByTool(FabricToolTags.PICKAXES)); // super(baseBlockState, settings);
    }

    @Override
    protected Block asBlock() { return super.asBlock(); }
}
