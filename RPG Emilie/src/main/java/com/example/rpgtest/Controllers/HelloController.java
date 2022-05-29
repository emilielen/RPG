package com.example.rpgtest.Controllers;

import com.example.rpgtest.Models.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Label WelcomeText;
    public Button StartButton;

    @FXML
    protected void onHelloButtonClick() throws Exception {
        Game.main();
    }
}