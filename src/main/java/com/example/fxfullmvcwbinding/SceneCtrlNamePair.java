package com.example.fxfullmvcwbinding;

import javafx.scene.Scene;

public class SceneCtrlNamePair {

    private Scene scene;
    private ControllerNames name;

    public Scene getScene() {
        return scene;
    }

    public ControllerNames getName() {
        return name;
    }

    public SceneCtrlNamePair(Scene scene, ControllerNames name) {
        this.scene = scene;
        this.name = name;
    }
}
