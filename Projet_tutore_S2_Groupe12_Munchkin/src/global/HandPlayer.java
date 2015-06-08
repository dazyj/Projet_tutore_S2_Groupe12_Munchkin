package global;

import global.card.Card;
import global.card.treasure_card.Equipment;

import java.util.ArrayList;
import java.util.List;

public class HandPlayer
	{
		/**
		 * the {@link HandPlayer} is a list of {@link Card}
		 */
		private List<Card> handPlayer;

		private int maximumNumberCard;

		public HandPlayer()
			{
				this.handPlayer = new ArrayList<Card>();
				this.setMaximumNumberCard(5);
			}

		public List<Card> getHandPlayer()
			{
					return handPlayer;
			}

		public void toEquip(String name)
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
