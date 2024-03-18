package unit04.reversi.view;

import javafx.scene.image.ImageView;
import unit04.reversi.model.Color;
import unit04.reversi.model.Square;
import unit04.reversi.model.SquareObserver;

public class SquareChanger implements SquareObserver{
    private final ImageView view;

    public SquareChanger (ImageView view) {
        this.view = view;
    }

    @Override
    public void squareChanged (Square square) {
        if (square.getOccupyingColor() == Color.WHITE) {
            view.setImage (ReversiGUI.WHITE);
        }
        else if (square.getOccupyingColor() == Color.BLACK) {
            view.setImage (ReversiGUI.BLACK);
        }
        else {
            view.setImage (ReversiGUI.BLANK);
        }
    }
}
