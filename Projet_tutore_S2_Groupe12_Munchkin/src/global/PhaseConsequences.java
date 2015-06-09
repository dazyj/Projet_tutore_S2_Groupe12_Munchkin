package global;

import java.util.Random;
import java.util.Scanner;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

public class PhaseConsequences
	{

		public static void start()
			{
				Player[] tabOfPlayers = Munchkin.getTabOfPlayers();
				if (PhaseDungeonCard1.isToFight())
					{
						if (FightTab.readIsWin())
							{
								System.out
										.println("vous avez gagnez :"+ FightTab.readMonster().getTreasureGain()+ "tr�sors.");
								for (int numberTreasure = 0; numberTreasure < FightTab.readMonster().getTreasureGain(); numberTreasure++)
									{
										tabOfPlayers[Move.getIdPlayersMove()].sendCard(Munchkin.getGameOfMunchkin().getTreasureHeap());
									}
								if (FightTab.readMonster().getLevelGain() != 0)
									{
										System.out.println("vous avez gagnez "+ FightTab.readMonster().getLevelGain()+ "niveaux");
										tabOfPlayers[Move.getIdPlayersMove()].updateLevel(FightTab.readMonster().getLevelGain());
									}
							} else
							{
								System.out.println("vous tentez de fuir !");
								Random thimble = new Random();
								int thimbledodge = thimble.nextInt(6) + 1;
								if (thimbledodge >= 5)
									{
										System.out.println("vous arriver a fuir !");
									} 
								else
									{
										System.out.println("le monstre vous rattrape et vous cogne !");
										if(tabOfPlayers[Move.getIdPlayersMove()].getLevel() <= 2)
											{
												System.out.println("vous �tes mort !");
												Munchkin.getGameOfMunchkin().deathPlayer(tabOfPlayers[Move.getIdPlayersMove()]);
											}
									}

							}

					}
			}
	}
