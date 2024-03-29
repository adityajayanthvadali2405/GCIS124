package unit04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageViewer extends Application {
    
    @Override
    public void start (Stage stage) throws Exception {
        Image image = new Image ("file:media/images/smb.gif");
        ImageView view = new ImageView (image);
        
        HBox box = new HBox();
        box.getChildren ().add (view);
        
        Scene scene = new Scene (box);
        stage.setScene (scene);
        stage.show ();
    }

    public static void main(String[] args) {
        launch (args);
    }
}
