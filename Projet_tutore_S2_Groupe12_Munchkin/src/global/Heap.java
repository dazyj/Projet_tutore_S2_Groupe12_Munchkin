package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

import java.util.ArrayList;
import java.util.List;

public class Heap 
	{
		/**
		 * The number of cards in the heap.
		 */
		private List<Card> deck;
		
		private final String cardType;
		
		public Heap(CardType type)
		{
			this.cardType = type.getType();
			this.deck = new ArrayList<Card>();

		}

		public List<Card> getDeck()
			{
				return this.deck;
			}


		/**
		 * remove a first class on this packet
		 * 
		 * @return C
		 */
		public Card RemoveFirstCard()
			{
				return this.deck.remove(0);
			}

		/**
		 * remove several {@link Card} on this packet
		 */
		public List<Card> removeSeveralCard(int numbersCard)
			{
				List<Card> cardsRemove;
				cardsRemove = this.deck.subList(0, numbersCard - 1);
				for (int cardIndex = 0; cardIndex <= 0; cardIndex++)
					{
						this.deck.remove(0);
					}
				return cardsRemove;

			}

		public String getCardType()
			{
					return this.cardType;
			}

	}
