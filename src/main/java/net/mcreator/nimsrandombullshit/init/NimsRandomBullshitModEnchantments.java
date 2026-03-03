
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.nimsrandombullshit.enchantment.PassiveIncomeEnchantmentEnchantment;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<Enchantment> PASSIVE_INCOME_ENCHANTMENT = REGISTRY.register("passive_income_enchantment", () -> new PassiveIncomeEnchantmentEnchantment());
}
