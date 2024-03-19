package com.example.demofitness;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {
    @FXML
    private Label error_msg;

    @FXML
    protected void onLoginButtonClick() {
        error_msg.setText("Error");
    }
}