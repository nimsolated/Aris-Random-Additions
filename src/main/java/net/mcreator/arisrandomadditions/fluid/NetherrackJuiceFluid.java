
package net.mcreator.arisrandomadditions.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModItems;
import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModFluids;
import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModFluidTypes;
import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModBlocks;

public abstract class NetherrackJuiceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ArisRandomAdditionsModFluidTypes.NETHERRACK_JUICE_TYPE.get(), () -> ArisRandomAdditionsModFluids.NETHERRACK_JUICE.get(),
			() -> ArisRandomAdditionsModFluids.FLOWING_NETHERRACK_JUICE.get()).explosionResistance(100f).bucket(() -> ArisRandomAdditionsModItems.NETHERRACK_JUICE_BUCKET.get())
			.block(() -> (LiquidBlock) ArisRandomAdditionsModBlocks.NETHERRACK_JUICE.get());

	private NetherrackJuiceFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NetherrackJuiceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NetherrackJuiceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
