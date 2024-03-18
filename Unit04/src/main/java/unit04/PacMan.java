package unit04;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class PacMan extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Button start = new Button ("Start");
        start.setMaxWidth (Double.POSITIVE_INFINITY);
        Media media = new Media (new File ("media/sounds/start.wav").toURI().toString());
        MediaPlayer player = new MediaPlayer (media);
        start.setOnAction (new StartPlayer(player));
        
        Button chomp = new Button ("Chomp");
        chomp.setMaxWidth (Double.POSITIVE_INFINITY);
        media = new Media (new File ("media/sounds/chomp.wav").toURI().toString());
        player = new MediaPlayer (media);
        chomp.setOnAction (new StartPlayer(player));
        
        Button eat = new Button ("Eat");
        eat.setMaxWidth (Double.POSITIVE_INFINITY);
        media = new Media (new File ("media/sounds/eat.wav").toURI().toString());
        player = new MediaPlayer (media);
        eat.setOnAction (new StartPlayer(player));
        
        Button end = new Button ("End");
        end.setMaxWidth (Double.POSITIVE_INFINITY);
        media = new Media (new File ("media/sounds/end.wav").toURI().toString());
        player = new MediaPlayer (media);
        end.setOnAction (new StartPlayer(player));

        VBox box = new VBox ();
        box.getChildren ().addAll (start, chomp, eat, end);

        Scene scene = new Scene (box);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch (args);
    }
}
