package de.waft;

import de.waft.logic.GameHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class Blackjack extends Application {

    void main() {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Schwarzer Jakob");
        primaryStage.setResizable(true);
        primaryStage.setMaximized(true);
        primaryStage.setOnCloseRequest(event -> {
            System.exit(0);
        });

        GameHandler gameHandler = new GameHandler(primaryStage);


    }
}
