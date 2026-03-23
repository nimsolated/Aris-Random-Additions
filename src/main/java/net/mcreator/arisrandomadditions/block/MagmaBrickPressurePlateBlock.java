
package net.mcreator.arisrandomadditions.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class MagmaBrickPressurePlateBlock extends PressurePlateBlock {
	public MagmaBrickPressurePlateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.5f).lightLevel(s -> 3).requiresCorrectToolForDrops().dynamicShape().forceSolidOn(), BlockSetType.IRON);
	}
}
