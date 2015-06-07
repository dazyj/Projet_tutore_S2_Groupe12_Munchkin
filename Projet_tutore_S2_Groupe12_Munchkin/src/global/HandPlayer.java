package global;

import global.card.Card;

import java.util.List;


public class HandPlayer
	{
		/**
		 * the {@link HandPlayer} is a list of {@link Card}
		 */
		private List<Card> HandPlayer;
		
		private int maximumNumberCard;
		
		

		public List<Card> getHandPlayer()
			{
					return this.HandPlayer;
			}
		public void equipGear ()
		{
			
		}
		public int getMaximumNumberCard()
			{
					return maximumNumberCard;
			}
		public void setMaximumNumberCard(int maximumNumberCard)
			{
					this.maximumNumberCard = maximumNumberCard;
			}

	}
