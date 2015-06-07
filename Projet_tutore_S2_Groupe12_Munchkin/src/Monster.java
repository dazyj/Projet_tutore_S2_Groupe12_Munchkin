
/**
 * the {@link Player} can fight against the {@link Monster} for win a level. 
 * @author Rhuarc
 *
 */
public class Monster extends DungeonCard
	{
		/**
		 * name of the card
		 */
		private final Monsters name;

		/**
		 * category of this card
		 */
		private final DungeonCardCategory category;
		/**
		 * the level is not final, because the player can be up or down the
		 * level.
		 */
		private int level;

		public Monster(Monsters name)
			{
				super();
				this.name = name;
				this.category = DungeonCardCategory.monster;
				switch (name)
					{
						case gobelin:
							this.setLevel(5);
						case orc:
							this.setLevel(6);
						case chipmunks:
							this.setLevel(2);
						case unicorn:
							this.setLevel(8);
						case chicken:
							this.setLevel(12);
					}
			}

		public Monsters getName()
			{
				return name;
			}

		public DungeonCardCategory getCategory()
			{
				return category;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}
		

	}
