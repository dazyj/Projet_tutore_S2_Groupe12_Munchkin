package global.card.treasure_card;

import global.card.TreasureCard;
import global.card.treasure_card.enumeration.EquipmentSpecification;
import global.card.treasure_card.enumeration.TreasureCardCategory;

/**
 * 
 * @author Zyra
 *
 */
public class Equipment extends TreasureCard
	{
		/**
		 * name of the card
		 */
		private final String name;

		private final String category;
	
		private final String categoryEquipment;
		
		private final int bonus;
		
		private final int value;
		

		
		/**
		 * @param name
		 * @param category
		 */
		public Equipment(EquipmentSpecification equipment)
			{
				this.category = TreasureCardCategory.equipment.getName();
				this.name = equipment.getName();
				this.categoryEquipment = equipment.getCategoryEquipment();
				this.bonus = equipment.getBonus();
				this.value = equipment.getValue();

			}

		public String getCategory()
			{
				return this.category;
			}

		public String getName()
			{
				return name;
			}

		public int getBonus()
			{
					return this.bonus;
			}

		public int getValue()
			{
					return this.value;
			}

		public String getCategoryEquipment()
			{
					return categoryEquipment;
			}
		public boolean equals (Object objectTest)
		{
			if(objectTest== this)
				{
					return true;
				}
			if(objectTest instanceof Equipment);
				{
					Equipment CastObject = (Equipment) objectTest;
					
					if(this.name != CastObject.name)
						{
							return false;
						}
				}
			return true;
			
		}

	}
