package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

public class Munchkin
{

	/**
	 * The number of player in the game.
	 */
	private static int nbPlayer;
	
	private static Player[] tabOfPlayers;
	
	private static Game gameOfMunchkin;
	
	public static void main(String[] args)
	{
		System.out.println("Bienvenue dans le Munchkin, nous allons procéder à la création d'une nouvelle partie.");
		Monster Monstre1 = new Monster(MonsterSpecification.bailiff);
		Monstre1.setHiddenFace(true);
		System.out.println(Monstre1.toString());
		Monstre1.setHiddenFace(false);
		System.out.println(Monstre1.toString());
		
		System.out.println("PHASE CONSEQUENCE");
		if()
	}

	/**
	* The processus that create the Game.  
	*/
	public static void createGame()
	{
		tabOfPlayers = new Player[Munchkin.nbPlayer];
		
		for (int i = 0; i < Munchkin.nbPlayer; i++)
		{
			Player temp = new Player(IHMPlayer.selectPseudo());
			tabOfPlayers[i] = temp;
			tabOfPlayers[i].asertId(i);
		}
		
		gameOfMunchkin.start();
	}
	
	public static int getNbPlayer()
	{
		return nbPlayer;
	}
	
	public static Player[] getTabOfPlayers()
	{
		return tabOfPlayers;
	}
	
	public static Game getGameOfMunchkin()
	{
		return gameOfMunchkin;
	}


}
