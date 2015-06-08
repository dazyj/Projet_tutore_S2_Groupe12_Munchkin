package global.card.dungeon_card;

import global.card.DungeonCard;
import global.card.dungeon_card.enumeration.DungeonCardCategory;
import global.card.dungeon_card.enumeration.MonsterCurseSpecification;



public class MonsterCurse extends DungeonCard
	{
		private final String name;

		private DungeonCardCategory category;

		private final int monsterLevelEffect;

		private final int treasureCardEffect;

		public MonsterCurse(MonsterCurseSpecification Specification)
			{
				super();
				this.name = Specification.getName();
				this.category = DungeonCardCategory.monster_curse;
				this.monsterLevelEffect = Specification.getMonsterLevelEffect();
				this.treasureCardEffect = Specification.getTreasureCardEffect();
			}

		public String getName()
			{
				return this.name;
			}

		public DungeonCardCategory getCategory()
			{
				return category;
			}

		public void setCategory(DungeonCardCategory category)
			{
				this.category = category;
			}

		public int getMonsterLevelEffect()
			{
				return monsterLevelEffect;
			}

		public int getTreasureCardEffect()
			{
				return treasureCardEffect;
			}
		/**
		 * this card can be change the level monster for a fight and gain.
		 * @param monster
		 */
		public void useCurse(Monster monster)
			{
				monster.setLevel(monster.getLevel() + this.monsterLevelEffect);
				monster.setTreasureGain(monster.getTreasureGain()
						+ this.treasureCardEffect);
			}

	}
