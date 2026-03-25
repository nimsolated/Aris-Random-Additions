
package net.mcreator.arisrandomadditions.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.arisrandomadditions.procedures.BleedEffectOnEffectActiveTickProcedure;

import java.util.List;
import java.util.ArrayList;

public class BleedEffectMobEffect extends MobEffect {
	public BleedEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedEffectOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
