package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class WarTankBulletProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.MOB);
		}
	}
}
