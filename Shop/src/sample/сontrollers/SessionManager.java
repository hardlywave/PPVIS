package sample.сontrollers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.product.Advertisement;
import sample.product.Category;
import sample.user.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SessionManager {

    private SortController sortController = new SortController();
    private SearchController searchController = new SearchController();
    private KeyWordController keyWordController = new KeyWordController();
    private Advertisement advertisementList = new Advertisement();
    private Category categoryList = new Category();
    private User user = new User();

    void addCategory(Category category){}

    boolean login(User user){
        return false;
    }

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
            loginButton.getScene().getWindow().hide();

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
        registerAuthButton.setOnAction(event -> {
            registerAuthButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/Fxml/Registre.fxml"));
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

