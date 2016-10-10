package gui;/**
 * Created by Olusegun on 10/10/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PlayerRegistration extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        ImageView player1 = new ImageView();
        ImageView player2 = new ImageView();
        ImageView player3 = new ImageView();
        ImageView player4 = new ImageView();


        Pane root = new Pane();
        BackgroundImage bImage = new BackgroundImage(new Image("/images/playerRegistration.jpg",870,670,false,true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        root.setBackground(new Background(bImage));

        GridPane content = new GridPane();


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
