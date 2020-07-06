package factory;

import enemies.Enemy;
import enemies.EnemyNight;

public class EnemyNightFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new EnemyNight();
    }
}