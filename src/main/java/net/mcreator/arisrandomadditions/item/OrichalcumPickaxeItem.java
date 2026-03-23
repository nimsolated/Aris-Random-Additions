
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModItems;

public class OrichalcumPickaxeItem extends PickaxeItem {
	public OrichalcumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ArisRandomAdditionsModItems.ORICHALCUM.get()));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
	}
}
