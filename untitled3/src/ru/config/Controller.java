package ru.config;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller {

    @FXML
    private Button ButtonOpen;

    @FXML
    void open(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/catalog.fxml"));
        //тут как в Main пишешь только путь другой
    }

}
