package com.github.paulzappia;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sand_Dust implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("sand_dust","item_group"), () -> new ItemStack(Sand_Dust.SAND_DUST));
    public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.build(new Identifier("sand_dust","block_group"), () -> new ItemStack(Sand_Dust.WHITE_STAINED_SAND));


    public static Logger LOGGER = LogManager.getLogger();

    //   - Sand Dust
    public static final Item SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item WHITE_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item YELLOW_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item RED_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item PURPLE_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item PINK_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item ORANGE_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item MAGENTA_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item LIME_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item LIGHT_GRAY_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item LIGHT_BLUE_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item GREEN_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item GRAY_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item CYAN_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item BROWN_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item BLUE_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));
    public static final Item BLACK_SAND_DUST = new SandDustItem(new Item.Settings().group(ITEM_GROUP).maxCount(64));

    //   - Bottled Sand
    public static final Item BOTTLED_SAND_WEAK = new BottledSandItemWeak(new Item.Settings().group(ITEM_GROUP).maxCount(16));
    public static final Item BOTTLED_SAND_MODERATE = new BottledSandItemModerate(new Item.Settings().group(ITEM_GROUP).maxCount(16));
    public static final Item BOTTLED_SAND_STRONG = new BottledSandItemStrong(new Item.Settings().group(ITEM_GROUP).maxCount(16));

    //   - Stained Sand
    public static final Block WHITE_STAINED_SAND = new StainedSandBlock("white_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block YELLOW_STAINED_SAND = new StainedSandBlock("yellow_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block RED_STAINED_SAND = new StainedSandBlock("red_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block PURPLE_STAINED_SAND = new StainedSandBlock("purple_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block PINK_STAINED_SAND = new StainedSandBlock("pink_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block ORANGE_STAINED_SAND = new StainedSandBlock("orange_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block MAGENTA_STAINED_SAND = new StainedSandBlock("magenta_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block LIME_STAINED_SAND = new StainedSandBlock("lime_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block LIGHT_GRAY_STAINED_SAND = new StainedSandBlock("light_gray_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block LIGHT_BLUE_STAINED_SAND = new StainedSandBlock("light_blue_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block GREEN_STAINED_SAND = new StainedSandBlock("green_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block GRAY_STAINED_SAND = new StainedSandBlock("gray_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block CYAN_STAINED_SAND = new StainedSandBlock("cyan_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block BROWN_STAINED_SAND = new StainedSandBlock("brown_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block BLUE_STAINED_SAND = new StainedSandBlock("blue_stained_sand", FabricBlockSettings.copy(Blocks.SAND));
    public static final Block BLACK_STAINED_SAND = new StainedSandBlock("black_stained_sand", FabricBlockSettings.copy(Blocks.SAND));

    //   - Stained Sandstone
    public static final Block WHITE_STAINED_SANDSTONE = new StainedSandstoneBlock("white_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block YELLOW_STAINED_SANDSTONE = new StainedSandstoneBlock("yellow_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block RED_STAINED_SANDSTONE = new StainedSandstoneBlock("red_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block PURPLE_STAINED_SANDSTONE = new StainedSandstoneBlock("purple_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block PINK_STAINED_SANDSTONE = new StainedSandstoneBlock("pink_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block ORANGE_STAINED_SANDSTONE = new StainedSandstoneBlock("orange_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block MAGENTA_STAINED_SANDSTONE = new StainedSandstoneBlock("magenta_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block LIME_STAINED_SANDSTONE = new StainedSandstoneBlock("lime_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block LIGHT_GRAY_STAINED_SANDSTONE = new StainedSandstoneBlock("light_gray_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block LIGHT_BLUE_STAINED_SANDSTONE = new StainedSandstoneBlock("light_blue_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block GREEN_STAINED_SANDSTONE = new StainedSandstoneBlock("green_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block GRAY_STAINED_SANDSTONE = new StainedSandstoneBlock("gray_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block CYAN_STAINED_SANDSTONE = new StainedSandstoneBlock("cyan_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block BROWN_STAINED_SANDSTONE = new StainedSandstoneBlock("brown_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block BLUE_STAINED_SANDSTONE = new StainedSandstoneBlock("blue_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));
    public static final Block BLACK_STAINED_SANDSTONE = new StainedSandstoneBlock("black_stained_sandstone", FabricBlockSettings.copy(Blocks.SANDSTONE));

    //      *** Stained Sandstone Slabs
    public static final Block WHITE_STAINED_SANDSTONE_SLAB = new SlabBase("white_stained_sandstone_slab", WHITE_STAINED_SANDSTONE);
    public static final Block YELLOW_STAINED_SANDSTONE_SLAB = new SlabBase("yellow_stained_sandstone_slab", YELLOW_STAINED_SANDSTONE);
    public static final Block RED_STAINED_SANDSTONE_SLAB = new SlabBase("red_stained_sandstone_slab", RED_STAINED_SANDSTONE);
    public static final Block PURPLE_STAINED_SANDSTONE_SLAB = new SlabBase("purple_stained_sandstone_slab", PURPLE_STAINED_SANDSTONE);
    public static final Block PINK_STAINED_SANDSTONE_SLAB = new SlabBase("pink_stained_sandstone_slab", PINK_STAINED_SANDSTONE);
    public static final Block ORANGE_STAINED_SANDSTONE_SLAB = new SlabBase("orange_stained_sandstone_slab", ORANGE_STAINED_SANDSTONE);
    public static final Block MAGENTA_STAINED_SANDSTONE_SLAB = new SlabBase("magenta_stained_sandstone_slab", MAGENTA_STAINED_SANDSTONE);
    public static final Block LIME_STAINED_SANDSTONE_SLAB = new SlabBase("lime_stained_sandstone_slab", LIME_STAINED_SANDSTONE);
    public static final Block LIGHT_GRAY_STAINED_SANDSTONE_SLAB = new SlabBase("light_gray_stained_sandstone_slab", LIGHT_GRAY_STAINED_SANDSTONE);
    public static final Block LIGHT_BLUE_STAINED_SANDSTONE_SLAB = new SlabBase("light_blue_stained_sandstone_slab", LIGHT_BLUE_STAINED_SANDSTONE);
    public static final Block GREEN_STAINED_SANDSTONE_SLAB = new SlabBase("green_stained_sandstone_slab", GREEN_STAINED_SANDSTONE);
    public static final Block GRAY_STAINED_SANDSTONE_SLAB = new SlabBase("gray_stained_sandstone_slab", GRAY_STAINED_SANDSTONE);
    public static final Block CYAN_STAINED_SANDSTONE_SLAB = new SlabBase("cyan_stained_sandstone_slab", CYAN_STAINED_SANDSTONE);
    public static final Block BROWN_STAINED_SANDSTONE_SLAB = new SlabBase("brown_stained_sandstone_slab", BROWN_STAINED_SANDSTONE);
    public static final Block BLUE_STAINED_SANDSTONE_SLAB = new SlabBase("blue_stained_sandstone_slab", BLUE_STAINED_SANDSTONE);
    public static final Block BLACK_STAINED_SANDSTONE_SLAB = new SlabBase("black_stained_sandstone_slab", BLACK_STAINED_SANDSTONE);

    //      *** Stained Sandstone Stairs
    public static final Block WHITE_STAINED_SANDSTONE_STAIRS = new StairsBase(WHITE_STAINED_SANDSTONE.getDefaultState(), "white_stained_sandstone_stairs", WHITE_STAINED_SANDSTONE);
    public static final Block YELLOW_STAINED_SANDSTONE_STAIRS = new StairsBase(YELLOW_STAINED_SANDSTONE.getDefaultState(), "yellow_stained_sandstone_stairs", YELLOW_STAINED_SANDSTONE);
    public static final Block RED_STAINED_SANDSTONE_STAIRS = new StairsBase(RED_STAINED_SANDSTONE.getDefaultState(), "red_stained_sandstone_stairs", RED_STAINED_SANDSTONE);
    public static final Block PURPLE_STAINED_SANDSTONE_STAIRS = new StairsBase(PURPLE_STAINED_SANDSTONE.getDefaultState(), "purple_stained_sandstone_stairs", PURPLE_STAINED_SANDSTONE);
    public static final Block PINK_STAINED_SANDSTONE_STAIRS = new StairsBase(PINK_STAINED_SANDSTONE.getDefaultState(), "pink_stained_sandstone_stairs", PINK_STAINED_SANDSTONE);
    public static final Block ORANGE_STAINED_SANDSTONE_STAIRS = new StairsBase(ORANGE_STAINED_SANDSTONE.getDefaultState(), "orange_stained_sandstone_stairs", ORANGE_STAINED_SANDSTONE);
    public static final Block MAGENTA_STAINED_SANDSTONE_STAIRS = new StairsBase(MAGENTA_STAINED_SANDSTONE.getDefaultState(), "magenta_stained_sandstone_stairs", MAGENTA_STAINED_SANDSTONE);
    public static final Block LIME_STAINED_SANDSTONE_STAIRS = new StairsBase(LIME_STAINED_SANDSTONE.getDefaultState(), "lime_stained_sandstone_stairs", LIME_STAINED_SANDSTONE);
    public static final Block LIGHT_GRAY_STAINED_SANDSTONE_STAIRS = new StairsBase(LIGHT_GRAY_STAINED_SANDSTONE.getDefaultState(), "light_gray_stained_sandstone_stairs", LIGHT_GRAY_STAINED_SANDSTONE);
    public static final Block LIGHT_BLUE_STAINED_SANDSTONE_STAIRS = new StairsBase(LIGHT_BLUE_STAINED_SANDSTONE.getDefaultState(), "light_blue_stained_sandstone_stairs", LIGHT_BLUE_STAINED_SANDSTONE);
    public static final Block GREEN_STAINED_SANDSTONE_STAIRS = new StairsBase(GREEN_STAINED_SANDSTONE.getDefaultState(), "green_stained_sandstone_stairs", GREEN_STAINED_SANDSTONE);
    public static final Block GRAY_STAINED_SANDSTONE_STAIRS = new StairsBase(GRAY_STAINED_SANDSTONE.getDefaultState(), "gray_stained_sandstone_stairs", GRAY_STAINED_SANDSTONE);
    public static final Block CYAN_STAINED_SANDSTONE_STAIRS = new StairsBase(CYAN_STAINED_SANDSTONE.getDefaultState(), "cyan_stained_sandstone_stairs", CYAN_STAINED_SANDSTONE);
    public static final Block BROWN_STAINED_SANDSTONE_STAIRS = new StairsBase(BROWN_STAINED_SANDSTONE.getDefaultState(), "brown_stained_sandstone_stairs", BROWN_STAINED_SANDSTONE);
    public static final Block BLUE_STAINED_SANDSTONE_STAIRS = new StairsBase(BLUE_STAINED_SANDSTONE.getDefaultState(), "blue_stained_sandstone_stairs", BLUE_STAINED_SANDSTONE);
    public static final Block BLACK_STAINED_SANDSTONE_STAIRS = new StairsBase(BLACK_STAINED_SANDSTONE.getDefaultState(), "black_stained_sandstone_stairs", BLACK_STAINED_SANDSTONE);

    //      *** Stained Sandstone Walls
    public static final Block WHITE_STAINED_SANDSTONE_WALL = new WallBase("white_stained_sandstone_wall", WHITE_STAINED_SANDSTONE);
    public static final Block YELLOW_STAINED_SANDSTONE_WALL = new WallBase("yellow_stained_sandstone_wall", YELLOW_STAINED_SANDSTONE);
    public static final Block RED_STAINED_SANDSTONE_WALL = new WallBase("red_stained_sandstone_wall", RED_STAINED_SANDSTONE);
    public static final Block PURPLE_STAINED_SANDSTONE_WALL = new WallBase("purple_stained_sandstone_wall", PURPLE_STAINED_SANDSTONE);
    public static final Block PINK_STAINED_SANDSTONE_WALL = new WallBase("pink_stained_sandstone_wall", PINK_STAINED_SANDSTONE);
    public static final Block ORANGE_STAINED_SANDSTONE_WALL = new WallBase("orange_stained_sandstone_wall", ORANGE_STAINED_SANDSTONE);
    public static final Block MAGENTA_STAINED_SANDSTONE_WALL = new WallBase("magenta_stained_sandstone_wall", MAGENTA_STAINED_SANDSTONE);
    public static final Block LIME_STAINED_SANDSTONE_WALL = new WallBase("lime_stained_sandstone_wall", LIME_STAINED_SANDSTONE);
    public static final Block LIGHT_GRAY_STAINED_SANDSTONE_WALL = new WallBase("light_gray_stained_sandstone_wall", LIGHT_GRAY_STAINED_SANDSTONE);
    public static final Block LIGHT_BLUE_STAINED_SANDSTONE_WALL = new WallBase("light_blue_stained_sandstone_wall", LIGHT_BLUE_STAINED_SANDSTONE);
    public static final Block GREEN_STAINED_SANDSTONE_WALL = new WallBase("green_stained_sandstone_wall", GREEN_STAINED_SANDSTONE);
    public static final Block GRAY_STAINED_SANDSTONE_WALL = new WallBase("gray_stained_sandstone_wall", GRAY_STAINED_SANDSTONE);
    public static final Block CYAN_STAINED_SANDSTONE_WALL = new WallBase("cyan_stained_sandstone_wall", CYAN_STAINED_SANDSTONE);
    public static final Block BROWN_STAINED_SANDSTONE_WALL = new WallBase("brown_stained_sandstone_wall", BROWN_STAINED_SANDSTONE);
    public static final Block BLUE_STAINED_SANDSTONE_WALL = new WallBase("blue_stained_sandstone_wall", BLUE_STAINED_SANDSTONE);
    public static final Block BLACK_STAINED_SANDSTONE_WALL = new WallBase("black_stained_sandstone_wall", BLACK_STAINED_SANDSTONE);


    //   - Cut Stained Sandstone
    public static final Block CUT_WHITE_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_white_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_YELLOW_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_yellow_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_RED_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_red_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_PURPLE_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_purple_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_PINK_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_pink_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_ORANGE_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_orange_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_MAGENTA_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_magenta_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_LIME_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_lime_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_LIGHT_GRAY_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_light_gray_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_LIGHT_BLUE_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_light_blue_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_GREEN_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_green_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_GRAY_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_gray_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_CYAN_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_cyan_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_BROWN_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_brown_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_BLUE_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_blue_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));
    public static final Block CUT_BLACK_STAINED_SANDSTONE = new StainedSandstoneBlock("cut_black_stained_sandstone", FabricBlockSettings.copy(Blocks.CUT_SANDSTONE));

    //      *** Cut Stained Sandstone Slabs
    public static final Block CUT_WHITE_STAINED_SANDSTONE_SLAB = new SlabBase("cut_white_stained_sandstone_slab", CUT_WHITE_STAINED_SANDSTONE);
    public static final Block CUT_YELLOW_STAINED_SANDSTONE_SLAB = new SlabBase("cut_yellow_stained_sandstone_slab", CUT_YELLOW_STAINED_SANDSTONE);
    public static final Block CUT_RED_STAINED_SANDSTONE_SLAB = new SlabBase("cut_red_stained_sandstone_slab", CUT_RED_STAINED_SANDSTONE);
    public static final Block CUT_PURPLE_STAINED_SANDSTONE_SLAB = new SlabBase("cut_purple_stained_sandstone_slab", CUT_PURPLE_STAINED_SANDSTONE);
    public static final Block CUT_PINK_STAINED_SANDSTONE_SLAB = new SlabBase("cut_pink_stained_sandstone_slab", CUT_PINK_STAINED_SANDSTONE);
    public static final Block CUT_ORANGE_STAINED_SANDSTONE_SLAB = new SlabBase("cut_orange_stained_sandstone_slab", CUT_ORANGE_STAINED_SANDSTONE);
    public static final Block CUT_MAGENTA_STAINED_SANDSTONE_SLAB = new SlabBase("cut_magenta_stained_sandstone_slab", CUT_MAGENTA_STAINED_SANDSTONE);
    public static final Block CUT_LIME_STAINED_SANDSTONE_SLAB = new SlabBase("cut_lime_stained_sandstone_slab", CUT_LIME_STAINED_SANDSTONE);
    public static final Block CUT_LIGHT_GRAY_STAINED_SANDSTONE_SLAB = new SlabBase("cut_light_gray_stained_sandstone_slab", CUT_LIGHT_GRAY_STAINED_SANDSTONE);
    public static final Block CUT_LIGHT_BLUE_STAINED_SANDSTONE_SLAB = new SlabBase("cut_light_blue_stained_sandstone_slab", CUT_LIGHT_BLUE_STAINED_SANDSTONE);
    public static final Block CUT_GREEN_STAINED_SANDSTONE_SLAB = new SlabBase("cut_green_stained_sandstone_slab", CUT_GREEN_STAINED_SANDSTONE);
    public static final Block CUT_GRAY_STAINED_SANDSTONE_SLAB = new SlabBase("cut_gray_stained_sandstone_slab", CUT_GRAY_STAINED_SANDSTONE);
    public static final Block CUT_CYAN_STAINED_SANDSTONE_SLAB = new SlabBase("cut_cyan_stained_sandstone_slab", CUT_CYAN_STAINED_SANDSTONE);
    public static final Block CUT_BROWN_STAINED_SANDSTONE_SLAB = new SlabBase("cut_brown_stained_sandstone_slab", CUT_BROWN_STAINED_SANDSTONE);
    public static final Block CUT_BLUE_STAINED_SANDSTONE_SLAB = new SlabBase("cut_blue_stained_sandstone_slab", CUT_BLUE_STAINED_SANDSTONE);
    public static final Block CUT_BLACK_STAINED_SANDSTONE_SLAB = new SlabBase("cut_black_stained_sandstone_slab", CUT_BLACK_STAINED_SANDSTONE);

    //   - Smooth Stained Sandstone
    public static final Block SMOOTH_WHITE_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_white_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_YELLOW_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_yellow_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_RED_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_red_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_PURPLE_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_purple_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_PINK_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_pink_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_ORANGE_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_orange_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_MAGENTA_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_magenta_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_LIME_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_lime_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_light_gray_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_light_blue_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_GREEN_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_green_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_GRAY_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_gray_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_CYAN_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_cyan_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_BROWN_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_brown_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_BLUE_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_blue_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));
    public static final Block SMOOTH_BLACK_STAINED_SANDSTONE = new SmoothStainedSandstoneBlock("smooth_black_stained_sandstone", FabricBlockSettings.copy(Blocks.SMOOTH_SANDSTONE));

    //      *** Stained Sandstone Slabs
    public static final Block SMOOTH_WHITE_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_white_stained_sandstone_slab", SMOOTH_WHITE_STAINED_SANDSTONE);
    public static final Block SMOOTH_YELLOW_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_yellow_stained_sandstone_slab", SMOOTH_YELLOW_STAINED_SANDSTONE);
    public static final Block SMOOTH_RED_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_red_stained_sandstone_slab", SMOOTH_RED_STAINED_SANDSTONE);
    public static final Block SMOOTH_PURPLE_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_purple_stained_sandstone_slab", SMOOTH_PURPLE_STAINED_SANDSTONE);
    public static final Block SMOOTH_PINK_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_pink_stained_sandstone_slab", SMOOTH_PINK_STAINED_SANDSTONE);
    public static final Block SMOOTH_ORANGE_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_orange_stained_sandstone_slab", SMOOTH_ORANGE_STAINED_SANDSTONE);
    public static final Block SMOOTH_MAGENTA_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_magenta_stained_sandstone_slab", SMOOTH_MAGENTA_STAINED_SANDSTONE);
    public static final Block SMOOTH_LIME_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_lime_stained_sandstone_slab", SMOOTH_LIME_STAINED_SANDSTONE);
    public static final Block SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_light_gray_stained_sandstone_slab", SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE);
    public static final Block SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_light_blue_stained_sandstone_slab", SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE);
    public static final Block SMOOTH_GREEN_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_green_stained_sandstone_slab", SMOOTH_GREEN_STAINED_SANDSTONE);
    public static final Block SMOOTH_GRAY_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_gray_stained_sandstone_slab", SMOOTH_GRAY_STAINED_SANDSTONE);
    public static final Block SMOOTH_CYAN_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_cyan_stained_sandstone_slab", SMOOTH_CYAN_STAINED_SANDSTONE);
    public static final Block SMOOTH_BROWN_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_brown_stained_sandstone_slab", SMOOTH_BROWN_STAINED_SANDSTONE);
    public static final Block SMOOTH_BLUE_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_blue_stained_sandstone_slab", SMOOTH_BLUE_STAINED_SANDSTONE);
    public static final Block SMOOTH_BLACK_STAINED_SANDSTONE_SLAB = new SlabBase("smooth_black_stained_sandstone_slab", SMOOTH_BLACK_STAINED_SANDSTONE);

    //      *** Stained Sandstone Stairs
    public static final Block SMOOTH_WHITE_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_WHITE_STAINED_SANDSTONE.getDefaultState(), "smooth_white_stained_sandstone_stairs", SMOOTH_WHITE_STAINED_SANDSTONE);
    public static final Block SMOOTH_YELLOW_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_YELLOW_STAINED_SANDSTONE.getDefaultState(), "smooth_yellow_stained_sandstone_stairs", SMOOTH_YELLOW_STAINED_SANDSTONE);
    public static final Block SMOOTH_RED_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_RED_STAINED_SANDSTONE.getDefaultState(), "smooth_red_stained_sandstone_stairs", SMOOTH_RED_STAINED_SANDSTONE);
    public static final Block SMOOTH_PURPLE_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_PURPLE_STAINED_SANDSTONE.getDefaultState(), "smooth_purple_stained_sandstone_stairs", SMOOTH_PURPLE_STAINED_SANDSTONE);
    public static final Block SMOOTH_PINK_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_PINK_STAINED_SANDSTONE.getDefaultState(), "smooth_pink_stained_sandstone_stairs", SMOOTH_PINK_STAINED_SANDSTONE);
    public static final Block SMOOTH_ORANGE_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_ORANGE_STAINED_SANDSTONE.getDefaultState(), "smooth_orange_stained_sandstone_stairs", SMOOTH_ORANGE_STAINED_SANDSTONE);
    public static final Block SMOOTH_MAGENTA_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_MAGENTA_STAINED_SANDSTONE.getDefaultState(), "smooth_magenta_stained_sandstone_stairs", SMOOTH_MAGENTA_STAINED_SANDSTONE);
    public static final Block SMOOTH_LIME_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_LIME_STAINED_SANDSTONE.getDefaultState(), "smooth_lime_stained_sandstone_stairs", SMOOTH_LIME_STAINED_SANDSTONE);
    public static final Block SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE.getDefaultState(), "smooth_light_gray_stained_sandstone_stairs", SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE);
    public static final Block SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE.getDefaultState(), "smooth_light_blue_stained_sandstone_stairs", SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE);
    public static final Block SMOOTH_GREEN_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_GREEN_STAINED_SANDSTONE.getDefaultState(), "smooth_green_stained_sandstone_stairs", SMOOTH_GREEN_STAINED_SANDSTONE);
    public static final Block SMOOTH_GRAY_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_GRAY_STAINED_SANDSTONE.getDefaultState(), "smooth_gray_stained_sandstone_stairs", SMOOTH_GRAY_STAINED_SANDSTONE);
    public static final Block SMOOTH_CYAN_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_CYAN_STAINED_SANDSTONE.getDefaultState(), "smooth_cyan_stained_sandstone_stairs", SMOOTH_CYAN_STAINED_SANDSTONE);
    public static final Block SMOOTH_BROWN_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_BROWN_STAINED_SANDSTONE.getDefaultState(), "smooth_brown_stained_sandstone_stairs", SMOOTH_BROWN_STAINED_SANDSTONE);
    public static final Block SMOOTH_BLUE_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_BLUE_STAINED_SANDSTONE.getDefaultState(), "smooth_blue_stained_sandstone_stairs", SMOOTH_BLUE_STAINED_SANDSTONE);
    public static final Block SMOOTH_BLACK_STAINED_SANDSTONE_STAIRS = new StairsBase(SMOOTH_BLACK_STAINED_SANDSTONE.getDefaultState(), "smooth_black_stained_sandstone_stairs", SMOOTH_BLACK_STAINED_SANDSTONE);

    //public static final SpecialCraftingRecipe BOTTLED_SAND_RECIPE = new BottledSandRecipe("bottled_sand_recipe");

    private static final Identifier HUSK_LOOT_TABLE_ID = new Identifier("minecraft", "entities/husk");

    public static final Identifier SAND_SOUND = new Identifier("sand_dust:sand_sound");
    public static SoundEvent SAND_SOUND_EVENT = new SoundEvent(SAND_SOUND);

    /*
    public static final EntityType<BottledSandEntity> BOTTLED_SAND_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("sand_dust", "bottled_sand_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, BottledSandEntity::new).dimensions(EntityDimensions.fixed(.25F, 0.25F)).trackable(4, 10).build()
    );

     */

    public static final String MOD_ID = "sand_dust";
    public static final String MOD_NAME = "Sand Dust";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        Registry.register(Registry.SOUND_EVENT, Sand_Dust.SAND_SOUND, SAND_SOUND_EVENT);
 /*
        FabricDefaultAttributeRegistry.register(BOTTLED_SAND_ENTITY, BottledSandEntity.createMobAttributes());
 */
        // ===== Items =====

        //   - Sand Dust
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "sand_dust"), SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_sand_dust"), WHITE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_sand_dust"), ORANGE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_sand_dust"), MAGENTA_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_sand_dust"), LIGHT_BLUE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_sand_dust"), YELLOW_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_sand_dust"), LIME_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_sand_dust"), PINK_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_sand_dust"), GRAY_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_sand_dust"), LIGHT_GRAY_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_sand_dust"), CYAN_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_sand_dust"), PURPLE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_sand_dust"), BLUE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_sand_dust"), BROWN_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_sand_dust"), GREEN_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_sand_dust"), RED_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_sand_dust"), BLACK_SAND_DUST);

        //   - Bottled Sand
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "bottled_sand_weak"), BOTTLED_SAND_WEAK);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "bottled_sand_moderate"), BOTTLED_SAND_MODERATE);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "bottled_sand_strong"), BOTTLED_SAND_STRONG);

        // ===== Blocks =====

        //   - Stained Sand
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_stained_sand"), new BlockItem(WHITE_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_stained_sand"), new BlockItem(ORANGE_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_stained_sand"), new BlockItem(MAGENTA_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_stained_sand"), new BlockItem(LIGHT_BLUE_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_stained_sand"), new BlockItem(YELLOW_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_stained_sand"), new BlockItem(LIME_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_stained_sand"), new BlockItem(PINK_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_stained_sand"), new BlockItem(GRAY_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_stained_sand"), new BlockItem(LIGHT_GRAY_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_stained_sand"), new BlockItem(CYAN_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_stained_sand"), new BlockItem(PURPLE_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_stained_sand"), new BlockItem(BLUE_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_stained_sand"), new BlockItem(BROWN_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_stained_sand"), new BlockItem(GREEN_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_stained_sand"), new BlockItem(RED_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_stained_sand"), new BlockItem(BLACK_STAINED_SAND, new Item.Settings().group(BLOCK_GROUP)));

        //   - Stained Sandstone
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_stained_sandstone"), new BlockItem(WHITE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_stained_sandstone"), new BlockItem(ORANGE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_stained_sandstone"), new BlockItem(MAGENTA_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_stained_sandstone"), new BlockItem(LIGHT_BLUE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_stained_sandstone"), new BlockItem(YELLOW_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_stained_sandstone"), new BlockItem(LIME_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_stained_sandstone"), new BlockItem(PINK_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_stained_sandstone"), new BlockItem(GRAY_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_stained_sandstone"), new BlockItem(LIGHT_GRAY_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_stained_sandstone"), new BlockItem(CYAN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_stained_sandstone"), new BlockItem(PURPLE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_stained_sandstone"), new BlockItem(BLUE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_stained_sandstone"), new BlockItem(BROWN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_stained_sandstone"), new BlockItem(GREEN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_stained_sandstone"), new BlockItem(RED_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_stained_sandstone"), new BlockItem(BLACK_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));


        //   - Stained Sandstone Slabs
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_stained_sandstone_slab"), new BlockItem(WHITE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_stained_sandstone_slab"), new BlockItem(ORANGE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_stained_sandstone_slab"), new BlockItem(MAGENTA_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_stained_sandstone_slab"), new BlockItem(LIGHT_BLUE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_stained_sandstone_slab"), new BlockItem(YELLOW_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_stained_sandstone_slab"), new BlockItem(LIME_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_stained_sandstone_slab"), new BlockItem(PINK_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_stained_sandstone_slab"), new BlockItem(GRAY_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_stained_sandstone_slab"), new BlockItem(LIGHT_GRAY_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_stained_sandstone_slab"), new BlockItem(CYAN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_stained_sandstone_slab"), new BlockItem(PURPLE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_stained_sandstone_slab"), new BlockItem(BLUE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_stained_sandstone_slab"), new BlockItem(BROWN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_stained_sandstone_slab"), new BlockItem(GREEN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_stained_sandstone_slab"), new BlockItem(RED_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_stained_sandstone_slab"), new BlockItem(BLACK_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));


        //   - Stained Sandstone Stairs
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_stained_sandstone_stairs"), new BlockItem(WHITE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_stained_sandstone_stairs"), new BlockItem(ORANGE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_stained_sandstone_stairs"), new BlockItem(MAGENTA_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_stained_sandstone_stairs"), new BlockItem(LIGHT_BLUE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_stained_sandstone_stairs"), new BlockItem(YELLOW_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_stained_sandstone_stairs"), new BlockItem(LIME_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_stained_sandstone_stairs"), new BlockItem(PINK_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_stained_sandstone_stairs"), new BlockItem(GRAY_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_stained_sandstone_stairs"), new BlockItem(LIGHT_GRAY_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_stained_sandstone_stairs"), new BlockItem(CYAN_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_stained_sandstone_stairs"), new BlockItem(PURPLE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_stained_sandstone_stairs"), new BlockItem(BLUE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_stained_sandstone_stairs"), new BlockItem(BROWN_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_stained_sandstone_stairs"), new BlockItem(GREEN_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_stained_sandstone_stairs"), new BlockItem(RED_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_stained_sandstone_stairs"), new BlockItem(BLACK_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));

        //   - Stained Sandstone Walls
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_stained_sandstone_wall"), new BlockItem(WHITE_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_stained_sandstone_wall"), new BlockItem(ORANGE_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_stained_sandstone_wall"), new BlockItem(MAGENTA_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_stained_sandstone_wall"), new BlockItem(LIGHT_BLUE_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_stained_sandstone_wall"), new BlockItem(YELLOW_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_stained_sandstone_wall"), new BlockItem(LIME_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_stained_sandstone_wall"), new BlockItem(PINK_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_stained_sandstone_wall"), new BlockItem(GRAY_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_stained_sandstone_wall"), new BlockItem(LIGHT_GRAY_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_stained_sandstone_wall"), new BlockItem(CYAN_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_stained_sandstone_wall"), new BlockItem(PURPLE_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_stained_sandstone_wall"), new BlockItem(BLUE_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_stained_sandstone_wall"), new BlockItem(BROWN_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_stained_sandstone_wall"), new BlockItem(GREEN_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_stained_sandstone_wall"), new BlockItem(RED_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_stained_sandstone_wall"), new BlockItem(BLACK_STAINED_SANDSTONE_WALL, new Item.Settings().group(BLOCK_GROUP)));

        //   - Cut Stained Sandstone
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_white_stained_sandstone"), new BlockItem(CUT_WHITE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_orange_stained_sandstone"), new BlockItem(CUT_ORANGE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_magenta_stained_sandstone"), new BlockItem(CUT_MAGENTA_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_light_blue_stained_sandstone"), new BlockItem(CUT_LIGHT_BLUE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_yellow_stained_sandstone"), new BlockItem(CUT_YELLOW_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_lime_stained_sandstone"), new BlockItem(CUT_LIME_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_pink_stained_sandstone"), new BlockItem(CUT_PINK_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_gray_stained_sandstone"), new BlockItem(CUT_GRAY_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_light_gray_stained_sandstone"), new BlockItem(CUT_LIGHT_GRAY_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_cyan_stained_sandstone"), new BlockItem(CUT_CYAN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_purple_stained_sandstone"), new BlockItem(CUT_PURPLE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_blue_stained_sandstone"), new BlockItem(CUT_BLUE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_brown_stained_sandstone"), new BlockItem(CUT_BROWN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_green_stained_sandstone"), new BlockItem(CUT_GREEN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_red_stained_sandstone"), new BlockItem(CUT_RED_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_black_stained_sandstone"), new BlockItem(CUT_BLACK_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));

        //      *** Cut Stained Sandstone Slabs
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_white_stained_sandstone_slab"), new BlockItem(CUT_WHITE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_orange_stained_sandstone_slab"), new BlockItem(CUT_ORANGE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_magenta_stained_sandstone_slab"), new BlockItem(CUT_MAGENTA_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_light_blue_stained_sandstone_slab"), new BlockItem(CUT_LIGHT_BLUE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_yellow_stained_sandstone_slab"), new BlockItem(CUT_YELLOW_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_lime_stained_sandstone_slab"), new BlockItem(CUT_LIME_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_pink_stained_sandstone_slab"), new BlockItem(CUT_PINK_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_gray_stained_sandstone_slab"), new BlockItem(CUT_GRAY_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_light_gray_stained_sandstone_slab"), new BlockItem(CUT_LIGHT_GRAY_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_cyan_stained_sandstone_slab"), new BlockItem(CUT_CYAN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_purple_stained_sandstone_slab"), new BlockItem(CUT_PURPLE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_blue_stained_sandstone_slab"), new BlockItem(CUT_BLUE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_brown_stained_sandstone_slab"), new BlockItem(CUT_BROWN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_green_stained_sandstone_slab"), new BlockItem(CUT_GREEN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_red_stained_sandstone_slab"), new BlockItem(CUT_RED_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cut_black_stained_sandstone_slab"), new BlockItem(CUT_BLACK_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));

        //   - Smooth Stained Sandstone
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_white_stained_sandstone"), new BlockItem(SMOOTH_WHITE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_orange_stained_sandstone"), new BlockItem(SMOOTH_ORANGE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_magenta_stained_sandstone"), new BlockItem(SMOOTH_MAGENTA_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_light_blue_stained_sandstone"), new BlockItem(SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_yellow_stained_sandstone"), new BlockItem(SMOOTH_YELLOW_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_lime_stained_sandstone"), new BlockItem(SMOOTH_LIME_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_pink_stained_sandstone"), new BlockItem(SMOOTH_PINK_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_gray_stained_sandstone"), new BlockItem(SMOOTH_GRAY_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_light_gray_stained_sandstone"), new BlockItem(SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_cyan_stained_sandstone"), new BlockItem(SMOOTH_CYAN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_purple_stained_sandstone"), new BlockItem(SMOOTH_PURPLE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_blue_stained_sandstone"), new BlockItem(SMOOTH_BLUE_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_brown_stained_sandstone"), new BlockItem(SMOOTH_BROWN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_green_stained_sandstone"), new BlockItem(SMOOTH_GREEN_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_red_stained_sandstone"), new BlockItem(SMOOTH_RED_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_black_stained_sandstone"), new BlockItem(SMOOTH_BLACK_STAINED_SANDSTONE, new Item.Settings().group(BLOCK_GROUP)));

        //   - Smooth Stained Sandstone Slabs
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_white_stained_sandstone_slab"), new BlockItem(SMOOTH_WHITE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_orange_stained_sandstone_slab"), new BlockItem(SMOOTH_ORANGE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_magenta_stained_sandstone_slab"), new BlockItem(SMOOTH_MAGENTA_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_light_blue_stained_sandstone_slab"), new BlockItem(SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_yellow_stained_sandstone_slab"), new BlockItem(SMOOTH_YELLOW_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_lime_stained_sandstone_slab"), new BlockItem(SMOOTH_LIME_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_pink_stained_sandstone_slab"), new BlockItem(SMOOTH_PINK_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_gray_stained_sandstone_slab"), new BlockItem(SMOOTH_GRAY_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_light_gray_stained_sandstone_slab"), new BlockItem(SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_cyan_stained_sandstone_slab"), new BlockItem(SMOOTH_CYAN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_purple_stained_sandstone_slab"), new BlockItem(SMOOTH_PURPLE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_blue_stained_sandstone_slab"), new BlockItem(SMOOTH_BLUE_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_brown_stained_sandstone_slab"), new BlockItem(SMOOTH_BROWN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_green_stained_sandstone_slab"), new BlockItem(SMOOTH_GREEN_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_red_stained_sandstone_slab"), new BlockItem(SMOOTH_RED_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_black_stained_sandstone_slab"), new BlockItem(SMOOTH_BLACK_STAINED_SANDSTONE_SLAB, new Item.Settings().group(BLOCK_GROUP)));

        //   - Smooth Stained Sandstone Stairs
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_white_stained_sandstone_stairs"), new BlockItem(SMOOTH_WHITE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_orange_stained_sandstone_stairs"), new BlockItem(SMOOTH_ORANGE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_magenta_stained_sandstone_stairs"), new BlockItem(SMOOTH_MAGENTA_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_light_blue_stained_sandstone_stairs"), new BlockItem(SMOOTH_LIGHT_BLUE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_yellow_stained_sandstone_stairs"), new BlockItem(SMOOTH_YELLOW_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_lime_stained_sandstone_stairs"), new BlockItem(SMOOTH_LIME_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_pink_stained_sandstone_stairs"), new BlockItem(SMOOTH_PINK_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_gray_stained_sandstone_stairs"), new BlockItem(SMOOTH_GRAY_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_light_gray_stained_sandstone_stairs"), new BlockItem(SMOOTH_LIGHT_GRAY_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_cyan_stained_sandstone_stairs"), new BlockItem(SMOOTH_CYAN_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_purple_stained_sandstone_stairs"), new BlockItem(SMOOTH_PURPLE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_blue_stained_sandstone_stairs"), new BlockItem(SMOOTH_BLUE_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_brown_stained_sandstone_stairs"), new BlockItem(SMOOTH_BROWN_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_green_stained_sandstone_stairs"), new BlockItem(SMOOTH_GREEN_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_red_stained_sandstone_stairs"), new BlockItem(SMOOTH_RED_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "smooth_black_stained_sandstone_stairs"), new BlockItem(SMOOTH_BLACK_STAINED_SANDSTONE_STAIRS, new Item.Settings().group(BLOCK_GROUP)));

        /*
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (HUSK_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = (FabricLootPoolBuilder) FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(SAND_DUST).apply(SetCountLootFunction.builder(UniformLootTableRange.between(0.0F, 2.0F))).apply(LootingEnchantLootFunction.builder(UniformLootTableRange.between(0.0F, 1.0F))));
                        //.withRolls(ConstantLootTableRange.create(1))
                        //.withEntry(ItemEntry.builder(SAND_DUST));

                supplier.withPool(poolBuilder);
            }
        });
*/
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}