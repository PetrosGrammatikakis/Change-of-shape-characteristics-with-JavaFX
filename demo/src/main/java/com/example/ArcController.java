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
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcController implements Initializable {

    @FXML
    private Button OK;
    @FXML
    private Arc Arc1;
    @FXML
    private Button BACK;
    @FXML
    private TextField T1;
    @FXML
    private TextField T2;
    @FXML
    private TextField T3;
    @FXML
    private TextField T4;
    @FXML
    private TextField T5;
    @FXML
    private TextField T6;

    private Stage stage;
    private Scene scene;
    private Parent root;

    double a, b, c, d, e, f;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         OK.setOnAction(this::Arc2);
    }

    public void Arc2(ActionEvent event) {

        for (int i = 0; i < 10000; i++) {
            try {

                a = Double.parseDouble(T1.getText());
                b = Double.parseDouble(T2.getText());
                c = Double.parseDouble(T3.getText());
                d = Double.parseDouble(T4.getText());
                e = Double.parseDouble(T5.getText());
                f = Double.parseDouble(T6.getText());
            } catch (NumberFormatException a) {
            } finally {

            }

            Arc1.setCenterX(a);
            Arc1.setCenterY(b);
            Arc1.setRadiusX(c);
            Arc1.setRadiusY(d);
            Arc1.setStartAngle(e);
            Arc1.setLength(f);
            Arc1.setType(ArcType.ROUND);
        }

    }

    public void Back3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
