
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
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(ArisRandomAdditionsModItems.MAGIC_FLESH.get());
			tabData.accept(ArisRandomAdditionsModItems.GOLDEN_BERRIES.get());
			tabData.accept(ArisRandomAdditionsModItems.BEAN.get());
			tabData.accept(ArisRandomAdditionsModItems.CHEESE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(ArisRandomAdditionsModBlocks.ORE_MINER.get().asItem());
			tabData.accept(ArisRandomAdditionsModBlocks.BEDROCKIFIER.get().asItem());
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
		}
	}
}
