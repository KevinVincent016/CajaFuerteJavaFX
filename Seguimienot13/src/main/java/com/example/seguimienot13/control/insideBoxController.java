package com.example.seguimienot13.control;

import com.example.seguimienot13.HelloApplication;
import com.example.seguimienot13.model.safeData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class insideBoxController implements Initializable {

    @FXML
    private Button changePassBT;

    @FXML
    private Button closeBT;

    @FXML
    private TextArea infoTA;

    @FXML
    void changePass(ActionEvent event) throws IOException {
        String info = infoTA.getText();
        safeData.getInstance().setContent(info);
        HelloApplication.showWindow("changePass.fxml");
        Stage currentStage = (Stage)changePassBT.getScene().getWindow();
        currentStage.hide();
    }

    @FXML
    void closeInsideBox(ActionEvent event) throws IOException {
        String info = infoTA.getText();
        safeData.getInstance().setContent(info);
        HelloApplication.showWindow("hello-view.fxml");
        Stage currentStage = (Stage)closeBT.getScene().getWindow();
        currentStage.hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        infoTA.setText(safeData.getInstance().getContent());
    }
}
