package global;

import global.card.Card;

import java.util.List;

public class Heap
	{
		/**
		 * The number of cards in the heap.
		 */
		private List<Card> deck;

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

	}
