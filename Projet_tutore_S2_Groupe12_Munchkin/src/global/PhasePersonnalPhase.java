package global;

import global.card.Card;
import global.card.TreasureCard;

import java.util.Scanner;

/**
 * The Personnal phase of a Move.
 * It is the phase where the players must manage their hand to have a maximum of 5 cards in.
 * To do that they can do commerce with the others players or remove cards of their game, or sell cards to the game (to win level).
 * @author dazyj
 *
 */
public class PhasePersonnalPhase
{

	/**
	 * Launch the phase.
	 */
	public static void start()
	{
			
			boolean test = false;
			while (Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].getHand().getHandPlayer().size() >= 5 || test == false)
			{
				test = true;
				boolean choice = true;
				while (choice)
				{
					System.out.println("Souhaitez-vous d�s�quiper des objets ?");
					Scanner sc1 = new Scanner(System.in);
					String ok = sc1.nextLine();
					ok.toUpperCase();
					switch (ok)
					{
						case "OUI":
							System.out.println("Veuillez s�lectionner l'�quipement � d�s�quiper (nom carte)");
							String nameCardDesequip = sc1.nextLine();
							nameCardDesequip.toUpperCase();
							Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].unequip(nameCardDesequip);
						case "NON":
							choice = false;
					}
					
				}
				boolean confirm = true;
				while (confirm)
				{
					System.out.println("Souhaitez-vous commercer avec les autres joueurs ?");
					Scanner sc1 = new Scanner(System.in);
					String answer = sc1.nextLine();
					answer.toUpperCase();
					switch (answer)
					{
						case "OUI":
							System.out.println("S�lectionnez un objet de votre main � �changer (�quipement ou objet consommable)");
							String nameItem = sc1.nextLine();
							nameItem.toUpperCase();
							Card card = Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].chooseCardToPut(nameItem);
							TreasureCard cardToTrade = (TreasureCard) card;
							for (int indexOfPlayers = 0; indexOfPlayers < Munchkin.getNbPlayer(); indexOfPlayers++)
							{
								System.out.println(cardToTrade.toString());
								if (indexOfPlayers != Move.getIdPlayersMove())
								{
									System.out.println(Munchkin.getTabOfPlayers()[indexOfPlayers].getPseudo() + " Voulez-vous obtenir cette carte en �change d'une autre ?");
									String approve = sc1.nextLine();
									approve.toUpperCase();
									int compare = approve.compareTo("OUI");
									if (compare == 0)
									{
										System.out.println(Munchkin.getTabOfPlayers()[indexOfPlayers].getHand().getHandPlayer().toString());
										System.out.println("S�lectionnez un objet de votre main � �changer (�quipement ou objet consommable)");
										String nameItem2 = sc1.nextLine();
										nameItem2.toUpperCase();
										TreasureCard cardToTrade2 = (TreasureCard) Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].chooseCardToPut(nameItem2);
										System.out.println(cardToTrade2.toString());
										System.out.println(Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].getPseudo() + " confirmez-vous l'�change ?");
										approve = sc1.nextLine();
										approve.toUpperCase();
										if (compare == 0)
										{
											Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].sendCardHand(cardToTrade2);
											Munchkin.getTabOfPlayers()[indexOfPlayers].sendCardHand(cardToTrade);
										}
										break;
									}
									
								}
								
							}						
						case "NON":
							confirm = false;
					}
				}
				boolean equip = true;
				while (equip)
				{
					System.out.println("Voulez-vous �quiper un objet ?");
					Scanner sc1 = new Scanner(System.in);
					String agree = sc1.nextLine();
					agree.toUpperCase();
					switch (agree)
					{
						case "OUI":
							System.out.println("Veuillez s�lectionner l'objet � �quiper (nom objet)");
							String objectToEquip = sc1.nextLine();
							objectToEquip.toUpperCase();
							Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].equipEquipment(objectToEquip);
						case "NON":
							equip = false;
					}
				}
				boolean sell = true;
				while (sell)
				{
					System.out.println("Voulez-vous vendre un objet ? 1000 PO = 1 niveau.");
					Scanner sc1 = new Scanner(System.in);
					String agree = sc1.nextLine();
					agree.toUpperCase();
					switch (agree)
					{
						case "OUI":
							System.out.println("Veuillez s�lectionner l'objet a  Vendre (nom objet).");
							String objectToSell = sc1.nextLine();
							objectToSell.toUpperCase();
							Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].SellEquipment(objectToSell);
						case "NON":
							sell = false;
					}
				}
				boolean trash = true;
				while (trash)
				{
					System.out.println("Voulez-vous jeter un objet ?");
					Scanner sc1 = new Scanner(System.in);
					String putOnTheTrash = sc1.nextLine();
					putOnTheTrash.toUpperCase();
					switch (putOnTheTrash)
					{
						case "OUI":
							System.out.println("Veuillez s�lectionner l'objet � jeter (nom objet).");
							String objectToPutOnTheTrash = sc1.nextLine();
							objectToPutOnTheTrash.toUpperCase();
							Munchkin.getTabOfPlayers()[Move.getIdPlayersMove()].discardPerName(objectToPutOnTheTrash);
						case "NON":
							trash = false;
					}
				}
			}
	}
}
