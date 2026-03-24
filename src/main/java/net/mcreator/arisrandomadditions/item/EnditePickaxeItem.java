
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModItems;

public class EnditePickaxeItem extends PickaxeItem {
	public EnditePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3048;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ArisRandomAdditionsModItems.ENDITE_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
	}
}
