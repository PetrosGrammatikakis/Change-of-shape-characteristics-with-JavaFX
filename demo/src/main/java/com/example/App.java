package com.example;

import java.io.IOException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class App extends Application {


   @Override
public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {
    // Load the FXML file as a stream
    InputStream fxmlStream = getClass().getResourceAsStream("primary.fxml");
    if (fxmlStream == null) {
        throw new IOException("FXML file not found");
    }
    
    // Load the FXML file using FXMLLoader
    FXMLLoader loader = new FXMLLoader();
    Parent root = loader.load(fxmlStream);
    
    // Create the scene
    Scene scene = new Scene(root);
    
    // Set the scene and show the stage
    primaryStage.setScene(scene);
    primaryStage.show();
}

 public static void main(String[] args) {
        launch();
    }

}
