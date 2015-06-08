package global.card.dungeon_card;

import global.card.DungeonCard;
import global.card.dungeon_card.enumeration.DungeonCardCategory;
import global.card.dungeon_card.enumeration.JobSpecification;



public class Job extends DungeonCard
	{
		/**
		 * category of this card
		 */
		private final String category;

		public Job(JobSpecification name)
			{
				super(name.getName());
				this.category = DungeonCardCategory.job.getName();
			}


		public String getCategory()
			{
				return category;
			}

	}
