package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

import java.util.*;

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

		private Race race;
		
		private Job job;

		private int idPlayer;

		private int money;

		private PlayerEquipment playerEquipment;
		

		/**
		 * Create a new player with his pseudo.
		 * 
		 * @param pseudo
		 */
		public Player(String pseudo)
			{
				/**
				 * The name that the player use during the Game.
				 */
				this.race = null;
				this.pseudo = pseudo;
				this.hand = new HandPlayer();
				this.level = 1;
				this.strength = this.level;
				this.money = 0;
				this.playerEquipment = new PlayerEquipment();
			}

		/**
		 * The method that return the card that the player want to put.
		 * 
		 * @return
		 */
		public Card chooseCardToPut(String name)
			{
				ListIterator<Card> iterator = this.hand.getHandPlayer()
						.listIterator();
				while (iterator.hasNext())
					{
						int compare = name.compareTo(iterator.next().getName());
						if (compare == 0)
							{
								return this.hand.getHandPlayer().remove(iterator.previousIndex());
							}
					}
				return null;

			}


		/**
		 * The method that send a card from the heap to the hand of the player.
		 * 
		 * @param heap
		 */
		public void sendCardHand(Card card)
			{
					{
						this.hand.getHandPlayer().add(card);
					}

			}

		/**
		 * discard a card to the hand of player
		 * 
		 * @param indexCard
		 */
		public Card discard(int indexCard)
			{
				return this.hand.getHandPlayer().remove(indexCard);
			}

		/**
		 * The method that send a card from the heap to the hand of the player.
		 * 
		 * @param heap
		 */
		public void sendCard(Heap heap)
			{
				if (this.hand.getHandPlayer().size() < this.hand
						.getNbMaxCard())
					{
						this.hand.getHandPlayer().add(heap.RemoveFirstCard());
					}
			}
		public void updateLevel(int numberLevelChange)
		{
			this.level = (this.level + numberLevelChange);
		}
		
/**
 * this method can be search a card in the {@link HandPlayer}, move in the {@link PlayerEquipment}.
 * this method update the bonusTotal to player
 * @param name
 */
		public void equipEquipment(String name)
			{
				ListIterator<Card> iterator = this.hand.getHandPlayer()
						.listIterator();
				while (iterator.hasNext())
					{
						int compare = name.compareTo(iterator.next().getName());
						if (compare == 0)
							{
								if(this.hand.getHandPlayer().get(iterator.previousIndex()) instanceof Equipment)
									{
										Equipment currentCarte = (Equipment)this.hand.getHandPlayer().get(iterator.previousIndex());
										this.playerEquipment.getEquipment().add(currentCarte);	
										this.playerEquipment.setBonusTotal(this.playerEquipment.getBonusTotal() + currentCarte.getBonus());
										this.updateStrength(currentCarte.getBonus());
										return;
									}

							}
					}
			}
		/**
		 * update the Strenght of the player when he equip or sell his item.
		 * @param StrengthEffect
		 */
		public void updateStrength(int strengthEffect)
		{
			this.setStrength(this.getStrength() + strengthEffect);
		}

		/**
		 * this method search a {@link Card} with a name, and sell it against the money
		 * this method update the level to a player when he have 1000 money.
		 * @param name
		 */
		public void SellEquipment(String name)
			{
				ListIterator<Equipment> iterator = this.playerEquipment.getEquipment().listIterator();

				while (iterator.hasNext())
					{
						int compare = name.compareTo(iterator.next().getName());
						if (compare == 0)
							{
								Equipment currentCard = (Equipment)this.hand.getHandPlayer().get(iterator.previousIndex());
								this.money += +iterator.previous().getValue();
								this.updateStrength(-currentCard.getBonus());
								if (this.money >= 1000)
									{
										this.level += 1;
										this.money -= 1000;

									}
								iterator.remove();
								return;
							}
					}
			}
		
		public void unequip(String name)
			{
				ListIterator<Equipment> iterator = this.playerEquipment.getEquipment().listIterator();

				while (iterator.hasNext())
					{
						int compare = name.compareTo(iterator.next().getName());
						if (compare == 0)
							{
								Equipment currentCard = (Equipment)this.getPlayerEquipment().getEquipment().remove(iterator.previousIndex());
								this.updateStrength(-currentCard.getBonus());
								this.hand.getHandPlayer().add(currentCard);
								
							}
					}
			}
		/**
		 * 
		 * @param name
		 */
		public void discardPerName(String name)
			{
				ListIterator<Card> iterator = this.hand.getHandPlayer().listIterator();

				while (iterator.hasNext())
					{
						int compare = name.compareTo(iterator.next().getName());
						if (compare == 0)
							{
								iterator.remove();
							}
					}
			}

		public int getId()
			{
				return this.idPlayer;
			}

		public void asertId(int i)
			{
				this.idPlayer = i;
			}
		public int getLevel()
			{
				return this.level;
			}

		public Race getRace()
			{
				return this.race;
			}
		
		public Job getJob()
		{
			return this.job;
		}

		public void setRace(Race race)
			{
				this.race = race;
			}
		
		public void setJob(Job job)
		{
			this.job = job;
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

		public PlayerEquipment getPlayerEquipment()
			{
				return this.playerEquipment;
			}

		public void setLevel(int newLevel)
			{
				this.level = newLevel;
				
			}

	}
