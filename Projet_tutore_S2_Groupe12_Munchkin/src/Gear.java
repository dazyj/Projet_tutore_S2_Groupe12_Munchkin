/**
 * 
 * @author Zyra
 *
 */
public class Gear extends TreasureCard
	{
		/**
		 * name of the card
		 */
		private final String name;

		private final TreasureCardsCategory category;
		
		private final int power;

		/**
		 * @param name
		 * @param category
		 */
		public Gear(String name, TreasureCardsCategory category, int power)
			{
				super();
				this.category = TreasureCardsCategory.gear;
				this.name = name;
				this.power = power;
			}

		public TreasureCardsCategory getCategory()
			{
				return category;
			}

		public String getName()
			{
				return name;
			}

		public int getPower()
			{
					return power;
			}

	}
