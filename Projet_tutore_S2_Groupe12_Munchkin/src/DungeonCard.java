/**
 * the Dungeon Card are a specify type of the card
 * 
 * @author Zyra
 *
 */
public abstract class DungeonCard extends Card
	{
		private final CardType type;

		public DungeonCard()
			{
				super();
				this.type = CardType.Dungeon;
			}

		public CardType getType()
			{
				return type;
			}

	}
