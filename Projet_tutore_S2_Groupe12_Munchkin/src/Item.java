/**
 * {@link Item} have different effect
 * @author Rhuarc
 *
 */
public class Item extends TreasureCard
	{
		/**
		 * name of the card
		 */
		private final String name;

		private final TreasureCardsCategory category;

		public Item(String name)
			{
				super();
				this.category = TreasureCardsCategory.item;
				this.name = name;
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
