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
	
	public FightTab fight(Monster monster)
	{
		
		System.out.println("Le Combat commence.");
		FightTab.editPlayer(this.identifyPlayerById(Move.getIdPlayersMove()));
		FightTab.editMonster(monster);
		//TODO Afficher Monstre
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
						Card card = Munchkin.getTabOfPlayers()[i].chooseCardToPut();
						if (card instanceof ConsumableItem)
						{
							ConsumableItem itemCard = (ConsumableItem) card;
							Munchkin.getTabOfPlayers()[i].putCard(card);
							FightTab.readMonster().setLevel(FightTab.readMonster().getLevel() + itemCard.getBonus());
						}
						if (card instanceof MonsterCurse)
						{
							MonsterCurse monsterCurseCard = (MonsterCurse) card;
							Munchkin.getTabOfPlayers()[i].putCard(card);
							FightTab.readMonster().setLevel(FightTab.readMonster().getLevel() + monsterCurseCard.getMonsterLevelEffect());
							FightTab.readMonster().setTreasureGain(FightTab.readMonster().getTreasureGain() + monsterCurseCard.getTreasureCardEffect());							
						}
						//TODO Afficher Monstre
						compare = "OUI".compareTo(answer);	
					case "NON":
						compare = "OUI".compareTo(answer);
				}
			}
		}
		System.out.println("Voulez-vous qu'un joueur vous aide ?");
		Scanner sc1 = new Scanner(System.in);
		String help;
		help = sc1.nextLine();
		sc1.close();
		help.toUpperCase();
		switch (help)
		{
			case "OUI":
				System.out.println("Indiquez le pseudo du joueur concern�.");
				sc1 = new Scanner(System.in);
				String nickname;
				nickname = sc1.nextLine();
				nickname.toUpperCase();
				sc1.close();
				for (int i = 0; i<Munchkin.getNbPlayer(); i++)
				{
					if (nickname == Munchkin.getTabOfPlayers()[i].getPseudo().toUpperCase())
						FightTab.editHelper(Munchkin.getTabOfPlayers()[i]);
				}
				Player playerOfTheFight = FightTab.readPlayer();
				Player helperOfTheFight = FightTab.readHelper();
				String answer = "OUI";
				int compare = "OUI".compareTo(answer);
				while (compare == 0)
				{
					System.out.println(FightTab.readPlayer().getPseudo() + ", Voulez-vous rajouter des bonus � vos d�g�ts ?");
					answer = sc1.nextLine();
					sc1.close();
					answer.toUpperCase();
					switch (answer)
					{
						case "OUI":
							Card card = FightTab.readPlayer().chooseCardToPut();
							if (card instanceof ConsumableItem)
							{
								ConsumableItem itemCard = (ConsumableItem) card;
								FightTab.readPlayer().putCard(card);
								FightTab.readPlayer().setStrength(FightTab.readPlayer().getStrength() + itemCard.getBonus());
							}
							//TODO Bonus de Job/Race
							//TODO Afficher Player
							compare = "OUI".compareTo(answer);	
						case "NON":
							compare = "OUI".compareTo(answer);
					}
				}
				answer = "OUI";
				compare = "OUI".compareTo(answer);
				while (compare == 0)
				{
					System.out.println(FightTab.readHelper().getPseudo() + ", voulez-vous rajouter des bonus � vos d�g�ts ?");
					answer = sc1.nextLine();
					sc1.close();
					answer.toUpperCase();
					switch (answer)
					{
						case "OUI":
							Card card = FightTab.readHelper().chooseCardToPut();
							if (card instanceof ConsumableItem)
							{
								ConsumableItem itemCard = (ConsumableItem) card;
								FightTab.readHelper().putCard(card);
								FightTab.readHelper().setStrength(FightTab.readHelper().getStrength() + itemCard.getBonus());
							}
							//TODO Bonus de Job/Race
							//TODO Afficher Monstre
							compare = "OUI".compareTo(answer);	
						case "NON":
							compare = "OUI".compareTo(answer);
					}
				}
				//TODO A finir
			case "NON":
				
		}
		
		return null;
	}
}
