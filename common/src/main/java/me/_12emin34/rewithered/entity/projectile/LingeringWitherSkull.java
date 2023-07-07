package me._12emin34.rewithered.entity.projectile;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class LingeringWitherSkull extends WitherSkull {
    public LingeringWitherSkull(EntityType<? extends WitherSkull> entityType, Level level) {
        super(entityType, level);
    }

    public LingeringWitherSkull(Level level, LivingEntity livingEntity, double d, double e, double f) {
        super(level, livingEntity, d, e, f);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide) {
            AreaEffectCloud areaEffectCloud = new AreaEffectCloud(this.level(), this.getX(), this.getY(), this.getZ());
            areaEffectCloud.setRadius(3.0F);
            areaEffectCloud.setRadiusOnUse(-0.5F);
            areaEffectCloud.setWaitTime(10);

            areaEffectCloud.addEffect(new MobEffectInstance(MobEffects.WITHER, 400, 1));

            this.level().addFreshEntity(areaEffectCloud);
        }
    }
}
