package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

//TODO JAAVADOC
//TODO TOSTRING
//TODO TESTS
//TODO CREER CARTES

/**
 * The application of the Munchkin.
 * It create a game, create the cards and launch a game.
 * @author dazyj
 *
 */

public class Munchkin
{

	/**
	 * The number of player in the game.
	 */
	private static int nbPlayer;
	
	/**
	 * The table that contains all the player of the game.
	 */
	private static Player[] tabOfPlayers;
	
	/**
	 * The game.
	 */
	private static Game gameOfMunchkin;
	
	/**
	 * The execution of the application.
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		System.out.println("Bienvenue dans le Munchkin, nous allons proc�der � la cr�ation d'une nouvelle partie.");
		nbPlayer = IHMPlayer.selectNbPlayers();
		createGame();
	}

	/**
	* The processus that create the Game and launch it.  
	*/
	public static void createGame()
	{
		gameOfMunchkin = new Game();
		tabOfPlayers = new Player[Munchkin.nbPlayer];
		
		for (int i = 0; i < Munchkin.nbPlayer; i++)
		{
			Player temp = new Player(IHMPlayer.selectPseudo());
			tabOfPlayers[i] = temp;
			tabOfPlayers[i].asertId(i);
		}
		
		gameOfMunchkin.start();
	}
	
	/**
	 * return the number of players in the game.
	 * @return
	 */
	public static int getNbPlayer()
	{
		return nbPlayer;
	}
	
	/**
	 * return the table of the players.
	 * @return
	 */
	public static Player[] getTabOfPlayers()
	{
		return tabOfPlayers;
	}
	
	/**
	 * return the game.
	 * @return
	 */
	public static Game getGameOfMunchkin()
	{
		return gameOfMunchkin;
	}
	
	public static void  CreateHeapDungeon()
        {
        	gameOfMunchkin.createAllCardCurse();
            gameOfMunchkin.createAllCardJob();
            gameOfMunchkin.createAllCardMonster();
            gameOfMunchkin.createAllCardMonsterCurse();
            gameOfMunchkin.createAllCardRace();        
        }
        
        public static void CreateHeapTreasure()
        {
            gameOfMunchkin.createAllCardEquipment();
            gameOfMunchkin.createAllCardConsumableItem();
            gameOfMunchkin.createAllCardLevelEffect();
        }
}
