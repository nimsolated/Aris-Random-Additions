
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChorusEyeItem extends Item {
	public ChorusEyeItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
