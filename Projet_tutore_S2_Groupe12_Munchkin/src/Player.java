import java.util.List;


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
	
	private int level;
	
	private List<Gear> Gears;
	
	private Races race;
	
	private int money;
	
	/**
	 * Create a new player with his pseudo.
	 * 
	 * @param pseudo
	 */
	public Player(String pseudo)
	{
		this.pseudo = pseudo;
		this.level = 1;
		this.setMoney(0);
		this.setRace(Races.human);
	}
	
	/**
	 * The method that return the card that the player want to put.
	 * 
	 * @return
	 */
	public Card ChooseCardToPut()
	{
		return null;
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
	public void sendCard(Heap heap)
	{
		
	}

	public int getLevel()
		{
				return level;
		}

	public void setLevel(int level)
		{
				this.level = level;
		}

	public Races getRace()
		{
				return this.race;
		}

	public void setRace(Races race)
		{
				this.race = race;
		}

	public String getPseudo()
		{
				return pseudo;
		}

	public HandPlayer getHand()
		{
				return hand;
		}

	public void setHand(HandPlayer hand)
		{
				this.hand = hand;
		}

	public List<Gear> getGears()
		{
				return Gears;
		}


	public int getMoney()
		{
				return money;
		}

	public void setMoney(int money)
		{
				this.money = money;
		}
	public void Toequip(Gear gear)
	{
		
	}
	 
	
}
