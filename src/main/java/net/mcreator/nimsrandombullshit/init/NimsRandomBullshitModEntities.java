
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.nimsrandombullshit.entity.TuxEntity;
import net.mcreator.nimsrandombullshit.entity.ShitProjectileEntity;
import net.mcreator.nimsrandombullshit.entity.PocketLightningProjectileEntity;
import net.mcreator.nimsrandombullshit.entity.GhoulEntity;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NimsRandomBullshitModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<EntityType<ShitProjectileEntity>> SHIT_PROJECTILE = register("shit_projectile",
			EntityType.Builder.<ShitProjectileEntity>of(ShitProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ShitProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GhoulEntity>> GHOUL = register("ghoul",
			EntityType.Builder.<GhoulEntity>of(GhoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhoulEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TuxEntity>> TUX = register("tux",
			EntityType.Builder.<TuxEntity>of(TuxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TuxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PocketLightningProjectileEntity>> POCKET_LIGHTNING_PROJECTILE = register("pocket_lightning_projectile",
			EntityType.Builder.<PocketLightningProjectileEntity>of(PocketLightningProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PocketLightningProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GhoulEntity.init();
			TuxEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GHOUL.get(), GhoulEntity.createAttributes().build());
		event.put(TUX.get(), TuxEntity.createAttributes().build());
	}
}
