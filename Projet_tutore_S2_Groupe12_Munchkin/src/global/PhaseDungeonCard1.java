package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

public class PhaseDungeonCard1
	{
		public static void start()
		{
			Player[] tabOfPlayers = Munchkin.getTabOfPlayers();
			Card firstCardDungeon = tabOfPlayers[Move.getIdPlayersMove()].sendCardTable(Munchkin.getGameOfMunchkin().getDungeonHeap());
			firstCardDungeon.setHiddenFace(false);
			//TODO Afficher la carte
			if (firstCardDungeon instanceof Monster)
			{
				
			}
			if (firstCardDungeon instanceof Job || firstCardDungeon instanceof Race || firstCardDungeon instanceof MonsterCurse)
			{
					tabOfPlayers[Move.getIdPlayersMove()].sendCardHandFromAnywhere(firstCardDungeon);
			}
			if (firstCardDungeon instanceof CardCurse)
			{
					
			}
			
		}

	}
