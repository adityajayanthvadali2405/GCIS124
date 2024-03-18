package unit04;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Updater implements EventHandler <ActionEvent> {
    
    private final Label yourName;
    private final TextField text;

    public Updater (Label yourName, TextField text) {
        this.yourName = yourName;
        this.text = text;
    }

    @Override
    public void handle (ActionEvent arg0) {
        yourName.setText (text.getText ());
    }
}
