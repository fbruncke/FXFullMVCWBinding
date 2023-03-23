package com.example.fxfullmvcwbinding;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    private static ArrayList<SceneCtrlNamePair> scenes = new ArrayList<>();
    private static Stage primaryStageHolder = null;

    @Override
    public void start(Stage stage) throws IOException {
        Application.setUserAgentStylesheet(getClass().getResource("Style.css").toExternalForm());

        primaryStageHolder = stage;
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("overview.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 520, 540);

        FXMLLoader overViewPaneLoader = new FXMLLoader(getClass().getResource("overview.fxml"));
        Parent overViewPane = overViewPaneLoader.load();
        Scene overViewScene = new Scene(overViewPane, 600, 600);

        FXMLLoader detailPaneLoader = new FXMLLoader(getClass().getResource("detailview.fxml"));
        Parent deailtPane = detailPaneLoader.load();
        Scene detailScene = new Scene(deailtPane, 600, 600);

        scenes.add(new SceneCtrlNamePair( overViewScene, ControllerNames.OverView));
        scenes.add(new SceneCtrlNamePair( detailScene, ControllerNames.DetailsView));

        stage.setTitle("Main");
        stage.setScene(overViewScene);
        stage.show();
    }

    /**
     * changeScene
     * @param sceneName
     */
    public static void changeScene(ControllerNames sceneName) {
        primaryStageHolder.setTitle(sceneName.toString());

        for (SceneCtrlNamePair sceneCtrlNamePair : scenes) {
            if (sceneCtrlNamePair.getName().equals(sceneName)) {
                primaryStageHolder.setScene(sceneCtrlNamePair.getScene());
            }
        }
    }



    public static void main(String[] args) {
        launch();
    }
}