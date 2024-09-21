module com.example.vehmis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vehmis to javafx.fxml;
    exports com.example.vehmis;
}