package unit04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BorderPaneActivity extends Application{
    
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

    private static Label creatLabel (String text, Color bgColor) {
        return createLabel (text, "Consolas",
                            Color.ANTIQUEWHITE, bgColor,
                            Color.BLACK, BorderStrokeStyle.SOLID,
                            15, BorderStroke.MEDIUM);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane ();

        pane.setTop (creatLabel ("TOP", Color.DARKGOLDENROD));
        pane.setBottom (creatLabel ("BOTTOM", Color.DARKGREEN));
        pane.setLeft (creatLabel ("LEFT", Color.DARKMAGENTA));
        pane.setRight (creatLabel ("RIGHT", Color.DARKORCHID));
        pane.setCenter (creatLabel ("CENTER", Color.DARKSLATEBLUE));

        Scene scene = new Scene (pane);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch (args);
    }
}
