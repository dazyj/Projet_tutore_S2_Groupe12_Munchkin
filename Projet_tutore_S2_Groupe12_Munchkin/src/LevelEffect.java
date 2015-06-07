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
		private final String name;
		/**
		 * the category of {@link LevelEffect} is level_effect
		 */
		private final TreasureCardsCategory category;

		private final int LevelNumberUp;

		private final int levelNumberLess;

		public LevelEffect(String name, int numberUp, int numberLess,
				boolean haveTarget)
			{
				super();
				this.name = name;
				this.category = TreasureCardsCategory.level_effect;
				this.LevelNumberUp = numberUp;
				this.levelNumberLess = numberLess;
			}

		public TreasureCardsCategory getCategory()
			{
				return category;
			}

		public String getName()
			{
				return name;
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
