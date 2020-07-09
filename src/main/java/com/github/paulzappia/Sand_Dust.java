package com.github.paulzappia;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTableRanges;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootingEnchantLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sand_Dust implements ModInitializer {

    private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("sand_dust","group"), () -> new ItemStack(Sand_Dust.SAND_DUST));

    public static Logger LOGGER = LogManager.getLogger();
    private static final Item SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item WHITE_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item YELLOW_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item RED_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item PURPLE_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item PINK_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item ORANGE_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item MAGENTA_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item LIME_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item LIGHT_GRAY_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item LIGHT_BLUE_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item GREEN_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item GRAY_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item CYAN_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item BROWN_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item BLUE_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));
    private static final Item BLACK_SAND_DUST = new SandDustItem(new Item.Settings().group(GROUP).maxCount(64));

    private static final Block WHITE_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block YELLOW_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block RED_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block PURPLE_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block PINK_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block ORANGE_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block MAGENTA_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block LIME_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block LIGHT_GRAY_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block LIGHT_BLUE_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block GREEN_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block GRAY_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block CYAN_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block BROWN_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block BLUE_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));
    private static final Block BLACK_STAINED_SAND = new StainedSandBlock(FabricBlockSettings.copy(Blocks.SAND));

    private static final Identifier HUSK_LOOT_TABLE_ID = new Identifier("minecraft", "entities/husk");

    public static final String MOD_ID = "sand_dust";
    public static final String MOD_NAME = "Sand Dust";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "sand_dust"), SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_sand_dust"), WHITE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_sand_dust"), YELLOW_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_sand_dust"), RED_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_sand_dust"), PURPLE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_sand_dust"), PINK_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_sand_dust"), ORANGE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_sand_dust"), MAGENTA_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_sand_dust"), LIME_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_sand_dust"), LIGHT_GRAY_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_sand_dust"), LIGHT_BLUE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_sand_dust"), GREEN_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_sand_dust"), GRAY_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_sand_dust"), CYAN_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_sand_dust"), BROWN_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_sand_dust"), BLUE_SAND_DUST);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_sand_dust"), BLACK_SAND_DUST);

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "white_stained_sand"), WHITE_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "white_stained_sand"), new BlockItem(WHITE_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "yellow_stained_sand"), YELLOW_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "yellow_stained_sand"), new BlockItem(YELLOW_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "red_stained_sand"), RED_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "red_stained_sand"), new BlockItem(RED_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "purple_stained_sand"), PURPLE_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "purple_stained_sand"), new BlockItem(PURPLE_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "pink_stained_sand"), PINK_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "pink_stained_sand"), new BlockItem(PINK_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "orange_stained_sand"), ORANGE_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "orange_stained_sand"), new BlockItem(ORANGE_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "magenta_stained_sand"), MAGENTA_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "magenta_stained_sand"), new BlockItem(MAGENTA_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "lime_stained_sand"), LIME_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "lime_stained_sand"), new BlockItem(LIME_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "light_gray_stained_sand"), LIGHT_GRAY_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_gray_stained_sand"), new BlockItem(LIGHT_GRAY_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "light_blue_stained_sand"), LIGHT_BLUE_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "light_blue_stained_sand"), new BlockItem(LIGHT_BLUE_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "green_stained_sand"), GREEN_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "green_stained_sand"), new BlockItem(GREEN_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "gray_stained_sand"), GRAY_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "gray_stained_sand"), new BlockItem(GRAY_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "cyan_stained_sand"), CYAN_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "cyan_stained_sand"), new BlockItem(CYAN_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "brown_stained_sand"), BROWN_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "brown_stained_sand"), new BlockItem(BROWN_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "blue_stained_sand"), BLUE_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "blue_stained_sand"), new BlockItem(BLUE_STAINED_SAND, new Item.Settings().group(GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("sand_dust", "black_stained_sand"), BLACK_STAINED_SAND);
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "black_stained_sand"), new BlockItem(BLACK_STAINED_SAND, new Item.Settings().group(GROUP)));
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