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

		public static void editPlayer(Player pPlayer)
			{
				player = pPlayer;
			}

		public static void editHelper(Player pHelper)
			{
				helper = pHelper;
			}

		public static void editMonster(Monster pMonster)
			{
				monster = pMonster;
			}

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

		public static boolean readIsWin()
			{
				return isWin;
			}
		public static boolean editIsWin(boolean win)
		{
			return isWin = win;
		}

	}
