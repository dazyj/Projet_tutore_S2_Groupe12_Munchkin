package global.card.dungeon_card.enumeration;

public enum JobSpecification
	{
		Warrior("warrior"),
		Rogue("rogue"),
		priest("priest");
		
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
