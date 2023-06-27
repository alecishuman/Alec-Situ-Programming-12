module com.example.friendsbook {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.friendsbook to javafx.fxml;
    exports com.example.friendsbook;
}