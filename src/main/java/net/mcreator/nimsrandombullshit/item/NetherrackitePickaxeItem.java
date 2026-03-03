
package net.mcreator.nimsrandombullshit.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.nimsrandombullshit.procedures.NetherrackitePickaxeBlockDestroyedWithToolProcedure;
import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModBlocks;

import java.util.List;

public class NetherrackitePickaxeItem extends PickaxeItem {
	public NetherrackitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6093;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		NetherrackitePickaxeBlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.nims_random_bullshit.netherrackite_pickaxe.description_0"));
	}
}
