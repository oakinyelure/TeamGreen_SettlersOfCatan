package media;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.net.URL;

/**
 * Created by Olusegun on 10/27/2016.
 */
public class ActionSound  {
    final URL resource = getClass().getResource("settlement.mp3");
    private MediaPlayer roadBuild = new MediaPlayer(new Media("http://cs.armstrong.edu/liang/common/sample.mp4"));
    private MediaPlayer settlementSound =  new MediaPlayer(new Media("http://cs.armstrong.edu/liang/common/sample.mp4"));
    private MediaPlayer registrationScreen = new MediaPlayer(new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv"));
    private MediaPlayer gameScreen = new MediaPlayer(new Media("http://cs.armstrong.edu/liang/common/sample.mp4"));



    public ActionSound(){

    }

    public ActionSound(MediaPlayer roadBuild, MediaPlayer settlementSound, MediaPlayer registrationScreen, MediaPlayer gameScreen) {
        this.roadBuild = roadBuild;
        this.settlementSound = settlementSound;
        this.registrationScreen = registrationScreen;
        this.gameScreen = gameScreen;
    }

   public MediaPlayer getRoadSound(){
       //roadBuild.setAutoPlay(true);
       roadBuild.setCycleCount(MediaPlayer.INDEFINITE);
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
