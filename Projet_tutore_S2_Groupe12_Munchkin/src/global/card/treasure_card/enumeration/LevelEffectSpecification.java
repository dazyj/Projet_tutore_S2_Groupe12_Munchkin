package global.card.treasure_card.enumeration;

import global.Player;

public enum LevelEffectSpecification
	{
		Steal_Level(1, 1), thousand_Gold_Piece(1, 0), downLevel(0, 1);

		/**
		 * number of level who gain the {@link Player}.
		 */
		private final int levelNumberUp;
		/**
		 * number of level who other {@link Player} can lose.
		 */
		private final int levelNumberDown;

		private LevelEffectSpecification(int levelNumberUp, int levelNumberDown)
			{
				this.levelNumberUp = levelNumberUp;

				this.levelNumberDown = levelNumberDown;
			}

		public int getLevelNumberUp()
			{
				return levelNumberUp;
			}

		public int getLevelNumberDown()
			{
				return levelNumberDown;
			}

	}
