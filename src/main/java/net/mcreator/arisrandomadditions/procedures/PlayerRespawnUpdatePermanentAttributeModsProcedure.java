package net.mcreator.arisrandomadditions.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.arisrandomadditions.ArisRandomAdditionsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerRespawnUpdatePermanentAttributeModsProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			ArisRandomAdditionsMod.queueServerWork(4, () -> {
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity3.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(
							((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0) + new Object() {
								public int getScore(String score, Entity _ent) {
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null)
										return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
									return 0;
								}
							}.getScore("PermanentBonusAttackDamage", entity)));
				if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity6.getAttribute(Attributes.MAX_HEALTH)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity4.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) + new Object() {
								public int getScore(String score, Entity _ent) {
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null)
										return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
									return 0;
								}
							}.getScore("PermanentBonusMaxHealth", entity)));
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ARMOR))
					_livingEntity9.getAttribute(Attributes.ARMOR)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.ARMOR) ? _livingEntity7.getAttribute(Attributes.ARMOR).getBaseValue() : 0) + new Object() {
								public int getScore(String score, Entity _ent) {
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null)
										return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
									return 0;
								}
							}.getScore("PermanentBonusArmor", entity)));
				if (entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS))
					_livingEntity12.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(
							((entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS) ? _livingEntity10.getAttribute(Attributes.ARMOR_TOUGHNESS).getBaseValue() : 0) + new Object() {
								public int getScore(String score, Entity _ent) {
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null)
										return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
									return 0;
								}
							}.getScore("PermanentBonusArmorToughness", entity) * 0.67));
				if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE))
					_livingEntity15.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(
							((entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE) ? _livingEntity13.getAttribute(Attributes.KNOCKBACK_RESISTANCE).getBaseValue() : 0)
									+ new Object() {
										public int getScore(String score, Entity _ent) {
											Scoreboard _sc = _ent.level().getScoreboard();
											Objective _so = _sc.getObjective(score);
											if (_so != null)
												return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
											return 0;
										}
									}.getScore("PermanentBonusKnockbackResistance", entity) * 0.05));
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = (new Object() {
						public int getScore(String score, Entity _ent) {
							Scoreboard _sc = _ent.level().getScoreboard();
							Objective _so = _sc.getObjective(score);
							if (_so != null)
								return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
							return 0;
						}
					}.getScore("PermanentCreativeFlight", entity) == 1);
					_player.onUpdateAbilities();
				}
			});
		}
	}
}
