package unit04;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class EatPlayer implements EventHandler <ActionEvent> {
    
    @Override
    public void handle (ActionEvent event) {
        Media media = new Media (new File ("media/sounds/eat.wav").toURI().toString());
        MediaPlayer player = new MediaPlayer (media);

        player.play ();
    };
}