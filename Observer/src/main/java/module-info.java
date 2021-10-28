module espol.observer {
    requires javafx.controls;
    requires javafx.fxml;

    opens espol.observer to javafx.fxml;
    exports espol.observer;
}
