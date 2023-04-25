module stra.cassapeota {
    requires javafx.controls;
    requires javafx.fxml;

    opens stra.cassapeota to javafx.fxml;
    exports stra.cassapeota;
}
