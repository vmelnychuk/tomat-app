package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;

public class Main extends Application {
    // Constants
    private final String APP_TITLE = "Tomat";
    private final double SCENE_WIDTH = 200;
    private final double SCENE_HEIGHT = 100;
    private final String OK_BUTTON_TITLE = "OK";
    private final String APP_ICON = "images/icon.png";
    // Member vars
    private Stage window;
    private Scene mainScene;
    private Scene settingsScene;

    private Label mainLabel;
    private Label settingsLabel = new Label("Settings");
    private Button settingsButton;

    private Button mainButton;

    //Layouts
    private VBox mainLayout = new VBox(20);
    private VBox settingLayout = new VBox(20);
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        mainLabel = new Label("Main");
        settingsButton = new Button("Settings");
        settingsButton.setOnAction(event -> window.setScene(settingsScene));
        mainLayout.getChildren().addAll(mainLabel, settingsButton);
        mainScene = new Scene(mainLayout, SCENE_WIDTH, SCENE_HEIGHT);

        mainButton = new Button("go Main");
        mainButton.setOnAction(event -> window.setScene(mainScene));

        settingLayout.getChildren().addAll(settingsLabel, mainButton);
        settingsScene = new Scene(settingLayout, SCENE_WIDTH, SCENE_HEIGHT);

        window.setScene(mainScene);
        window.setTitle(APP_TITLE);
        window.show();
    }
}