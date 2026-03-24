
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnditeUpgradeSmithingTemplateItem extends Item {
	public EnditeUpgradeSmithingTemplateItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
