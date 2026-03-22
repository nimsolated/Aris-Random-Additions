
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NimsRandomBullshitModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NimsRandomBullshitMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NimsRandomBullshitModBlocks.CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.BROKEN_GLASS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.QUADRA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.PENTA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.HEXA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.MAGMA_BRICKS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.MAGMA_BRICK_STAIRS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.MAGMA_BRICK_SLABS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.MAGMA_BRICK_WALLS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.ORICHALCUM_ORE.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.ORICHALCUM_BLOCK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.RAVE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NimsRandomBullshitModItems.BLOCK_EATER.get());
			tabData.accept(NimsRandomBullshitModItems.NETHERRACKITE_PICKAXE.get());
			tabData.accept(NimsRandomBullshitModItems.SHIT.get());
			tabData.accept(NimsRandomBullshitModItems.GRAVEDIGGER.get());
			tabData.accept(NimsRandomBullshitModItems.STAR_WAND.get());
			tabData.accept(NimsRandomBullshitModItems.NETHERRACK_JUICE_BUCKET.get());
			tabData.accept(NimsRandomBullshitModItems.BEDROCK_PICKAXE.get());
			tabData.accept(NimsRandomBullshitModItems.BEDROCK_SWORD.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_PICKAXE.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_AXE.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_SHOVEL.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_HOE.get());
			tabData.accept(NimsRandomBullshitModItems.BEDROCK_EATER.get());
			tabData.accept(NimsRandomBullshitModItems.WAND_OF_RESIZING.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NimsRandomBullshitModItems.NETHERRACKITE.get());
			tabData.accept(NimsRandomBullshitModItems.SAND_DUST.get());
			tabData.accept(NimsRandomBullshitModItems.LAPIS_LAZULI_NUGGET.get());
			tabData.accept(NimsRandomBullshitModItems.MAGIC_DUST.get());
			tabData.accept(NimsRandomBullshitModItems.STAR.get());
			tabData.accept(NimsRandomBullshitModItems.BEDROCK_UPGRADE_TEMPLATE.get());
			tabData.accept(NimsRandomBullshitModItems.MAGIC_EGG.get());
			tabData.accept(NimsRandomBullshitModItems.WITHER_QUESTION_MARK.get());
			tabData.accept(NimsRandomBullshitModItems.IRON_GOLEM_QUESTION_MARK.get());
			tabData.accept(NimsRandomBullshitModItems.SNOW_GOLEM_QUESTION_MARK.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM.get());
			tabData.accept(NimsRandomBullshitModItems.BEDROCK_SHARD.get());
			tabData.accept(NimsRandomBullshitModItems.BLACK_IRON_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(NimsRandomBullshitModItems.MAGIC_FLESH.get());
			tabData.accept(NimsRandomBullshitModItems.GOLDEN_BERRIES.get());
			tabData.accept(NimsRandomBullshitModItems.BEAN.get());
			tabData.accept(NimsRandomBullshitModItems.CHEESE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(NimsRandomBullshitModBlocks.ORE_MINER.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.BEDROCKIFIER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NimsRandomBullshitModItems.GHOUL_SPAWN_EGG.get());
			tabData.accept(NimsRandomBullshitModItems.TUX_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(NimsRandomBullshitModBlocks.REDSTONE_BRICKS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.REDSTONE_BRICK_STAIRS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.REDSTONE_BRICK_SLABS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.REDSTONE_BRICK_WALLS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.MAGMA_BRICK_PRESSURE_PLATE.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.MAGMA_BRICK_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_SWORD.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_ARMOR_HELMET.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_ARMOR_CHESTPLATE.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_ARMOR_LEGGINGS.get());
			tabData.accept(NimsRandomBullshitModItems.ORICHALCUM_ARMOR_BOOTS.get());
			tabData.accept(NimsRandomBullshitModItems.NIGHT_VISION_GOGGLES_HELMET.get());
		}
	}
}
