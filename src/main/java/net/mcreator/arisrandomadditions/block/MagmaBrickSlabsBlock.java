
package net.mcreator.arisrandomadditions.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MagmaBrickSlabsBlock extends SlabBlock {
	public MagmaBrickSlabsBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.5f).lightLevel(s -> 3).requiresCorrectToolForDrops().dynamicShape());
	}
}
