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
		
		private final int bonus;
				
		private final int nbMaxCardBurnable;

		public Job(JobSpecification name, int bonus, int nbCard, int nbMax)
			{
				super(name.getName());
				this.category = DungeonCardCategory.job.getName();
				this.bonus = bonus;
				this.nbMaxCardBurnable = nbMax;
			}


		public int getBonus()
		{
			return this.bonus;
		}
		
		public int getNbMaxCardBurnable()
		{
			return this.nbMaxCardBurnable;
		}
		
		public String getCategory()
			{
				return this.category;
			}

	}
