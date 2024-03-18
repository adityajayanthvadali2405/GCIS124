package unit04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelActivity extends Application {

    private static Label createLabel (String text, String fontName,
                                      Color textColor, Color bgColor,
                                      Color bColor, BorderStrokeStyle bStyle,
                                      int bRadii, BorderWidths bWidth) {
        Label label = new Label (text);
        label.setFont (new Font (fontName, 64));
        label.setTextFill (textColor);
        label.setPadding (new Insets (30));
        label.setBackground (new Background (new BackgroundFill (
            bgColor, new CornerRadii (bRadii), Insets.EMPTY)
        ));
        label.setAlignment (Pos.CENTER);
        label.setBorder (new Border (new BorderStroke (
            bColor, bStyle, new CornerRadii (bRadii), bWidth
        )));
        label.setMaxWidth (Double.POSITIVE_INFINITY);
        label.setMaxHeight (Double.POSITIVE_INFINITY);

        return label;
    }
    
    @Override
    public void start (Stage stage) throws Exception {
        Label label = LabelActivity.createLabel ("My First Label", "Comic Sans MS", 
                                                 Color.CHARTREUSE, Color.FUCHSIA,
                                                 Color.DARKGREEN, BorderStrokeStyle.DASHED,
                                                 10, BorderStroke.MEDIUM);
        Label label2 = LabelActivity.createLabel ("Second Label", "Consolas", 
                                                 Color.SALMON, Color.LEMONCHIFFON,
                                                 Color.DARKBLUE, BorderStrokeStyle.DOTTED,
                                                 20, BorderStroke.THICK);
        Label label3 = LabelActivity.createLabel ("Third", "Arial", 
                                                 Color.HOTPINK, Color.HONEYDEW,
                                                 Color.DARKRED, BorderStrokeStyle.SOLID,
                                                 30, BorderStroke.THIN);

        VBox box = new VBox ();
        box.getChildren ().addAll (label, label2, label3);

        Scene scene = new Scene (box);
        stage.setTitle ("Activity 4.2");
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch (args);
    }
}
