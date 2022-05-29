module com.example.rpgtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;


    opens com.example.rpgtest to javafx.fxml;
    exports com.example.rpgtest;
    exports com.example.rpgtest.Models;
    opens com.example.rpgtest.Models to javafx.fxml;
    exports com.example.rpgtest.Controllers;
    opens com.example.rpgtest.Controllers to javafx.fxml;
    exports com.example.rpgtest.Helpers;
    opens com.example.rpgtest.Helpers to javafx.fxml;
}