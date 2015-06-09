package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

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
			// TODO AFficher les cartes de la main
			PhaseDungeonCard1.start();
			// TODO AFficher les cartes de la main
			PhaseConsequences.start();
			// TODO AFficher les cartes de la main
			PhasePersonnalPhase.start();
			// TODO AFficher les cartes de la main

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
