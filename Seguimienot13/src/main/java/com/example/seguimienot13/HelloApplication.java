package com.example.seguimienot13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showWindow("hello-view.fxml");
    }

    public static void showWindow(String fxml) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
            Parent node = fxmlLoader.load();
            Scene scene = new Scene(node);
            Stage window = new Stage();
            window.setScene(scene);
            window.show();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}