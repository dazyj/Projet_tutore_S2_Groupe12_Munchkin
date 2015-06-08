package global;
import java.util.Scanner;


public class IHMPlayer
{
	
	/**
	 * Ask to the user the number of player for a Game.
	 * 
	 * @return
	 */
	public static int selectNbPlayers()
	{
		System.out.println("S�lectionnez le nombre de joueurs � int�grer � la partie.");
		Scanner sc1 = new Scanner(System.in);
		int nbPlayer;
		nbPlayer = sc1.nextInt();
		sc1.close();
		return nbPlayer;
	}
	
	/**
	 * Ask to the user his pseudo to create the Game.
	 * 
	 * @return
	 */
	public static String selectPseudo()
	{
		System.out.println("S�lectionnez le pseudo du joueur.");
		Scanner sc1 = new Scanner(System.in);
		String nickname;
		nickname = sc1.nextLine();
		sc1.close();
		return nickname;
	}
	
}