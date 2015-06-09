package global;

import java.util.Scanner;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

public class Game
	{
		/**
		 * The phase of the Game. It allow to know in which part of the game the
		 * player is.
		 */
		private Player[] Players;

		private Heap Dungeon;

		private Heap Treasure;

		/**
		 * Create an object of type Game.
		 */
		public Game(int Players)
			{
				this.Dungeon = new Heap(CardType.dungeon);
				this.Treasure = new Heap(CardType.treasure);
			}

		/**
		 * Start the game.
		 */
		public void start()
			{

			}

		/**
		 * Determine the number of Card to put, in function of the player and
		 * his situation in the game.
		 * 
		 * @param phase
		 * @param player
		 * @return
		 */
		public int determineNbCardToPut(PhaseSpecification phase, Player player)
			{
				return 0;
			}

		/**
		 * Propose to the player 1 (or more) heap where draw a card. The heaps
		 * are proposed in function of the situation in the game.
		 * 
		 * @param phase
		 */
		public void proposeHeap(PhaseSpecification phase)
			{

			}

		/**
		 * Determine the number of cards to draw, in function of the player and
		 * his situation in the game.
		 * 
		 * @param phase
		 * @param player
		 * @return
		 */
		public int determineNbCardToDraw(PhaseSpecification phase, Player player)
			{
				return 0;
			}

		/**
		 * Launch the processing that analyze the situation and allow the player
		 * to put card.
		 */
		public void putCard()
			{

			}

		/**
		 * LAunch the processing that analyze the situation and allow the player
		 * to draw a card.
		 */
		public void drawCard()
			{

			}

		/**
		 * Update the game's stats from the player. It includes the number of
		 * cards, the levels, the number of the move.
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

		public Player identifyPlayerById(int id)
			{
				for (int i = 0; i < Munchkin.getNbPlayer(); i++)
					{
						Player player = Munchkin.getTabOfPlayers()[i];
						if (player.getId() == id)
							return player;
					}
				return null;
			}

		public void addBuffToMonster(Monster monster)
		{
			for (int i = 0; i < Munchkin.getNbPlayer(); i++)
				{
					String iString = String.valueOf(i);
					Scanner sc1 = new Scanner(System.in);
					String answer = "OUI";
					int compare = "OUI".compareTo(answer);
					while (compare == 0)
					{
						System.out.println("Bonjour joueur " + iString + " Voulez-vous ajouter un bonus au monstre ?");
						answer = sc1.nextLine();
						sc1.close();
						answer.toUpperCase();
						switch (answer)
						{
							case "OUI":
								System.out.println("Choisissez une carte à poser. Rentrer le nom de la carte.");
								String name = sc1.nextLine();
								sc1.close();
								name.toUpperCase();
								Card card = Munchkin.getTabOfPlayers()[i].chooseCardToPut(name);
								if (card instanceof ConsumableItem)
								{
									ConsumableItem itemCard = (ConsumableItem) card;
									FightTab.readMonster().setLevel(FightTab.readMonster().getLevel() + itemCard.getBonus());
								}
								if (card instanceof MonsterCurse)
								{
									MonsterCurse monsterCurseCard = (MonsterCurse) card;
									FightTab.readMonster().setLevel(
									FightTab.readMonster().getLevel() + monsterCurseCard.getMonsterLevelEffect());
									FightTab.readMonster().setTreasureGain(FightTab.readMonster().getTreasureGain() + monsterCurseCard.getTreasureCardEffect());
								}
								// TODO Afficher Monstre
								compare = "OUI".compareTo(answer);
							case "NON":
								compare = "OUI".compareTo(answer);
						}
					}
				}
		}
		
		public void addBufferToPlayer(Player player)
		{
			String answer = "OUI";
			int compare = "OUI".compareTo(answer);
			while (compare == 0)
			{
				System.out.println(player.getPseudo()+ ", Voulez-vous rajouter des bonus à vos dégâts ?");
				Scanner sc1 = new Scanner(System.in);
				answer = sc1.nextLine();
				sc1.close();
				answer.toUpperCase();
				switch (answer)
				{
					case "OUI":
						System.out.println("Voulez-vous ajouter un bonus de carte ? (consommable)?");
						String bonus = sc1.nextLine();
						sc1.close();
						bonus.toUpperCase();
						int test = "OUI".compareTo(bonus);
						if (test == 0)
						{
							System.out.println("Choisissez une carte à poser. Rentrer le nom de la carte.");
							String name = sc1.nextLine();
							sc1.close();
							name.toUpperCase();
							Card card = player.chooseCardToPut(name);
							if (card instanceof ConsumableItem)
							{
								ConsumableItem itemCard = (ConsumableItem) card;
								player.setStrength(player.getStrength() + itemCard.getBonus());
							}
						}
						System.out.println("Voulez-vous ajouter un bonus de classe (Guerrier, Voleur, Mage)?");
						bonus = sc1.nextLine();
						sc1.close();
						bonus.toUpperCase();
						if (test == 0)
						{
							String maxString = String.valueOf(player.getJob().getNbMaxCardBurnable());
							String bonusString = String.valueOf(player.getJob().getBonus());
							System.out.println("Vous pouvez défausser " + maxString + " cartes utilisant chacune un bonus de " + bonusString);
							System.out.println("Combien de cartes voulez-vous défausser ?");
							int nbCardToBurn = sc1.nextInt();
							sc1.close();
							if (nbCardToBurn < player.getJob().getNbMaxCardBurnable())
							{
								int bonusHit = player.getJob().getBonus() * nbCardToBurn;
								player.setStrength(player.getStrength() + bonusHit);
							}							
						}
						System.out.println("Voulez-vous ajouter un bonus de classe (Nain)?");
						bonus = sc1.nextLine();
						sc1.close();
						bonus.toUpperCase();
						if (test == 0)
						{
							String nameRace = player.getRace().getName();
							int test2 = nameRace.compareTo("dwarf");
							if (test2 > 0)
							{
								player.setStrength(player.getStrength() + 1);	
							}							
						}
						// TODO Afficher Player
						compare = "OUI".compareTo(answer);
					case "NON":
						compare = "OUI".compareTo(answer);
				}
			}
		}
		
		public void askHelpToFight(String help, Monster monster)
		{
			Player playerOfTheFight = FightTab.readPlayer();
			Player helperOfTheFight = FightTab.readHelper();
			switch (help)
			{
			case "OUI":
				System.out.println("Indiquez le pseudo du joueur concerné.");
				Scanner sc1 = new Scanner(System.in);
				String nickname;
				nickname = sc1.nextLine();
				nickname.toUpperCase();
				sc1.close();
				for (int i = 0; i < Munchkin.getNbPlayer(); i++)
				{
					if (nickname == Munchkin.getTabOfPlayers()[i].getPseudo().toUpperCase())
						{
							System.out.println(nickname + ", êtes vous OK pour aider " + playerOfTheFight.getPseudo() + "?");
							String ok = sc1.nextLine();
							ok.toUpperCase();
							sc1.close();
							switch (ok)
							{
								case "OUI":
									FightTab.editHelper(Munchkin.getTabOfPlayers()[i]);
								case "NON":
									FightTab.editHelper(null);
							}
						}
						
				}
				this.addBufferToPlayer(playerOfTheFight);
				this.addBufferToPlayer(helperOfTheFight);
				if (playerOfTheFight.getStrength() + helperOfTheFight.getStrength() > monster.getLevel())
				{
					FightTab.editIsWin(true);
				}
				else
				{
					FightTab.editIsWin(false);
				}
				
			case "NON":
				this.addBufferToPlayer(playerOfTheFight);
				if (playerOfTheFight.getStrength() > monster.getLevel())
					{
						FightTab.editIsWin(true);
					}
					else
					{
						FightTab.editIsWin(false);
					}
			}
		}
		
		public void fight(Monster monster)
		{
			System.out.println("Le Combat commence.");
			FightTab.editPlayer(this.identifyPlayerById(Move.getIdPlayersMove()));
			FightTab.editMonster(monster);
			// TODO Afficher Monstre
			this.addBuffToMonster(monster);
			
			System.out.println("Voulez-vous qu'un joueur vous aide ?");
			Scanner sc1 = new Scanner(System.in);
			String help;
			help = sc1.nextLine();
			sc1.close();
			help.toUpperCase();
			this.askHelpToFight(help, monster);
		}


		public Player[] getPlayers()
			{
				return Players;
			}

		public void setPlayers(Player[] players)
			{
				Players = players;
			}
		
	}
