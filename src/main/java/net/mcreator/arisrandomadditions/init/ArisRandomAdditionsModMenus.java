
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arisrandomadditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.arisrandomadditions.world.inventory.TurdGUIMenu;
import net.mcreator.arisrandomadditions.world.inventory.StarAssemblyTableGUIMenu;
import net.mcreator.arisrandomadditions.world.inventory.OreMinerGUIMenu;
import net.mcreator.arisrandomadditions.world.inventory.NetherPowerGeneratorGUIMenu;
import net.mcreator.arisrandomadditions.world.inventory.BedrockifierGUIMenu;
import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

public class ArisRandomAdditionsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ArisRandomAdditionsMod.MODID);
	public static final RegistryObject<MenuType<OreMinerGUIMenu>> ORE_MINER_GUI = REGISTRY.register("ore_miner_gui", () -> IForgeMenuType.create(OreMinerGUIMenu::new));
	public static final RegistryObject<MenuType<BedrockifierGUIMenu>> BEDROCKIFIER_GUI = REGISTRY.register("bedrockifier_gui", () -> IForgeMenuType.create(BedrockifierGUIMenu::new));
	public static final RegistryObject<MenuType<TurdGUIMenu>> TURD_GUI = REGISTRY.register("turd_gui", () -> IForgeMenuType.create(TurdGUIMenu::new));
	public static final RegistryObject<MenuType<NetherPowerGeneratorGUIMenu>> NETHER_POWER_GENERATOR_GUI = REGISTRY.register("nether_power_generator_gui", () -> IForgeMenuType.create(NetherPowerGeneratorGUIMenu::new));
	public static final RegistryObject<MenuType<StarAssemblyTableGUIMenu>> STAR_ASSEMBLY_TABLE_GUI = REGISTRY.register("star_assembly_table_gui", () -> IForgeMenuType.create(StarAssemblyTableGUIMenu::new));
}
