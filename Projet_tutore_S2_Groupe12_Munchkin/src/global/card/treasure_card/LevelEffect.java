package global.card.treasure_card;

import global.Player;
import global.card.TreasureCard;
import global.card.treasure_card.enumeration.LevelEffectSpecification;
import global.card.treasure_card.enumeration.TreasureCardCategory;

/**
 * the levelEffect impact the {@link Player} level.
 * 
 * @author Rhuarc
 *
 */
public class LevelEffect extends TreasureCard
	{
		/**
		 * name of the card
		 */
		private final LevelEffectSpecification name;
		/**
		 * the category of {@link LevelEffect} is level_effect
		 */
		private final TreasureCardCategory category;
		/**
		 * number of level who gain the {@link Player}.
		 */
		private final int LevelNumberUp;
		/**
		 * number of level who other {@link Player} can lose.
		 */
		private final int levelNumberLess;


		public LevelEffect(LevelEffectSpecification name)
			{
				super();
				this.name = name;
				this.category = TreasureCardCategory.level_effect;
				this.LevelNumberUp = name.getLevelNumberUp();
				this.levelNumberLess = name.getLevelNumberDown();
			}

		public TreasureCardCategory getCategory()
			{
				return category;
			}

		public LevelEffectSpecification getName()
			{
				return this.name;
			}

		public void effect(Player player, Player targetPlayer)
			{
				player.setLevel(player.getLevel() + this.LevelNumberUp);
				if(targetPlayer.getLevel() < 1)
					{
						targetPlayer.setLevel(targetPlayer.getLevel() - this.levelNumberLess);
					}
				
			}

	}
