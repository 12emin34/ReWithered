package me._12emin34.rewithered.mixin;

import me._12emin34.rewithered.entity.projectile.SpawningWitherSkull;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PowerableMob;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WitherBoss.class)
public abstract class WitherBossMixin extends Monster implements PowerableMob, RangedAttackMob {
    protected WitherBossMixin(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    /**
     * @author
     * @reason
     */
    @Overwrite
    private void performRangedAttack(int i, double d, double e, double f, boolean bl) {
        if (!this.isSilent()) {
            this.level().levelEvent(null, 1024, this.blockPosition(), 0);
        }

        double g = this.getHeadX(i);
        double h = this.getHeadY(i);
        double j = this.getHeadZ(i);
        double k = d - g;
        double l = e - h;
        double m = f - j;
        WitherSkull witherSkull = new SpawningWitherSkull(this.level(), this, k, l, m);
        witherSkull.setOwner(this);
        if (bl) {
            witherSkull.setDangerous(true);
        }

        witherSkull.setPosRaw(g, h, j);
        this.level().addFreshEntity(witherSkull);
    }

    @Shadow
    protected abstract double getHeadZ(int i);

    @Shadow
    protected abstract double getHeadY(int i);

    @Shadow
    protected abstract double getHeadX(int i);
}
