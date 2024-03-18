package unit04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NameTag extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Label hello = new Label ("HELLO MY NAME IS");
        hello.setFont (new Font ("Impact", 40));
        hello.setTextFill (Color.BLUE);
        hello.setAlignment (Pos.CENTER);
        hello.setMaxWidth (Double.POSITIVE_INFINITY);

        Label yourName = new Label ("Your Name");
        yourName.setFont (new Font ("Comic Sans MS", 96));
        yourName.setTextFill (Color.RED);
        yourName.setPadding (new Insets (20));
        yourName.setAlignment (Pos.CENTER);

        VBox top = new VBox ();
        top.getChildren ().addAll (hello, yourName);
        top.setBorder (new Border (new BorderStroke (
            Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii (20), BorderStroke.THICK
        )));

        TextField entry = new TextField ("Enter Your Name");
        entry.setAlignment (Pos.CENTER);

        Button update = new Button ("Updage Name Tag");
        update.setMaxWidth (Double.POSITIVE_INFINITY);
        update.setOnAction (new Updater (yourName, entry));

        Button clear = new Button ("Clear");
        clear.setMaxWidth (Double.POSITIVE_INFINITY);

        VBox box = new VBox ();
        box.getChildren().addAll (top, entry, update, clear);
        
        Scene scene = new Scene (box);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch (args);
    }
}
