package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    private final String APP_TITLE = "Tomat";
    private final double SCENE_WIDTH = 200;
    private final double SCENE_HEIGHT = 100;
    private final String OK_BUTTON_TITLE = "OK";
    private Button okButton;
    private StackPane layout;
    private Scene scene;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(APP_TITLE);
        okButton = new Button(OK_BUTTON_TITLE);
        okButton.setOnAction(event -> System.out.println("lambda click " + okButton.getText()));

        layout = new StackPane();
        layout.getChildren().add(okButton);

        scene = new Scene(layout, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}