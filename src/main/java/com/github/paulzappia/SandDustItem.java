package com.github.paulzappia;

import net.minecraft.item.DyeableItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class SandDustItem extends Item implements DyeableItem {
    public SandDustItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return super.getUseAction(stack);
    }
}
