package com.example.seguimienot13.control;

import com.example.seguimienot13.HelloApplication;
import com.example.seguimienot13.model.safeData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class changePassController {

    @FXML
    private HBox actualKeyBoxes;

    @FXML
    private HBox newKeyBoxes;

    @FXML
    private TextField newnum1;

    @FXML
    private Button changePassBT;

    @FXML
    private TextField newnum2;

    @FXML
    private TextField newnum3;

    @FXML
    private TextField newnum4;

    @FXML
    private TextField newnum5;

    @FXML
    private TextField newnum6;

    @FXML
    private TextField oldnum1;

    @FXML
    private TextField oldnum2;

    @FXML
    private TextField oldnum3;

    @FXML
    private TextField oldnum4;

    @FXML
    private TextField oldnum5;

    @FXML
    private TextField oldnum6;

    @FXML
    void changePass(ActionEvent event) {
        String oldPass = "";
        for(Node node : actualKeyBoxes.getChildren()){
            TextField tf = (TextField) node;
            oldPass += tf.getText();
        }
        String newPass = "";
        for(Node node : newKeyBoxes.getChildren()){
            TextField tf = (TextField) node;
            newPass += tf.getText();
        }
        if (!oldPass.equals(safeData.getInstance().getPassword())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("La combinacion actual no concuerda a la registrada");
            alert.show();
        } else if (oldPass.equals(newPass)) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Advertencia");
            alert.setContentText("La combinacion actual es igual a la nueva, no se realizaran cambios");
            alert.show();
        }else{
            safeData.getInstance().setPassword(newPass);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Contraseña cambiada exitosamente");
            alert.show();
        }
    }

    @FXML
    void closeBox(ActionEvent event) throws IOException {
        HelloApplication.showWindow("hello-view.fxml");
        Stage currentStage = (Stage)oldnum6.getScene().getWindow();
        currentStage.hide();
    }

    @FXML
    void onKey(KeyEvent event) {
        if(event.getSource().equals(newnum1)){
            newnum2.requestFocus();
        }
        if(event.getSource().equals(newnum2)){
            newnum3.requestFocus();
        }
        if(event.getSource().equals(newnum3)){
            newnum4.requestFocus();
        }
        if(event.getSource().equals(newnum4)){
            newnum5.requestFocus();
        }
        if(event.getSource().equals(newnum5)){
            newnum6.requestFocus();
        }
        if (event.getSource().equals(newnum6)){
            changePassBT.requestFocus();
        }
    }

    @FXML
    void onKeyOldPass(KeyEvent event) {
        if(event.getSource().equals(oldnum1)){
            oldnum2.requestFocus();
        }
        if(event.getSource().equals(oldnum2)){
            oldnum3.requestFocus();
        }
        if(event.getSource().equals(oldnum3)){
            oldnum4.requestFocus();
        }
        if(event.getSource().equals(oldnum4)){
            oldnum5.requestFocus();
        }
        if(event.getSource().equals(oldnum5)){
            oldnum6.requestFocus();
        }
        if (event.getSource().equals(oldnum6)){
            newnum1.requestFocus();
        }
    }

}
