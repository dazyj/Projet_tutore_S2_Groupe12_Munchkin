public abstract class Card
	{
		/**
		 * Say if the card's face his hidden or not.
		 */
		private boolean hiddenFace;

		public Card()
			{
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
		

	}
