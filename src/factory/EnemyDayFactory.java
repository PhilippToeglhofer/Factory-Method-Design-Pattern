package factory;

import enemies.Enemy;
import enemies.EnemyDay;

public class EnemyDayFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new EnemyDay();
    }
}
