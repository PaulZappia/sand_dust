package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class StainedSandstoneBlockSlab extends SlabBlock {
    public StainedSandstoneBlockSlab(Settings settings) {
        super(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB).breakByTool(FabricToolTags.PICKAXES));//.strength(0.8F));
    }
    @Override
    protected Block asBlock() { return super.asBlock(); }
}
