package global;

import java.util.Random;

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
				Card firstCardDungeon = (Card) Munchkin.getGameOfMunchkin()
						.getDungeonHeap().RemoveFirstCard();
				firstCardDungeon.setHiddenFace(false);
				// TODO Afficher la carte
				if (firstCardDungeon instanceof Monster)
					{

					}
				if (firstCardDungeon instanceof Job
						|| firstCardDungeon instanceof Race
						|| firstCardDungeon instanceof MonsterCurse)
					{
						tabOfPlayers[Move.getIdPlayersMove()]
								.sendCardHAnd(firstCardDungeon);
					}
				if (firstCardDungeon instanceof CardCurse)
					{
						
						for(int numberDiscardCard = 0; numberDiscardCard <= ((CardCurse) firstCardDungeon).getNumberCardRemove(); numberDiscardCard++);
							{	
								Random randomGenerator = new Random();
								tabOfPlayers[Move.getIdPlayersMove()].discard(randomGenerator.nextInt(tabOfPlayers[Move.getIdPlayersMove()].getHand().getHandPlayer().size()));
							}
						
					}

			}
	}
