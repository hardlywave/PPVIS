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
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField searchField;

    @FXML
    private Button backButton;

    @FXML
    private Button searchButton;

    @FXML
    private Button shopListButton;

    @FXML
    private Button infoCompanyButton;

    @FXML
    private Button contactsButton;

    @FXML
    private ImageView avatarImage;

    @FXML
    private Button editeProfileButton;

    @FXML
    private VBox accountVBox;

    @FXML
    private Button personalDataButton;

    @FXML
    private Button couponsButton;

    @FXML
    private Button activeOrdersButton;

    @FXML
    private Button archiveOrdersButton;

    @FXML
    void initialize() {
        backButton.setOnAction(event -> {
            backButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/Fxml/Shop.fxml"));
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
