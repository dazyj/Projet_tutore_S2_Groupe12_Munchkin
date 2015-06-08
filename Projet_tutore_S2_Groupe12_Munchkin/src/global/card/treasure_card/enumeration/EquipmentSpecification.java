package global.card.treasure_card.enumeration;
/**
 * a equipment is defined by a name, a category of equipment a bonus and a value.
 * @author Zyra
 *
 */
public enum EquipmentSpecification
	{
		sword_of_bastard("bastard (of) sword",CategoryEquipment.weapon_one_hand.getName(),2,400);

		private final String name;
		
		private final String categoryEquipment;
		
		private final int bonus;
		
		private final int value;

		private EquipmentSpecification(String name, String categoryEquipment,
				int bonus, int value)
			{
				this.name = name;
				this.categoryEquipment = categoryEquipment;
				this.bonus = bonus;
				this.value = value;
			}

		public String getName()
			{
					return this.name;
			}

		public String getCategoryEquipment()
			{
					return this.categoryEquipment;
			}

		public int getBonus()
			{
					return bonus;
			}

		public int getValue()
			{
					return value;
			}
		
		
	}
