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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class RectangleController implements Initializable {

    @FXML
    private Button Back;
    @FXML
    private Rectangle Rectangle1;
    @FXML
    private TextField T1;
    @FXML
    private TextField T2;
    double a, b;
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void RectangleShape(ActionEvent event) {
      for (int i = 0; i < 10000; i++) {
            try {

                a = Double.parseDouble(T1.getText());
                b = Double.parseDouble(T2.getText());
               

            } catch (NumberFormatException c) {
            } finally {

            }
            Rectangle1.setHeight(a);
            Rectangle1.setWidth(b);
        

        }
    }

    public void Back8(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}

