package global.card;

public abstract class Card
	{
		/**
		 * Say if the card's face his hidden or not.
		 */
		private final String name;
		
		private boolean hiddenFace;

		public Card(String name)
			{
				this.name = name;
				this.setHiddenFace(false);
			}

		public boolean getHiddenFace()
			{
					return this.hiddenFace;
			}

		public void setHiddenFace(boolean hiddenFace)
			{
					this.hiddenFace = hiddenFace;
			}

		public String getName()
			{
					return name;
			}
		

	}
