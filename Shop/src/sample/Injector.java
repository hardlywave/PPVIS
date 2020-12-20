package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.сontrollers.*;

public class Injector extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new ProductController();
        new AdvertisementController();
        new SessionManager();
        new KeyWordController();
        new SearchController();
        new SortController();

        Parent root = FXMLLoader.load(getClass().getResource("Fxml/Sample.fxml"));
        primaryStage.setTitle("Shop Program");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
