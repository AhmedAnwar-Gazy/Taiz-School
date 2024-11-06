module com.javafx_aromart.khawalatest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.javafx_aromart.khawalatest to javafx.fxml;
    exports com.javafx_aromart.khawalatest;
}