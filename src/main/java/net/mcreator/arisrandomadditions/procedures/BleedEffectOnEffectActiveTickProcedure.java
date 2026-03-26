package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModParticleTypes;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class BleedEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			ArisRandomAdditionsMod.queueServerWork(10, () -> {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("aris_random_additions:bleed_damage_type")))), 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ArisRandomAdditionsModParticleTypes.BLEEDING_PARTICLES.get()), x, (y + 1), z, 3, 0.33, 0.33, 0.33, 0);
			});
		}
	}
}
