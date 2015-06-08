package global.card.dungeon_card;

import global.card.Card;
import global.card.DungeonCard;
import global.card.dungeon_card.enumeration.DungeonCardCategory;




/**
 * {@link Race} is a race for a player.
 * 
 * @author Zyra
 *
 */
public class Race extends DungeonCard
	{
		/**
		 * name of the {@link Card}
		 */
		private final String name;
		/**
		 * category of this {@link Card}
		 */
		private final DungeonCardCategory category;

		public Race(String name)
			{
				super();
				this.category = DungeonCardCategory.race;
				this.name = name;
			}
		
		public void power ( String name)
		{
			
		}

		public DungeonCardCategory getCategory()
			{
				return category;
			}

		public String getName()
			{
				return name;
			}

	}
