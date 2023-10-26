module com.github.ffrancoc.storeapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mariadb.jdbc;

    opens com.github.ffrancoc.storeapp to javafx.fxml;
    exports com.github.ffrancoc.storeapp;
}
