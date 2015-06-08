package global;

import global.card.Card;
import global.card.dungeon_card.enumeration.RaceSpecification;
import global.card.treasure_card.Equipment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Player
	{
		/**
		 * The name that the player use during the Game.
		 */
		private final String pseudo;

		/**
		 * The hand of the player where he stocks the cards that he hasn't shown
		 * to the others.
		 */
		private HandPlayer hand;

		private int strength;

		private int level;

		private String race;

		private List<Equipment> playerEquipment;

		/**
		 * Create a new player with his pseudo.
		 * 
		 * @param pseudo
		 */
		public Player(String pseudo, RaceSpecification race)
			{
				race = RaceSpecification.human;
				this.pseudo = pseudo;
				this.hand = new HandPlayer();
				this.level = 1;
				this.strength = this.level;
				this.race = race.getName();
				this.playerEquipment = new ArrayList<Equipment>();
			}

		/**
		 * The method that return the card that the player want to put.
		 * 
		 * @return
		 */
		public Card ChooseCardToPut(String name)
			{
				return null;
			}

		/**
		 * The method that send a card from the heap to the hand of the player.
		 * 
		 * @param heap
		 */
		public void sendCard(Heap heap)
			{
				if(this.hand.getHandPlayer().size() < this.hand.getMaximumNumberCard())
					{
						this.hand.getHandPlayer().add(heap.RemoveFirstCard());
					}
				
			}

		public int getLevel()
			{
				return this.level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public String getRace()
			{
				return this.race;
			}

		public void setRace(RaceSpecification race)
			{
				this.race = race.getName();
			}

		public String getPseudo()
			{
				return pseudo;
			}

		public HandPlayer getHand()
			{
				return hand;
			}

		public int getStrength()
			{
				return strength;
			}

		public void setStrength(int strength)
			{
				this.strength = strength;
			}

		public List<Equipment> getPlayerEquipment()
			{
				return playerEquipment;
			}

		public void equipEquipment(String name)
			{
				ListIterator<Card> iterator = this.hand.getHandPlayer().listIterator();
				while(iterator.hasNext())
					{
						if(iterator.next().getName() == name)
							{
								if(iterator.next() instanceof Equipment)
								{
									this.playerEquipment.add((Equipment) this.hand.getHandPlayer().get(iterator.previousIndex()));
									return;
								}
							}
						
					}
				
			}
		
		


	}

