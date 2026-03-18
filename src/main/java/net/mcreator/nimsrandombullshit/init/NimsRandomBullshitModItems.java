
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nimsrandombullshit.item.WitherQuestionMarkItem;
import net.mcreator.nimsrandombullshit.item.StarWandItem;
import net.mcreator.nimsrandombullshit.item.StarItem;
import net.mcreator.nimsrandombullshit.item.SnowGolemQuestionMarkItem;
import net.mcreator.nimsrandombullshit.item.ShitItem;
import net.mcreator.nimsrandombullshit.item.SandDustItem;
import net.mcreator.nimsrandombullshit.item.NetherrackitePickaxeItem;
import net.mcreator.nimsrandombullshit.item.NetherrackiteItem;
import net.mcreator.nimsrandombullshit.item.NetherrackJuiceItem;
import net.mcreator.nimsrandombullshit.item.MagicFleshItem;
import net.mcreator.nimsrandombullshit.item.MagicEggItem;
import net.mcreator.nimsrandombullshit.item.MagicDustItem;
import net.mcreator.nimsrandombullshit.item.LapisLazuliNuggetItem;
import net.mcreator.nimsrandombullshit.item.IronGolemQuestionMarkItem;
import net.mcreator.nimsrandombullshit.item.GravediggerItem;
import net.mcreator.nimsrandombullshit.item.GoldenBerriesItem;
import net.mcreator.nimsrandombullshit.item.CheeseItem;
import net.mcreator.nimsrandombullshit.item.BlockEaterItem;
import net.mcreator.nimsrandombullshit.item.BedrockUpgradeTemplateItem;
import net.mcreator.nimsrandombullshit.item.BedrockSwordItem;
import net.mcreator.nimsrandombullshit.item.BedrockPickaxeItem;
import net.mcreator.nimsrandombullshit.item.BeanItem;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<Item> CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> CONDENSED_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> CONDENSED_CONDENSED_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> BLOCK_EATER = REGISTRY.register("block_eater", () -> new BlockEaterItem());
	public static final RegistryObject<Item> BROKEN_GLASS = block(NimsRandomBullshitModBlocks.BROKEN_GLASS);
	public static final RegistryObject<Item> QUADRA_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.QUADRA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> NETHERRACKITE_PICKAXE = REGISTRY.register("netherrackite_pickaxe", () -> new NetherrackitePickaxeItem());
	public static final RegistryObject<Item> NETHERRACKITE = REGISTRY.register("netherrackite", () -> new NetherrackiteItem());
	public static final RegistryObject<Item> PENTA_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.PENTA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> HEXA_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.HEXA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> SAND_DUST = REGISTRY.register("sand_dust", () -> new SandDustItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_NUGGET = REGISTRY.register("lapis_lazuli_nugget", () -> new LapisLazuliNuggetItem());
	public static final RegistryObject<Item> MAGIC_DUST = REGISTRY.register("magic_dust", () -> new MagicDustItem());
	public static final RegistryObject<Item> MAGIC_FLESH = REGISTRY.register("magic_flesh", () -> new MagicFleshItem());
	public static final RegistryObject<Item> SHIT = REGISTRY.register("shit", () -> new ShitItem());
	public static final RegistryObject<Item> GOLDEN_BERRIES = REGISTRY.register("golden_berries", () -> new GoldenBerriesItem());
	public static final RegistryObject<Item> ORE_MINER = block(NimsRandomBullshitModBlocks.ORE_MINER);
	public static final RegistryObject<Item> GHOUL_SPAWN_EGG = REGISTRY.register("ghoul_spawn_egg", () -> new ForgeSpawnEggItem(NimsRandomBullshitModEntities.GHOUL, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> GRAVEDIGGER = REGISTRY.register("gravedigger", () -> new GravediggerItem());
	public static final RegistryObject<Item> STAR = REGISTRY.register("star", () -> new StarItem());
	public static final RegistryObject<Item> STAR_WAND = REGISTRY.register("star_wand", () -> new StarWandItem());
	public static final RegistryObject<Item> NETHERRACK_JUICE_BUCKET = REGISTRY.register("netherrack_juice_bucket", () -> new NetherrackJuiceItem());
	public static final RegistryObject<Item> TUX_SPAWN_EGG = REGISTRY.register("tux_spawn_egg", () -> new ForgeSpawnEggItem(NimsRandomBullshitModEntities.TUX, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> REDSTONE_BRICKS = block(NimsRandomBullshitModBlocks.REDSTONE_BRICKS);
	public static final RegistryObject<Item> REDSTONE_BRICK_STAIRS = block(NimsRandomBullshitModBlocks.REDSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> REDSTONE_BRICK_SLABS = block(NimsRandomBullshitModBlocks.REDSTONE_BRICK_SLABS);
	public static final RegistryObject<Item> REDSTONE_BRICK_WALLS = block(NimsRandomBullshitModBlocks.REDSTONE_BRICK_WALLS);
	public static final RegistryObject<Item> MAGMA_BRICKS = block(NimsRandomBullshitModBlocks.MAGMA_BRICKS);
	public static final RegistryObject<Item> MAGMA_BRICK_STAIRS = block(NimsRandomBullshitModBlocks.MAGMA_BRICK_STAIRS);
	public static final RegistryObject<Item> MAGMA_BRICK_SLABS = block(NimsRandomBullshitModBlocks.MAGMA_BRICK_SLABS);
	public static final RegistryObject<Item> MAGMA_BRICK_WALLS = block(NimsRandomBullshitModBlocks.MAGMA_BRICK_WALLS);
	public static final RegistryObject<Item> MAGMA_BRICK_PRESSURE_PLATE = block(NimsRandomBullshitModBlocks.MAGMA_BRICK_PRESSURE_PLATE);
	public static final RegistryObject<Item> MAGMA_BRICK_BUTTON = block(NimsRandomBullshitModBlocks.MAGMA_BRICK_BUTTON);
	public static final RegistryObject<Item> BEAN = REGISTRY.register("bean", () -> new BeanItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> BEDROCK_UPGRADE_TEMPLATE = REGISTRY.register("bedrock_upgrade_template", () -> new BedrockUpgradeTemplateItem());
	public static final RegistryObject<Item> BEDROCKIFIER = block(NimsRandomBullshitModBlocks.BEDROCKIFIER);
	public static final RegistryObject<Item> MAGIC_EGG = REGISTRY.register("magic_egg", () -> new MagicEggItem());
	public static final RegistryObject<Item> WITHER_QUESTION_MARK = REGISTRY.register("wither_question_mark", () -> new WitherQuestionMarkItem());
	public static final RegistryObject<Item> IRON_GOLEM_QUESTION_MARK = REGISTRY.register("iron_golem_question_mark", () -> new IronGolemQuestionMarkItem());
	public static final RegistryObject<Item> SNOW_GOLEM_QUESTION_MARK = REGISTRY.register("snow_golem_question_mark", () -> new SnowGolemQuestionMarkItem());
	public static final RegistryObject<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", () -> new BedrockSwordItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
