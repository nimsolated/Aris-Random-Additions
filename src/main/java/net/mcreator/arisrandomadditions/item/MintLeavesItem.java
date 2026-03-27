
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MintLeavesItem extends Item {
	public MintLeavesItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
