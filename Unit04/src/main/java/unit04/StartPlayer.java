package unit04;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class StartPlayer implements EventHandler <ActionEvent> {

    private MediaPlayer player;

    public StartPlayer (MediaPlayer player) {
        this.player = player;
    }
    
    @Override
    public void handle(ActionEvent event) {
        player.stop ();
        player.play ();
    }
}
