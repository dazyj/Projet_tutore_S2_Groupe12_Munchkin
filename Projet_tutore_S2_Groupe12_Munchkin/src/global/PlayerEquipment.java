package global;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import global.card.treasure_card.*;

/**
 * 
 * @author Rhuarc
 *
 */
public class PlayerEquipment
	{
		private List<Equipment> playerEquipement;
		
		private int bonusTotal;
		
		public PlayerEquipment()
			{
				this.playerEquipement = new ArrayList<Equipment>();
				this.setBonusTotal(0);
			}

		public List<Equipment> getEquipment()
			{
				return playerEquipement;
			}

		public int getBonusTotal()
			{
					return bonusTotal;
			}

		public void setBonusTotal(int bonusTotal)
			{
					this.bonusTotal = bonusTotal;
			}


	}
