package com.example.fxfullmvcwbinding;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EmptyviewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome emptyview controller!");
    }




    public void changeView(ActionEvent actionEvent)
    {
        //welcomeText.setText("Test");
        //Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Main.changeScene(ControllerNames.DetailsView);

    }
}
