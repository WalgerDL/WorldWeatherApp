module com.github.walgerdl.worldweatherapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.json;

    opens com.github.walgerdl.worldweatherapp to javafx.fxml;
    exports com.github.walgerdl.worldweatherapp;
}