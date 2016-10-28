package media;

import javafx.scene.media.MediaPlayer;

import javax.swing.*;

/**
 * Created by Olusegun on 10/27/2016.
 */
public class ActionSound  {
    private MediaPlayer roadBuild;
    private MediaPlayer settlementSound;
    private MediaPlayer registrationScreenImage;
    private MediaPlayer gameScreenImage;

    public ActionSound(){

    }

    public ActionSound(MediaPlayer roadBuild, MediaPlayer settlementSound) {
        this.roadBuild = roadBuild;
        this.settlementSound = settlementSound;
    }

    public MediaPlayer getRoadBuild() {
        return roadBuild;
    }

    public void setRoadBuild(MediaPlayer roadBuild) {
        this.roadBuild = roadBuild;
    }

    public MediaPlayer getSettlementSound() {
        return settlementSound;
    }

    public void setSettlementSound(MediaPlayer settlementSound) {
        this.settlementSound = settlementSound;
    }

    public MediaPlayer getRegistrationScreenImage() {
        return registrationScreenImage;
    }

    public void setRegistrationScreenImage(MediaPlayer registrationScreenImage) {
        this.registrationScreenImage = registrationScreenImage;
    }

    public MediaPlayer getGameScreenImage() {
        return gameScreenImage;
    }

    public void setGameScreenImage(MediaPlayer gameScreenImage) {
        this.gameScreenImage = gameScreenImage;
    }
}
