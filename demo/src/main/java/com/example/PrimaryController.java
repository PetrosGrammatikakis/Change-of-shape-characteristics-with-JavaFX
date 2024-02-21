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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class PrimaryController implements Initializable {

    @FXML
    private Label MyLabel1;
    @FXML
    private Button Enter1;
    @FXML
    private ChoiceBox<String> MyChoiceBox;

    private final String[] Shapes = {"Arc", "CubicCurve", "Cylinder", "Ellipse", "Line", "Path", "Polygon", "Rectangle"};

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
        MyChoiceBox.getItems().addAll(Shapes);
        MyChoiceBox.setOnAction(this::GetShape);

    }

    @SuppressWarnings("unused")
    public void GetShape(ActionEvent event) {
        String MyShape = MyChoiceBox.getValue();
        MyLabel1.setText("Now press Enter ");

    }

    public void SwitchToShape(ActionEvent event) throws IOException {
        String MyShape = MyChoiceBox.getValue();
        if ("Line".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Line.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if ("Path".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Path.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if ("Arc".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Arc.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if ("CubicCurve".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("CubicCurve.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if ("Cylinder".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Cylinder.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if ("Ellipse".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Ellipse.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if ("Polygon".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Polygon.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if ("Rectangle".equals(MyShape)) {
            root = FXMLLoader.load(getClass().getResource("Rectangle.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}
