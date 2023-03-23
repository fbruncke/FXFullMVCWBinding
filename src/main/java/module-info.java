module com.example.fxfullmvcwbinding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxfullmvcwbinding to javafx.fxml;
    exports com.example.fxfullmvcwbinding;
}