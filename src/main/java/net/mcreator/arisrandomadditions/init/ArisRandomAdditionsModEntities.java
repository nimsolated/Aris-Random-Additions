
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

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

import net.mcreator.arisrandomadditions.entity.TuxEntity;
import net.mcreator.arisrandomadditions.entity.TurdProjectileEntity;
import net.mcreator.arisrandomadditions.entity.PocketLightningProjectileEntity;
import net.mcreator.arisrandomadditions.entity.GhoulEntity;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArisRandomAdditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<EntityType<GhoulEntity>> GHOUL = register("ghoul",
			EntityType.Builder.<GhoulEntity>of(GhoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhoulEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TuxEntity>> TUX = register("tux",
			EntityType.Builder.<TuxEntity>of(TuxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TuxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PocketLightningProjectileEntity>> POCKET_LIGHTNING_PROJECTILE = register("pocket_lightning_projectile",
			EntityType.Builder.<PocketLightningProjectileEntity>of(PocketLightningProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PocketLightningProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TurdProjectileEntity>> TURD_PROJECTILE = register("turd_projectile",
			EntityType.Builder.<TurdProjectileEntity>of(TurdProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TurdProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

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
