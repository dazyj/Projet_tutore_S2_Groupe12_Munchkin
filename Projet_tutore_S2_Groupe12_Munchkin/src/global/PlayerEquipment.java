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

		public PlayerEquipment()
			{
				this.playerEquipement = new ArrayList<Equipment>();
			}

		public List<Equipment> getEquipment()
			{
				return playerEquipement;
			}

		public void DeleteEquipment(String name)
			{
				ListIterator<Equipment> iterator = this.playerEquipement
						.listIterator();
				while (iterator.hasNext())
					{
						if (iterator.next().getName() == name)
							{
								iterator.remove();
								return;
							}
					}
			}
	}
