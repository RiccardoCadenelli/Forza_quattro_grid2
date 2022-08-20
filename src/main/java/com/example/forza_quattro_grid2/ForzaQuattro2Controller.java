package com.example.forza_quattro_grid2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ForzaQuattro2Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}