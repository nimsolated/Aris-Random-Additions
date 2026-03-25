
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLEEDING_PARTICLES = REGISTRY.register("bleeding_particles", () -> new SimpleParticleType(false));
}
