package global.card.dungeon_card;

import global.card.DungeonCard;
import global.card.dungeon_card.enumeration.DungeonCardCategory;



public class Job extends DungeonCard
	{
		/**
		 * name of the card
		 */
		private final String name;
		/**
		 * category of this card
		 */
		private final DungeonCardCategory category;

		public Job(String name, DungeonCardCategory category)
			{
				super();
				this.name = name;
				this.category = category;
			}

		public String getName()
			{
				return name;
			}

		public DungeonCardCategory getCategory()
			{
				return category;
			}

	}
