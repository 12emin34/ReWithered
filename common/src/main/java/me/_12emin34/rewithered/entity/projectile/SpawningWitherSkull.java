package me._12emin34.rewithered.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

public class SpawningWitherSkull extends WitherSkull {
    public SpawningWitherSkull(EntityType<? extends WitherSkull> entityType, Level level) {
        super(entityType, level);
    }

    public SpawningWitherSkull(Level level, LivingEntity livingEntity, double d, double e, double f) {
        super(level, livingEntity, d, e, f);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide) {
            WitherSkeleton witherSkeleton = new WitherSkeleton(EntityType.WITHER_SKELETON, level());
            witherSkeleton.setPos(this.getX(), this.getY(), this.getZ());
            witherSkeleton.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.STONE_SWORD));
            level().addFreshEntity(witherSkeleton);
        }
    }
}
