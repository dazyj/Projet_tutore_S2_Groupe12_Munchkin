
public class Player
{
	/**
	 * The name that the player use during the Game.
	 */
	private String pseudo;
	
	/**
	 * The hand of the player where he stocks the cards that he hasn't shown to the others.
	 */
	private HandPlayer hand;
	
	/**
	 * Create a new player with his pseudo.
	 * 
	 * @param pseudo
	 */
	public Player(String pseudo)
	{
		this.pseudo = pseudo;
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
	
}
