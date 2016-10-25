package gui;/**
 * Created by Olusegun on 9/28/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class SettlersOfCatan extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        //start of menu Bar
        MenuBar menuBar = new MenuBar();
        menuBar.setStyle("-fx-background-color : #E5785B");
        menuBar.setOpacity(1.8);

        Menu viewMembers = new Menu("Team Members");
        Menu viewSourceCode = new Menu("View Source Code");
        Menu viewGameInstructions = new Menu("View Game Instructions");
        Menu exit = new Menu("Exit");

        menuBar.getMenus().addAll(viewMembers,viewSourceCode,viewGameInstructions,exit);

        //start of right Box
        VBox vBox = new VBox(10);

        //start button
        Button startButton = new Button("Start Game");
        startButton.setPrefSize(200,100);
        startButton.setStyle("-fx-background-color: #E5785B");

        //exit button
        Button exitButton = new Button("Exit Game");
        exitButton.setPrefSize(200,100);
        exitButton.setStyle("-fx-background-color: #E5785B");

        //startButton.setStyle("-fx-padding : 10");
        vBox.getChildren().addAll(startButton, exitButton);
        //hBox.setMargin(startButton, new Insets(40.0,40.0,0.8,0.4));
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color : #5B97E5");

        //start of center
        Pane centerContent = new Pane();
        centerContent.setStyle("-fx-background-color :#AEE1EC");
        ImageView image = new ImageView();
        Image frontImage = new Image("/images/splashImage.jpg");
        image.setImage(frontImage);
        image.setImage(frontImage);
        image.setFitWidth(810);
        image.setFitHeight(1000);
        image.setPreserveRatio(true);
        image.setSmooth(true);
        image.setCache(true);

        Circle images = new Circle(20,20,20);

        centerContent.getChildren().addAll(image);

        //start of bottom
        HBox footer = new HBox(8);
        TextField header = new TextField("DEVELOPERS");
        header.setAlignment(Pos.CENTER);

        Text developers = new Text("Scott Nickel, Alex Skeens, Nick Gilbert, Olusegun Akinyelure, Ogunyemi Alewi");
        developers.setTextAlignment(TextAlignment.CENTER);

        footer.getChildren().addAll(header,developers);



        //start adding menu panes to borderpane

        root.setTop(menuBar);
        root.setRight(vBox);
        root.setCenter(centerContent);
        root.setBottom(footer);





        Scene scene = new Scene(root,1000,600);

        primaryStage.setScene(scene);
        primaryStage.setOpacity(0.9);
        primaryStage.setTitle("SettlersOfCatan");
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
