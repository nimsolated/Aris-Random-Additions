
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.arisrandomadditions.potion.SummonedEntityEffectMobEffect;
import net.mcreator.arisrandomadditions.potion.StinkyEffectMobEffect;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<MobEffect> STINKY_EFFECT = REGISTRY.register("stinky_effect", () -> new StinkyEffectMobEffect());
	public static final RegistryObject<MobEffect> SUMMONED_ENTITY_EFFECT = REGISTRY.register("summoned_entity_effect", () -> new SummonedEntityEffectMobEffect());
}
