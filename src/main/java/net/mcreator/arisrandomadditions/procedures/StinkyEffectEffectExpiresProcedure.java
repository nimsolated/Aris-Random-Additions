package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.arisrandomadditions.world.inventory.TurdGUIMenu;

public class StinkyEffectEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof TurdGUIMenu) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
