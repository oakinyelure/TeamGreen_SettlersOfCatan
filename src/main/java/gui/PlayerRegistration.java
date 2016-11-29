package gui;
/**
 * Created by Olusegun on 10/10/2016.
 */

import game.GameRunner;
import game.Player;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import media.ActionSound;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.File;
import java.awt.Desktop;
import java.io.IOException;

public class PlayerRegistration extends Application {
    String[] imgFiles = {"/images/redknight.png","/images/blueknight.png","/images/greenknight.png","/images/yellowknight.png"};
    public ArrayList userNames = new ArrayList<>();
    Collection <String> images = new ArrayList<>();
    ArrayList<Node> imageViews = new ArrayList<Node>();
    List<Node> label = new ArrayList<Node>();
    List<TextField> inputFields = new ArrayList<>();
    private static ActionSound sound = new ActionSound();
    Button submitButton;
    public final int numOfPlayer = 3;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);


    public static void main(String[] args) {
        sound.getRegistrationSound().play();
        launch(args);

    }



    @Override
    public void start(Stage primaryStage) {

        int playerNum = 1;
        //looping through image view.
        for(int count = 0; count <= numOfPlayer; count++){
            imageViews.add(new ImageView(new Image(imgFiles[count])));
            label.add(new Label("Player" + "name"));
            inputFields.add(new TextField());
            inputFields.get(count).setPromptText("Enter Player " + playerNum++ + " name");

        }

        Pane root = new Pane();
        BorderPane bPane = new BorderPane();
        HBox header = new HBox(12);
        HBox footer = new HBox(5);
        GridPane content = new GridPane();

        Button submitButton = new Button("Start Game");
        submitButton.setCursor(Cursor.HAND);
        submitButton.getStyleClass().add("submitButton");

        Button instructions = new Button("Instructions");
        instructions.setCursor(Cursor.HAND);
        instructions.getStyleClass().add("instructions");


        header.setPrefHeight(220.0);


        BackgroundImage bImage = new BackgroundImage(new Image("/images/splashImage.jpg",870,670,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        root.setBackground(new Background(bImage));


        content.getStyleClass().add("playersContainer");
        content.setHgap(18);
        content.setVgap(15);
        content.setPrefSize(600,400);
        content.setOpacity(0.8);


        bPane.setMargin(content, new Insets(0,0,0,120));
        bPane.setCenter(content);
        bPane.setTop(header);
        bPane.setBottom(footer);

        footer.getChildren().add(submitButton);
        submitButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                    for (int k = 0; k <= numOfPlayer; k++) {
                        if(inputFields.get(k).getText().length() == 0){
                            inputFields.get(k).setText("Player" + ++k);
                            k--;
                        }
                        userNames.add(inputFields.get(k).getText());
                    }

                alert.setTitle("Successful: Players created");
                alert.setHeaderText("Registered Player Names");
                alert.setContentText(inputFields.get(0).getText() + ", " + inputFields.get(1).getText() + ", " + inputFields.get(2).getText() + ", " + inputFields.get(3).getText());
                alert.showAndWait();

                    GameRunner.names = userNames;
                    GameRunner.main(null);
                    primaryStage.close();

            }
        });

        footer.getChildren().add(instructions);
        instructions.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File(getClass().getResource("/images/Catan_Rules.pdf").getFile());
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                        // no application registered for PDFs
                    }
                }
            }
                                       }
        );



        content.add(imageViews.get(0),0, 0);
        content.add(inputFields.get(0),1,0);
        content.add(imageViews.get(1),2,0);
        content.add(inputFields.get(1),3,0);
        content.add(imageViews.get(2),0,1);
        content.add(inputFields.get(2),1,1);
        content.add(imageViews.get(3),2,1);
        content.add(inputFields.get(3),3,1);


        root.getChildren().add(bPane);

        Scene scene = new Scene(root, 850,650);
        scene.getStylesheets().add("/stylesheet/catanstylesheet.css");


        primaryStage.setScene(scene);
        primaryStage.setTitle("Player Registration");
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("/images/playerRegistration.jpg"));
    }

}
