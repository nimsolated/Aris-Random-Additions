
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.arisrandomadditions.enchantment.SunderingEnchantmentEnchantment;
import net.mcreator.arisrandomadditions.enchantment.RuiningEnchantmentEnchantment;
import net.mcreator.arisrandomadditions.enchantment.PassiveIncomeEnchantmentEnchantment;
import net.mcreator.arisrandomadditions.enchantment.LifeMendingEnchantmentEnchantment;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<Enchantment> PASSIVE_INCOME_ENCHANTMENT = REGISTRY.register("passive_income_enchantment", () -> new PassiveIncomeEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> RUINING_ENCHANTMENT = REGISTRY.register("ruining_enchantment", () -> new RuiningEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> SUNDERING_ENCHANTMENT = REGISTRY.register("sundering_enchantment", () -> new SunderingEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> LIFE_MENDING_ENCHANTMENT = REGISTRY.register("life_mending_enchantment", () -> new LifeMendingEnchantmentEnchantment());
}
