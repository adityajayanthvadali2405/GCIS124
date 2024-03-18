package unit04;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class EndPlayer implements EventHandler <ActionEvent> {
    
    @Override
    public void handle (ActionEvent event) {
        Media media = new Media (new File ("media/sounds/end.wav").toURI().toString());
        MediaPlayer player = new MediaPlayer (media);

        player.play ();
    };
}