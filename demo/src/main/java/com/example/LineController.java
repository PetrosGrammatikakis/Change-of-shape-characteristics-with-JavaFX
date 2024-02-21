package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LineController implements Initializable {

    @FXML
    private Label L;
    @FXML
    private Label W;
    @FXML
    private Line Line1;
    @FXML
    private TextField Length;
    @FXML
    private TextField Length1;
    @FXML
    private TextField Width;
    @FXML
    private Button Enter3;
    @FXML
    private Button Back1;
    private Stage stage;
    private Scene scene;
    private Parent root;

    double a, b, c;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Enter3.setOnAction(this::GetShape);

    }

    public void GetShape(ActionEvent event) {
        for (int i = 0; i < 10000; i++) {
            try {
                a = Double.parseDouble(Width.getText());
                b = Double.parseDouble(Length.getText());
                c = Double.parseDouble(Length1.getText());
            } catch (NumberFormatException a) {
            } finally {

            }
            Line1.setEndX(b);
            Line1.setEndY(0);
            Line1.setStartX(c);
            Line1.setStartY(0);
            Line1.setStrokeWidth(a);

        }
    }

    public void Back2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}

