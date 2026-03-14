
package net.mcreator.nimsrandombullshit.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseItem extends Item {
	public CheeseItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).build()));
	}
}
