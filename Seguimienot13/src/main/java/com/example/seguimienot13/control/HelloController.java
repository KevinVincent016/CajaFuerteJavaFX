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


public class HelloController {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField num3;

    @FXML
    private TextField num4;

    @FXML
    private TextField num5;

    @FXML
    private TextField num6;

    @FXML
    private Button openButton;

    @FXML
    private HBox boxes;

    @FXML
    void onKey(KeyEvent event) {
        if(event.getSource().equals(num1)){
            num2.requestFocus();
        }
        if(event.getSource().equals(num2)){
            num3.requestFocus();
        }
        if(event.getSource().equals(num3)){
            num4.requestFocus();
        }
        if(event.getSource().equals(num4)){
            num5.requestFocus();
        }
        if(event.getSource().equals(num5)){
            num6.requestFocus();
        }
        if (event.getSource().equals(num6)){
            openButton.requestFocus();
        }
    }

    @FXML
    void openBox(ActionEvent event) throws IOException {
        String txt = "";
        for(Node node : boxes.getChildren()){
            TextField tf = (TextField) node;
            txt += tf.getText();
        }
        if (safeData.getInstance().getPassword().equals(txt)){
            HelloApplication.showWindow("insideBox.fxml");
            Stage currentStage = (Stage)num1.getScene().getWindow();
            currentStage.hide();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("Contraseña equivocada");
            alert.show();
        }
    }

}