package com.example.vac3liveandletlive;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ListView<String> vacList;

    @FXML
    private TextField vacName;

    @FXML
    private TextField vacAddress;

    @FXML
    private TextField vacEircode;

    @FXML
    private TextField vacParking;

    @FXML
    void addCentre(MouseEvent event) {
        VaccinationCentre v;
        HelloApplication.Vlist.addElement(v = new VaccinationCentre(vacName.getText(), vacAddress.getText(), vacEircode.getText(), Integer.parseInt(vacParking.getText())));
        vacList.getItems().addAll(vacName.getText() + " - " + vacAddress.getText() + " - " +vacEircode.getText() + " - " + vacParking.getText());
    }

}
