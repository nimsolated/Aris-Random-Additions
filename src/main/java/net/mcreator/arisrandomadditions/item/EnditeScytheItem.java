
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.arisrandomadditions.procedures.EnditeScytheLivingEntityIsHitWithToolProcedure;
import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModItems;

import java.util.List;

public class EnditeScytheItem extends HoeItem {
	public EnditeScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 3048;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 8f;
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
		}, 0, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EnditeScytheLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.aris_random_additions.endite_scythe.description_0"));
	}
}
