package global;

import global.*;
import global.card.*;
import global.card.dungeon_card.*;
import global.card.dungeon_card.enumeration.*;
import global.card.treasure_card.*;
import global.card.treasure_card.enumeration.*;

public class FightTab
	{
		private static Player player;

		private static Player helper;

		private static Monster monster;

		private static boolean isWin;
<<<<<<< Upstream, based on origin/master

=======
		
>>>>>>> ee2706d fight + 2-3 modifs game + delete toString() Monster + FightTab
		public static void editPlayer(Player pPlayer)
			{
				player = pPlayer;
			}

		public static void editHelper(Player pHelper)
			{
				helper = pHelper;
			}

<<<<<<< Upstream, based on origin/master
=======
		
>>>>>>> ee2706d fight + 2-3 modifs game + delete toString() Monster + FightTab
		public static void editMonster(Monster pMonster)
			{
				monster = pMonster;
			}

<<<<<<< Upstream, based on origin/master
=======
		public static void editIsWin(boolean b)
		{
			isWin = b;
		}
		
		public static boolean readIsWin()
		{
			return isWin;
		}
		
>>>>>>> ee2706d fight + 2-3 modifs game + delete toString() Monster + FightTab
		public static Player readPlayer()
			{
				return player;
			}

		public static Player readHelper()
			{
				return helper;
			}

		public static Monster readMonster()
			{
				return monster;
			}

<<<<<<< Upstream, based on origin/master
		public static boolean readIsWin()
			{
				return isWin;
			}
		public static boolean editIsWin(boolean win)
		{
			return isWin = win;
		}

=======
>>>>>>> ee2706d fight + 2-3 modifs game + delete toString() Monster + FightTab
	}
