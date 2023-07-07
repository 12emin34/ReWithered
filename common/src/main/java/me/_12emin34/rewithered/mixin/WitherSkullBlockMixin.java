package me._12emin34.rewithered.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WitherSkullBlock;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WitherSkullBlock.class)
public class WitherSkullBlockMixin {
    private WitherSkullBlockMixin() {
        throw new IllegalStateException("This class is not intended to be instantiated");
    }

    /**
     * @author 12emin34
     * @reason We do not want players to spawn Withers
     */
    @Overwrite
    public static boolean canSpawnMob(Level level, BlockPos blockPos, ItemStack itemStack) {
        return false;
    }

    /**
     * @author 12emin34
     * @reason We do not want players to spawn Withers
     */
    @Overwrite
    public static void checkSpawn(Level level, BlockPos blockPos, SkullBlockEntity skullBlockEntity) {
        // no-op
    }
}
