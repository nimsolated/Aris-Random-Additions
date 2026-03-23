package net.mcreator.arisrandomadditions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PassiveIncomeProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("PassiveIncomeCounter", (entity.getPersistentData().getDouble("PassiveIncomeCounter") + 1));
			if (entity.getPersistentData().getDouble("PassiveIncomeCounter") % 1340 == 0) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()) > 0) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(
								(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()));
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()) > 0) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(
								(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()));
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()) > 0) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(
								(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()));
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()) > 0) {
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(
								(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getEnchantmentLevel(ArisRandomAdditionsModEnchantments.PASSIVE_INCOME_ENCHANTMENT.get()));
				}
			}
		}
	}
}
