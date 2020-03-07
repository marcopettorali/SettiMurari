package settimurari;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SettiMurari extends Application {

    @Override
    public void start(Stage primaryStage) {  
        SettiMurariGUI gui = new SettiMurariGUI();
        Scene scene = new Scene(gui);  
        primaryStage.setTitle("Calcolo Setti Murari");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        
        gui.reset();
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
