package unit04.reversi.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import unit04.reversi.model.Color;
import unit04.reversi.model.Reversi;
import unit04.reversi.model.ReversiException;
import unit04.reversi.model.Square;

public class ReversiGUI extends Application {
    public static final Image SQUARE = new Image ("file:media/images/reversi/square.png");
    public static final Image BLANK = new Image ("file:media/images/reversi/blank.png");
    public static final Image BLACK = new Image ("file:media/images/reversi/blackpiece.png");
    public static final Image WHITE = new Image ("file:media/images/reversi/whitepiece.png");

    private Reversi game;
    private Label status;
    private Label p1Score;
    private Label p2Score;

    private Button makeReversiButton (int row, int col) {
        Square square = game.getSquare (row, col);
        Image image = BLANK;
        if (square.getOccupyingColor () == Color.WHITE) {
            image = WHITE;
        }
        else if (square.getOccupyingColor () == Color.BLACK) {
            image = BLACK;
        }
        ImageView imageView = new ImageView (image);
        square.setOnChange (new SquareChanger (imageView));

        Button button = new Button ("", imageView);
        button.setBackground (new Background (new BackgroundImage (
            SQUARE,
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER, BackgroundSize.DEFAULT
        )));
        button.setPadding (Insets.EMPTY);
        button.setPrefSize (72, 72);

        button.setOnAction (new MoveMaker (row, col, this));

        return button;
    }

    @Override
    public void start (Stage stage) throws Exception {
        game = new Reversi();

        GridPane grid = new GridPane ();
        for (int col = 0; col < Reversi.COLS; col++) {
            for (int row = 0; row < Reversi.ROWS; row++) {
                grid.add (makeReversiButton(row, col), col, row);
            }
        }

        Scene scene = new Scene (grid);
        stage.setScene (scene);
        stage.setTitle ("Reversi");
        stage.show ();

        
    }

    public void makeMove (int row, int col) {
        try {
            game.move (row, col);
        } catch (ReversiException re) {
            System.out.println (re.getMessage ());
        }
    }

    public static void main(String[] args) {
        launch (args);
    }
    
}
