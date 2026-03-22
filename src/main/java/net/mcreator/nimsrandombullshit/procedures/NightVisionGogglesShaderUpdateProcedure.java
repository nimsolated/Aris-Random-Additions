package net.mcreator.nimsrandombullshit.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class NightVisionGogglesShaderUpdateProcedure {
	@SubscribeEvent
	public static void onClientTick(TickEvent.ClientTickEvent event) {
		Minecraft mc = Minecraft.getInstance();
		if (mc.level == null)
			return;
		if (event.phase != TickEvent.Phase.END)
			return;
		execute(event, mc.level, mc.player);
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == NimsRandomBullshitModItems.NIGHT_VISION_GOGGLES_HELMET.get()
				&& !(Minecraft.getInstance().gameRenderer.currentEffect() != null)) {
			Minecraft.getInstance().gameRenderer.checkEntityPostEffect(new Creeper(EntityType.CREEPER, (Level) world));
		} else if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == NimsRandomBullshitModItems.NIGHT_VISION_GOGGLES_HELMET.get())
				&& Minecraft.getInstance().gameRenderer.currentEffect() != null) {
			Minecraft.getInstance().gameRenderer.shutdownEffect();
		}
	}
}
