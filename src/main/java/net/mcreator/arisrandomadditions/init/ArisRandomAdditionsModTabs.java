
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArisRandomAdditionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArisRandomAdditionsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ArisRandomAdditionsModBlocks.CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.CONDENSED_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.BROKEN_GLASS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.QUADRA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.PENTA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.HEXA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.MAGMA_BRICKS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.MAGMA_BRICK_STAIRS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.MAGMA_BRICK_SLABS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.MAGMA_BRICK_WALLS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ORICHALCUM_ORE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ORICHALCUM_BLOCK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.RAVE_BLOCK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ENDITE_BLOCK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ORICHALCUM_DEEPSLATE_ORE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.BRICKIER_MAGMA_BRICKS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.BLACK_IRON_BLOCK.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_WOOD.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_LOG.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_PLANKS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_STAIRS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_SLAB.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_FENCE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_FENCE_GATE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_PRESSURE_PLATE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ArisRandomAdditionsModItems.BLOCK_EATER.get());
			tabData.accept(ArisRandomAdditionsModItems.NETHERRACKITE_PICKAXE.get());
			tabData.accept(ArisRandomAdditionsModItems.GRAVEDIGGER.get());
			tabData.accept(ArisRandomAdditionsModItems.STAR_WAND.get());
			tabData.accept(ArisRandomAdditionsModItems.NETHERRACK_JUICE_BUCKET.get());
			tabData.accept(ArisRandomAdditionsModItems.BEDROCK_PICKAXE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_PICKAXE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_AXE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_SHOVEL.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_HOE.get());
			tabData.accept(ArisRandomAdditionsModItems.BEDROCK_EATER.get());
			tabData.accept(ArisRandomAdditionsModItems.WAND_OF_RESIZING.get());
			tabData.accept(ArisRandomAdditionsModItems.TURD.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_PICKAXE.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_AXE.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_SHOVEL.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_HOE.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_SCYTHE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ArisRandomAdditionsModItems.NETHERRACKITE.get());
			tabData.accept(ArisRandomAdditionsModItems.SAND_DUST.get());
			tabData.accept(ArisRandomAdditionsModItems.LAPIS_LAZULI_NUGGET.get());
			tabData.accept(ArisRandomAdditionsModItems.MAGIC_DUST.get());
			tabData.accept(ArisRandomAdditionsModItems.STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.BEDROCK_UPGRADE_TEMPLATE.get());
			tabData.accept(ArisRandomAdditionsModItems.MAGIC_EGG.get());
			tabData.accept(ArisRandomAdditionsModItems.WITHER_QUESTION_MARK.get());
			tabData.accept(ArisRandomAdditionsModItems.IRON_GOLEM_QUESTION_MARK.get());
			tabData.accept(ArisRandomAdditionsModItems.SNOW_GOLEM_QUESTION_MARK.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM.get());
			tabData.accept(ArisRandomAdditionsModItems.BEDROCK_SHARD.get());
			tabData.accept(ArisRandomAdditionsModItems.BLACK_IRON_INGOT.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_INGOT.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_UPGRADE_SMITHING_TEMPLATE.get());
			tabData.accept(ArisRandomAdditionsModItems.CHORUS_EYE.get());
			tabData.accept(ArisRandomAdditionsModItems.POWER_STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.VOID_STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.CAN_LID.get());
			tabData.accept(ArisRandomAdditionsModItems.EMPTY_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.MINT_LEAVES.get());
			tabData.accept(ArisRandomAdditionsModItems.SOCKET.get());
			tabData.accept(ArisRandomAdditionsModItems.GOLD_TOKEN.get());
			tabData.accept(ArisRandomAdditionsModItems.LEFT_PIECE_OF_NETHER_STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.TOP_PIECE_OF_NETHER_STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.RIGHT_PIECE_OF_NETHER_STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.BOTTOM_PIECE_OF_NETHER_STAR.get());
			tabData.accept(ArisRandomAdditionsModItems.BLACK_IRON_UPGRADE_SMITHING_TEMPLATE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(ArisRandomAdditionsModItems.MAGIC_FLESH.get());
			tabData.accept(ArisRandomAdditionsModItems.GOLDEN_BERRIES.get());
			tabData.accept(ArisRandomAdditionsModItems.BEAN.get());
			tabData.accept(ArisRandomAdditionsModItems.CHEESE.get());
			tabData.accept(ArisRandomAdditionsModItems.VOID_APPLE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_APPLE.get());
			tabData.accept(ArisRandomAdditionsModItems.BEDROCK_APPLE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORANGE.get());
			tabData.accept(ArisRandomAdditionsModItems.MINT.get());
			tabData.accept(ArisRandomAdditionsModItems.WATER_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.CARBONATED_WATER_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.SWEETENED_CARBONATED_WATER_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.MINT_SWEETENED_CARBONATED_WATER_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.ORANGE_SWEETENED_CARBONATED_WATER_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.BLAZE_APPLE.get());
			tabData.accept(ArisRandomAdditionsModItems.TURTLE_APPLE.get());
			tabData.accept(ArisRandomAdditionsModItems.BLACK_IRON_APPLE.get());
			tabData.accept(ArisRandomAdditionsModItems.TASTE_THE_RAINBOW_WATER_CAN.get());
			tabData.accept(ArisRandomAdditionsModItems.NETHERITE_APPLE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(ArisRandomAdditionsModBlocks.ORE_MINER.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.BEDROCKIFIER.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.SODA_MACHINE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.NETHER_POWER_GENERATOR.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.STAR_ASSEMBLY_TABLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ArisRandomAdditionsModItems.GHOUL_SPAWN_EGG.get());
			tabData.accept(ArisRandomAdditionsModItems.TUX_SPAWN_EGG.get());
			tabData.accept(ArisRandomAdditionsModItems.ARI_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ArisRandomAdditionsModBlocks.REDSTONE_BRICKS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.REDSTONE_BRICK_STAIRS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.REDSTONE_BRICK_SLABS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.REDSTONE_BRICK_WALLS.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.MAGMA_BRICK_PRESSURE_PLATE.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.MAGMA_BRICK_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ArisRandomAdditionsModItems.BEDROCK_SWORD.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_SWORD.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_ARMOR_HELMET.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_ARMOR_CHESTPLATE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_ARMOR_LEGGINGS.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_ARMOR_BOOTS.get());
			tabData.accept(ArisRandomAdditionsModItems.NIGHT_VISION_GOGGLES_HELMET.get());
			tabData.accept(ArisRandomAdditionsModItems.WAND_OF_DRAINING.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_SWORD.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_ARMOR_HELMET.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_ARMOR_CHESTPLATE.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_ARMOR_LEGGINGS.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_ARMOR_BOOTS.get());
			tabData.accept(ArisRandomAdditionsModItems.ENDITE_SCYTHE.get());
			tabData.accept(ArisRandomAdditionsModItems.ORICHALCUM_KATANA.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ArisRandomAdditionsModBlocks.MINT_PLANT.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.ANAHEIM_LEAVES.get().asItem());
		}
	}
}
