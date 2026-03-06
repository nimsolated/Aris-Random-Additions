package net.mcreator.nimsrandombullshit.procedures;

import net.minecraft.world.entity.Entity;

public class TuxPlaybackConditionJumpUpProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().y() > 0) {
			return true;
		}
		return false;
	}
}
