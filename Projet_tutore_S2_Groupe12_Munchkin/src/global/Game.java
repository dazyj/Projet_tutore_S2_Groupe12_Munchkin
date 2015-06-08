package global;

public class Game 
{
	/**
	 * The phase of the Game.
	 * It allow to know in which part of the game the player is.
	 */
	private Phase gamePhase;
	
	private Heap Dungeon;
	
	private Heap Treasure;
	
	/**
	 * Create an object of type Game.
	 */
	public Game()
	{
		this.gamePhase = Phase.INITIALISATION;
		this.gamePhase.isNotFinished();
	}
	
	/**
	 * Identify in which phase of the game we are at the moment where the method is called.
	 * 
	 * @return
	 */
	public Phase identifyPhaseOfGame()
	{
		return this.gamePhase;
	}
	
	/**
	 * Start the Next phase of the game.
	 */
	public void startNextPhase()
	{
		int numPhaseFromGamePhase;
		numPhaseFromGamePhase = this.gamePhase.getNumPhase();
		if (numPhaseFromGamePhase == 3)
			numPhaseFromGamePhase = 1;
		else
			numPhaseFromGamePhase++;
		
		this.gamePhase = Phase.phaseFromNumPhase(numPhaseFromGamePhase);
		this.gamePhase.isNotFinished();
		switch (this.gamePhase)
		{
			case DUNGEON_CARD_1:
				PhaseDungeonCard1.start();
			case CONSEQUENCES:
				PhaseConsequences.start();
			case PERSONAL_PHASE:
				PhasePersonnalPhase.start();				
		}		
	}
	
	/**
	 * Finish the actually phase of the game.
	 */
	public void finishPhase()
	{
		this.gamePhase.isFinished();
	}
	
	/**
	 * Start the game.
	 */
	public void start()
	{
		
	}
	
	/**
	 * Determine the number of Card to put, in function of the player and his situation in the game.
	 * 
	 * @param phase
	 * @param player
	 * @return
	 */
	public int determineNbCardToPut(Phase phase, Player player)
	{
		return 0;
	}
	
	
	/**
	 * Propose to the player 1 (or more) heap where draw a card. The heaps are proposed in function of the situation in the game.
	 * 
	 * @param phase
	 */
	public void proposeHeap(Phase phase)
	{
		
	}
	
	/**
	 * Determine the number of cards to draw, in function of the player and his situation in the game.
	 * 
	 * @param phase
	 * @param player
	 * @return
	 */
	public int determineNbCardToDraw(Phase phase, Player player)
	{
		return 0;
	}
	
	
	/**
	 * Launch the processing that analyze the situation and allow the player to put card.
	 */
	public void putCard()
	{
		
	}
	
	/**
	 * LAunch the processing that analyze the situation and allow the player to draw a card.
	 */
	public void drawCard()
	{
		
	}
	
	/**
	 * Update the game's stats from the player. It includes the number of cards, the levels, the number of the move.
	 * 
	 * @param player
	 */
	public void updatePlayerStats(Player player)
	{
		
	}
	
	/**
	 * Initialize the game.
	 */
	public void initialize()
	{
		
	}
	
	public Heap getDungeonHeap()
	{
		return this.Dungeon;
	}
	
	public Heap getTreasureHeap()
	{
		return this.Treasure;
	}
	
	public FightTab Fight()
	{
		
	}
}
