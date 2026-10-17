module com.example.mascotajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mascotajavafx to javafx.fxml;
    exports com.example.mascotajavafx;
}