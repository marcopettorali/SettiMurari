package settimurari;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SettiMurari extends Application {
    
    public static boolean chiudiMenuSelected = false;
    
    SettiMurariGUI gui;

    @Override
    public void start(Stage primaryStage) {
        gui = new SettiMurariGUI();
        Scene scene = new Scene(gui);
        primaryStage.setTitle("Calcolo Setti Murari");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        gui.reset();

        primaryStage.show();

    }

    @Override
    public void stop() {
        if(!chiudiMenuSelected){
            gui.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
