module com.example.seguimienot13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seguimienot13 to javafx.fxml;
    exports com.example.seguimienot13;

    opens com.example.seguimienot13.control to javafx.fxml;
    exports com.example.seguimienot13.control;
}