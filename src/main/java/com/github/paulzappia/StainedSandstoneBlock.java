package com.github.paulzappia;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StainedSandstoneBlock extends Block {
    public StainedSandstoneBlock(String name, Settings settings) {
        super(FabricBlockSettings.copyOf(Blocks.SANDSTONE).breakByTool(FabricToolTags.PICKAXES).strength(0.8F));
        Registry.register(Registry.BLOCK, new Identifier(Sand_Dust.MOD_ID, name), this);
    }
    @Override
    protected Block asBlock() { return super.asBlock(); }
}
