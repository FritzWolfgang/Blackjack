package de.ender.ui;

import de.ender.logic.GameHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TitleScreenPane extends StackPane {

    public TitleScreenPane(GameHandler gameHandler) {

        // Background gradient
        Rectangle bg = new Rectangle();
        bg.widthProperty().bind(widthProperty());
        bg.heightProperty().bind(heightProperty());
        bg.setFill(Color.web("#1b1f3b"));


        // Main layout
        VBox menuBox = new VBox(35);
        menuBox.setAlignment(Pos.CENTER);


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




        menuBox.getChildren().addAll(title, startButton);


        this.getChildren().addAll(bg, menuBox);
    }
}
