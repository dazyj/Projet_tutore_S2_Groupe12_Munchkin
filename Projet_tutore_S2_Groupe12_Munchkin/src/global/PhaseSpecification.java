package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

public enum PhaseSpecification
{
	DUNGEON_CARD_1(1),
	CONSEQUENCES(2),
	PERSONAL_PHASE(3);
	
	/**
	 * The number that identify a phase.
	 * To change the phase we just increment the numPhase.
	 * To reset a move, we just set the numPhase to 1.
	 */
	private int numPhase;
	
	/**
	 * Create a new Phase
	 * 
	 * @param numPhase
	 */
	private PhaseSpecification(int numPhase)
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
	
	public static PhaseSpecification phaseFromNumPhase(int nPhase)
	{
		switch (nPhase)
		{
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
