package com.github.paulzappia;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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

    public static Logger LOGGER = LogManager.getLogger();
    private static final Item SAND_DUST = new SandDustItem(new Item.Settings().group(ItemGroup.MISC).maxCount(64));
    private static final Identifier HUSK_LOOT_TABLE_ID = new Identifier("minecraft", "entities/husk");

    public static final String MOD_ID = "sand_dust";
    public static final String MOD_NAME = "Sand Dust";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        Registry.register(Registry.ITEM, new Identifier("sand_dust", "sand_dust"), SAND_DUST);
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