package global;

public class FightTab
	{
		private static int player;
		
		private static int helper;
		
		private static String monster;
		
		private static int treasure;
		
		private static int level;
		
		public static void editPlayer(int pPlayer)
		{
			player = pPlayer;
		}
		
		public static void editHelper(int pHelper)
		{
			helper = pHelper;
		}
		
		public static void editMonster(String pMonster)
		{
			monster = pMonster;
		}
		
		public static void editTreasure(int pTreasure)
		{
			treasure = pTreasure;
		}
		
		public static void editLevel(int pLevel)
		{
			level = pLevel;
		}
		
		public static int readPlayer()
		{
			return player;
		}
		
		public static int readHelper()
		{
			return helper;
		}
			
		public static String readMonster()
		{
			return monster;
		}
			
		public static int readTreasure()
		{
			return treasure;
		}
			
		public static int readLevel()
		{
			return level;
		}
	}
