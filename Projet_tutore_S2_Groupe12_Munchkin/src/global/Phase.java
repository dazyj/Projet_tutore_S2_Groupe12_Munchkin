package global;

public enum Phase
{
	INITIALISATION(0),
	DUNGEON_CARD_1(1),
	CONSEQUENCES(2),
	PERSONAL_PHASE(3);
	
	/**
	 * The number that identify a phase.
	 * To change the phase we just increment the numPhase.
	 * To reset a move, we just set the numPhase to 1.
	 */
	private int numPhase;
	
	private boolean isFinished;
	
	/**
	 * Create a new Phase
	 * 
	 * @param numPhase
	 */
	private Phase(int numPhase)
	{
		this.numPhase = numPhase;
	}
	
	/**
	 * return the numPhase of the Phase.
	 * 
	 * @return
	 */
	public int getNumPhase()
	{
		return this.numPhase;
	}
	
	public boolean getIsFinished()
	{
		return this.isFinished;
	}
	
	public void isFinished()
	{
		this.isFinished = true;
	}
	
	public void isNotFinished()
	{
		this.isFinished = false;
	}
	
	public static Phase phaseFromNumPhase(int nPhase)
	{
		switch (nPhase)
		{
		case 0:
			return INITIALISATION;
		case 1:
			return DUNGEON_CARD_1;
		case 2:
			return CONSEQUENCES;
		case 3:
			return PERSONAL_PHASE;
		}
		return null;
	}
}