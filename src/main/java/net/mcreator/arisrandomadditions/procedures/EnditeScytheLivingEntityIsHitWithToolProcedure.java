package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModMobEffects;

public class EnditeScytheLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(ArisRandomAdditionsModMobEffects.THE_END_OF_YOUR_MISERY_EFFECT.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(ArisRandomAdditionsModMobEffects.THE_END_OF_YOUR_MISERY_EFFECT.get(), 80, 0, true, true));
			}
		}
	}
}
