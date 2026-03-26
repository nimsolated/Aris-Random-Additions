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
