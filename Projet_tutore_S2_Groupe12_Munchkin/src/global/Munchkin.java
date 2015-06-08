package global;

import global.card.dungeon_card.Monster;
import global.card.dungeon_card.enumeration.*;

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
		Monster bailiff = new Monster(MonsterSpecification.bailiff);
		System.out.println(bailiff.toString());
		
		
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
