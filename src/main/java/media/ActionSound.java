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
    private MediaPlayer settlementSound =  new MediaPlayer(new Media("http://soundimage.org/wp-content/uploads/2016/04/UI_Quirky16.mp3"));
    private MediaPlayer registrationScreen = new MediaPlayer(new Media("http://www.downloadfreesound.com/wp-content/uploads/2013/07/Battle_Pirate_Theme_Music_1.mp3"));
    private MediaPlayer gameScreen = new MediaPlayer(new Media("http://www.downloadfreesound.com/wp-content/uploads/2013/07/War_Jungle_Theme_Music_1.mp3"));



    public ActionSound(){

    }

    public ActionSound(MediaPlayer roadBuild, MediaPlayer settlementSound, MediaPlayer registrationScreen, MediaPlayer gameScreen) {
        this.roadBuild = roadBuild;
        this.settlementSound = settlementSound;
        this.registrationScreen = registrationScreen;
        this.gameScreen = gameScreen;
    }

   public MediaPlayer getRoadSound(){
       roadBuild.setAutoPlay(true);
       roadBuild.setCycleCount(MediaPlayer.INDEFINITE);
       return roadBuild;
   }

   public MediaPlayer getSettlementSound(){
       settlementSound.setAutoPlay(true);
       return settlementSound;
   }

   public MediaPlayer getRegistrationSound(){
       registrationScreen.setAutoPlay(true);
       registrationScreen.setCycleCount(MediaPlayer.INDEFINITE);
       return registrationScreen;
   }

   public MediaPlayer getGameSound(){
       gameScreen.setAutoPlay(true);
       gameScreen.setCycleCount(MediaPlayer.INDEFINITE);
       return gameScreen;
   }
}
