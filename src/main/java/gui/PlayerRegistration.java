package gui;/**
 * Created by Olusegun on 10/10/2016.
 */

import javafx.application.Application;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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
    ArrayList<Object> imageViews = new ArrayList<Object>();
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
        for(int count = 1; count > numOfPlayer; count++){
            imageViews.add(new ImageView(new Image(imgFilesObject.get(count))));
        }


        ImageView player1Image = new ImageView(new Image("/images/redknight.png", 100,100,false,true));
        ImageView player2Image = new ImageView(new Image("/images/blueknight.png"));
        ImageView player3Image = new ImageView(new Image("/images/greenknight.png"));
        ImageView player4Image = new ImageView(new Image("/images/yellowknight.png"));

        bPane.setCenter(content);
        bPane.setTop(hb);
        content.add(player1Image, 0, 0);


        root.getChildren().add(bPane);

        Scene scene = new Scene(root, 850,650);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Player Registration");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
