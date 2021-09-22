//package com.github.walgerdl.worldweatherapp;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//
//public class HelloController {
////    @FXML
////    private Label welcomeText;
////
////    @FXML
////    protected void onHelloButtonClick() {
////        welcomeText.setText("Welcome to JavaFX Application!");
////    }
//}
/**
 * Sample Skeleton for 'weather.fxml' Controller Class
 */

package com.github.walgerdl.worldweatherapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="city"
    private TextField city; // Value injected by FXMLLoader

    @FXML // fx:id="getData"
    private Button getData; // Value injected by FXMLLoader

    @FXML // fx:id="temperature"
    private Text temperature; // Value injected by FXMLLoader

    @FXML // fx:id="max"
    private Text max; // Value injected by FXMLLoader

    @FXML // fx:id="feltLike"
    private Text feltLike; // Value injected by FXMLLoader

    @FXML // fx:id="min"
    private Text min; // Value injected by FXMLLoader

    @FXML // fx:id="atmoPress"
    private Text atmoPress; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        getData.setOnAction(event -> {
            System.out.println("Worked!");
        });

    }
}

