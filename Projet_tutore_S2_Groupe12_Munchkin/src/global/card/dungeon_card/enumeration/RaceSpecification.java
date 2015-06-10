package global.card.dungeon_card.enumeration;

/**
 * different race possible.
 * 
 * @author Rhuarc
 *
 */

public enum RaceSpecification
	{

		human("Human"), dwarf("Dwarf"), elf("Elf");
		private final String name;

		private RaceSpecification(String name)
			{
				this.name = name;
			}

		public String getName()
			{
					return name;
			}
		
	}
