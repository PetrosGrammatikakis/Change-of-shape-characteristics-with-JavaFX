package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
@SuppressWarnings("unused")
public class CylinderController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button Back;
    @FXML
    private Button Enter;
    @FXML
    private TextField Height;
    @FXML
    private TextField Radius;


    @FXML
    private Cylinder Cylinder1;

    double a, b ;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Enter.setOnAction(this::CylinderShape);
    }

    public void CylinderShape(ActionEvent event) {
        for (int i = 0; i < 10000; i++) {
            try {

                a = Double.parseDouble(Height.getText());
                b = Double.parseDouble(Radius.getText());
               

            } catch (NumberFormatException c) {
            } finally {

            }
            Cylinder1.setHeight(a);
            Cylinder1.setRadius(b);
        

        }
    }

    public void Back5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
