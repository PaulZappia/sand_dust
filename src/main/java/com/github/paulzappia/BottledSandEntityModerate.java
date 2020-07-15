package com.github.paulzappia;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class BottledSandEntityModerate extends ThrownItemEntity {

    public BottledSandEntityModerate(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public BottledSandEntityModerate(World world, LivingEntity owner) { super(EntityType.SNOWBALL, owner, world); }

    public BottledSandEntityModerate(World world, double x, double y, double z) {
        super(EntityType.SNOWBALL, x, y, z, world);
    }

    @Environment(EnvType.CLIENT)
    public void handleStatus(byte status) {
        if (status == 3) {
            double d = 0.08D;

            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM, this.getStack()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D);
            }
        }
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        entityHitResult.getEntity().damage(DamageSource.thrownProjectile(this, this.getOwner()), 0.0F);
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
                    AreaEffectCloudEntity areaEffectCloudEntity = (AreaEffectCloudEntity) EntityType.AREA_EFFECT_CLOUD.create(this.world);
                    areaEffectCloudEntity.setRadius(2f);
                    areaEffectCloudEntity.setDuration(15);
                    areaEffectCloudEntity.setColor(12234600);

                    // Moderate
                    StatusEffectInstance statusEffectInstance1 = new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 2);
                    StatusEffectInstance statusEffectInstance2 = new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 1);
                    areaEffectCloudEntity.addEffect(statusEffectInstance1);
                    areaEffectCloudEntity.addEffect(statusEffectInstance2);

                    world.playSound((PlayerEntity)null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_SPLASH_POTION_BREAK, SoundCategory.PLAYERS, 0.5F, 1.0F/* / (random.nextFloat() * 0.7F + 0.8F)*/);
                    world.playSound((PlayerEntity)null, this.getX(), this.getY(), this.getZ(), Sand_Dust.SAND_SOUND_EVENT, SoundCategory.NEUTRAL, 0.5F, 1.0F / (random.nextFloat() * 0.7F + 0.8F));

                    areaEffectCloudEntity.refreshPositionAndAngles(this.getX(), this.getY(), this.getZ(), this.yaw, 0.0F);
                    areaEffectCloudEntity.setWaitTime(0);
                    this.world.spawnEntity(areaEffectCloudEntity);

                    this.world.sendEntityStatus(this, (byte)3);
                    this.remove();
                }
            }
    protected Item getDefaultItem() {
        return Items.SNOWBALL;
    }
}
