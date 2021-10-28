package espol.observer;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private AnchorPane fondo;
    @FXML
    private Button btRojo;
    @FXML
    private Button btAzul;
    @FXML
    private Button btVerde;
    
    @FXML
    private void cambiarRojo(MouseEvent event) {
        fondo.setStyle("-fx-background-color: RED");
    }

    @FXML
    private void cambiarAzul(MouseEvent event) {
        fondo.setStyle("-fx-background-color: BLUE");
    }

    @FXML
    private void cambiarVerde(MouseEvent event) {
        fondo.setStyle("-fx-background-color: GREEN");
    }

}
