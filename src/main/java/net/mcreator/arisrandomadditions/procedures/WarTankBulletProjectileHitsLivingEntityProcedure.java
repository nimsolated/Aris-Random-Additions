package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

public class WarTankBulletProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!world.isClientSide()) {
			if (!(entity == sourceentity)) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.MOB);
			}
		}
	}
}
