module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.base;
    requires javafx.graphics;

    opens com.example to javafx.fxml;
    exports com.example;
}
