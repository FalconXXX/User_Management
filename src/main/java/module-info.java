module com.example.user_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.user_management to javafx.fxml;
    exports com.example.user_management;
}