package global;

import global.card.Card;
import global.card.treasure_card.Equipment;
import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

import java.util.ArrayList;
import java.util.List;

public class HandPlayer
	{
		/**
		 * the {@link HandPlayer} is a list of {@link Card}
		 */
		private List<Card> handPlayer;

		private final int maximumNumberCard;

		public HandPlayer()
			{
				this.maximumNumberCard = 5;
				this.handPlayer = new ArrayList<Card>();
			}

		public List<Card> getHandPlayer()
			{
					return handPlayer;
			}
		
		public int getNbMaxCard()
		{
			return this.maximumNumberCard;
		}


	}
