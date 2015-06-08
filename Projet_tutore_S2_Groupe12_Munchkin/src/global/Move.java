package global;

public class Move
	{
		private static int nbMove = 0;
		
		private static int idPlayersMove = -1;
		
		public static void start()
		{
			nbMove++;
			if (idPlayersMove < Munchkin.getNbPlayer())
				idPlayersMove++;
			else 
				idPlayersMove = -1;
			PhaseDungeonCard1.start();
			PhaseConsequences.start();
			PhasePersonnalPhase.start();
		}
		
		public static int getNbMove()
		{
			return nbMove;
		}
		
		public static int getIdPlayersMove()
		{
				return idPlayersMove;
		}
	}
