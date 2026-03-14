
package net.mcreator.nimsrandombullshit.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class MagmaBrickWallsBlock extends WallBlock {
	public MagmaBrickWallsBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.STONE).strength(0.5f).lightLevel(s -> 3).requiresCorrectToolForDrops().forceSolidOn());
	}
}
