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
		private List<Card> HandPlayer;

		private int maximumNumberCard;

		public HandPlayer()
			{
				this.setHandPlayer(new ArrayList<Card>());
				this.maximumNumberCard = 5;
			}

		public List<Card> getHandPlayer()
			{
					return HandPlayer;
			}

		public void toEquip(String name)
		{
			
		}

		

	}
