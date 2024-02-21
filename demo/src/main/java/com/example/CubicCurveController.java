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
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CubicCurveController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button back4;
    @FXML
    private Button ENTER;
    @FXML
    private CubicCurve Cubic;
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
    @FXML
    private TextField T7;
    @FXML
    private TextField T8;

    double a, b, c, d, e, f, q, w;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ENTER.setOnAction(this::Cubic2);
    }

    public void Cubic2(ActionEvent event) {

        for (int i = 0; i < 10000; i++) {
            try {

                a = Double.parseDouble(T1.getText());
                b = Double.parseDouble(T2.getText());
                c = Double.parseDouble(T3.getText());
                d = Double.parseDouble(T4.getText());
                e = Double.parseDouble(T5.getText());
                f = Double.parseDouble(T6.getText());
                q = Double.parseDouble(T7.getText());
                w = Double.parseDouble(T8.getText());
            } catch (NumberFormatException a) {
            } finally {
            }

            Cubic.setStartX(a);
            Cubic.setStartY(b);
            Cubic.setEndX(c);
            Cubic.setEndY(d);
            Cubic.setControlX1(e);
            Cubic.setControlY1(f);
            Cubic.setControlX2(q);
            Cubic.setControlY2(w);
        }
    }

    public void Back4(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
