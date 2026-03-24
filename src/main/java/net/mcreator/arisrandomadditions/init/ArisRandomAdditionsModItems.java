
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.arisrandomadditions.item.WitherQuestionMarkItem;
import net.mcreator.arisrandomadditions.item.WandOfResizingItem;
import net.mcreator.arisrandomadditions.item.WandOfDrainingItem;
import net.mcreator.arisrandomadditions.item.TurdItem;
import net.mcreator.arisrandomadditions.item.StarWandItem;
import net.mcreator.arisrandomadditions.item.StarItem;
import net.mcreator.arisrandomadditions.item.SnowGolemQuestionMarkItem;
import net.mcreator.arisrandomadditions.item.SandDustItem;
import net.mcreator.arisrandomadditions.item.PowerStarItem;
import net.mcreator.arisrandomadditions.item.PocketLightningItem;
import net.mcreator.arisrandomadditions.item.OrichalcumSwordItem;
import net.mcreator.arisrandomadditions.item.OrichalcumShovelItem;
import net.mcreator.arisrandomadditions.item.OrichalcumPickaxeItem;
import net.mcreator.arisrandomadditions.item.OrichalcumItem;
import net.mcreator.arisrandomadditions.item.OrichalcumHoeItem;
import net.mcreator.arisrandomadditions.item.OrichalcumAxeItem;
import net.mcreator.arisrandomadditions.item.OrichalcumArmorItem;
import net.mcreator.arisrandomadditions.item.NightVisionGogglesItem;
import net.mcreator.arisrandomadditions.item.NetherrackitePickaxeItem;
import net.mcreator.arisrandomadditions.item.NetherrackiteItem;
import net.mcreator.arisrandomadditions.item.NetherrackJuiceItem;
import net.mcreator.arisrandomadditions.item.MagicFleshItem;
import net.mcreator.arisrandomadditions.item.MagicEggItem;
import net.mcreator.arisrandomadditions.item.MagicDustItem;
import net.mcreator.arisrandomadditions.item.LapisLazuliNuggetItem;
import net.mcreator.arisrandomadditions.item.IronGolemQuestionMarkItem;
import net.mcreator.arisrandomadditions.item.GravediggerItem;
import net.mcreator.arisrandomadditions.item.GoldenBerriesItem;
import net.mcreator.arisrandomadditions.item.EnditeUpgradeSmithingTemplateItem;
import net.mcreator.arisrandomadditions.item.EnditeSwordItem;
import net.mcreator.arisrandomadditions.item.EnditeShovelItem;
import net.mcreator.arisrandomadditions.item.EnditeScytheItem;
import net.mcreator.arisrandomadditions.item.EnditePickaxeItem;
import net.mcreator.arisrandomadditions.item.EnditeIngotItem;
import net.mcreator.arisrandomadditions.item.EnditeHoeItem;
import net.mcreator.arisrandomadditions.item.EnditeAxeItem;
import net.mcreator.arisrandomadditions.item.EnditeArmorItem;
import net.mcreator.arisrandomadditions.item.ChorusEyeItem;
import net.mcreator.arisrandomadditions.item.CheeseItem;
import net.mcreator.arisrandomadditions.item.BlockEaterItem;
import net.mcreator.arisrandomadditions.item.BlackIronIngotItem;
import net.mcreator.arisrandomadditions.item.BedrockUpgradeTemplateItem;
import net.mcreator.arisrandomadditions.item.BedrockSwordItem;
import net.mcreator.arisrandomadditions.item.BedrockShardItem;
import net.mcreator.arisrandomadditions.item.BedrockPickaxeItem;
import net.mcreator.arisrandomadditions.item.BedrockEaterItem;
import net.mcreator.arisrandomadditions.item.BeanItem;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<Item> CONDENSED_NETHERRACK = block(ArisRandomAdditionsModBlocks.CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> CONDENSED_CONDENSED_NETHERRACK = block(ArisRandomAdditionsModBlocks.CONDENSED_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> CONDENSED_CONDENSED_CONDENSED_NETHERRACK = block(ArisRandomAdditionsModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> BLOCK_EATER = REGISTRY.register("block_eater", () -> new BlockEaterItem());
	public static final RegistryObject<Item> BROKEN_GLASS = block(ArisRandomAdditionsModBlocks.BROKEN_GLASS);
	public static final RegistryObject<Item> QUADRA_CONDENSED_NETHERRACK = block(ArisRandomAdditionsModBlocks.QUADRA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> NETHERRACKITE_PICKAXE = REGISTRY.register("netherrackite_pickaxe", () -> new NetherrackitePickaxeItem());
	public static final RegistryObject<Item> NETHERRACKITE = REGISTRY.register("netherrackite", () -> new NetherrackiteItem());
	public static final RegistryObject<Item> PENTA_CONDENSED_NETHERRACK = block(ArisRandomAdditionsModBlocks.PENTA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> HEXA_CONDENSED_NETHERRACK = block(ArisRandomAdditionsModBlocks.HEXA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> SAND_DUST = REGISTRY.register("sand_dust", () -> new SandDustItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_NUGGET = REGISTRY.register("lapis_lazuli_nugget", () -> new LapisLazuliNuggetItem());
	public static final RegistryObject<Item> MAGIC_DUST = REGISTRY.register("magic_dust", () -> new MagicDustItem());
	public static final RegistryObject<Item> MAGIC_FLESH = REGISTRY.register("magic_flesh", () -> new MagicFleshItem());
	public static final RegistryObject<Item> GOLDEN_BERRIES = REGISTRY.register("golden_berries", () -> new GoldenBerriesItem());
	public static final RegistryObject<Item> ORE_MINER = block(ArisRandomAdditionsModBlocks.ORE_MINER);
	public static final RegistryObject<Item> GHOUL_SPAWN_EGG = REGISTRY.register("ghoul_spawn_egg", () -> new ForgeSpawnEggItem(ArisRandomAdditionsModEntities.GHOUL, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> GRAVEDIGGER = REGISTRY.register("gravedigger", () -> new GravediggerItem());
	public static final RegistryObject<Item> STAR = REGISTRY.register("star", () -> new StarItem());
	public static final RegistryObject<Item> STAR_WAND = REGISTRY.register("star_wand", () -> new StarWandItem());
	public static final RegistryObject<Item> NETHERRACK_JUICE_BUCKET = REGISTRY.register("netherrack_juice_bucket", () -> new NetherrackJuiceItem());
	public static final RegistryObject<Item> TUX_SPAWN_EGG = REGISTRY.register("tux_spawn_egg", () -> new ForgeSpawnEggItem(ArisRandomAdditionsModEntities.TUX, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> REDSTONE_BRICKS = block(ArisRandomAdditionsModBlocks.REDSTONE_BRICKS);
	public static final RegistryObject<Item> REDSTONE_BRICK_STAIRS = block(ArisRandomAdditionsModBlocks.REDSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> REDSTONE_BRICK_SLABS = block(ArisRandomAdditionsModBlocks.REDSTONE_BRICK_SLABS);
	public static final RegistryObject<Item> REDSTONE_BRICK_WALLS = block(ArisRandomAdditionsModBlocks.REDSTONE_BRICK_WALLS);
	public static final RegistryObject<Item> MAGMA_BRICKS = block(ArisRandomAdditionsModBlocks.MAGMA_BRICKS);
	public static final RegistryObject<Item> MAGMA_BRICK_STAIRS = block(ArisRandomAdditionsModBlocks.MAGMA_BRICK_STAIRS);
	public static final RegistryObject<Item> MAGMA_BRICK_SLABS = block(ArisRandomAdditionsModBlocks.MAGMA_BRICK_SLABS);
	public static final RegistryObject<Item> MAGMA_BRICK_WALLS = block(ArisRandomAdditionsModBlocks.MAGMA_BRICK_WALLS);
	public static final RegistryObject<Item> MAGMA_BRICK_PRESSURE_PLATE = block(ArisRandomAdditionsModBlocks.MAGMA_BRICK_PRESSURE_PLATE);
	public static final RegistryObject<Item> MAGMA_BRICK_BUTTON = block(ArisRandomAdditionsModBlocks.MAGMA_BRICK_BUTTON);
	public static final RegistryObject<Item> BEAN = REGISTRY.register("bean", () -> new BeanItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> BEDROCK_UPGRADE_TEMPLATE = REGISTRY.register("bedrock_upgrade_template", () -> new BedrockUpgradeTemplateItem());
	public static final RegistryObject<Item> BEDROCKIFIER = block(ArisRandomAdditionsModBlocks.BEDROCKIFIER);
	public static final RegistryObject<Item> MAGIC_EGG = REGISTRY.register("magic_egg", () -> new MagicEggItem());
	public static final RegistryObject<Item> WITHER_QUESTION_MARK = REGISTRY.register("wither_question_mark", () -> new WitherQuestionMarkItem());
	public static final RegistryObject<Item> IRON_GOLEM_QUESTION_MARK = REGISTRY.register("iron_golem_question_mark", () -> new IronGolemQuestionMarkItem());
	public static final RegistryObject<Item> SNOW_GOLEM_QUESTION_MARK = REGISTRY.register("snow_golem_question_mark", () -> new SnowGolemQuestionMarkItem());
	public static final RegistryObject<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", () -> new BedrockSwordItem());
	public static final RegistryObject<Item> ORICHALCUM = REGISTRY.register("orichalcum", () -> new OrichalcumItem());
	public static final RegistryObject<Item> ORICHALCUM_ORE = block(ArisRandomAdditionsModBlocks.ORICHALCUM_ORE);
	public static final RegistryObject<Item> ORICHALCUM_BLOCK = block(ArisRandomAdditionsModBlocks.ORICHALCUM_BLOCK);
	public static final RegistryObject<Item> ORICHALCUM_PICKAXE = REGISTRY.register("orichalcum_pickaxe", () -> new OrichalcumPickaxeItem());
	public static final RegistryObject<Item> ORICHALCUM_AXE = REGISTRY.register("orichalcum_axe", () -> new OrichalcumAxeItem());
	public static final RegistryObject<Item> ORICHALCUM_SWORD = REGISTRY.register("orichalcum_sword", () -> new OrichalcumSwordItem());
	public static final RegistryObject<Item> ORICHALCUM_SHOVEL = REGISTRY.register("orichalcum_shovel", () -> new OrichalcumShovelItem());
	public static final RegistryObject<Item> ORICHALCUM_HOE = REGISTRY.register("orichalcum_hoe", () -> new OrichalcumHoeItem());
	public static final RegistryObject<Item> ORICHALCUM_ARMOR_HELMET = REGISTRY.register("orichalcum_armor_helmet", () -> new OrichalcumArmorItem.Helmet());
	public static final RegistryObject<Item> ORICHALCUM_ARMOR_CHESTPLATE = REGISTRY.register("orichalcum_armor_chestplate", () -> new OrichalcumArmorItem.Chestplate());
	public static final RegistryObject<Item> ORICHALCUM_ARMOR_LEGGINGS = REGISTRY.register("orichalcum_armor_leggings", () -> new OrichalcumArmorItem.Leggings());
	public static final RegistryObject<Item> ORICHALCUM_ARMOR_BOOTS = REGISTRY.register("orichalcum_armor_boots", () -> new OrichalcumArmorItem.Boots());
	public static final RegistryObject<Item> BEDROCK_SHARD = REGISTRY.register("bedrock_shard", () -> new BedrockShardItem());
	public static final RegistryObject<Item> BEDROCK_EATER = REGISTRY.register("bedrock_eater", () -> new BedrockEaterItem());
	public static final RegistryObject<Item> WAND_OF_RESIZING = REGISTRY.register("wand_of_resizing", () -> new WandOfResizingItem());
	public static final RegistryObject<Item> POCKET_LIGHTNING = REGISTRY.register("pocket_lightning", () -> new PocketLightningItem());
	public static final RegistryObject<Item> NIGHT_VISION_GOGGLES_HELMET = REGISTRY.register("night_vision_goggles_helmet", () -> new NightVisionGogglesItem.Helmet());
	public static final RegistryObject<Item> BLACK_IRON_INGOT = REGISTRY.register("black_iron_ingot", () -> new BlackIronIngotItem());
	public static final RegistryObject<Item> RAVE_BLOCK = block(ArisRandomAdditionsModBlocks.RAVE_BLOCK);
	public static final RegistryObject<Item> TURD = REGISTRY.register("turd", () -> new TurdItem());
	public static final RegistryObject<Item> WAND_OF_DRAINING = REGISTRY.register("wand_of_draining", () -> new WandOfDrainingItem());
	public static final RegistryObject<Item> ARI_SPAWN_EGG = REGISTRY.register("ari_spawn_egg", () -> new ForgeSpawnEggItem(ArisRandomAdditionsModEntities.ARI, -65448, -1, new Item.Properties()));
	public static final RegistryObject<Item> ENDITE_INGOT = REGISTRY.register("endite_ingot", () -> new EnditeIngotItem());
	public static final RegistryObject<Item> ENDITE_BLOCK = block(ArisRandomAdditionsModBlocks.ENDITE_BLOCK);
	public static final RegistryObject<Item> ENDITE_PICKAXE = REGISTRY.register("endite_pickaxe", () -> new EnditePickaxeItem());
	public static final RegistryObject<Item> ENDITE_AXE = REGISTRY.register("endite_axe", () -> new EnditeAxeItem());
	public static final RegistryObject<Item> ENDITE_SWORD = REGISTRY.register("endite_sword", () -> new EnditeSwordItem());
	public static final RegistryObject<Item> ENDITE_SHOVEL = REGISTRY.register("endite_shovel", () -> new EnditeShovelItem());
	public static final RegistryObject<Item> ENDITE_HOE = REGISTRY.register("endite_hoe", () -> new EnditeHoeItem());
	public static final RegistryObject<Item> ENDITE_ARMOR_HELMET = REGISTRY.register("endite_armor_helmet", () -> new EnditeArmorItem.Helmet());
	public static final RegistryObject<Item> ENDITE_ARMOR_CHESTPLATE = REGISTRY.register("endite_armor_chestplate", () -> new EnditeArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDITE_ARMOR_LEGGINGS = REGISTRY.register("endite_armor_leggings", () -> new EnditeArmorItem.Leggings());
	public static final RegistryObject<Item> ENDITE_ARMOR_BOOTS = REGISTRY.register("endite_armor_boots", () -> new EnditeArmorItem.Boots());
	public static final RegistryObject<Item> ENDITE_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("endite_upgrade_smithing_template", () -> new EnditeUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> CHORUS_EYE = REGISTRY.register("chorus_eye", () -> new ChorusEyeItem());
	public static final RegistryObject<Item> POWER_STAR = REGISTRY.register("power_star", () -> new PowerStarItem());
	public static final RegistryObject<Item> ENDITE_SCYTHE = REGISTRY.register("endite_scythe", () -> new EnditeScytheItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
