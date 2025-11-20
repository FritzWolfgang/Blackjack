package de.waft.ui;

import de.waft.logic.GameHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class TitleScreenPane extends StackPane {

    public TitleScreenPane(GameHandler gameHandler) {

        // Background gradient
        Rectangle bg = new Rectangle();
        bg.widthProperty().bind(widthProperty());
        bg.heightProperty().bind(heightProperty());
        bg.setFill(new LinearGradient(
                0, 0, 1, 1,
                true,
                CycleMethod.NO_CYCLE,
                new Stop[]{
                        new Stop(0, Color.web("#172657")),
                        new Stop(1, Color.web("#3e047c"))
                }
        ));


        // Main layout
        VBox centerBox = new VBox(35);
        centerBox.setAlignment(Pos.TOP_CENTER);
        centerBox.setPadding(new Insets(300,0,0,0));

        VBox closeBox = new VBox();
        closeBox.setAlignment(Pos.TOP_RIGHT);
        closeBox.setPadding(new Insets(10,10,0,0)); // top, right, bottom, left

        Button closeButton = new Button("❌");
        closeButton.getStyleClass().add("close-button");
        closeButton.setOnAction(e -> {System.exit(0);});
        closeButton.setAlignment(Pos.TOP_RIGHT);

        closeBox.getChildren().add(closeButton);

        // Title text
        Text title = new Text("BLACKJACK");
        title.setFont(gameHandler.title_font);
        title.setFill(Color.web("#ffffff"));
        title.setStroke(Color.BLACK);
        title.setStrokeWidth(2);


        // Start button
        Button startButton = new Button("Start Game");
        startButton.getStyleClass().add("standard-button");
        startButton.setOnAction(e -> {
            gameHandler.startGame();
        });

        // Explanation Button
        Button explanationButton = new Button("Explanation");
        explanationButton.getStyleClass().add("standard-button");
        explanationButton.setOnAction(e -> {
            gameHandler.showExplanationScreen();
        });

        centerBox.getChildren().addAll(title, startButton, explanationButton);

        VBox box = new VBox();
        box.getChildren().addAll(closeBox, centerBox);


        this.getChildren().addAll(bg, box);
    }
}
