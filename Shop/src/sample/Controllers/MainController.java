package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerAuthButton;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordFild;

    @FXML
    void initialize() {
        loginButton.setOnAction(event -> {

        });
        registerAuthButton.setOnAction(event -> {

        });
    }
}

