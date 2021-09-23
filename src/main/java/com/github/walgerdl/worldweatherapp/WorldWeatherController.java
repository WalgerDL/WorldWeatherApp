package com.github.walgerdl.worldweatherapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;

public class WorldWeatherController {

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
            String getUserCity = city.getText().trim();
            if(!getUserCity.equals("")){
            //String output = getURLcontent("http://api.openweathermap.org/data/2.5/weather?q="+ getUserCity + "&appid=4e2bee95cadeb6d9b4398f9144d1f1dc");
            String output = getURLcontent("http://api.openweathermap.org/data/2.5/weather?q="+ getUserCity + "&units=metric&appid=4e2bee95cadeb6d9b4398f9144d1f1dc");
                System.out.println(output);

            if(!output.isEmpty()) {
                JSONObject object = new JSONObject(output);
                temperature.setText("Temperature: "+object.getJSONObject("main").getDouble("temp"));
                feltLike.setText("Felt like: "+object.getJSONObject("main").getDouble("feels_like"));
                max.setText("Maximum: "+object.getJSONObject("main").getDouble("temp_max"));
                min.setText("Minimum: "+object.getJSONObject("main").getDouble("temp_min"));
                atmoPress.setText("Atmo. Pressure: "+object.getJSONObject("main").getDouble("pressure"));
            }
          }
        });
    }


    private static String getURLcontent(String urlAdress){

        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL(urlAdress);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line=bufferedReader.readLine()) != null) {
                content.append(line+"\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("The city not found!");
        }
        return content.toString();
    }

}

