package media;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;

/**
 * Created by Olusegun on 10/27/2016.
 */
public class ActionSound  {
    private MediaPlayer roadBuild = new MediaPlayer(new Media(""));
    private MediaPlayer settlementSound =  new MediaPlayer(new Media(""));
    private MediaPlayer registrationScreen = new MediaPlayer(new Media(""));
    private MediaPlayer gameScreen = new MediaPlayer(new Media(""));

    public ActionSound(){

    }

    public ActionSound(MediaPlayer roadBuild, MediaPlayer settlementSound, MediaPlayer registrationScreen, MediaPlayer gameScreen) {
        this.roadBuild = roadBuild;
        this.settlementSound = settlementSound;
        this.registrationScreen = registrationScreen;
        this.gameScreen = gameScreen;
    }

   public MediaPlayer getRoadSound(){
       return this.roadBuild;
   }

   public MediaPlayer getSettlementSound(){
       return settlementSound;
   }

   public MediaPlayer getRegistrationSound(){
       return registrationScreen;
   }

   public MediaPlayer getGameSound(){
       return gameScreen;
   }
}
