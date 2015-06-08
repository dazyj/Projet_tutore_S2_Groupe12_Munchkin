package global.card.treasure_card;

import global.card.TreasureCard;
import global.card.treasure_card.enumeration.ConsumableItemSpecification;
import global.card.treasure_card.enumeration.TreasureCardCategory;

/**
 * {@link ConsumableItem} have different effect
 * @author Rhuarc
 *
 */
public class ConsumableItem extends TreasureCard
	{
		/**
		 * name of the card
		 */
		private final String name;
		
		private final int bonus;

		private final String category;

		public ConsumableItem(ConsumableItemSpecification name)
			{
				super();
				this.category = TreasureCardCategory.item.getName();
				this.name = name.getName();
				this.bonus = name.getBonus();
			}

		public String getCategory()
			{
					return this.category;
			}

		public String getName()
			{
					return this.name;
			}

		public int getBonus()
			{
					return bonus;
			}
		
		

	}
