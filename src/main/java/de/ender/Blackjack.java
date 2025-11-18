package de.ender;

import de.ender.logic.GameHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Blackjack extends Application {

    static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Blackjack");
        primaryStage.setResizable(false);
        primaryStage.setMaximized(true);

        GameHandler gameHandler = new GameHandler(primaryStage);


    }
}
