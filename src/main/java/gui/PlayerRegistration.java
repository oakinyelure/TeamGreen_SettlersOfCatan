package gui;/**
 * Created by Olusegun on 10/10/2016.
 */

import javafx.application.Application;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFieldBuilder;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayerRegistration extends Application {
    String[] imgFiles = {"/images/redknight.png","/images/blueknight.png","/images/greenknight.png","/images/yellowknight.png",};
    ArrayList userNames = new ArrayList();
    Collection <String> images = new ArrayList<>();
    ArrayList<Node> imageViews = new ArrayList<Node>();
    List<String>  imgFilesObject= new ArrayList<>();
    public final int numOfPlayer = 4;



    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        BorderPane bPane = new BorderPane();
        HBox hb = new HBox(10);

        hb.setPrefHeight(220.0);


        BackgroundImage bImage = new BackgroundImage(new Image("/images/playerRegistration.jpg",870,670,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        root.setBackground(new Background(bImage));

        GridPane content = new GridPane();
        content.getStyleClass().add("playersCOntainer");
        content.setHgap(180);
        content.setVgap(15);



        Label player1Label = new Label("Player1");
        ImageView player1Image = new ImageView(new Image("/images/redknight.png", 100,100,false,true));

        Label player2Label = new Label("Player 2");
        ImageView player2Image = new ImageView(new Image("/images/blueknight.png", 100, 100, false, true));

        Label player3Label = new Label("player 3");
        ImageView player3Image = new ImageView(new Image("/images/greenknight.png", 100, 100, false, true));

        Label player4Label = new Label("Player 4");
        ImageView player4Image = new ImageView(new Image("/images/yellowknight.png", 100, 100, false, true));

        bPane.setMargin(content, new Insets(0,0,0,160));
        bPane.setCenter(content);
        bPane.setTop(hb);
        content.add(player1Label,0, 0);
        content.add(player1Image,0,1);
        content.add(player2Label,1, 0);
        content.add(player2Image,1,1);
        content.add(player3Label,0,2);
        content.add(player3Image,0,3);
        content.add(player4Label,1,2);
        content.add(player4Image,1,3);


        root.getChildren().add(bPane);


        Scene scene = new Scene(root, 850,650);
        scene.getStylesheets().add("/stylesheet/catanstylesheet.css");

        primaryStage.setScene(scene);
        primaryStage.setTitle("Player Registration");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
