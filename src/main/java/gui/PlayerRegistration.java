package gui;/**
 * Created by Olusegun on 10/10/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PlayerRegistration extends Application {
    ArrayList userNames = new ArrayList();

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        BackgroundImage bImage = new BackgroundImage(new Image("/images/playerRegistration.jpg",870,670,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        root.setBackground(new Background(bImage));

        GridPane content = new GridPane();

        ImageView player1Image = new ImageView(new Image("images/redknight.jpg"));
        ImageView player2Image = new ImageView(new Image("images/blueknight.jpg")); 
        ImageView player3Image = new ImageView(new Image("images/greenknight.png"));       
        ImageView player4Image = new ImageView(new Image("images/yellowknight.png"));


        root.getChildren().add(content);

        Scene scene = new Scene(root, 850,650);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Player Registration");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public Image playerData(){
        Image playerAvatar = new Image("");
        return playerAvatar;
    }
}
