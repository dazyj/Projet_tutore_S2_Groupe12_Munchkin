package global.card.treasure_card;

import global.Player;
import global.card.treasure_card.enumeration.TreasureCardsCategory;

/**
 * the bonus can help a {@link Player} or handicap a other {@link Player}
 * @author Rhuarc
 *
 */
public class Bonus extends TreasureCard
	{
		private final String name;
		/**
		 * the category of {@link Bonus} is bonus
		 */
		private final TreasureCardsCategory category;
		
		public Bonus(String name)
			{
				super();
				this.name = name;
				this.category = TreasureCardsCategory.bonus;
			}

		public TreasureCardsCategory getCategory()
			{
					return category;
			}

		public String getName()
			{
					return name;
			}
		

	}
