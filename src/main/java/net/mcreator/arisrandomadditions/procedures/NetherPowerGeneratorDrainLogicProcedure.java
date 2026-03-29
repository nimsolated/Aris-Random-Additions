package net.mcreator.arisrandomadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class NetherPowerGeneratorDrainLogicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (new Object() {
				public boolean doesBlockHaveTank(LevelAccessor level, BlockPos pos) {
					BlockEntity blockEntity = level.getBlockEntity(pos);
					if (blockEntity != null) {
						return blockEntity.getCapability(ForgeCapabilities.FLUID_HANDLER, null).isPresent();
					}
					return false;
				}
			}.doesBlockHaveTank(world, BlockPos.containing(x, y, z))) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == Items.BUCKET) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = new ItemStack(ArisRandomAdditionsModItems.NETHERRACK_JUICE_BUCKET.get()).copy();
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 1000;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
					}
					{
						int _value = (int) (new Object() {
							public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
								return _retval.get();
							}
						}.getFluidTankLevel(world, BlockPos.containing(x, y, z), 1) / 1000);
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.BLOCKS, (float) 0.75, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.BLOCKS, (float) 0.75, 1, false);
						}
					}
				}
			}
		}
	}
}
