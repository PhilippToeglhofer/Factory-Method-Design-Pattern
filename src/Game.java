import javafx.application.Application;
import javafx.stage.Stage;
import factory.EnemyFactory;
import factory.EnemyDayFactory;
import factory.EnemyNightFactory;

import java.util.Calendar;

public class Game extends Application {
    private static EnemyFactory dialog;

    @Override
    public void start(Stage primaryStage) {
        run();
        render(primaryStage);
    }

    private static void run() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour > 18 || hour < 5) {
            dialog = new EnemyNightFactory();
        } else {
            dialog = new EnemyDayFactory();
        }
    }

    private static void render(Stage primaryStage) {
        dialog.renderWindow(primaryStage);
    }


}
