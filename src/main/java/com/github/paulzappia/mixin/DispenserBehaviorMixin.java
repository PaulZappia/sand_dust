package com.github.paulzappia.mixin;

import net.minecraft.block.*;
import net.minecraft.block.dispenser.DispenserBehavior;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static net.minecraft.block.CauldronBlock.LEVEL;

// Thinking of adding ability for buckets to be able to refill cauldrons. I don't know how to even do it lol.

@Mixin(DispenserBehavior.class)
public class DispenserBehaviorMixin {
/*
    @Inject(at = @At("HEAD"), method = "registerDefaults")
    private static void registerDefaults(CallbackInfo callbackInfo) {
        DispenserBlock.registerBehavior(Items.WATER_BUCKET, new FallibleItemDispenserBehavior() {
            public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
                Direction direction = (Direction)pointer.getBlockState().get(DispenserBlock.FACING);
                BlockPos blockPos = pointer.getBlockPos().offset(direction);
                World world = pointer.getWorld();
                BlockState blockState = world.getBlockState(blockPos);
                this.setSuccess(true);
                if (blockState.isOf(Blocks.CAULDRON)) {
                    if ((Integer)blockState.get(LEVEL) < 4) {
                        world.setBlockState(blockPos, (BlockState)blockState.with(LEVEL - LEVEL + 4)); //LEVEL, (Integer)blockState.get(LEVEL) + 1), 3);
                        CauldronBlock.LEVEL(world, blockPos, blockState);
                        //stack.decrement(1);
                    } else {
                        this.setSuccess(false);
                    }

                    return stack;
                } else {
                    return super.dispenseSilently(pointer, stack);
                }
            }
        });


    }

*/
}
