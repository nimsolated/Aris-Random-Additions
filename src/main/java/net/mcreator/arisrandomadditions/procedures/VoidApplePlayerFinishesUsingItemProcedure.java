package net.mcreator.arisrandomadditions.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

public class VoidApplePlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1600, 2, true, true));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1600, 2, true, true));
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
				_livingEntity4.getAttribute(Attributes.MAX_HEALTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MAX_HEALTH) ? _livingEntity3.getAttribute(Attributes.MAX_HEALTH).getBaseValue() : 0) + 2));
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("PermanentBonusMaxHealth");
				if (_so == null)
					_so = _sc.addObjective("PermanentBonusMaxHealth", ObjectiveCriteria.DUMMY, Component.literal("PermanentBonusMaxHealth"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
					public int getScore(String score, Entity _ent) {
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective(score);
						if (_so != null)
							return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
						return 0;
					}
				}.getScore("PermanentBonusMaxHealth", entity) + 2));
			}
			if (entity instanceof Player) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A75Void Apple \u00A7rgranted you bonus Max Health!"), false);
			}
		}
	}
}
