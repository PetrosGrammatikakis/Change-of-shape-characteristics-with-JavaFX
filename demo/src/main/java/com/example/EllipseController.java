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
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class EllipseController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button Enter;
    @FXML
    private Ellipse Elipse;
    @FXML
    private TextField Radius1;
    @FXML
    private TextField Radius2;

    double a, b;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Enter.setOnAction(this::Elipse1);
    }

    public void Elipse1(ActionEvent event) {

        for (int i = 0; i < 10000; i++) {
            try {

                a = Double.parseDouble(Radius1.getText());
                b = Double.parseDouble(Radius2.getText());

            } catch (NumberFormatException c) {
            } finally {

            }
            Elipse.setRadiusX(a);
            Elipse.setRadiusY(b);

        }

    }

    public void Back6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
