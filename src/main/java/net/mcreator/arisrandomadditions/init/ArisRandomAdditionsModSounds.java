
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<SoundEvent> WARTANK_MOVING = REGISTRY.register("wartank_moving", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("aris_random_additions", "wartank_moving")));
}
