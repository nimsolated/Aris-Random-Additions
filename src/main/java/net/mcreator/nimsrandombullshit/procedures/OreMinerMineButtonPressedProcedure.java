package net.mcreator.nimsrandombullshit.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.Map;

public class OreMinerMineButtonPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double oreMinerRoll = 0;
		if (!world.isClientSide()) {
			if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())
					&& !(entity instanceof Player _plrCldCheck5 && _plrCldCheck5.getCooldowns()
							.isOnCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.break")), SoundSource.BLOCKS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.75, 0.85));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.break")), SoundSource.BLOCKS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.75, 0.85), false);
					}
				}
				{
					ItemStack _ist = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY);
					if (_ist.hurt(15, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				oreMinerRoll = Math.random();
				if (oreMinerRoll < 0.4) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COAL).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(1) + Mth.nextInt(RandomSource.create(), 1, 3)
								* ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 6);
				} else if (oreMinerRoll < 0.6) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COPPER_INGOT).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(2) + Mth.nextInt(RandomSource.create(), 2, 4)
								* ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 8);
				} else if (oreMinerRoll < 0.7) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(3) + 1 * ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(3)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 8);
				} else if (oreMinerRoll < 0.78) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(4) + 1 * ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(4)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 10);
				} else if (oreMinerRoll < 0.81) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(5) + Mth.nextInt(RandomSource.create(), 1, 2)
								* ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(5)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(3);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 14);
				} else if (oreMinerRoll < 0.84) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(6) + Mth.nextInt(RandomSource.create(), 1, 2)
								* ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(6)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(3);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 14);
				} else if (oreMinerRoll < 0.985) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(7) + Mth.nextInt(RandomSource.create(), 3, 6)
								* ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.giveExperiencePoints(5);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 9);
				} else {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP).copy();
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(8) + 1 * ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1)));
						((Slot) _slots.get(8)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem(), 20);
				}
			}
		}
	}
}
