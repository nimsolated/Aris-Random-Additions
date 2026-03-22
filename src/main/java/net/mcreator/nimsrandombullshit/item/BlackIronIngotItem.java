
package net.mcreator.nimsrandombullshit.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlackIronIngotItem extends Item {
	public BlackIronIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
