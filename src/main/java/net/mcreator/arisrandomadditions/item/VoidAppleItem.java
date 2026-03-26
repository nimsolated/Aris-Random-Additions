
package net.mcreator.arisrandomadditions.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.arisrandomadditions.procedures.VoidApplePlayerFinishesUsingItemProcedure;

import java.util.List;

public class VoidAppleItem extends Item {
	public VoidAppleItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(16).saturationMod(1.6f).alwaysEat().build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.aris_random_additions.void_apple.description_0"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		VoidApplePlayerFinishesUsingItemProcedure.execute(world, entity);
		return retval;
	}
}
