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
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
/**
 *
 * PATH Controller
 */
public class SecondaryController implements Initializable {

    @FXML
    private AnchorPane panel;

    @FXML
    private Button ENTER2;
     @FXML
    private Button Back ;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField TF1;
    @FXML
    private TextField TF2;
    @FXML
    private TextField TF3;
    @FXML
    private TextField TF4;
    @FXML
    private TextField TF5;
    @FXML
    private TextField TF6;
    @FXML
    private TextField TF7;
    @FXML
    private TextField TF8;
    @FXML
    private TextField TF9;
    @FXML
    private TextField TF10;
    @FXML
    private TextField TF11;
    @FXML
    private TextField TF12;
    @FXML
    private Path PATH2;
    @FXML
    private MoveTo start;
    @FXML
    private LineTo line;
    @FXML
    private ArcTo Arcto;
    @FXML
    private QuadCurveTo Quad;

    double a, b, c, d, e, k, l, s, w, q, t, r;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
      ENTER2.setOnAction(this::PATH);
    }

    @FXML
    public void PATH(ActionEvent event) {

        for (int i = 0; i < 10000; i++) {
            try {
                a = Double.parseDouble(TF1.getText());
                b = Double.parseDouble(TF2.getText());
                c = Double.parseDouble(TF3.getText());
                d = Double.parseDouble(TF4.getText());
                e = Double.parseDouble(TF5.getText());
                k = Double.parseDouble(TF6.getText());
                l = Double.parseDouble(TF7.getText());
                s = Double.parseDouble(TF8.getText());
                w = Double.parseDouble(TF9.getText());
                q = Double.parseDouble(TF10.getText());
                t = Double.parseDouble(TF11.getText());
                r = Double.parseDouble(TF12.getText());
            } catch (NumberFormatException a) {
            } finally {
            }
            start.setX(a);
            start.setY(b);
            line.setX(c);
            line.setY(d);
            Arcto.setX(e);
            Arcto.setY(k);
            Arcto.setRadiusX(l);
            Arcto.setRadiusY(s);
            Quad.setX(w);
            Quad.setY(q);
            Quad.setControlX(t);
            Quad.setControlY(r);
           
        }
        

    }
     public void Back1 (ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("primary.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

     }
        }