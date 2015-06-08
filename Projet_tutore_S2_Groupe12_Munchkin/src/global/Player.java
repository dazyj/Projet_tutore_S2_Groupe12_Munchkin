package global;
import global.card.Card;
import global.card.dungeon_card.enumeration.RaceSpecification;
import global.card.treasure_card.Equipment;
import java.util.ArrayList;
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
		this.setPlayerEquipment(new ArrayList<Equipment>());
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

	public void setHand(HandPlayer hand)
		{
				this.hand = hand;
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

	public void setPlayerEquipment(List<Equipment> playerEquipment)
		{
				this.playerEquipment = playerEquipment;
		}
	 
	
}
