package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModMobEffects;

public class GhoulOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(ArisRandomAdditionsModMobEffects.SUMMONED_ENTITY_EFFECT.get(), 200, 1, false, false));
	}
}
