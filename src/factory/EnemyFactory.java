package factory;

import javafx.stage.Stage;
import enemies.Enemy;

public abstract class EnemyFactory {

    public void renderWindow(Stage primaryStage) {
        Enemy enemy = createEnemy();
        enemy.render(primaryStage);
    }

    protected abstract Enemy createEnemy();
}
