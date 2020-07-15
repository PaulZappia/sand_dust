package com.github.paulzappia;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class BottledSandItemWeak extends Item {
    /*
    public PlayerEntity playerEntity;
    public EntityType entityType;
    public LivingEntity livingEntity;
    public World world;

     */
    public BottledSandItemWeak(Settings settings)
    {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> list, TooltipContext tooltipContext) {
        list.add(new TranslatableText("sand_dust.bottled_sand_weak.flavor_text"));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        world.playSound((PlayerEntity)null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));
        //ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        if (!world.isClient) {

            BottledSandEntityWeak bottledSandEntity = new BottledSandEntityWeak(world, playerEntity);

            bottledSandEntity.setItem(itemStack);
            bottledSandEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 0.0F, 1.5F, 1.0F);
            world.spawnEntity(bottledSandEntity);
        }

        //user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!playerEntity.abilities.creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.method_29237(itemStack, world.isClient());
    }
}


