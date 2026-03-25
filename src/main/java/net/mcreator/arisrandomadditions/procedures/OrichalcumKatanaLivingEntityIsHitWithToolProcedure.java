package net.mcreator.arisrandomadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModMobEffects;

public class OrichalcumKatanaLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.isClientSide() && itemstack.getOrCreateTag().getBoolean("nextAttackBleeds") == true) {
			itemstack.getOrCreateTag().putBoolean("nextAttackBleeds", false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.hit")), SoundSource.PLAYERS, (float) 0.66, (float) 1.36);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.hit")), SoundSource.PLAYERS, (float) 0.66, (float) 1.36, false);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ArisRandomAdditionsModMobEffects.BLEED_EFFECT.get(), 100, 0, false, false));
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(30, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
