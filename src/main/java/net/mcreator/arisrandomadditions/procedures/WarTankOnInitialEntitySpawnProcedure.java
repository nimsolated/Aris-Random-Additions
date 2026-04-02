package net.mcreator.arisrandomadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class WarTankOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && entity.isAlive()) {
			ArisRandomAdditionsMod.queueServerWork(100, () -> {
				ArisRandomAdditionsMod.LOGGER.info("WarTankOnInitialEntitySpawn: Replaying aris_random_additions:wartank_moving");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aris_random_additions:wartank_moving")), SoundSource.HOSTILE, (float) 0.3, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aris_random_additions:wartank_moving")), SoundSource.HOSTILE, (float) 0.3, 1, false);
					}
				}
				WarTankOnInitialEntitySpawnProcedure.execute(world, x, y, z, entity);
			});
		}
	}
}
