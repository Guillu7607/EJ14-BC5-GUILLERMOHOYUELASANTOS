package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField field = new TextField();
        field.setPromptText("Introduce un número de teléfono");

        Label label = new Label();

        Button buttonSubmit = new Button("Confirmar entrada");


        buttonSubmit.setOnAction(event -> {
            String tel = field.getText();
            if (tel.length() == 10 && tel.matches("[0-9]+")) {
                label.setText("Es un número de telefono valido");
            }
            else {
                label.setText("Número de telefono invalido");
            }
        });


        VBox layout = new VBox(10, field, buttonSubmit, label);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);

        primaryStage.setTitle("Validador de Direcciones JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}