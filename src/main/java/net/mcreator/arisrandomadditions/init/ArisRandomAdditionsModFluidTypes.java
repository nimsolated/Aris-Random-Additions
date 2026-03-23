
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.arisrandomadditions.fluid.types.NetherrackJuiceFluidType;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<FluidType> NETHERRACK_JUICE_TYPE = REGISTRY.register("netherrack_juice", () -> new NetherrackJuiceFluidType());
}
