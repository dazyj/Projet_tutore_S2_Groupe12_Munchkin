package global.card.dungeon_card.enumeration;

public enum JobSpecification
	{
		Warrior("Warrior"),
		Rogue("Rogue"),
		priest("Priest");
		
		private final String name;
		
		private JobSpecification(String name)
		{
			this.name = name;
		}

		public String getName()
			{
					return name;
			}
	}
