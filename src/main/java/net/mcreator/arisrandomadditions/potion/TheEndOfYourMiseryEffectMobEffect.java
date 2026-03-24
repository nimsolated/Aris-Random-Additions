
package net.mcreator.arisrandomadditions.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.arisrandomadditions.procedures.TheEndOfYourMiseryEffectEffectStartedappliedProcedure;
import net.mcreator.arisrandomadditions.procedures.TheEndOfYourMiseryEffectEffectExpiresProcedure;

public class TheEndOfYourMiseryEffectMobEffect extends MobEffect {
	public TheEndOfYourMiseryEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434778);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		TheEndOfYourMiseryEffectEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TheEndOfYourMiseryEffectEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
