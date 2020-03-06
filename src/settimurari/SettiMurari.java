package settimurari;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class SettiMurari extends Application {

   
    

    private void setupArraySettoAttuale() {
        try {
            TextInputDialog attualeInputDialog = new TextInputDialog("Inserire un numero");
            attualeInputDialog.setHeaderText("Inserire numero setti stato ATTUALE");
            attualeInputDialog.showAndWait();
            GestoreSetti.buildAttualeArr(Integer.parseInt(attualeInputDialog.getEditor().getText()));
        } catch (Exception e) {
            setupArraySettoAttuale();
        }
    }

    private void setupArraySettoModificato() {
        try {
            TextInputDialog modificatoInputDialog = new TextInputDialog("Inserire un numero");
            modificatoInputDialog.setHeaderText("Inserire numero setti stato MODIFICATO");
            modificatoInputDialog.showAndWait();
            GestoreSetti.buildModificatoArr(Integer.parseInt(modificatoInputDialog.getEditor().getText()));
        } catch (Exception e) {
            setupArraySettoModificato();

        }
    }

    @Override
    public void start(Stage primaryStage) {

        setupArraySettoAttuale();
        setupArraySettoModificato();
        
        Scene scene = new Scene(new SettiMurariGUI());  
        primaryStage.setTitle("Calcolo Setti Murari");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
