package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.item.ItemStack;

public class OrichalcumKatanaHasItemGlowingEffectProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("nextAttackBleeds") == true) {
			return true;
		}
		return false;
	}
}
