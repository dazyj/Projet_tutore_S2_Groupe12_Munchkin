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
	 * The hand of the player where he stocks the cards that he hasn't shown to the others.
	 */
	private HandPlayer hand;
	
	private int strength;
	
	private int level;
	
	private String race;
	
	private int idPlayer;
	
	private List<Equipment> playerEquipment;
	
	
	/**
	 * Create a new player with his pseudo.
	 * 
	 * @param pseudo
	 */
	public Player(String pseudo, RaceSpecification race)
	{
		/**
		 * The name that the player use during the Game.
		 */
		race = RaceSpecification.human;
		this.pseudo = pseudo;
		this.hand = new HandPlayer();
		this.level = 1;
		this.strength = this.level;
		this.race = race.getName();
		this.setPlayerEquipment(new ArrayList<Equipment>());
	}
	
	/**
	 * The method that return the card that the player want to put.
	 * 
	 * @return
	 */
	public Card chooseCardToPut()
	{
		System.out.println("Veuillez sélectionner la carte à poser (nomCarte)");
		String card;
		Scanner sc1 = new Scanner(System.in);
		card = sc1.nextLine();
		sc1.close();
		card.toUpperCase();
		for (int j = 0; j < this.getHand().getNbMaxCard(); j++)
		{
			if (this.getHand().getHandPlayer().get(j).getName() == card)
			{
				return this.getHand().getHandPlayer().get(j);
			}
		}	
		return null;
	}
	
	public void putCard(Card card)
	{
		
	}
	
	/**
	 * The method that the player use to choose a heap where draw a card.
	 * 
	 * @param heap
	 */
	public void chooseHeap(Heap heap)
	{
		
	}
	
	/**
	 * The method that send a card from the heap to the hand of the player.
	 * 
	 * @param heap
	 */
	public void sendCardHAnd(Heap heap)
	{
		
	}
	
	/**
	 * The method that send a card from the heap to the public table of the player.
	 * 
	 * @param heap
	 */
	public void sendCardTable(Heap heap)
	{
		
	}
<<<<<<< Upstream, based on origin/master
>>>>>>> 59291a6 commit share 08/06/2015 11:53

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
<<<<<<< Upstream, based on origin/master
			}
=======
		}
<<<<<<< Upstream, based on origin/master
<<<<<<< Upstream, based on origin/master
>>>>>>> 59291a6 commit share 08/06/2015 11:53

		public List<Equipment> getPlayerEquipment()
			{
				return playerEquipment;
			}

<<<<<<< Upstream, based on origin/master
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
=======
>>>>>>> 6d00eb8 commit rÃ©unif
		
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
	
	public int getId()
	{
		return this.idPlayer;
	}
	
	public void asertId(int i)
	{
		this.idPlayer = i;
	}

	public void setPlayerEquipment(List<Equipment> playerEquipment)
		{
				this.playerEquipment = playerEquipment;
		}
}
