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
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridPaneActivity extends Application {
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

    private static Label createLabel (String text, Color fill, Color bgColor, Color bColor) {
        return createLabel (text, "Consolas",
                            fill, bgColor,
                            bColor, BorderStrokeStyle.SOLID,
                            15, BorderStroke.MEDIUM);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Label entry = createLabel ("123.456", Color.BLACK, Color.WHITE, Color.BLACK);
        Label ac = createLabel ("AC", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label per = createLabel ("%", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label div = createLabel ("/", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label sev = createLabel ("7", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label eig = createLabel ("8", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label nin = createLabel ("9", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label mul = createLabel ("/", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label fou = createLabel ("4", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label fiv = createLabel ("5", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label six = createLabel ("6", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label min = createLabel ("-", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label one = createLabel ("1", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label two = createLabel ("2", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label thr = createLabel ("3", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label plu = createLabel ("+", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label zer = createLabel ("0", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label dot = createLabel (".", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);
        Label equ = createLabel ("=", Color.DIMGRAY, Color.DARKGRAY, Color.WHITE);

        GridPane pane = new GridPane ();
        pane.add (entry, 0, 0, 4, 1);
        pane.add (ac, 0, 1, 2, 1);
        pane.add (per, 2, 1);
        pane.add (div, 3, 1);
        pane.add (sev, 0, 2);
        pane.add (eig, 1, 2);
        pane.add (nin, 2, 2);
        pane.add (mul, 3, 2);
        pane.add (fou, 0, 3);
        pane.add (fiv, 1, 3);
        pane.add (six, 2, 3);
        pane.add (min, 3, 3);
        pane.add (one, 0, 4);
        pane.add (two, 1, 4);
        pane.add (thr, 2, 4);
        pane.add (plu, 3, 4);
        pane.add (zer, 0, 5, 2, 1);
        pane.add (dot, 2, 5);
        pane.add (equ, 3, 5);

        Scene scene = new Scene (pane);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
