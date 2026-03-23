
package net.mcreator.arisrandomadditions.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.arisrandomadditions.procedures.StinkyEffectOnEffectActiveTickProcedure;
import net.mcreator.arisrandomadditions.procedures.StinkyEffectEffectExpiresProcedure;

import java.util.List;
import java.util.ArrayList;

public class StinkyEffectMobEffect extends MobEffect {
	public StinkyEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -2621555);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StinkyEffectOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		StinkyEffectEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
