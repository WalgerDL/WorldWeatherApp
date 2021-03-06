package com.github.walgerdl.worldweatherapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WorldWeatherApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("weather.fxml"));
        stage.setTitle("World Weather Viewer");
        stage.setResizable(false);
        stage.setScene(new Scene(root,496,585));
        stage.show();
    }

    public static void main(String[] args) {
        launch();


    }
}