package settimurari;

import java.io.*;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SettiMurariGUI extends Pane {

    private boolean modificaMode = false;
    private int settoMod;
    private String sceltaMod;

    private File selectedFile;

    protected final Pane pane;
    protected final VBox vBox;
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem nuovoMenu;
    protected final SeparatorMenuItem separatorMenuItem;
    protected final MenuItem apriMenu;
    protected final SeparatorMenuItem separatorMenuItem0;
    protected final MenuItem salvaMenu;
    protected final MenuItem salvaConNomeMenu;
    protected final SeparatorMenuItem separatorMenuItem1;
    protected final MenuItem chiudiMenu;
    protected final Menu menu0;
    protected final MenuItem guidaMenu;
    protected final MenuItem infoMenu;
    protected final VBox vBox0;
    protected final HBox hBox;
    protected final VBox calcolaVBox;
    protected final VBox vBox1;
    protected final Label label;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final TextField toField;
    protected final TextField eField;
    protected final TextField gField;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;
    protected final VBox vBox2;
    protected final Label label9;
    protected final GridPane gridPane0;
    protected final Label label10;
    protected final Label label11;
    protected final Label label12;
    protected final TextField hField;
    protected final TextField lField;
    protected final TextField tField;
    protected final Label label13;
    protected final Label label14;
    protected final Label label15;
    protected final Label label16;
    protected final Label label17;
    protected final Label label18;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final VBox vBox3;
    protected final Label label19;
    protected final GridPane gridPane1;
    protected final Label label110;
    protected final Label label111;
    protected final TextField s0Field;
    protected final Label label112;
    protected final Label label113;
    protected final Label label114;
    protected final Label label115;
    protected final Label label116;
    protected final Label label117;
    protected final TextField nField;
    protected final TextField fmField;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final ColumnConstraints columnConstraints9;
    protected final ColumnConstraints columnConstraints10;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final HBox hBox0;
    protected final Button calcolaBtn;
    protected final VBox vBox4;
    protected final Label label118;
    protected final TextArea logText;
    protected final HBox modificaHBox;
    protected final Label label119;
    protected final TextField settoField;
    protected final Label label1110;
    protected final ChoiceBox statoChoice;
    protected final Button modificaBtn;
    protected final HBox hBox1;
    protected final TextArea attualeText;
    protected final TextArea modificatoText;
    protected final Label statoLbl;

    public SettiMurariGUI() {

        pane = new Pane();
        vBox = new VBox();
        menuBar = new MenuBar();
        menu = new Menu();
        nuovoMenu = new MenuItem();
        separatorMenuItem = new SeparatorMenuItem();
        apriMenu = new MenuItem();
        separatorMenuItem0 = new SeparatorMenuItem();
        salvaMenu = new MenuItem();
        salvaConNomeMenu = new MenuItem();
        separatorMenuItem1 = new SeparatorMenuItem();
        chiudiMenu = new MenuItem();
        menu0 = new Menu();
        guidaMenu = new MenuItem();
        infoMenu = new MenuItem();
        vBox0 = new VBox();
        hBox = new HBox();
        calcolaVBox = new VBox();
        vBox1 = new VBox();
        label = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        toField = new TextField();
        eField = new TextField();
        gField = new TextField();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();
        vBox2 = new VBox();
        label9 = new Label();
        gridPane0 = new GridPane();
        label10 = new Label();
        label11 = new Label();
        label12 = new Label();
        hField = new TextField();
        lField = new TextField();
        tField = new TextField();
        label13 = new Label();
        label14 = new Label();
        label15 = new Label();
        label16 = new Label();
        label17 = new Label();
        label18 = new Label();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        vBox3 = new VBox();
        label19 = new Label();
        gridPane1 = new GridPane();
        label110 = new Label();
        label111 = new Label();
        s0Field = new TextField();
        label112 = new Label();
        label113 = new Label();
        label114 = new Label();
        label115 = new Label();
        label116 = new Label();
        label117 = new Label();
        nField = new TextField();
        fmField = new TextField();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        columnConstraints9 = new ColumnConstraints();
        columnConstraints10 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        hBox0 = new HBox();
        calcolaBtn = new Button();
        vBox4 = new VBox();
        label118 = new Label();
        logText = new TextArea();
        modificaHBox = new HBox();
        label119 = new Label();
        settoField = new TextField();
        label1110 = new Label();
        statoChoice = new ChoiceBox();
        modificaBtn = new Button();
        hBox1 = new HBox();
        attualeText = new TextArea();
        modificatoText = new TextArea();
        statoLbl = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);

        menu.setMnemonicParsing(false);
        menu.setText("File");

        nuovoMenu.setMnemonicParsing(false);
        nuovoMenu.setText("Nuovo setto murario");

        separatorMenuItem.setMnemonicParsing(false);

        apriMenu.setMnemonicParsing(false);
        apriMenu.setText("Apri");

        separatorMenuItem0.setMnemonicParsing(false);

        salvaMenu.setMnemonicParsing(false);
        salvaMenu.setText("Salva");

        salvaConNomeMenu.setMnemonicParsing(false);
        salvaConNomeMenu.setText("Salva con nome");

        separatorMenuItem1.setMnemonicParsing(false);

        chiudiMenu.setMnemonicParsing(false);
        chiudiMenu.setText("Chiudi");

        menu0.setMnemonicParsing(false);
        menu0.setText("?");

        guidaMenu.setMnemonicParsing(false);
        guidaMenu.setText("Guida");

        infoMenu.setMnemonicParsing(false);
        infoMenu.setText("Informazioni su Calcolo Setti Murari");

        vBox0.setAlignment(javafx.geometry.Pos.CENTER);

        hBox.setAlignment(javafx.geometry.Pos.CENTER);
        hBox.setFillHeight(false);
        hBox.setSpacing(50.0);

        calcolaVBox.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        calcolaVBox.setFillWidth(false);
        calcolaVBox.setSpacing(20.0);

        vBox1.setSpacing(10.0);

        label.setText("Caratteristiche meccaniche (Tabb. C8.5.I e C8.5.II NTC '18)");
        label.setFont(new Font("System Bold", 12.0));

        gridPane.setHgap(20.0);
        gridPane.setVgap(5.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);

        columnConstraints0.setHalignment(javafx.geometry.HPos.RIGHT);
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(235.0);
        columnConstraints1.setMinWidth(0.0);
        columnConstraints1.setPrefWidth(118.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);

        rowConstraints.setMaxHeight(208.0);
        rowConstraints.setMinHeight(USE_PREF_SIZE);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(USE_PREF_SIZE);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(USE_PREF_SIZE);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label0.setText("Resistenza a taglio della muratura");

        GridPane.setRowIndex(label1, 1);
        label1.setText("Valore del modulo di elasticità normale");

        GridPane.setRowIndex(label2, 2);
        label2.setText("Valore del modulo di elasticità tangenziale");

        GridPane.setColumnIndex(toField, 2);

        GridPane.setColumnIndex(eField, 2);
        GridPane.setRowIndex(eField, 1);

        GridPane.setColumnIndex(gField, 2);
        GridPane.setRowIndex(gField, 2);

        GridPane.setColumnIndex(label3, 1);
        label3.setText("𝜏o =");

        GridPane.setColumnIndex(label4, 1);
        GridPane.setRowIndex(label4, 1);
        label4.setText("E =");

        GridPane.setColumnIndex(label5, 1);
        GridPane.setRowIndex(label5, 2);
        label5.setText("G =");

        GridPane.setColumnIndex(label6, 3);
        label6.setText("N/mmq");

        GridPane.setColumnIndex(label7, 3);
        GridPane.setRowIndex(label7, 1);
        label7.setText("N/mmq");

        GridPane.setColumnIndex(label8, 3);
        GridPane.setRowIndex(label8, 2);
        label8.setText("N/mmq");

        vBox2.setSpacing(10.0);

        label9.setText("Caratteristiche geometriche del setto");
        label9.setFont(new Font("System Bold", 12.0));

        gridPane0.setHgap(20.0);
        gridPane0.setVgap(5.0);

        label10.setText("Altezza");

        GridPane.setRowIndex(label11, 1);
        label11.setText("Lunghezza");

        GridPane.setRowIndex(label12, 2);
        label12.setText("Spessore");

        GridPane.setColumnIndex(hField, 2);

        GridPane.setColumnIndex(lField, 2);
        GridPane.setRowIndex(lField, 1);

        GridPane.setColumnIndex(tField, 2);
        GridPane.setRowIndex(tField, 2);

        GridPane.setColumnIndex(label13, 1);
        label13.setText("h =");

        GridPane.setColumnIndex(label14, 1);
        GridPane.setRowIndex(label14, 1);
        label14.setText("l =");

        GridPane.setColumnIndex(label15, 1);
        GridPane.setRowIndex(label15, 2);
        label15.setText("t =");

        GridPane.setColumnIndex(label16, 3);
        label16.setText("cm");

        GridPane.setColumnIndex(label17, 3);
        GridPane.setRowIndex(label17, 1);
        label17.setText("cm");

        GridPane.setColumnIndex(label18, 3);
        GridPane.setRowIndex(label18, 2);
        label18.setText("cm");

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);

        columnConstraints4.setHalignment(javafx.geometry.HPos.RIGHT);
        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(235.0);
        columnConstraints5.setMinWidth(0.0);
        columnConstraints5.setPrefWidth(118.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMinWidth(10.0);

        rowConstraints2.setMaxHeight(208.0);
        rowConstraints2.setMinHeight(USE_PREF_SIZE);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(USE_PREF_SIZE);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(USE_PREF_SIZE);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        vBox3.setSpacing(10.0);

        label19.setText("Altri parametri");
        label19.setFont(new Font("System Bold", 12.0));

        gridPane1.setHgap(20.0);
        gridPane1.setVgap(5.0);

        label110.setText("Tensione di compressione");

        GridPane.setRowIndex(label111, 3);
        label111.setText("Tipo di modellazione");

        GridPane.setColumnIndex(s0Field, 2);

        GridPane.setColumnIndex(label112, 1);
        label112.setText("σo =");

        GridPane.setColumnIndex(label113, 1);
        GridPane.setRowIndex(label113, 3);
        label113.setText("n =");

        GridPane.setColumnIndex(label114, 3);
        label114.setText("N/mmq");

        GridPane.setRowIndex(label115, 1);
        label115.setText("Resistenza media a compressione della muratura");

        GridPane.setColumnIndex(label116, 1);
        GridPane.setRowIndex(label116, 1);
        label116.setText("fm =");

        GridPane.setColumnIndex(label117, 3);
        GridPane.setRowIndex(label117, 1);
        label117.setText("N/mmq");

        GridPane.setColumnIndex(nField, 2);
        GridPane.setRowIndex(nField, 3);

        GridPane.setColumnIndex(fmField, 2);
        GridPane.setRowIndex(fmField, 1);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(290.0);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(262.0);

        columnConstraints8.setHalignment(javafx.geometry.HPos.RIGHT);
        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMaxWidth(38.0);
        columnConstraints8.setMinWidth(0.0);
        columnConstraints8.setPrefWidth(28.0);

        columnConstraints9.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setMaxWidth(143.0);
        columnConstraints9.setMinWidth(0.0);
        columnConstraints9.setPrefWidth(79.0);

        columnConstraints10.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints10.setMaxWidth(66.0);
        columnConstraints10.setMinWidth(10.0);
        columnConstraints10.setPrefWidth(44.0);

        rowConstraints5.setMaxHeight(208.0);
        rowConstraints5.setMinHeight(USE_PREF_SIZE);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(USE_PREF_SIZE);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMinHeight(USE_PREF_SIZE);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(USE_PREF_SIZE);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        hBox0.setAlignment(javafx.geometry.Pos.CENTER);

        calcolaBtn.setMnemonicParsing(false);
        calcolaBtn.setText("Calcola");
        calcolaBtn.setFont(new Font(18.0));

        vBox4.setSpacing(20.0);

        label118.setText("Log:");

        logText.setEditable(false);
        logText.setPrefHeight(356.0);

        modificaHBox.setAlignment(javafx.geometry.Pos.CENTER);
        modificaHBox.setSpacing(10.0);

        label119.setText("Setto n.");

        label1110.setText("Stato:");

        statoChoice.setPrefWidth(150.0);
        ArrayList<String> items = new ArrayList<>();
        items.add("Attuale");
        items.add("Modificato");
        statoChoice.setItems(FXCollections.observableArrayList(items));

        modificaBtn.setMnemonicParsing(false);
        modificaBtn.setText("Modifica");

        hBox1.setAlignment(javafx.geometry.Pos.CENTER);
        hBox1.setSpacing(64.0);

        attualeText.setEditable(false);

        modificatoText.setEditable(false);
        modificatoText.setPrefHeight(349.0);
        modificatoText.setPrefWidth(465.0);
        VBox.setMargin(hBox1, new Insets(0.0));
        hBox1.setPadding(new Insets(20.0, 0.0, 20.0, 0.0));

        statoLbl.setText("Stato");

        menu.getItems().add(nuovoMenu);
        menu.getItems().add(separatorMenuItem);
        menu.getItems().add(apriMenu);
        menu.getItems().add(separatorMenuItem0);
        menu.getItems().add(salvaMenu);
        menu.getItems().add(salvaConNomeMenu);
        menu.getItems().add(separatorMenuItem1);
        menu.getItems().add(chiudiMenu);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(guidaMenu);
        menu0.getItems().add(infoMenu);
        menuBar.getMenus().add(menu0);
        vBox.getChildren().add(menuBar);
        vBox1.getChildren().add(label);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(toField);
        gridPane.getChildren().add(eField);
        gridPane.getChildren().add(gField);
        gridPane.getChildren().add(label3);
        gridPane.getChildren().add(label4);
        gridPane.getChildren().add(label5);
        gridPane.getChildren().add(label6);
        gridPane.getChildren().add(label7);
        gridPane.getChildren().add(label8);
        vBox1.getChildren().add(gridPane);
        calcolaVBox.getChildren().add(vBox1);
        vBox2.getChildren().add(label9);
        gridPane0.getChildren().add(label10);
        gridPane0.getChildren().add(label11);
        gridPane0.getChildren().add(label12);
        gridPane0.getChildren().add(hField);
        gridPane0.getChildren().add(lField);
        gridPane0.getChildren().add(tField);
        gridPane0.getChildren().add(label13);
        gridPane0.getChildren().add(label14);
        gridPane0.getChildren().add(label15);
        gridPane0.getChildren().add(label16);
        gridPane0.getChildren().add(label17);
        gridPane0.getChildren().add(label18);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getColumnConstraints().add(columnConstraints5);
        gridPane0.getColumnConstraints().add(columnConstraints6);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        vBox2.getChildren().add(gridPane0);
        calcolaVBox.getChildren().add(vBox2);
        vBox3.getChildren().add(label19);
        gridPane1.getChildren().add(label110);
        gridPane1.getChildren().add(label111);
        gridPane1.getChildren().add(s0Field);
        gridPane1.getChildren().add(label112);
        gridPane1.getChildren().add(label113);
        gridPane1.getChildren().add(label114);
        gridPane1.getChildren().add(label115);
        gridPane1.getChildren().add(label116);
        gridPane1.getChildren().add(label117);
        gridPane1.getChildren().add(fmField);
        gridPane1.getChildren().add(nField);

        gridPane1.getColumnConstraints().add(columnConstraints7);
        gridPane1.getColumnConstraints().add(columnConstraints8);
        gridPane1.getColumnConstraints().add(columnConstraints9);
        gridPane1.getColumnConstraints().add(columnConstraints10);
        gridPane1.getRowConstraints().add(rowConstraints5);
        gridPane1.getRowConstraints().add(rowConstraints6);
        gridPane1.getRowConstraints().add(rowConstraints7);
        gridPane1.getRowConstraints().add(rowConstraints8);
        vBox3.getChildren().add(gridPane1);
        calcolaVBox.getChildren().add(vBox3);
        hBox0.getChildren().add(calcolaBtn);
        calcolaVBox.getChildren().add(hBox0);
        hBox.getChildren().add(calcolaVBox);
        vBox4.getChildren().add(label118);
        vBox4.getChildren().add(logText);
        modificaHBox.getChildren().add(label119);
        modificaHBox.getChildren().add(settoField);
        modificaHBox.getChildren().add(label1110);
        modificaHBox.getChildren().add(statoChoice);
        modificaHBox.getChildren().add(modificaBtn);
        vBox4.getChildren().add(modificaHBox);
        hBox.getChildren().add(vBox4);
        vBox0.getChildren().add(hBox);
        hBox1.getChildren().add(attualeText);
        hBox1.getChildren().add(modificatoText);
        vBox0.getChildren().add(hBox1);
        vBox0.getChildren().add(statoLbl);
        vBox.getChildren().add(vBox0);
        pane.getChildren().add(vBox);
        getChildren().add(pane);

        setupButtonsAndMenu();
    }

    private void setupButtonsAndMenu() {
        //BUTTONS
        calcolaBtn.setOnAction(e -> {
            calcolaBtnHandler();
        });

        modificaBtn.setOnAction(e -> {
            modificaBtnHandler();
        });

        //MENU
        nuovoMenu.setOnAction(e -> {
            nuovoMenuHandler();
        });

        salvaMenu.setOnAction(e -> {
            salvaMenuHandler();
        });

        salvaConNomeMenu.setOnAction(e -> {
            salvaConNomeMenuHandler();
        });

        chiudiMenu.setOnAction(e -> {
            chiudiMenuHandler();
        });

        apriMenu.setOnAction(e -> {
            apriMenuHandler();
        });

        guidaMenu.setOnAction(e -> {
            guidaMenuHandler();
        });

        infoMenu.setOnAction(e -> {
            infoMenuHandler();
        });
    }

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

    public void reset() {
        toField.setText("");
        eField.setText("");
        gField.setText("");
        hField.setText("");
        lField.setText("");
        tField.setText("");
        s0Field.setText("");
        nField.setText("");

        attualeText.setText("");
        modificatoText.setText("");

        GestoreSetti.reset();

        setupArraySettoAttuale();
        setupArraySettoModificato();

        aggiungiLog("------------NUOVO SETTO---------------");
        aggiungiLog(GestoreSetti.getStageLog());

        modificaHBox.setDisable(true);
        statoLbl.setVisible(false);
        calcolaVBox.setDisable(false);
        modificaMode = false;
        selectedFile = null;
        salvaMenu.setDisable(true);
        statoLbl.setVisible(false);
    }

    private void aggiungiLog(String s) {
        logText.setText(logText.getText() + s + "\n");
    }

    private void aggiungiAttualeText(String s) {
        attualeText.setText(attualeText.getText() + s + "\n");
    }

    private void aggiungiModificatoText(String s) {
        modificatoText.setText(modificatoText.getText() + s + "\n");
    }

    private void clear() {
//        toField.setText("");
//        eField.setText("");
//        gField.setText("");
//        hField.setText("");
        lField.setText("");
//        tField.setText("");
//        s0Field.setText("");
//        nField.setText("");
    }

    private void stampaSetti() {
        attualeText.setText("");
        modificatoText.setText("");

        for (int i = 0; i < GestoreSetti.getAttualeStage(); i++) {
            Setto setto = GestoreSetti.getAttualeArr()[i];
            aggiungiAttualeText("Stato ATTUALE - setto n. " + (i + 1));
            aggiungiAttualeText(setto.toString());
            aggiungiAttualeText("--------------------------------------");
        }

        for (int i = 0; i < GestoreSetti.getModificatoStage(); i++) {
            Setto setto = GestoreSetti.getModificatoArr()[i];
            aggiungiModificatoText("Stato MODIFICATO - setto n. " + (i + 1));
            aggiungiModificatoText(setto.toString());
            aggiungiModificatoText("--------------------------------------");
        }

    }

    private void stampaSetto(Setto s) {
        if (!GestoreSetti.attualeCompletato()) {
            aggiungiAttualeText("Stato ATTUALE - setto n. " + (GestoreSetti.getAttualeStage() + 1));
            aggiungiAttualeText(s.toString());
            aggiungiAttualeText("--------------------------------------");
        } else if (!GestoreSetti.modificatoCompletato()) {
            aggiungiModificatoText("Stato MODIFICATO - setto n. " + (GestoreSetti.getModificatoStage() + 1));
            aggiungiModificatoText(s.toString());
            aggiungiModificatoText("--------------------------------------");
        }
    }

    private void calcolaBtnHandler() {
        if (!modificaMode) {
            calcolaBtnAggiungiSetto();
        } else {
            calcolaBtnModificaSetto();
        }
    }

    private Setto estraiSettoDaCampiInseriti() {
        double to, e, g, h = 0, l, t, s0, fm, n;
        try {
            to = Double.parseDouble(toField.getText().replace(",", "."));
            e = Double.parseDouble(eField.getText().replace(",", "."));
            g = Double.parseDouble(gField.getText().replace(",", "."));
            h = Double.parseDouble(hField.getText().replace(",", ".")) * 10;
            l = Double.parseDouble(lField.getText().replace(",", ".")) * 10;
            t = Double.parseDouble(tField.getText().replace(",", ".")) * 10;
            s0 = Double.parseDouble(s0Field.getText().replace(",", "."));
            fm = Double.parseDouble(fmField.getText().replace(",", "."));
            n = Double.parseDouble(nField.getText().replace(",", "."));

            if (n != 3 && n != 12) {
                aggiungiLog("ATTENZIONE: valore inserito di n diverso da 3 o 12");
            }
            if (l <= h / 3) {
                aggiungiLog("ATTENZIONE: valore di lunghezza inferiore di h/3 = " + h / 3);
            }
            if (to < 0 || e < 0 || g < 0 || h < 0 || l < 0 || t < 0 | s0 < 0 || fm < 0 || n < 0) {
                throw new Exception("negativo");
            }
        } catch (Exception ex) {
            if (ex.getMessage().equals("negativo")) {
                aggiungiLog("ERRORE: inserire un valore positivo");
            } else {
                aggiungiLog("ERRORE: valore inserito non numerico.");
            }
            return null;
        }

        Setto s = new Setto(to, e, g, h, l, t, s0, fm, n);
        return s;
    }

    private void aggiornaGUICalcoloStatoVerificato() {
        calcolaVBox.setDisable(true);
        modificaHBox.setDisable(false);
        if (GestoreSetti.calcolaStatoVerificato()) {
            statoLbl.setText("STATO MODIFICATO VERIFICATO");
            statoLbl.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            statoLbl.setText("STATO MODIFICATO NON VERIFICATO");
            statoLbl.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        stampaSetti();
        aggiungiAttualeText(GestoreSetti.getConclusioniAttuale());
        aggiungiModificatoText(GestoreSetti.getConclusioniModificato());
        statoLbl.setVisible(true);
    }

    private void calcolaBtnAggiungiSetto() {

        Setto s = estraiSettoDaCampiInseriti();

        if (s == null) {
            return;
        }

        s.calcola();
        stampaSetto(s);
        GestoreSetti.aggiungiSetto(s);
        aggiungiLog(GestoreSetti.getStageLog());
        clear();

        if (GestoreSetti.modificatoCompletato()) {
            aggiornaGUICalcoloStatoVerificato();
        }

    }

    private void calcolaBtnModificaSetto() {
        Setto s = estraiSettoDaCampiInseriti();

        if (s == null) {
            return;
        }

        s.calcola();
        GestoreSetti.aggiornaSetto(s, settoMod, sceltaMod);
        aggiornaGUICalcoloStatoVerificato();
    }

    private void modificaBtnHandler() {
        int numeroSetto;
        String sceltaAttMod;
        try {
            numeroSetto = Integer.parseInt(settoField.getText());
            sceltaAttMod = statoChoice.getValue().toString();

            System.out.println(sceltaAttMod);

            if (numeroSetto < 0) {
                throw new Exception();
            }
            if (sceltaAttMod.equals("Attuale") && numeroSetto > GestoreSetti.getAttualeArr().length) {
                throw new Exception();
            }
            if (sceltaAttMod.equals("Modificato") && numeroSetto > GestoreSetti.getModificatoArr().length) {
                throw new Exception();
            }
        } catch (Exception e) {
            aggiungiLog("ERRORE: inserire un numero di setto valido");
            return;
        }

        Setto settoDaModificare;
        if (sceltaAttMod.equals("Attuale")) {
            settoDaModificare = GestoreSetti.getAttualeArr()[numeroSetto - 1];
        } else {
            settoDaModificare = GestoreSetti.getModificatoArr()[numeroSetto - 1];
        }

        toField.setText(String.valueOf(settoDaModificare.getT0() / 10));
        eField.setText(String.valueOf(settoDaModificare.getE() / 10));
        gField.setText(String.valueOf(settoDaModificare.getG() / 10));
        hField.setText(String.valueOf(settoDaModificare.getH()));
        lField.setText(String.valueOf(settoDaModificare.getL()));
        tField.setText(String.valueOf(settoDaModificare.getT()));
        s0Field.setText(String.valueOf(settoDaModificare.getS0() / 10));
        nField.setText(String.valueOf(settoDaModificare.getN()));

        modificaMode = true;
        settoMod = numeroSetto - 1;
        sceltaMod = sceltaAttMod;

        calcolaVBox.setDisable(false);

    }

    private void nuovoMenuHandler() {
        aggiungiLog("\n");
        reset();
    }

    private void salvaMenuHandler() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(selectedFile));
            oos.writeObject(new StatoSalvato());
            aggiungiLog("Salvataggio completato.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean salvaConNomeMenuHandler() {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Setto Murario (*.set)", "*.set");
        fileChooser.getExtensionFilters().add(extFilter);
        Stage stage = new Stage();
        File file = fileChooser.showSaveDialog(stage);
        if (file == null) {
            return false;
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new StatoSalvato());
            aggiungiLog("Salvataggio completato.");
            selectedFile = file;
            salvaMenu.setDisable(false);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return true;
    }

    private boolean apriMenuHandler() {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Setto Murario (*.set)", "*.set");
        fileChooser.getExtensionFilters().add(extFilter);
        Stage stage = new Stage();
        File file = fileChooser.showOpenDialog(stage);
        if (file == null) {
            return false;
        }
        try {
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file));
            StatoSalvato s = (StatoSalvato) oos.readObject();
            aggiungiLog("Caricamento completato.");
            GestoreSetti.caricaStatoSalvato(s);
            stampaSetti();
            if (GestoreSetti.modificatoCompletato()) {
                aggiornaGUICalcoloStatoVerificato();
            }
            salvaMenu.setDisable(false);
            selectedFile = file;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public void close() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Setti Murari");
        alert.setContentText("Salvare prima di uscire?");
        ButtonType yesButton = new ButtonType("Si", ButtonBar.ButtonData.YES);
        ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.NO);
        ButtonType cancelButton = new ButtonType("Annulla", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(yesButton, noButton);
        if (SettiMurari.chiudiMenuSelected) {
            alert.getButtonTypes().addAll(cancelButton);
        }
        alert.showAndWait().ifPresent(type -> {
            if (type == yesButton) {
                if (selectedFile == null) {
                    do {
                    } while (!salvaConNomeMenuHandler());
                } else {
                    salvaMenuHandler();
                }
                System.exit(0);
            } else if (type == noButton) {
                System.exit(0);
            }
        });
    }

    private void guidaMenuHandler() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Setti Murari");
        alert.setContentText("Per copiare i dati, posizionarsi con il cursore su uno dei box. Premere CTRL-A per selezionare tutto il testo e CTRL-C per copiare i dati. Infine, incollare il testo su un editor di testo (Word) con CTRL-V.");
        ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        alert.getButtonTypes().setAll(okButton);
        alert.showAndWait();
    }

    private void infoMenuHandler() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Informazioni su Setti Murari");
        alert.setContentText("Calcolo setti murari (C) 2020 - by Marco Pettorali\n23/09/17 - v 1.0\n23/07/18 - v 2.0\n07/03/20 - v 3.0");
        ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        alert.getButtonTypes().setAll(okButton);
        alert.showAndWait();
    }

    private void chiudiMenuHandler() {
        SettiMurari.chiudiMenuSelected = true;
        close();
        SettiMurari.chiudiMenuSelected = false;
    }
}
