package sample.сontrollers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AccountController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField searchField;

    @FXML
    private Button searchButton;

    @FXML
    private Button outAccountButton;

    @FXML
    private Button shopListButton;

    @FXML
    private Button infoCompanyButton;

    @FXML
    private Button contactsButton;

    @FXML
    private Button editeProfileButton;

    @FXML
    private Button infoCompanyButton1;

    @FXML
    void initialize() {
        outAccountButton.setOnAction(event -> {
            outAccountButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Shop.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}
