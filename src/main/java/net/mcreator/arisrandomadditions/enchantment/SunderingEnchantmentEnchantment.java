
package net.mcreator.arisrandomadditions.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModEnchantments;

import java.util.List;

public class SunderingEnchantmentEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("aris_random_additions_sundering_enchantment", item -> Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:swords"))).test(new ItemStack(item)));

	public SunderingEnchantmentEnchantment() {
		super(Enchantment.Rarity.VERY_RARE, ENCHANTMENT_CATEGORY, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return super.checkCompatibility(enchantment) && !List.of(ArisRandomAdditionsModEnchantments.RUINING_ENCHANTMENT.get()).contains(enchantment);
	}
}
